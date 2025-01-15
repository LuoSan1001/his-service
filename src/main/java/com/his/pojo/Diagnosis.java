package com.his.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Diagnosis {
    private Integer dgNo;
    private Integer pNo;
    private String deptNo;
    private Integer dNo;
    private String symptom;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private String diagnosis;
    private LocalDate dgTime;
}
