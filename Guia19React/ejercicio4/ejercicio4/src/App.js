import logo from "./logo.svg";
import "./App.css";
import Main from "./public/Main";
import { Footer } from "./public/Footer";
import { Navbar } from "./public/Navbar";
import { Routes, Route } from "react-router-dom";
import { BrowserRouter } from "react-router-dom";
import Main2 from './public/Main2';
function App() {
  return (
    <div>
      <Navbar />
      <Routes>
        <Route exact path="/" element={<Main/>} />
        <Route exact path="/Main2" element={<Main2/>} />
      </Routes>
      <Footer />
    </div>
  );
}

export default App;
