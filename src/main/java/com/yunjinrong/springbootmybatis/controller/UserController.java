package com.yunjinrong.springbootmybatis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yunjinrong.springbootmybatis.model.User;
import com.yunjinrong.springbootmybatis.service.UserService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

@Api(value="企业信息")
@RestController
public class UserController {

    @Autowired
    private UserService userService;

 /*   @ApiOperation(value = "用户列表查询",notes="用户列表查询")
    @ApiImplicitParams({@ApiImplicitParam(paramType="query",dataType="int",name="page",value="页码",required=true),
    		@ApiImplicitParam(paramType="query",dataType="int",name="rows",value="行数",required=true)})
    @RequestMapping(value="/findUserList",method=RequestMethod.GET)
    public Page<User> findUserList(@RequestParam("page")int page,@RequestParam("rows") int rows) {
    	Page<User> p = userService.findUserList(page,rows);
    	return p;
    }*/
    
    @ApiOperation(value = "用户查询",notes="用户查询")
    @ApiImplicitParams({
    @ApiImplicitParam(paramType="query",dataType="String",name="userId",value="用户id",required=true)})
    @RequestMapping(value="/findUserById",method=RequestMethod.GET)
    public User findUser(@RequestParam String userId) {
    	return userService.fingUserById(userId);
    }
    
    @ApiOperation(value = "用户新增",notes="用户新增")
    @ApiImplicitParams({
    @ApiImplicitParam(paramType="body",dataType="User",name="user",value="用户",required=true)})
    @RequestMapping(value="insertUser",method=RequestMethod.POST)
    public User insertUser(@RequestBody User user) {
    	user=userService.insertUser(user);
    	return user;
    }
    
    @ApiOperation(value = "用户修改",notes="用户修改")
    @ApiImplicitParams({
    @ApiImplicitParam(paramType="body",dataType="User",name="user",value="用户",required=true)})
    @RequestMapping(value="updateUser",method=RequestMethod.POST)
    public User updateUser(@RequestBody User user) {
    	user=userService.updateUserById(user);
    	return user;
    }
    
    @ApiOperation(value = "用户删除",notes="用户删除")
    @ApiImplicitParams({
    @ApiImplicitParam(paramType="query",dataType="String",name="id",value="用户id",required=true)})
    @RequestMapping(value="delUser",method=RequestMethod.DELETE)
    public Boolean delUser(@RequestParam String id) {
    	userService.deleteUser(id);
    	return true;
    }

    @RequestMapping("/testTransaction")
    public void testTransaction(){
        User user = new User();
        user.setName("张三");
        user.setAge(12);
        user.setPassword("123");
        userService.testTransaction2(user);
    }
    
}
