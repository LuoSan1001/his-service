package com.his.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Doctor {
    private Integer dNo;
    private String dName;
    private String dSex;
    private Integer dAge;
    private String deptNo;
    private Integer tNo;
    private String dUserName;
}
