package com.example.demo.entity;

import javax.persistence.*;

@Entity
@Table(name="user")
public class User
{
    public User(){}

    public long getId()
    {
        return id;
    }

    public String getUserName()
    {
        return userName;
    }

    public void setUserName(String userName)
    {
        this.userName = userName;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name="name")
    private String userName;

    @Override
    public String toString()
    {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                '}';
    }
}
