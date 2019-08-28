package org.xoyo.oop;

/**
 * Class Description
 * Created at 2019-05-18
 *
 * @author hzyuxiaohua@corp.netease.com
 */
public class HttpResponse<T> {

    private Integer code;

    private String errCode;

    private T data;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getErrCode() {
        return errCode;
    }

    public void setErrCode(String errCode) {
        this.errCode = errCode;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "HttpResponse{" +
                "code=" + code +
                ", errCode='" + errCode + '\'' +
                ", data=" + data +
                '}';
    }
}
