package com.example.DepartmentWeb.Department.Website.Repo;

import com.example.DepartmentWeb.Department.Website.Models.Faculty;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FacultyRepo extends JpaRepository<Faculty, Long> {
    Faculty findByEmailAndPassword(String email, String password);
}
