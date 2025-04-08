package com.example.DepartmentWeb.Department.Website.Controller;

import com.example.DepartmentWeb.Department.Website.Models.AdmissionEnquiry;
import com.example.DepartmentWeb.Department.Website.Repo.AdmissionEnquiryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/admission")
public class AdmissionEnquiryController {

    @Autowired
    private AdmissionEnquiryRepo admissionEnquiryRepository;

    @PostMapping("/enquiry")
    public AdmissionEnquiry submitEnquiry(@RequestBody AdmissionEnquiry enquiry) {
        return admissionEnquiryRepository.save(enquiry);
    }
}
