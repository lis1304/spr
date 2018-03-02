package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

@Component
public class StudentSql {
    @Autowired StudentDao studentDao;
    @Autowired MajorDao majorDao;


    @PostConstruct
    void aaa(){
        Major major = new Major(1,"yaya");
        majorDao.save(major);


        List<Student> list = studentDao.findByMajorOrderByFirstNameAsc(major);
    }


}
