package com.bridgelabz.addressbookspring.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomValidException {
    private int errorCode;
    private String message;
}
