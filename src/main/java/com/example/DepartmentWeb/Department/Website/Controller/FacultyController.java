package com.example.DepartmentWeb.Department.Website.Controller;

import com.example.DepartmentWeb.Department.Website.Models.Faculty;
import com.example.DepartmentWeb.Department.Website.Services.FacultyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/faculty")
public class FacultyController {
    @Autowired
    private FacultyService facultyService;

    @PostMapping("/login")
    public Map<String, String> login(@RequestBody Map<String, String> credentials) {
        String email = credentials.get("email");
        String password = credentials.get("password");

        Faculty faculty = facultyService.login(email, password);

        Map<String, String> response = new HashMap<>();
        if (faculty != null) {
            response.put("message", "Login Successful");
            response.put("facultyId", faculty.getFacultyId());
        } else {
            response.put("message", "Invalid Email or Password");
        }
        return response;
    }
}
