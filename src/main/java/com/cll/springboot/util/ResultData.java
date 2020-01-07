package com.cll.springboot.util;

/**
 * @ClassName ResultData
 * @Description TODO
 * @Author cll
 * @Date 2020-01-06 21:57
 * @Version 1.0
 **/
public class ResultData {

    private String code;
    private Object data;
    private String msg;

    public ResultData(String code, Object data, String msg) {
        this.code = code;
        this.data = data;
        this.msg = msg;
    }

    public static ResultData success(Object data, String msg){
        return new ResultData("200",data,msg);
    }

    public static ResultData success(Object data){
        return success(data,"操作成功");
    }

    public static ResultData success(String msg){
        return success(null,msg);
    }

    public static ResultData success(){
        return success(null,"操作成功");
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
