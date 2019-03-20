package org.xoyo.base;

import org.xoyo.TestingRunner;
import org.xoyo.annotation.SanityCheck;

import java.lang.reflect.Field;
import java.util.Arrays;

public class DescriptionObject {

    public void description() {
        System.out.println("======" + this.getClass().getName() + "======");
    }

    public String sanityCheckMessage(String fieldName) {
        for (Field f: Arrays.asList(this.getClass().getFields())) {
            if (!f.getName().equals(fieldName)) {
                continue;
            }

            SanityCheck sc = (SanityCheck)f.getAnnotation(SanityCheck.class);
            return sc.mesg();
        }

        return "no more message";
    }
}
