package com.example.demo.repository;

import com.example.demo.entity.Pupil;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PupilRepository extends JpaRepository<Pupil,Long>
{
}
