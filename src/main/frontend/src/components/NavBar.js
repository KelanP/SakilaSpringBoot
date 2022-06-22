import React from 'react';

import Container from 'react-bootstrap/Container';
import Navbar from 'react-bootstrap/Navbar';
import Nav from 'react-bootstrap/Nav';
import {NavDropdown} from "react-bootstrap";
import {BrowserRouter as Router, Link, Route, Routes} from "react-router-dom"
import WelcomeCard from "./WelcomeCard";
import FilmList from "./FilmList";
import Pricing from "./Pricing";
import Location from "./Location";
import AccountCreation from "./AccountCreation";
import Rentals from "./Rentals";

class NavBar extends React.Component{
    render(){
        return(
            <Router>
            <Navbar bg="light" expand="lg">
                <Container>


                    <Link to="" className={"navbar-brand"}><img  alt="brand-logo" height={"30"} src={require("../resources/logo.png")}/></Link>

                    <Nav className="me-auto">
                        <Nav.Link as={Link} to={"/"} className={"navbar-link"} id={"nav-home"}> Home </Nav.Link>
                        <Nav.Link as={Link} to="/films" className={"navbar-link"} id={"nav-ourFilms"}> Our Films </Nav.Link>
                        <Nav.Link as={Link} to="/pricing" className={"navbar-link"} id={"nav-pricing"}>Pricing</Nav.Link>
                        <Nav.Link as={Link} to="/location" className={"navbar-link"} id={"nav-findUs"}>Find Us</Nav.Link>
                        <NavDropdown title="Account" id="basic-nav-dropdown">
                            <NavDropdown.Item as={Link} to="/rentals" className={"navbar-link"} id={"account-rentals"}>See My Rentals</NavDropdown.Item>
                            <NavDropdown.Item as={Link} to="/accountCreation" className={"navbar-link"} id={"account-creation"}>Make an account</NavDropdown.Item>
                        </NavDropdown>
                    </Nav>




                </Container>

        </Navbar>
                <Container>
                    <Routes>
                        <Route path="/" element={<WelcomeCard/>}/>
                        <Route path="/films" element={<FilmList/>}/>
                        <Route path="/pricing" element={<Pricing/>}/>
                        <Route path="/location" element={<Location/>}/>
                        <Route path="/rentals" element={<Rentals/>}/>
                        <Route path="/accountCreation" element={<AccountCreation/>}/>

                    </Routes>
                </Container>

    </Router>
        );
    }
}
export default NavBar;