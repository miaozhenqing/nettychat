package com.example.qzm.nettychat.abstracts;


import jdk.nashorn.internal.objects.annotations.Setter;

/**
 * @ClassName Packet
 * @Description TODO
 * @Author Mzq
 * @Date 2019/3/5 9:19
 * @Version 1.0
 **/
public abstract class Packet {
    /**
     * 协议版本
     */
    private Byte version = 1;

    /**
     * 指令
     */
    public abstract Byte getCommand();

    public Byte getVersion() {
        return version;
    }

    public void setVersion(Byte version) {
        this.version = version;
    }
}
