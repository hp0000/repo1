package socket;

import vo.Message;

import javax.websocket.OnClose;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;
import java.util.ArrayList;
import java.util.List;

@ServerEndpoint("/chatSocket")
public class ChatSocket {

    private String username;
    private static List<Session> sessions=new ArrayList<Session>();
    private static List<String> names=new ArrayList<String>();
    @OnOpen
    public void open(Session session){
        //当前的websocket的session不是servlet里的session
        String queryString=session.getQueryString();
        username=queryString.split("=")[1];
        this.names.add(username);
        this.sessions.add(session);
        String msg="欢迎"+this.username+"进入聊天室";
        Message message=new Message();
        message.setUsernames(this.names);
        message.setWelcome(msg);
//        System.out.println(username);
    }

    @OnMessage
    public void message(Session session){

    }

    @OnClose
    public void close(Session session){

    }
}
