import React from "react";
import ExampleComponent from "./Components/ExampleComponent";

function AlertBingle()
{
  alert("Bingle!");

}

function App() {
  return (
    <div className="App">
      <h2>here is an example of compents and properties</h2>
      <ExampleComponent playerName="Anna" role="Consort"></ExampleComponent>
    </div>
  );
}

export default App;
