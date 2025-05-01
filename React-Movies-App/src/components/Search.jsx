import React from 'react'

const Search = (searchItem,setSearchItem) => {
  return (
    <div className="search">
        <div>
            <img src="./search.svg" alt="" />
            <input type="text" name="" id="" 
            placeholder='Search for your favourite movie'
            onChange={(e)=>searchItem(e.target.value)}/>
        </div>
    </div>
  )
}

export default Search