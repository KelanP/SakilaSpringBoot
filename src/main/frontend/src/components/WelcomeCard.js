import React from "react";

import Card from "react-bootstrap/Card";
import Button from "react-bootstrap/Button";


class WelcomeCard extends React.Component{
    render(){
        return (
            <Card className="text-center">

                <Card.Body>
                    <Card.Title>Welcome</Card.Title>
                    <Card.Text>
                        Why use Netflix or other streaming platforms when you can come to <em>Movie Zone</em> and pick
                        up a film. It's less inconvenient than you think.
                    </Card.Text>

                    <Button id="random-film-button" variant="primary" target="_blank" href={"https://sakilaspringproject-1655722832050.azurewebsites.net/home/film/random"}>Pick a film</Button>
                </Card.Body>
            </Card>
       );
    }
}

export default WelcomeCard;