package com.example.swaggertest.bean;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * <p>Title: UserVo</p>
 * <p>Description: </p>
 *
 * @author ppgg鹏哥哥
 * @version 1.0.0
 * @date 2023/4/3 12:47
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserVO {
    /**
     * 用户id
     */
    @ApiModelProperty(value = "用户id", name = "用户name", allowableValues="123")
    private Long userId;
    /**
     * 用户名
     */
    private String userName;
    /**
     * 用户性别
     */
    private Integer userSex;
}