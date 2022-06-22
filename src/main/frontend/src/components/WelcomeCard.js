import React from "react";

import Card from "react-bootstrap/Card";
import Button from "react-bootstrap/Button";
import Container from "react-bootstrap/Container";



class WelcomeCard extends React.Component{


    render(){
        return (
            <Container>
            <Card className="text-center buffer-top">

                <Card.Body>
                    <Card.Title>Welcome</Card.Title>
                    <Card.Text>
                        Why use Netflix or other streaming platforms when you can come to <em>Movie Zone</em> and pick
                        up a film. It's less inconvenient than you think. <p>{"\n"}</p>
                        Struggling to choose a film, why not click the button below


                    </Card.Text>


                    <Button id="random-film-button" variant="primary" onClick={randomFilm}>Pick a random film</Button>

                        <div id ="randomFilm" className={"buffer-top"}></div>



                </Card.Body>

            </Card>


            </Container>
       );
    }
}

export default WelcomeCard;

function randomFilm(){
    let filmDiv = document.getElementById("randomFilm");


    fetch(`https://sakilaspringproject-1655722832050.azurewebsites.net/home/film/random`)
        .then(res => res.json())
        .then(film=> {
            filmDiv.innerHTML = `<h5>${film.title}</h5><p>${film.description} <p/>`

        });
}