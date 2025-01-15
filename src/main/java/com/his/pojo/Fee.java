package com.his.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Fee {
    private Integer fNo;
    private String fNumber;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate fDate;
    private  Integer dgNo;
    private Integer rNo; // 处方编号
    private Integer cNo; // 收银员编号
    private Integer pNo;
    private Float fRecipeFee;
    private Float fDiscount;
    private Float fSum;
    private Integer payed;
}
