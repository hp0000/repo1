package config;

import javax.websocket.Endpoint;
import javax.websocket.server.ServerApplicationConfig;
import javax.websocket.server.ServerEndpointConfig;
import java.util.Set;

/*
实现一个websocket程序的基本操作：
1.开启通道连接
2.客户端给服务器端发送信息
3.服务器端接收信息
4.服务器端给客户端发信息
5.客户端接收信息
6.监听三类基本事件：onopen:打开连接时的响应事件
                 onmessage：发送数据时的响应事件
                 onclose：关闭连接时的响应事件
 */

public class DemoConfig implements ServerApplicationConfig {

    //接口方式
    @Override
    public Set<ServerEndpointConfig> getEndpointConfigs(Set<Class<? extends Endpoint>> set) {
        return null;
    }

    //注解方式
    @Override
    public Set<Class<?>> getAnnotatedEndpointClasses(Set<Class<?>> set) {
        System.out.println("config......"+set.size());

        //返回，提供了过滤的作用
        return set;
    }
}
