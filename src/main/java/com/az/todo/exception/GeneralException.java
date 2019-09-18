package com.az.todo.exception;

public class GeneralException extends RuntimeException {
    private ErrorCode errorCode;
    private String errorMsg;

    public GeneralException(ErrorCode errorCode, String errorMsg) {
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }

    public ErrorCode getErrorCode() {
        return errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }
}
