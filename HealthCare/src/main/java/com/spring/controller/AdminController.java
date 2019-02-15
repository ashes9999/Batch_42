package com.spring.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.model.AdminModel;


@RestController
@RequestMapping(path="/admin")
public class AdminController {
	 @PostMapping(path="/add")
     public void insertUser(@RequestBody AdminModel doctor){
//         AdminModel.save(doctor);
         
     }
}
