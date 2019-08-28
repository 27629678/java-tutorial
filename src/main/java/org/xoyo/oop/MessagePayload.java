package org.xoyo.oop;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

public class MessagePayload implements MessageDebugDescriptionInterface {

    private String mid;

    private Integer type;

    private String source;

    private String content;

    public MessagePayload() {

    }

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

    @Override
    public void debugDescription() {
        System.out.println(this.getClass().toString());
    }
}
