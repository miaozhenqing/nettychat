package com.example.qzm.nettychat.abstracts.classes;

import com.example.qzm.nettychat.abstracts.Packet;
import com.example.qzm.nettychat.common.SystemConstant;

import static com.example.qzm.nettychat.interfaces.Command.LOGIN_REQUEST;


/**
 * @ClassName LoginRequestPacket
 * 登录请求数据包
 * @Author Mzq
 * @Date 2019/3/5 9:22
 * @Version 1.0
 **/
public class LoginRequestPacket extends Packet {
    private String userId;

    private String username;

    private String password;

    @Override
    public Byte getCommand() {

        return LOGIN_REQUEST;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
