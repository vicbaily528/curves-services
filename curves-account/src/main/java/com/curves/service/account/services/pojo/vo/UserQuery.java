package com.curves.service.account.services.pojo.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 用户查询对象
 * @author vic
 */
@Data
@ApiModel(value = "UserQuery", description = "用户对象")
public class UserQuery {
    @ApiModelProperty(value = "用户名称")
    private String username;

    @ApiModelProperty(value = "用户密码")
    private String userpass;

    @ApiModelProperty(value = "用户年龄")
    private Integer userage;

    @ApiModelProperty(value = "部门编号")
    private String deptUuid;

    @ApiModelProperty(value = "电话")
    private String phone;

    @ApiModelProperty(value = "邮箱")
    private String email;
}
