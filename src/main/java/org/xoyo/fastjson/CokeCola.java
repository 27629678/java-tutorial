package org.xoyo.fastjson;

import org.xoyo.annotation.Committer;
import org.xoyo.annotation.MethodHook;
import org.xoyo.annotation.SanityCheck;
import org.xoyo.base.DescriptionObject;

@Committer
public class CokeCola extends DescriptionObject {
    private String name;
    private Integer volum;

    @SanityCheck(mesg = "生产批次号禁止为空字符串")
    public String batchNumber;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setVolum(Integer volum) {
        this.volum = volum;
    }

    public Integer getVolum() {
        return volum;
    }

    public CokeCola() {}

    public CokeCola(String name, Integer volum) {
        this.name = name;
        this.volum = volum;
    }

    @MethodHook(key = "FastJsonRunner", value = "run")
    public String greeting() {
        System.out.println("Hello, CokeCola.");

        return "OK";
    }
}
