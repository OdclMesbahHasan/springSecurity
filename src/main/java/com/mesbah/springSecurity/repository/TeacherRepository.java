package com.mesbah.springSecurity.repository;

import com.mesbah.springSecurity.model.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository extends JpaRepository<Teacher, Integer> {
}
