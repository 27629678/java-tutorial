package org.xoyo.fastjson;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import org.xoyo.TestingRunner;
import org.xoyo.annotation.Committer;
import org.xoyo.annotation.MethodHook;
import org.xoyo.annotation.SanityCheck;
import org.xoyo.base.DescriptionObject;
import org.xoyo.oop.HttpResponse;
import org.xoyo.oop.WeChatMessage;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;

public class FastJsonRunner extends DescriptionObject implements TestingRunner {

    private CokeCola cola;

    final static Type type = new TypeReference<HttpResponse<List<WeChatMessage>>>() {}.getType();

    public CokeCola getCola() {
        if (cola == null) {
            this.cola = new CokeCola("cocacola", 350);
        }

        return cola;
    }

    @Override
    public void run() {
        description();

        Object obj = JSON.toJSON(getCola());
        String json = obj.toString();
        System.out.println(json);
//
//        JSONObject target = JSON.parseObject(json);
//        System.out.println(target);
//
//        String name = target.getString("name");
//        System.out.println("name:" + name);
//
//        CokeCola newCola = JSONObject.toJavaObject(target, CokeCola.class);
//        System.out.println(newCola.getName());
//
//        if (CokeCola.class.isAnnotationPresent(Committer.class)) {
//            Committer committer = (Committer)CokeCola.class.getAnnotation(Committer.class);
//            System.out.println(committer.author());
//        }
//
//        for (Method m : Arrays.asList(CokeCola.class.getMethods())) {
//            if (m.getName().equals("greeting")) {
//                MethodHook hook = (MethodHook)m.getAnnotation(MethodHook.class);
//                System.out.println(hook.key() + ' ' + hook.value());
//            }
//        }
//
//        System.out.println(newCola.sanityCheckMessage("batchNumber"));


//        String json = "{\"code\": 200,\"errCode\": \"success\",\"data\": [{\"from\": \"hzyuxiaohua\",\"mesg\": \"hi, ...\"}]}";

//        System.out.println(type.toString());
//        System.out.println(type.getTypeName());
//
//        HttpResponse<List<WeChatMessage>> resp = JSON.parseObject(json, type);
//
//        System.out.println(resp.getData());
    }
}
