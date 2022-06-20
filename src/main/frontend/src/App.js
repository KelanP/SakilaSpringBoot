import './App.css';
import React from 'react';
import NavBar from "./components/NavBar";
import BasicExample from "./components/BasicExample";
import 'bootstrap/dist/css/bootstrap.min.css';





function App() {
  return (
    <div className="App">
        <img alt="moviezone logo" src={"https://i.imgur.com/ge2l0jq.png"} height="100" />

        <NavBar/>

    </div>
  );
}

export default App;
