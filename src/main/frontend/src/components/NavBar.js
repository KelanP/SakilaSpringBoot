import React from 'react';

import Container from 'react-bootstrap/Container';
import Navbar from 'react-bootstrap/Navbar';
import Nav from 'react-bootstrap/Nav';

class NavBar extends React.Component{
    render(){
        return(
            <Navbar bg="light" expand="lg">
                <Container>
                    <Navbar.Brand href="/">
                        <img  alt="brand-logo" height={"30"} src={require("../resources/logo.png")}/>
                    </Navbar.Brand>
                    <Nav className="me-auto">
                        <Nav.Link href="#home">Home</Nav.Link>
                        <Nav.Link target = "_blank" href="https://sakilaspringproject-1655722832050.azurewebsites.net/home/film/all">Our Films</Nav.Link>
                        <Nav.Link href="#pricing">Pricing</Nav.Link>
                        <Nav.Link href="../src/main/frontend/public/location.html">Find Us</Nav.Link>
                    </Nav>
                </Container>
        </Navbar>
        );
    }
}
export default NavBar;