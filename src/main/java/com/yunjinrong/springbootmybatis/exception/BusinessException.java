package com.yunjinrong.springbootmybatis.exception;

public class BusinessException extends RuntimeException{
    private static final long serialVersionUID = 1L;

    private String code;

    public BusinessException(String code, String message, Throwable cause) {
        super(message, cause);
        this.code = code;
    }
    public BusinessException(String code, String message) {
        this(code, message, null);
    }
    //业务异常不需要dump thread
    @Override
    public synchronized Throwable fillInStackTrace() {
        return this;
    }

    public String getCode() {
        return code;
    }

    @Override
    public String toString() {
        return "code: " + code + ", message: " + getMessage();
    }
}
