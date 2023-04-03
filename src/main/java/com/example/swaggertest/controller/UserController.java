package com.example.swaggertest.controller;

/**
 * <p>Title: UserController</p>
 * <p>Description: </p>
 *
 * @author ppgg鹏哥哥
 * @version 1.0.0
 * @date 2023/4/3 12:45
 */

import com.example.swaggertest.api.ApiResult;
import com.example.swaggertest.bean.UserForm;
import com.example.swaggertest.bean.UserVO;
import com.github.xiaoymin.knife4j.annotations.ApiOperationSupport;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 微信公众号：深入技术架构
 * @description 用户服务-用户管理模块
 */
@Api(value = "用户服务", tags = "用户模块")
@Slf4j
@RestController
public class UserController {

    @ApiOperation(value = "1.创建用户信息")
    @ApiOperationSupport(order = 1)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "userID", value = "用户id", paramType = "query", dataType = "String" ,required = true),
    })
    @PostMapping("user/createUser")
    public ApiResult<UserForm> createUser(@Validated @RequestBody UserForm userForm) {
        return ApiResult.success(userForm);
    }

    @ApiOperation(value = "2.获取用户信息")
    @ApiOperationSupport(order = 2)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "userID", value = "用户id", paramType = "query", dataType = "String"),
    })
    @GetMapping("user/getUser")
    public ApiResult<UserVO> getUser() {
//        UserVO userVO = new UserVO();
//        userVO.setUserId(1L);
//        userVO.setUserName("张三");
//        userVO.setUserSex(1);
//        return ApiResult.success(userVO);
        UserVO userVO=UserVO.builder()
                .userId(1L)
                .userName("张三")
                .userSex(1)
                .build();
        return ApiResult.success(userVO);
    }

}