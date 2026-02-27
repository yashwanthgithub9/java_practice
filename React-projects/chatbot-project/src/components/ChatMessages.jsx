 import { useEffect, useRef } from "react";
 import { ChatMessage } from './ChatMessage.jsx';

 export function ChatMessages({chatMessages}){
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