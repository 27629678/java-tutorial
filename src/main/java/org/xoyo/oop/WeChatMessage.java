package org.xoyo.oop;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

public class WeChatMessage {

    private String from;

    private String mesg;

    public WeChatMessage(String json) {
        JSONObject jo = JSON.parseObject(json);
        this.from = jo.getString("from");
        this.mesg = jo.getString("mesg");
    }

    public boolean isValid() {
        return getFrom().length() * getMesg().length() > 0;
    }

    public String getFrom() {
        return from != null ? from : "";
    }

    public String getMesg() {
        return mesg != null ? mesg : "";
    }
}
