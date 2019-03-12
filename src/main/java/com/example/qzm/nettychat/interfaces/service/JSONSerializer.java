package com.example.qzm.nettychat.interfaces.service;

import com.example.qzm.nettychat.interfaces.Serializer;
import com.alibaba.fastjson.JSON;

/**
 * @ClassName JSONSerializer
 * @Description TODO
 * @Author Mzq
 * @Date 2019/3/5 9:32
 * @Version 1.0
 **/
public class JSONSerializer implements Serializer {
    @Override
    public byte getSerializerAlogrithm() {

        return SerializerAlgorithm.JSON;
    }

    @Override
    public byte[] serialize(Object object) {

        return JSON.toJSONBytes(object);
    }

    @Override
    public <T> T deserialize(Class<T> clazz, byte[] bytes) {

        return JSON.parseObject(bytes, clazz);
    }
}
