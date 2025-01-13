package com.icase.controller;

import com.icase.pojo.Fee;
import com.icase.service.FeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/fee")
public class FeeController {
    @Autowired
    private FeeService feeService;

    @GetMapping
    public List<Fee> getFee(@RequestParam(required = false) Integer pNo) {
        return feeService.getFee(pNo);
    }

    @PutMapping
    public String updateFee(@RequestBody Fee fee){
        if (feeService.updateFee(fee) == 1) {
            return "success";
        } else {
            return "fail";
        }
    }
}
