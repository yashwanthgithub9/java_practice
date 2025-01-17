import { Fragment } from "react/jsx-runtime";

function ListGroup() {
  let items = ["Hyderbad", "Banglore", "Chennai", "Mumbai"];
  items = ["Delhi"];

  return (
    // <Fragment>
    <>
      {/* Either add Fragment or keep empty braces<></> */}
      <h1>List Group</h1>
      {/* returning h1 and ul is not possible so combined everythin in on div and returning it*/}
      {items.length === 0 && <p>No Items found</p>}
      {/* check for condition, if items is empty then above expression will be true then <p>will be rendered */}
      <ul className="list-group">
        {items.map((item) => (
          <li key={item}>{item}</li>
        ))}
        {/* put the javascript function inside {} */}
      </ul>
      {/* </Fragment>  */}
    </>
  );
}

export default ListGroup;
