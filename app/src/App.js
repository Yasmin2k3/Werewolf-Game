import React, { useEffect, useState } from "react";


function App() {
  const [messages, setMessages] = useState([]);
  const [input, setInput] = useState("");
  let socket;

  useEffect(() => {
    // Connect to the WebSocket server
    socket = new WebSocket("ws://localhost:8080/ws");

    // Handle incoming messages
    socket.onmessage = (event) => {
      setMessages((prevMessages) => [...prevMessages, event.data]);
    };

    // Cleanup on component unmount
    return () => {
      socket.close();
    };
  }, []);

  const sendMessage = () => {
    if (socket && input.trim()) {
      socket.send(input); // Send the input message to the backend
      setInput(""); // Clear the input field
    }
  };

  return (
    <div className="App">
      <h1>WebSocket Chat</h1>
      <div>
        <input
          type="text"
          value={input}
          onChange={(e) => setInput(e.target.value)}
          placeholder="Type a message"
        />
        <button onClick={sendMessage}>Send</button>
      </div>
      <div>
        <h2>Messages:</h2>
        <ul>
          {messages.map((msg, index) => (
            <li key={index}>{msg}</li>
          ))}
        </ul>
      </div>
    </div>
  );
}

export default App;
