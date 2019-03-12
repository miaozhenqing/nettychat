package com.example.qzm.nettychat.interfaces;

import com.example.qzm.nettychat.interfaces.service.JSONSerializer;

/**
 * @ClassName Serializer
 * 序列化接口
 * @Author Mzq
 * @Date 2019/3/5 9:26
 * @Version 1.0
 **/
public interface Serializer {
    /**
     * 序列化算法
     */
    byte getSerializerAlogrithm();

    /**
     * java 对象转换成二进制
     */
    byte[] serialize(Object object);

    /**
     * 二进制转换成 java 对象
     */
    <T> T deserialize(Class<T> clazz, byte[] bytes);

    /**
     * json 序列化
     */
    byte JSON_SERIALIZER = 1;

    Serializer DEFAULT = new JSONSerializer();
}
