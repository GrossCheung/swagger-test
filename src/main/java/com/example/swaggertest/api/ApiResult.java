package com.example.swaggertest.api;

/*
  <p>Title: ApiResult</p>
  <p>Description: Api接口返回结构</p>
  @author ppgg鹏哥哥
 * @version 1.0.0
 * @date 2023/4/3 12:51
 */

import com.example.swaggertest.api.code.BaseCode;
import com.example.swaggertest.api.code.CommonCode;

public class ApiResult<T> {
    private int code;
    private String message;
    private T data;

    protected ApiResult() {
    }

    /**
     * code和message构造函数
     * @param code 错误码
     * @param message 错误信息
     */
    protected ApiResult(int code, String message) {
        this.code = code;
        this.message = message;
    }

    /**
     * 全参构造函数
     * @param code 错误码
     * @param message 错误信息
     * @param data
     */
    protected ApiResult(int code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    /**
     * 成功返回结果
     */
    public static <T> ApiResult<T> success() {
        return new ApiResult<T>(CommonCode.SUCCESS.getCode(), CommonCode.SUCCESS.getMessage());
    }

    /**
     * 成功返回结果
     *
     * @param data 返回的数据
     */
    public static <T> ApiResult<T> success(T data) {
        return new ApiResult<T>(CommonCode.SUCCESS.getCode(), CommonCode.SUCCESS.getMessage(), data);
    }

    /**
     * 失败返回结果
     */
    public static <T> ApiResult<T> failed(BaseCode baseCode) {
        return new ApiResult<T>(baseCode.getCode(), baseCode.getMessage(), null);
    }

    /**
     * 失败返回结果  code 99999
     *
     * @param message 错误信息 提示信息
     */
    public static <T> ApiResult<T> failed(String message) {
        return new ApiResult<T>(CommonCode.FAILED.getCode(), message, null);
    }

    /**
     * 失败返回结果
     *
     * @param baseCode 错误码
     * @param message 错误信息  错误信息
     */
    public static <T> ApiResult<T> failed(BaseCode baseCode, String message) {
        return new ApiResult<T>(baseCode.getCode(), message, null);
    }

    /**
     * 失败返回结果
     *
     * @param code 错误码    错误码
     * @param message 错误信息 错误信息
     */
    public static <T> ApiResult<T> failed(int code, String message) {
        return new ApiResult<T>(code, message, null);
    }
    public static <T> ApiResult<T> failed(int code, String message, T data) {
        return new ApiResult<T>(code, message, data);
    }
    public long getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
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
}
