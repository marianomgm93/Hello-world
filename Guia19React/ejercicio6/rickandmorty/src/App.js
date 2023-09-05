import "./App.css";
import { Footer } from "./components/public/Footer";
import Main from "./components/public/Main";
import { Navbar } from './components/public/Navbar';
import { Routes } from 'react-router-dom';
import { Route } from 'react-router-dom';
import { Details } from "./components/public/Details";
import { UserForm } from './components/public/UserForm';
function App() {
  return (
    <div>
      <Navbar />
      <Routes>
        <Route exact path="/" element={<Main/>}/>
        <Route path="/details/:id" element={<Details/>}/>
        <Route path="/userform" element={<UserForm/>}/>
      </Routes>
      <Footer />
    </div>
  );
}

export default App;
