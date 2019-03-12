package com.example.qzm.nettychat.abstracts.classes;


import com.example.qzm.nettychat.abstracts.Packet;

import static com.example.qzm.nettychat.interfaces.Command.LOGIN_RESPONSE;

public class LoginResponsePacket extends Packet {
    private boolean success;

    private String reason;


    @Override
    public Byte getCommand() {
        return LOGIN_RESPONSE ;
    }


    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}
