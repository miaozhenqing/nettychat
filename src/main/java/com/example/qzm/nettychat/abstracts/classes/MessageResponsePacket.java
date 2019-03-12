package com.example.qzm.nettychat.abstracts.classes;

import com.example.qzm.nettychat.abstracts.Packet;
import lombok.Data;

import static com.example.qzm.nettychat.interfaces.Command.MESSAGE_RESPONSE;
@Data
public class MessageResponsePacket extends Packet {

    private String message;

    @Override
    public Byte getCommand() {

        return MESSAGE_RESPONSE ;
    }
}
