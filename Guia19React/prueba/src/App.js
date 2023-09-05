import "./App.css";
import { Header } from "./components/public/Header";
import { Main } from "./components/public/Main";
import { Footer } from "./components/public/Footer";

function App() {
  return (
    <div class="container-fluid m-0 p-0 d-flex row ">
      <Header />
      <div class="container-fluid p-0 m-0 d-flex row">
      <Main />
      </div>
      <div class="container-fluid m-0 p-0">
      <Footer/>
      </div>
    </div>
  );
}

export default App;
