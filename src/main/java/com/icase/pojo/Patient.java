package com.icase.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Patient {
    private Integer pno;
    private String pname;
    private String psex;
    @JsonFormat(pattern = "yyyy-M-d")
    private LocalDate pbd;
    private String pid;
    private String pino;
    private String pmno;
    private String padd;
    private String ptel;
    private String pusername;
}
