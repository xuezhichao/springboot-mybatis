package com.yunjinrong.springbootmybatis.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yunjinrong.springbootmybatis.model.Student;
import com.yunjinrong.springbootmybatis.service.StuService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

@Api(value="学生信息")
@RestController("/student")
public class StudentController {
	
	@Resource
	StuService stuService;
	
	@ApiOperation(value = "学生新增",notes="学生新增")
    @ApiImplicitParams({
    @ApiImplicitParam(paramType="body",dataType="Student",name="stu",value="学生",required=true)})
	@RequestMapping(value="insetStu",method=RequestMethod.POST)
	public Student insertStu(@RequestBody Student stu) {
		stu=stuService.insertStu(stu);
		return stu;
	}
	
	@ApiOperation(value = "学生修改",notes="学生修改")
    @ApiImplicitParams({
    @ApiImplicitParam(paramType="body",dataType="Student",name="stu",value="学生",required=true)})
	@RequestMapping(value="updateStu",method=RequestMethod.POST)
	public Student updateStu(@RequestBody Student stu) {
		stu = stuService.updateStu(stu);
		return stu;
	}
	
	@ApiOperation(value = "学生查询",notes="学生查询")
    @ApiImplicitParams({
    @ApiImplicitParam(paramType="query",dataType="String",name="stuId",value="学生id",required=true)})
	@RequestMapping(value="findStuById",method=RequestMethod.GET)
	public Student findStuById(@RequestParam String stuId) {
		Student s=stuService.findStuById(stuId);
		return s;
	}
	
	@ApiOperation(value = "学生删除",notes="学生删除")
    @ApiImplicitParams({
    @ApiImplicitParam(paramType="query",dataType="String",name="stuId",value="学生id",required=true)})
	@RequestMapping(value="delById",method=RequestMethod.GET)
	public void delById(@RequestParam String stuId) {
		stuService.delStu(stuId);
	}

}
