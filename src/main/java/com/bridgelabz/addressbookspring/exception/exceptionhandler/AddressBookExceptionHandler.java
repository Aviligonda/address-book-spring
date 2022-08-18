package com.bridgelabz.addressbookspring.exception.exceptionhandler;

import com.bridgelabz.addressbookspring.exception.AddressBookException;
import com.bridgelabz.addressbookspring.exception.CustomValidException;
import com.bridgelabz.addressbookspring.util.ResponseUtil;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class AddressBookExceptionHandler {
    @ExceptionHandler(AddressBookException.class)
    public ResponseEntity<ResponseUtil> handlerHiringException(AddressBookException exception) {
        ResponseUtil response = new ResponseUtil();
        response.setErrorCode(400);
        response.setMessage(exception.getMessage());
        return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
    }
    //  Using custom exception for handling the error of validation part
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<CustomValidException> handlerHiringException(MethodArgumentNotValidException exception) {
        CustomValidException validException = new CustomValidException();
        validException.setErrorCode(400);
        validException.setMessage(exception.getFieldError().getDefaultMessage());
        return new ResponseEntity<>(validException, HttpStatus.BAD_REQUEST);
    }
}
