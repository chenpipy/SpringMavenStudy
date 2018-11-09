package com.tmall.controller;

import com.tmall.service.impl.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

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

    @RequestMapping(value="/getAllStudent",method = RequestMethod.GET)
    public ModelAndView getAllStudent(){
        ModelAndView mav=new ModelAndView();
        mav.setViewName("studentDisplay");
        mav.addObject("students",studentService.getAllStudent());
        return mav;
    }
}
