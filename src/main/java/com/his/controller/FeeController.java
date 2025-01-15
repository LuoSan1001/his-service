package com.his.controller;

import com.his.pojo.Fee;
import com.his.service.FeeService;
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

    @DeleteMapping("/{fNos}")
    public String deleteFee(@PathVariable List<Integer> fNos) {
        if (feeService.deleteFee(fNos) >= 1) {
            return "success";
        } else {
            return "fail";
        }
    }
}
