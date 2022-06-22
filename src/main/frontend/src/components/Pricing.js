import React from "react";

import 'bootstrap/dist/css/bootstrap.min.css';
import Container from "react-bootstrap/Container";


class Pricing extends React.Component{
    render(){
        return(
            <Container className={"buffer-top"}>
            <h2>Pricing:</h2>
            <p>
                Prices vary film by film depending on popularity and rarity.
            </p>
            </Container>




        );
    }
}

export default Pricing;