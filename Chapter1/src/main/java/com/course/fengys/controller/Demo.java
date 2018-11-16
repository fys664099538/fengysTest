//package com.course.fengys.controller;
//
//
//import com.course.fengys.model.User;
//import io.swagger.annotations.Api;
//import io.swagger.annotations.ApiOperation;
//import org.mybatis.spring.SqlSessionTemplate;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@Api(value = "v1",description = "firstDemo")
//@RequestMapping("/v1")
//public class Demo {
//    //首先获取第一个执行sql语句对象
//    @Autowired
//    private SqlSessionTemplate template;
//
//    @ApiOperation(value="可以获取到用户数",httpMethod = "GET")
//    @RequestMapping(value = "/getUserCount",method = RequestMethod.GET)
//    public int getUserCount(){
//        return template.selectOne("getUserCount");
//    }
//
//    @RequestMapping(value = "/addUser",method = RequestMethod.POST)
//    public int addUser(@RequestBody User user){
//        int result = template.insert("addUser",user);
//        return result;
//    }
//
//    @RequestMapping(value = "/updateUser",method = RequestMethod.POST)
//    public int updateUser(@RequestBody User user){
//        int result = template.update("updateUser",user);
//        return result;
//    }
//
//    @RequestMapping(value = "deleteUser",method = RequestMethod.GET)
//    public int deleteUser(@RequestParam int id){
//        int result = template.delete("deleteUser",id);
//        return result;
//    }
//}
