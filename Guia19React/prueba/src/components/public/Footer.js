import React, { useState } from "react";

export const Footer = () => {
  const [click, setClick] = useState(0);

  const sumarClicks = () => {
    setClick(click + 1);
  };
  const restarClicks = () => {
    setClick(click - 1);
  };

  const year = new Date().getFullYear();
  return (
    <div class="container-fluid p-0 m-0">
      <footer class="d-flex flex-wrap justify-content-between align-items-center py-3 px-3 mt-4 border-top text-bg-dark">
        <p class="col-md-4 mb-0">{year} {click}</p>
        <div class="d-flex flex-wrap">
        <button
          className="btn btn-sm btn-outline-success"
          onClick={sumarClicks}
        >
          Sumar clicks
        </button>
        <button
          className="btn btn-sm btn-outline-danger"
          onClick={restarClicks}
        >
          Restar clicks
        </button>
        </div>
      </footer>
    </div>
  );
};

