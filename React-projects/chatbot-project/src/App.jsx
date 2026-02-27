import { useState } from 'react'
import { useEffect } from 'react';
import { useRef } from 'react';
// import './chatbot.js'
import {Chatbot} from 'supersimpledev';
// import reactLogo from './assets/react.svg'
// import viteLogo from '/vite.svg'
import './App.css';

import robot from './assets/robot.png';
import user from './assets/user.png'


function ChatInput({chatMessages,setChatMessages}) {
      const [inputText, setInputText]=useState('');
      function saveInputText(event) {
        // console.log(event.target.value)
        setInputText(event.target.value);
      }

      function sendMessage() {
          console.log(inputText);
          const newChatMessages=[
            ...chatMessages,
            {// this is added at the end of current message
              // if we just push its state won't change, hence it can't update UI
              message:inputText,
              sender:'user',
              id:crypto.randomUUID()
            }
          ]
          setChatMessages(newChatMessages)
        const respose=Chatbot.getResponse(inputText)
            setInputText('');
        setChatMessages(
          [
            ...newChatMessages,
            {// this is added at the end of current message
              // if we just push its state won't change, hence it can't update UI
              message:respose,
              sender:'robot',
              id:crypto.randomUUID()
            }
          ]
        )
        console.log(respose)
      }
      return (
        <div className="chat-input-container">
          <input
            placeholder="Send message to chat bot"
            size="25"
            onChange={saveInputText}
            value={inputText}
            className="text-box"
            >
          </input>
          <button
            onClick={sendMessage}
          >Send</button>
        </div>
      );
    }
    function ChatMessage({ message, sender }) { //destructuring at parameter level
      return (
        <div className={sender=='user'?'chat-msg-user':'chat-msg-robot'}>
          {sender === 'robot' && (<img className="img" src={robot} />)}
          <div className="chat-text-msg">
            {message}
            </div>
          {sender === 'user' && <img className="img" src={user} />}
        </div>
      );
    }
 function ChatMessages({chatMessages}){
      const chatMsgRef=useRef(null);
      useEffect(()=>{
        // console.log(chatMsgRef.current);
        const containerElement=chatMsgRef.current;
        if (containerElement) {
          containerElement.scrollTop=containerElement.scrollHeight;
        }
      },[chatMessages]);

     
      return(
        <div className="chat-msgs-container"
        ref={chatMsgRef}>
          {chatMessages.map((chat)=>{
            return(
            <ChatMessage 
              message={chat.message}
              sender={chat.sender}
              key={chat.id}
            />
        );
      })}
      </div>
      );
    }

function App() {
  const [chatMessages, setChatMessages] = useState([{
        message:'Hellooo Chatbot',
        sender:'user',
        id:'id1'
      },{
        message:'Hellooo User',
        sender:'robot',
        id:'id2'
      },{
        message:'Get me Todays date',
        sender:'user',
        id:'id3'
      },{
        message:'Hellooo Chatbot',
        sender:'robot',
        id:'id4'
      }]);
      return(
        <div className="app-container">

        <ChatMessages
          chatMessages={chatMessages}
        />
        <ChatInput 
          chatMessages={chatMessages}
          setChatMessages={setChatMessages}
        />
        </div>
      );
}

export default App
