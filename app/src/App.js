import React from "react";
import ExampleComponent from "./Components/ExampleComponent";

function AlertBingle()
{
  alert("Bingle!");

}

function App() {
  return (
    <div className="App">
      <h1>here is a button :0</h1>
      <button onClick={AlertBingle}>The Button</button>
      <h1>here is an example of compents and properties</h1>
      <ExampleComponent></ExampleComponent>
    </div>
  );
}

export default App;
