import './App.css';
import React from 'react';
import NavBar from "./components/NavBar";
import Card from "react-bootstrap/card";
import Button from "react-bootstrap/Button";


import 'bootstrap/dist/css/bootstrap.min.css';




function App() {
  return (
    <div className="App">
        <img alt="moviezone logo" src={"https://i.imgur.com/ge2l0jq.png"} height="100" />
        <NavBar/>

        <Card style={{ width: '90%',left:'5%',right:'5%',top:'5px' }}>

            <Card.Body>
                <Card.Title>Welcome</Card.Title>
                <Card.Text>
                    Why use Netflix or other streaming platforms when you can come to <em>Movie Zone</em> and pick
                    up a film. It's less inconvenient than you think.
                </Card.Text>

                <Button variant="primary" target="_blank" href={"https://sakilaspringproject-1655722832050.azurewebsites.net/home/film/random"}>Pick a film</Button>
            </Card.Body>
        </Card>



    </div>
  );
}

export default App;
