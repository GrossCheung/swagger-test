package com.example.swaggertest.api.code;

/**
 * <p>Title: BaseCode</p>
 * <p>Description: </p>
 *
 * @author ppgg鹏哥哥
 * @version 1.0.0
 * @date 2023/4/3 12:52
 */
/**
 * 0 请求成功
 * 99999 未知失败
 * 1开头为对通用错误信息
 * 2开头为输入参数错误
 * 3开头为业务调用错误
 * 4开头为数据库数据业务错误
 * 5开头为缓存调用错误
 * @description 基础返回码
 * @className BaseCode
 */
public interface BaseCode {

    public int getCode();

    public String getMessage();
}