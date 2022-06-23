import React from "react";
import Container from "react-bootstrap/Container";
import Navbar from "react-bootstrap/Navbar";
import 'bootstrap/dist/css/bootstrap.min.css';


class Footer extends React.Component{
    render(){
        let year = new Date().getFullYear()
        return (
            <Navbar fixed={"bottom"} bg="light" expand="lg" className={"text-xs-center"}>
                <Container >
                    <Navbar.Text>
                        ©Kelan Patel {year}
                    </Navbar.Text>
                </Container>
            </Navbar>

        );
    }
}

export default Footer;