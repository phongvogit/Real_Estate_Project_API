package com.phongvo.estatespringboot.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerDto {
    private Long id;
    private String email;
    private String phone;
    private String demand;
    private boolean enable;
    private String fullname;
    private Long staffId;
}
