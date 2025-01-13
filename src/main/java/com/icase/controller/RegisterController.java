package com.icase.controller;

import com.icase.pojo.Register;
import com.icase.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/register")
public class RegisterController {
    @Autowired
    private RegisterService registerService;

    @PostMapping
    public String insertRegister(@RequestBody Register register) {
        if (registerService.insertRegister(register) == 1) {
            return "success";
        } else {
            return "fail";
        }
    }

    @GetMapping
    public List<Register> getRegister(@RequestParam(required = false) Integer dNo,
                                      @RequestParam(required = false) @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate rfVisitTime,
                                      @RequestParam(required = false) Integer pNo) {
        return registerService.selectRegister(dNo, rfVisitTime, pNo);
    }
}
