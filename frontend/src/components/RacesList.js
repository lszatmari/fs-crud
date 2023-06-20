import {Table} from "react-bootstrap";
import PropTypes from "prop-types";

const RacesList = ({data}) => {

  return (
    <Table striped bordered hover>
      <thead>
      <tr>
        <th>#</th>
        <th>Name</th>
        <th>Winner</th>
        <th>Country</th>
        <th>Date</th>
        <th>Length (km)</th>
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