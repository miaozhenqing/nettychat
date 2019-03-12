package com.example.qzm.nettychat.abstracts.classes;


import com.example.qzm.nettychat.abstracts.Packet;
import lombok.Data;

import static com.example.qzm.nettychat.interfaces.Command.MESSAGE_REQUEST;
@Data
public class MessageRequestPacket extends Packet {

    private String message;

    @Override
    public Byte getCommand() {
        return MESSAGE_REQUEST;
    }
}
