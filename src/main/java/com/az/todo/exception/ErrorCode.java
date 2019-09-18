package com.az.todo.exception;

/**
 * 错误码
 *
 * @author Lenovo
 */
public enum ErrorCode {

    PARAM_ERROR("601", "参数异常"),
    DATA_ERROR("602", "数据异常"),
    SYS_ERROR("501", "系统异常"),
    SUCCESS("200", "操作成功"),
    AUTH_ERROR("2", "找不到客户端认证信息(Header: Authorization)");

    private String errorMsg;
    private String errorCode;

    ErrorCode(String errorCode, String errorMsg) {
        this.errorMsg = errorMsg;
        this.errorCode = errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }
}
