package com.maxboguslavskyi.service.impl;

import com.maxboguslavskyi.entity.Student;
import com.maxboguslavskyi.service.StudentService;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    @Override
    public Student getStudent(String login) {
        Student student = new Student();
        student.setLogin(login);
        student.setPassword("b1b3773a05c0ed0176787a4f1574ff0075f7521e");

        return student;
    }

}
