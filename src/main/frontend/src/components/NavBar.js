import React from 'react';

import Container from 'react-bootstrap/Container';
import Navbar from 'react-bootstrap/Navbar';
import Nav from 'react-bootstrap/Nav';
import {Form} from "reactstrap";
import {FormControl} from "react-bootstrap";
import Button from "react-bootstrap/Button";
import {BrowserRouter as Router, Link, Route, Routes} from "react-router-dom"
import WelcomeCard from "./WelcomeCard";
import FilmList from "./FilmList";
import Pricing from "./Pricing";
import Location from "./Location";

class NavBar extends React.Component{
    render(){
        return(
            <Router>
            <Navbar bg="light" expand="lg">
                <Container>


                    <Link to="" className={"navbar-brand"}><img  alt="brand-logo" height={"30"} src={require("../resources/logo.png")}/></Link>

                    <Nav className="me-auto">
                        <Nav.Link as={Link} to={"/"}> Home </Nav.Link>
                        <Nav.Link as={Link} to="/films" className={"navbar-link"}> Our Films </Nav.Link>
                        <Nav.Link as={Link} to="/pricing" className={"navbar-link"}>Pricing</Nav.Link>
                        <Nav.Link as={Link} to="/location" className={"navbar-link"}>Find Us</Nav.Link>
                    </Nav>



                    <Form className="d-flex">
                        <FormControl
                            type="search"
                            placeholder="Search"
                            className="me-2"
                            aria-label="Search"
                        />
                        <Button variant="outline-success">Search</Button>
                    </Form>
                </Container>

        </Navbar>
                <Container>
                    <Routes>
                        <Route path="/" element={<WelcomeCard/>}/>
                        <Route path="/films" element={<FilmList/>}/>
                        <Route path="/pricing" element={<Pricing/>}/>
                        <Route path="/location" element={<Location/>}/>

                    </Routes>
                </Container>

    </Router>
        );
    }
}
export default NavBar;