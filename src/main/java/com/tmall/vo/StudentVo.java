package com.tmall.vo;

import com.tmall.model.Student;

/**
 * 大学学生类
 *
 * @author chenjun on 2018/11/14
 */
public class StudentVo extends Student {
    private String hobby;

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
}
