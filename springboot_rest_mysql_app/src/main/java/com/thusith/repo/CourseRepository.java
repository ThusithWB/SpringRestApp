package com.thusith.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thusith.binding.Course;

public interface CourseRepository extends JpaRepository<Course, Serializable> {

}
