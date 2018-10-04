package com.ryan.demo.controller;


import com.ryan.demo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * describe：
 * Created with IDEA
 * author:ryan
 * Date:2018/10/4
 * Time:下午3:40
 */
@Controller
@RequestMapping("/demo/")
public class TestController {

    @Autowired
    private TestService testService;

    @RequestMapping("test")
    @ResponseBody
    public String first() {
        return testService.getMapperDemo();
    }

}
