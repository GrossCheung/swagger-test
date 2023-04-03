package com.example.swaggertest.api.code;

/**
 * <p>Title: CommonCode</p>
 * <p>Description: </p>
 *
 * @author ppgg鹏哥哥
 * @version 1.0.0
 * @date 2023/4/3 12:52
 */
public enum CommonCode implements BaseCode {
    /**
     * 返回码
     */
    SUCCESS(0, "success"),
    FAIL(10000, "通用错误信息"),
    SIGN_FAIL(10001, "签名错误"),
    TIME_FAIL(10002, "时间戳超时错误"),
    TOKEN_FAIL(10003, "token错误"),
    AUTH_FAIL(10004, "权限不足"),

    PARAM_ERROR(20000, "参数错误"),
    PARAM_EMPTY_ERROR(20001, "参数为空"),
    PARAM_PATTERN_ERROR(20002, "参数格式不对"),

    FAILED(99999, "系统繁忙，请稍后再试.");
    /**
     * 错误码
     */
    private final int code;
    /**
     * 错误信息
     */
    private final String message;

    CommonCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    @Override
    public int getCode() {
        return code;
    }
    @Override
    public String getMessage() {
        return message;
    }
}
