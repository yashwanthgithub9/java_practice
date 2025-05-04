import { useState } from 'react';
import './App.css'
import { useCallback } from 'react';


function App() {
  const [display, setDisplay] = useState('');
  const [firstOperand, setFirstOperand] = useState(null);
  const [operator, setOperator] = useState(null);
  const [waitingForSecondOperand, setWaitingForSecondOperand] = useState(false)  ;
  const handleNumberClick=useCallback((num)=>{
    console.log(num)
    setDisplay((prevDisplay) => {
      if (waitingForSecondOperand) {
        setWaitingForSecondOperand(false);
        return String(num);
      } else {
        return prevDisplay === '0' ? String(num) : prevDisplay + num;
      }
  })
});
const handleOperator= useCallback(
  (nextOperator) => {
    setWaitingForSecondOperand(true);

    if (firstOperand === null) {
      setFirstOperand(Number(display));
      setOperator(nextOperator);
      return;
    }

    if (operator) {
      const result = calculate(firstOperand, Number(display), operator);
      setDisplay(String(result));
      setFirstOperand(result);
      setOperator(nextOperator);
    }
  },
  [display, firstOperand, operator]
);

const handleEqualClick = useCallback(() => {
  if (operator) {
    const result = calculate(firstOperand, Number(display), operator);
    setDisplay(String(result));
    setFirstOperand(null);
    setOperator(null);
    setWaitingForSecondOperand(true);
  }
}, [display, firstOperand, operator]);
const handleClearClick = useCallback(() => {
  setDisplay('0');
  setFirstOperand(null);
  setOperator(null);
  setWaitingForSecondOperand(false);
}, []);
const calculate = (firstOperand, secondOperand, operator) => {
  switch (operator) {
    case '+':
      return firstOperand + secondOperand;
    case '-':
      return firstOperand - secondOperand;
    case '*':
      return firstOperand * secondOperand;
    case '/':
      return firstOperand / secondOperand;
    default:
      return secondOperand;
  }
}
  return(
    <>
    <h1>Calculator</h1>
    <div className="calculator bg-white text-black rounded-xl m-2 h-76 flex-col">
        <div className='h-16 items-end ml-2'>
          <h1 className="items-end ml-2">{display}</h1>
          {/* <h1>hi</h1> */}
        </div>
        <div className='buttons grid grid-cols-4 gap-1'>
          <button className="button" onClick={()=>handleNumberClick(7)}>7</button>
          <button className="button" onClick={()=>handleNumberClick(8)}>8</button>
          <button className="button" onClick={()=>handleNumberClick(9)}>9</button>
          <button onClick={()=>handleOperator('+')}>+</button>
          <button className="button" onClick={()=>handleNumberClick(4)}>4</button>
          <button className="button" onClick={()=>handleNumberClick(5)}>5</button>
          <button className="button" onClick={()=>handleNumberClick(6)}>6</button>
          <button onClick={()=>handleOperator('-')}> - </button>
          <button className="button" onClick={()=>handleNumberClick(1)}>1</button>
          <button className="button" onClick={()=>handleNumberClick(2)}>2</button>
          <button className="button" onClick={()=>handleNumberClick(3)}>3</button>
          <button onClick={()=>handleOperator('*')}>*</button>
          <button className="button" onClick={()=>handleNumberClick(0)}>0</button>
          <button onClick={()=>handleEqualClick('=')}>=</button>
          <button onClick={()=>handleClearClick('C')}>C</button>
          <button onClick={()=>handleOperator('/')}>/</button>

        </div>
    </div>
    </>
  )
}

export default App;