package org.xoyo.oop;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.apache.commons.lang3.StringUtils;

public class WeChatMessage {

    private String from;

    private String mesg;

    public WeChatMessage(String json) {
        JSONObject jo = JSON.parseObject(json);
        this.from = jo.getString("from");
        this.mesg = jo.getString("mesg");
    }

    public boolean isValid() {
        return StringUtils.isNotBlank(from) && StringUtils.isNotEmpty(mesg);
    }

    public String getFrom() {
        return from;
    }

    public String getMesg() {
        return mesg;
    }
}
