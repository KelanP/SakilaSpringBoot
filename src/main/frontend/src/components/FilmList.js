

import 'bootstrap/dist/css/bootstrap.min.css';
import Card from "react-bootstrap/Card";
import Table from "react-bootstrap/Table";
import React, {useEffect, useState} from 'react';
import {FormControl} from "react-bootstrap";
import Button from "react-bootstrap/Button";
import {Form} from "reactstrap";




function FilmList() {

    const [films, setFilms, search] = useState([])

    const getFilmData = () => {
        fetch("https://sakilaspringproject-1655722832050.azurewebsites.net/home/film/all")
            .then((resp) => resp.json())
            .then((filmsjson) => {
                setFilms(filmsjson);
            })
            .catch((err) => {
                console.error(err);
            });
    };
    useEffect(() => {
        getFilmData();
    }, []);


        return(
        <Card>
            <Card.Header >
                <div>
                    <h2 className={"text-center"}>All Films</h2>
                </div>

                <div>
                    <Form className="d-flex">
                        <FormControl
                            type="text"
                            placeholder="Search for a film..."
                            className="me-2"
                            aria-label="Search"
                        />
                        <Button variant="outline-success">Search</Button>
                        <Button variant="outline-danger">Cancel</Button>
                    </Form>
                </div>

            </Card.Header>

            <Card.Body>
                <Table striped size={"sm"}>
                    <thead>
                    <tr>
                        <th>#</th>
                        <th>Title</th>
                        <th>Description</th>
                        <th>Release Year</th>
                        <th>Runtime(min)</th>
                        <th>Rating</th>
                        <th>Rental Cost(£)</th>
                    </tr>
                    </thead>
                    <tbody>
                    {films.map((film) => (
                        <tr>
                            <td>{film.film_id}</td>
                            <td>{film.title}</td>
                            <td>{film.description}</td>
                            <td>{film.release_year}</td>
                            <td>{film.length}</td>
                            <td>{film.rating}</td>
                            <td>{film.rental_rate}</td>

                        </tr>
                    ))}
                    </tbody>

                </Table>

            </Card.Body>
        </Card>


    );

}
export default FilmList;
