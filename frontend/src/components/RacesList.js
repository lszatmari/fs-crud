import {Table} from "react-bootstrap";
import PropTypes from "prop-types";
import {useNavigate} from "react-router-dom";

import './RaceList.style.css';

const RacesList = ({data, deleteHandler}) => {

    const navigate = useNavigate();

    const handleEdit = () => {
        navigate('/')
    }

  return (
    <Table striped bordered hover responsive className="race-list-table">
      <thead>
      <tr>
        <th>#</th>
        <th>Name</th>
        <th>Winner</th>
        <th>Country</th>
        <th>Date</th>
        <th>Length (km)</th>
        <th>Action</th>
      </tr>
      </thead>
      <tbody>
      {data.map(item => (
        <tr key={item.id}>
          <td>{item.id}</td>
          <td>{item.destination.name}</td>
          <td>{item.raceWinner.name}</td>
          <td>{item.destination.country}</td>
          <td>{item.dateOfRace}</td>
          <td>{item.destination.length}</td>
          <td>
              <div className="d-flex justify-content-evenly">
                  <button onClick={deleteHandler.bind(this, item.id)} className="btn btn-danger">Delete</button>
                  <button onClick={handleEdit} className="btn btn-outline-primary">Edit</button>
              </div>
          </td>
        </tr>
      ))}

      </tbody>
    </Table>
  );
}

export default RacesList;

RacesList.prototype = {
  id: PropTypes.number,
  name: PropTypes.string,
  country: PropTypes.string,
  raceWinner: PropTypes.object,
  destination: PropTypes.object,
  item: PropTypes.object,
  length: PropTypes.number,
  dateOfRace: PropTypes.string,
}