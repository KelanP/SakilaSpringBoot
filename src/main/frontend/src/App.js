import './App.css';
import 'bootstrap/dist/css/bootstrap.min.css';

import NavBar from "./components/NavBar";
import Footer from "./components/Footer";


import React from 'react';

function App() {
  return (
    <div className="App">
        <img alt="moviezone logo" class ="logo-center logo-responsive" src={"https://i.imgur.com/ge2l0jq.png"} height="100" />
        <NavBar/>

        <Footer/>
    </div>
    
  );
}

export default App;
