package com.example.demo.controller;

import com.example.demo.entity.Pupil;
import com.example.demo.entity.Teacher;
import com.example.demo.entity.User;
import com.example.demo.repository.PupilRepository;
import com.example.demo.repository.TeacherRepository;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Controller
{
    private final UserRepository userRepository;
    private final PupilRepository pupilRepository;
    private final TeacherRepository teacherRepository;

    public Controller(UserRepository userRepository, PupilRepository pupilRepository, TeacherRepository teacherRepository)
    {
        this.userRepository = userRepository;
        this.pupilRepository = pupilRepository;
        this.teacherRepository = teacherRepository;
    }

    @GetMapping(value = "/show-users")
    public List<User> showUsers()
    {
        List<User> user = new ArrayList<>();
        user = userRepository.findAll();
        return user;
    }
    @GetMapping(value = "/show-pupils")
    public List<Pupil> showPupils()
    {
        List<Pupil> pupil = new ArrayList<>();
        pupil = pupilRepository.findAll();
        return pupil;
    }
    @GetMapping(value = "/show-teachers")
    public List<Teacher> showTeachers()
    {
        List<Teacher> teachers = new ArrayList<>();
        teachers = teacherRepository.findAll();
        return teachers;
    }

    @RequestMapping(method = RequestMethod.POST)
    public User oneUser()
    {
        return userRepository.findOne(2L);
    }
}
