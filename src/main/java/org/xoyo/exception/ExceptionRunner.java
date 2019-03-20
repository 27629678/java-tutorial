package org.xoyo.exception;

import org.xoyo.TestingRunner;
import org.xoyo.base.DescriptionObject;

import java.text.MessageFormat;

public class ExceptionRunner extends DescriptionObject implements TestingRunner {

    private void foo(int idx) throws RuntimeException {
        System.out.println(idx);
        throw new RuntimeException("foo:" + String.valueOf(idx));
    }

    private void bar(int idx) throws RuntimeException {
//        foo(idx);
        try {
            foo(idx);
        }
        catch (Exception e) {
            e.printStackTrace(System.out);
            throw e;
        }
    }


    @Override
    public void run() {
        description();

        System.out.println(MessageFormat.format("{0} {1}", "hello", "world."));

        for(int i = 0; i < 2; i ++) {
//            foo(i);
            try {
                bar(i);
            }
            catch (Exception e) {
                e.printStackTrace(System.out);
            }
        }
    }
}
