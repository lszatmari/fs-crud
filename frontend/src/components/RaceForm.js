import {Form, json, redirect, useLoaderData} from "react-router-dom";

const RaceForm = () => {
  const pilots = useLoaderData();

  return (
    <Form method="post">
      <p>
        <label htmlFor="destination">Race destination</label>
        <input id="destination" name="destination" type="text" required/>
      </p>
      <p>
        <label htmlFor="race-winner">Race winner</label>
        <select name="race-winner" id="race-winner">
          {
            pilots.map(pilot => <option key={pilot.id} value={pilot.id}>{pilot.name}</option>)
          }
        </select>
      </p>
      <p>
        <label htmlFor="race-date">Race date</label>
        <input id="race-date" name="race-date" type="datetime-local" required/>
      </p>
      <div>
        <button>Save</button>
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
  const response = await fetch('http://localhost:8080/get-all-pilots');

  return response;
}

export default RaceForm;