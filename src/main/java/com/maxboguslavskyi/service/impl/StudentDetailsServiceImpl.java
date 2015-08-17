package com.maxboguslavskyi.service.impl;

import com.maxboguslavskyi.entity.Student;
import com.maxboguslavskyi.entity.enums.UserRoleEnum;
import com.maxboguslavskyi.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service("studentDetailsService")
public class StudentDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private StudentService studentService;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Student student = studentService.getStudent("student");
        Set<GrantedAuthority> roles = new HashSet<>();
        roles.add(new SimpleGrantedAuthority(UserRoleEnum.USER.name()));

        return new org.springframework.security.core.userdetails.User(student.getLogin(), student.getPassword(), roles);
    }

}