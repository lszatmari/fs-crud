import {Form, json, redirect, useLoaderData} from "react-router-dom";
import {FormControl, FormSelect} from "react-bootstrap";

const RaceForm = () => {
  const info = useLoaderData();

  return (
    <Form className="col-md-4" method="post">
      <div className="my-3">
        <label className="fs-6" htmlFor="destination">Race destination</label>
        <FormSelect size="lg" className="custom-select" name="destination" id="destination">
          {
            info.destinations.map(destination => <option key={destination.id}
                                                         value={destination.id}>{destination.name}</option>)
          }
        </FormSelect>
      </div>
      <div className="my-3">
        <label className="fs-6" htmlFor="race-winner">Race winner</label>
        <FormSelect size="lg" name="race-winner" id="race-winner">
          {
            info.pilots.map(pilot => <option key={pilot.id} value={pilot.id}>{pilot.name}</option>)
          }
        </FormSelect>
      </div>
      <div className="col-6 my-3">
        <label className="fs-6" htmlFor="race-date">Race date</label>
        <FormControl className="d-block" id="race-date" name="race-date" type="date" required/>
      </div>
      <div>
        <button className="btn btn-primary">Save</button>
      </div>
    </Form>
  );
}

export const action = async ({request, params}) => {
  const data = await request.formData();

  const eventData = {
    destination: data.get('destination'),
    raceWinner: data.get('race-winner'),
    dateOfRace: data.get('race-date'),
    numberOfDNFs: 1
  };

  console.log(JSON.stringify(eventData));

  const response = await fetch('http://localhost:8080/races/add', {
    method: "POST",
    headers: {
      'Content-Type': 'application/json',
    },
    body: JSON.stringify(eventData),
  });

  if (!response.ok) {
    throw json({message: 'Could not save event'}, {status: 500});
  }

  return redirect("/");
}

export const loader = async () => {
  const response = await fetch('http://localhost:8080/races/get-all-info');

  return response;
}

export default RaceForm;