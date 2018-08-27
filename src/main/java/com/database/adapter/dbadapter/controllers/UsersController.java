package com.database.adapter.dbadapter.controllers;

import com.database.adapter.dbadapter.domain.Users;
import com.database.adapter.dbadapter.repositories.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value="/rest/user")
public class UsersController {

    @Autowired
    UsersRepository usersRepository;

    @GetMapping(value="/all")
    public List<Users> getAll() {
        ArrayList<Users> userlist = new ArrayList<Users>();
        usersRepository.findAll().forEach(userlist::add);
        return userlist;
    }
}
