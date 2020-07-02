package com.example.dxsjy.Util;

/**
 * @program: app01
 * @description: 消息类
 * @author: charles
 * @Create:2020年7月1日08:31:16
 **/

public class Message<T> {
    public Message() {
    }

    public Message(Integer status, String message, T data, Long time) {
        this.status = status;
        this.message = message;
        this.data = data;
        this.time = time;
    }

    /**
     * 状态码
     */
    private Integer status;

    /**
     * 返回信息
     */
    private String message;

    /**
     * 返回的数据类
     */
    private T data;

    /**
     * 时间
     */
    private Long time;

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }
}
