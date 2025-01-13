package com.icase.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Register {
    private Integer rfNo;
    private String rfDept;
    private Integer rfDoctor;
    private Integer rfPatient;
    private Integer rfCashier;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime rfTime;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime rfVisitTime;
    private Float rfFee;
    private String rfNotes;
}
