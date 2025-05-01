import React from 'react'

const Search = ({searchItem,setSearchItem}) => { // keeping {} will destructure the objects
  return (
    <div className="search">
        <div>
            <img src="./search.svg" alt="" />
            <input type="text" name="" id="" 
            placeholder='Search for your favourite movie'
            value={searchItem}
            onChange={(e)=>setSearchItem(e.target.value)}/>
        </div>

    </div>
  )
}

export default Search