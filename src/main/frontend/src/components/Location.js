import React from "react";

import 'bootstrap/dist/css/bootstrap.min.css';
import Container from "react-bootstrap/Container";


class Location extends React.Component{
    render(){
        return(
            <Container>
                <h2>Our Location:</h2>
                <br/>
                <img  alt="map-location" class ="responsive center" src={require("../resources/map.png")}/>





            </Container>



        );
    }
}

export default Location;