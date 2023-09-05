import React from 'react'
import {Link} from 'react-router-dom'
export const Card = ({personaje}) => {
  return (
    <div>
      <div class="col">
  <div class="card shadow-sm">
        <img width="100%" src={personaje.image} alt="IMAGEN" />
    <div class="card-body">
      <p class="card-text">
        {personaje.name}
      </p>
      <div class="d-flex justify-content-between align-items-center">
        <div class="btn-group">
          <button type="button" class="btn btn-sm btn-outline-secondary">
            <Link to={`/details/${personaje.id}`}>
            Details
            </Link>
          </button>
        </div>
        <small class="text-body-secondary">9 mins</small>
      </div>
    </div>
  </div>
</div>;

    </div>
  )
}
