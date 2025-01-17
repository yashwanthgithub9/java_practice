import { Fragment } from "react/jsx-runtime";
import { MouseEvent } from "react";

function ListGroup() {
  let items = ["Hyderbad", "Banglore", "Chennai", "Mumbai"];
  // items = ["Delhi"];
  const handler = (event: MouseEvent) => console.log(event);
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
          <li className="list-group-item" key={item} onClick={handler}>
            {" "}
            {/* Bootstrap class to format list groups*/}
            {item}
          </li>
        ))}
        {/* put the javascript function inside {} */}
      </ul>
      {/* </Fragment>  */}
    </>
  );
}

export default ListGroup;
