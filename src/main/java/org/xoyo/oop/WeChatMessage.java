package org.xoyo.oop;

import org.apache.commons.lang3.StringUtils;

public class WeChatMessage extends MessagePayload {

    private String from;

    private String mesg;

    public WeChatMessage() {
        super();
    }

    public WeChatMessage(String json) {
        super(json);
    }

    public boolean isValid() {
        return StringUtils.isNotBlank(from) && StringUtils.isNotEmpty(mesg);
    }

    public String getFrom() {
        return from != null ? from : "";
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getMesg() {
        return mesg != null ? mesg : "";
    }

    public void setMesg(String mesg) {
        this.mesg = mesg;
    }

    @Override
    public String toString() {
        return "WeChatMessage{" +
                "from='" + from + '\'' +
                ", mesg='" + mesg + '\'' +
                '}';
    }
}
