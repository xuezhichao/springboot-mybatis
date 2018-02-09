package com.yunjinrong.springbootmybatis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.Page;
import com.yunjinrong.springbootmybatis.model.User;
import com.yunjinrong.springbootmybatis.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

@Api(value="企业信息")
@RestController
public class UserController {
//	private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @ApiOperation(value = "用户列表查询",notes="用户列表查询")
    @ApiImplicitParams({@ApiImplicitParam(paramType="query",dataType="int",name="page",value="页码",required=true),
    		@ApiImplicitParam(paramType="query",dataType="int",name="rows",value="行数",required=true)})
    @RequestMapping(value="/findUserList",method=RequestMethod.GET)
    public Page<User> findUserList(@RequestParam("page")int page,@RequestParam("rows") int rows) {
    	Page<User> p = userService.findUserList(page,rows);
    	return p;
    }
    
}
