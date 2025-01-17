import { Fragment } from "react/jsx-runtime";

function ListGroup() {
  const items = ["Hyderbad", "Banglore", "Chennai", "Mumbai"];

  return (
    // <Fragment>
    <>
      {/* Either add Fragment or keep empty braces<></> */}
      <h1>List Group</h1>
      {/* returning h1 and ul is not possible so combined everythin in on div and returning it*/}
      <ul className="list-group">
        {items.map((item) => (
          <li>{item}</li>
        ))}
        {/* put the javascript function inside {} */}
      </ul>
      {/* </Fragment>  */}
    </>
  );
}

export default ListGroup;
