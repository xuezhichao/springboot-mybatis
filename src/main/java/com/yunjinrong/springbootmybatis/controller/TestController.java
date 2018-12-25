package com.yunjinrong.springbootmybatis.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("test")
public class TestController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    /**
     * logback测试
     */
    @RequestMapping(value = "logbackTest",method = RequestMethod.GET)
    @ResponseBody
    public String toBase() {
//        try{
//            int i =1/0;
//        }catch(Exception e){
////            logger.debug("输出debug级别的日志.....");
////            logger.info("输出info级别的日志.....");
////            logger.error("输出error级别的日志.....");
//            logger.error("登录报错：风控调用超时",e);
//            Person p = new Person();
//            if(p == null){
//                logger.info("人员信息：{}",p);
//            }else{
//                logger.info("人员信息else：{}",p);
//            }
//        }
        System.out.println("继续执行。。。。。");
        return "logbackTest";
    }

}