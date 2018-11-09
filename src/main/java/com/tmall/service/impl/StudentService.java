package com.tmall.service.impl;

import com.tmall.dao.StudentDao;
import com.tmall.model.Student;
import com.tmall.service.IStudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author chenjun on 2018/11/9
 */
@Service
public class StudentService implements IStudentService {

    @Resource
    private StudentDao studentDao;
    /**
     * 查询所有的学生数据
     * @return List<Student>
     */
    public List<Student> getAllStudent() {
        return studentDao.findAll();
    }
}
