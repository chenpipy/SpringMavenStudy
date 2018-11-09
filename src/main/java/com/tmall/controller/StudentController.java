package com.tmall.controller;

import com.alibaba.fastjson.JSON;
import com.tmall.service.impl.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * 学习用的controller
 *
 * @author chenjun on 2018/11/9
 */
@Controller
@RequestMapping(value = "student")
public class StudentController {

    @Resource
    private StudentService studentService;
    protected final Logger logger = LoggerFactory.getLogger(this.getClass());

    @RequestMapping(value = "/getAllStudent", method = RequestMethod.GET)
    @ResponseBody
    public String getAllStudent() {
        Map<String, Object> map = new HashMap();
        try {
            map.put("code",1);
            map.put("data", 1/0);
        } catch (Exception e) {
            map.put("code",0);
            map.put("message",e.getMessage());
            System.out.println();
            logger.error(e.getMessage());
        }
        return JSON.toJSONString(map);
    }
}
