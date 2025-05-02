import './App.css'


function App() {

  return (
    <>
      <div className="calc-container bg-blue-950 h-auto w-auto rounded-xl flex-col m-2 content-center items-center">
        <h1 className='text-balance text-shadow-teal-50 p-2.5'> Calculator</h1>
        <div className="result h-20 bg-blue-400 m-2 rounded-xl">
               
        </div>
        <div className="grid grid-cols-4 gap- 2 buttons rounded-xl m-2 flex-1/12 content-center">
          <button className="size-fitss mb-1.5 pb-2">1</button>
          <button>2</button>
          <button>3</button>
          <button>4</button>
          <button>5</button>
          <button>6</button>
          <button>7</button>
          <button>8</button>
          <button>9</button>
          <button>0</button>
          <button>*</button>
          <button>+</button>
          <button>-</button>
          <button>/</button>
          <button>%</button>
          <button>.</button>
          <button>.</button>
          <button>.</button>
          <button>.</button>
          <button>.</button>
          <button>.</button>
          <button>.</button>
          <button>.</button>

        </div>
        <div className="calc rounded-xl">
          <button type="reset">Clear</button>
          <button type="submit">=</button>
        </div>
      </div>
    </>

  )
}

export default App


// import React, { useState } from 'react';

// function Calculator() {
//   const [display, setDisplay] = useState('0');
//   const [firstOperand, setFirstOperand] = useState(null);
//   const [operator, setOperator] = useState(null);
//   const [waitingForSecondOperand, setWaitingForSecondOperand] = useState(false);

//   const handleNumberClick = (number) => {
//     if (waitingForSecondOperand) {
//       setDisplay(String(number));
//       setWaitingForSecondOperand(false);
//     } else {
//       setDisplay(display === '0' ? String(number) : display + number);
//     }
//   };

//   const handleOperatorClick = (nextOperator) => {
//     if (firstOperand === null) {
//       setFirstOperand(Number(display));
//     } else if (operator) {
//       const result = calculate(firstOperand, Number(display), operator);
//       setDisplay(String(result));
//       setFirstOperand(result);
//     }

//     setWaitingForSecondOperand(true);
//     setOperator(nextOperator);
//   };

//   const handleEqualClick = () => {
//     if (operator) {
//       const result = calculate(firstOperand, Number(display), operator);
//       setDisplay(String(result));
//       setFirstOperand(null);
//       setOperator(null);
//       setWaitingForSecondOperand(true);
//     }
//   };

//   const handleClearClick = () => {
//     setDisplay('0');
//     setFirstOperand(null);
//     setOperator(null);
//     setWaitingForSecondOperand(false);
//   };

//   const calculate = (firstOperand, secondOperand, operator) => {
//     switch (operator) {
//       case '+':
//         return firstOperand + secondOperand;
//       case '-':
//         return firstOperand - secondOperand;
//       case '*':
//         return firstOperand * secondOperand;
//       case '/':
//         return firstOperand / secondOperand;
//       default:
//         return secondOperand;
//     }
//   };

//   return (
//     <div>
//       <h1>Calculator</h1>
//       <div className="display">{display}</div>
//       <div className="buttons">
//         <button onClick={() => handleClearClick()}>C</button>
//         <button onClick={() => handleOperatorClick('/')}>/</button>
//         <button onClick={() => handleNumberClick(7)}>7</button>
//         <button onClick={() => handleNumberClick(8)}>8</button>
//         <button onClick={() => handleNumberClick(9)}>9</button>
//         <button onClick={() => handleOperatorClick('*')}>*</button>
//         <button onClick={() => handleNumberClick(4)}>4</button>
//         <button onClick={() => handleNumberClick(5)}>5</button>
//         <button onClick={() => handleNumberClick(6)}>6</button>
//         <button onClick={() => handleOperatorClick('-')}>-</button>
//         <button onClick={() => handleNumberClick(1)}>1</button>
//         <button onClick={() => handleNumberClick(2)}>2</button>
//         <button onClick={() => handleNumberClick(3)}>3</button>
//         <button onClick={() => handleOperatorClick('+')}>+</button>
//         <button onClick={() => handleNumberClick(0)}>0</button>
//         <button onClick={() => handleEqualClick()}>=</button>
//       </div>
//     </div>
//   );
// }

// export default Calculator;