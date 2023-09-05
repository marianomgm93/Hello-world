import React, { useEffect, useState } from "react";
import rmservice from "../../services/rmservice";
import { Card } from "./Card";
export const Cards = () => {
    const [personaje,setPersonaje]=useState([]);
    
    useEffect(()=>{
        rmservice.getAllCharacters().then((data)=>setPersonaje(data.results)).catch((error)=>console.log(error));

    },[personaje]);
    const cardList=personaje.map((p)=><Card personaje={p} key={p.id}/>);
    return (
    <div>
      <div class="album py-5 bg-body-tertiary">
        <div class="container">
          <div class="row row-cols-1 row-cols-sm-2 row-cols-md-3 g-3">
            {cardList}
          </div>
        </div>
      </div>
    </div>
  );
};
