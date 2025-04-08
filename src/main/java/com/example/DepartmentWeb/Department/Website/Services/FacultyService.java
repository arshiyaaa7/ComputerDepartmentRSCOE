package com.example.DepartmentWeb.Department.Website.Services;

import com.example.DepartmentWeb.Department.Website.Models.Faculty;
import com.example.DepartmentWeb.Department.Website.Repo.FacultyRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FacultyService {
    @Autowired
    private FacultyRepo facultyRepository;

    public Faculty login(String email, String password) {
        return facultyRepository.findByEmailAndPassword(email, password);
    }
}
