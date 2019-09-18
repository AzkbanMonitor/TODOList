package com.az.todo.vo;

import com.az.todo.exception.ErrorCode;
import com.az.todo.exception.GeneralException;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ResultVo<T> {
    /**
     * 错误码
     */
    private String code;

    /**
     * 非200的时候是错误信息
     */
    private String message;

    /**
     * 内容
     */
    private T data;

    /**
     * 返回正确结果
     *
     * @param data
     * @param message
     * @param <T>
     * @return
     */
    public static <T> ResultVo<T> genSucResult(T data, String message) {
        return ResultVo.<T>builder()
                .code(ErrorCode.SUCCESS.getErrorCode())
                .message(null == message ? ErrorCode.SUCCESS.getErrorMsg() : message)
                .data(data)
                .build();
    }

    public static <T> ResultVo<T> genSucResult(T data) {
        return ResultVo.<T>builder()
                .code(ErrorCode.SUCCESS.getErrorCode())
                .message(ErrorCode.SUCCESS.getErrorMsg())
                .data(data)
                .build();
    }


    public static ResultVo genSucResult(String message) {
        return genSucResult(null, message);
    }


    public static ResultVo genSucResult() {
        return genSucResult(null, null);
    }

    public static ResultVo genFailResult(@NonNull GeneralException ex) {
        return ResultVo.builder()
                .code(ex.getErrorCode().getErrorCode())
                .message(null == ex.getMessage() ? ErrorCode.SYS_ERROR.getErrorMsg() : ex.getMessage())
                .build();
    }

    public static <T> ResultVo genFailResult(String message, T data) {
        return ResultVo.builder().code(ErrorCode.SYS_ERROR.getErrorCode())
                .message(message).data(data).build();
    }

    public static ResultVo genFailResult(ErrorCode errorCode, String message) {
        return ResultVo.builder().code(errorCode.getErrorCode()).message(message).build();
    }
}
