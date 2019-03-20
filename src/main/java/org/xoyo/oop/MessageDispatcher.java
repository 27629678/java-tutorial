package org.xoyo.oop;

import org.xoyo.TestingRunner;
import org.xoyo.base.DescriptionObject;

public class MessageDispatcher extends DescriptionObject implements TestingRunner {

    @Override
    public void run() {
        description();

        String json = "{\"mid\":\"1553081989\",\"type\":1,\"source\":\"apple\",\"content\":\"{\\\"from\\\":\\\"hzyuxiaohua\\\",\\\"mesg\\\":\\\"hello, world.\\\"}\"}";
        MessagePayload payload = new MessagePayload(json);

        if (payload.getType() == 1) {
            WeChatMessage mesg = new WeChatMessage(payload.getContent());

            if (mesg.isValid()) {
                System.out.println("WeChat Message: " + mesg.getMesg());
            }
        }
    }
}
