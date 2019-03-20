package org.xoyo.oop;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import java.io.Serializable;

public class MessagePayload implements Serializable {

    private String mid;

    private Integer type;

    private String source;

    private String content;

    public MessagePayload(String json) {
        JSONObject jo = JSON.parseObject(json);

        this.mid = jo.getString("mid");
        this.type = jo.getInteger("type");
        this.source = jo.getString("source");
        this.content = jo.getString("content");
    }

    public String getMid() {
        return mid;
    }

    public Integer getType() {
        return type;
    }

    public String getSource() {
        return source;
    }

    public String getContent() {
        return content;
    }
}
