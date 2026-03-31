import React, { useState } from 'react';
import './App.css';

function App() {
  const [output, setOutput] = useState('');

  const getData = () => {
    fetch('http://127.0.0.1:5000/')
      .then(response => response.json())
      .then(data => {
        setOutput(data.message);
      })
      .catch(error => console.error(error));
  };

  return (
    <div className="App">
      <h1>Simple Full Stack App</h1>
      <button onClick={getData}>Get Message</button>
      <p id="output">{output}</p>
    </div>
  );
}

export default App;