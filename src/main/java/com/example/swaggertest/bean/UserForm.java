package com.example.swaggertest.bean;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
/**
 * <p>Title: UserForm</p>
 * <p>Description: </p>
 * @author ppgg鹏哥哥
 * @version 1.0.0
 * @date 2023/4/3 12:54
 */
@Data
@ApiModel(value = "UserForm", description = "用户信息的接收实体对象")
public class UserForm {

    @ApiModelProperty(value = "用户名，示例：张三", required = true)
    @NotNull(message = "请输入用户名")
    @Pattern(regexp = "^\\d+$", message = "用户名格式不正确")
    private String userName;

    @ApiModelProperty(value = "手机号，示例：18300000000", required = true)
    @Pattern(regexp = "^\\d{11}$", message = "手机号格式不正确")
    private String phone;

    @ApiModelProperty(value = "微博ID，示例：12345", required = true)
    @Pattern(regexp = "^\\d{5,20}$", message = "格式不正确")
    private String weiboId;
}