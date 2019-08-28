package org.xoyo.base;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/**
 * Class Description
 * Created at 2019-06-17
 *
 * @author hzyuxiaohua@corp.netease.com
 */
public class GenericEntity<M, D> {

    private M model;

    private D data;

    public M getModel() {
        return model;
    }

    public void setModel(M model) {
        this.model = model;
    }

    public D getData() {
        return data;
    }

    public void setData(D data) {
        this.data = data;
    }

    public void foo() {
        Class<?> thisClass = this.getClass();
        Type superClass = thisClass.getGenericSuperclass();
        Class genericClassName = (Class) ((ParameterizedType) superClass).getActualTypeArguments()[0];
        System.out.println(genericClassName);
    }

    @Override
    public String toString() {


//        System.out.println(mClass.getName());
//
//        Class dClass = (Class)((ParameterizedType)getClass().getGenericSuperclass()).getActualTypeArguments()[1];
//
//        System.out.println(dClass.getName());

        return super.toString();
    }
}
