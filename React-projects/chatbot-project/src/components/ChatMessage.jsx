import robot from '../assets/robot.png';
import user from '../assets/user.png'
import dayjs from 'dayjs';
export function ChatMessage({ message, sender,time }) { //destructuring at parameter level
    return (
    <div className={sender=='user'?'chat-msg-user':'chat-msg-robot'}>
        {sender === 'robot' && (<img className="img" src={robot} />)}
        <div className="chat-text-msg">
        {message}
        {/* The "time && (" check is optional. I added it just to be safe. */}
        {time && (
          <div className={sender=='user'?'chat-time-user':'chat-time-robot'}>
            {dayjs(time).format('h:mma')}
          </div>
        )}
        </div>
        {sender === 'user' && <img className="img" src={user} />}
    </div>
    );
}