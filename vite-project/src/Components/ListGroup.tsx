import { Fragment } from "react/jsx-runtime";

function ListGroup() {
  return (
    // <Fragment>
    <>
      {/* Either add Fragment or keep empty braces<></> */}
<h1>List Group</h1> 
{/* returning h1 and ul is not possible so combined everythin in on div and returning it*/}
    <ol className="list-group">
      <li className="list-group-item">A second item</li>
      <li className="list-group-item">A third item</li>
      <li className="list-group-item">An item</li>
      <li className="list-group-item">A fourth item</li>
      <li className="list-group-item">And a fifth one</li>
    </ol>
    {/* </Fragment>  */}
    </>
  );
}

export default ListGroup;
