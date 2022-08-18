package com.bridgelabz.addressbookspring.dto;

import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Data
public class AddressBookDTO {
    @NotNull(message = "FirstName Can't be Empty ")
    @Pattern(regexp = "[A-Z][a-z]{2,}", message = "Name Should Start with capital letter and min of 3 letter")
    private String firstName;
    @NotNull(message = "LastName Can't be Empty ")
    @Pattern(regexp = "[A-Z][a-z]{2,}", message = "Name Should Start with capital letter and min of 3 letter")
    private String lastName;
    @NotNull(message = "Address Cant be Empty")
    @Pattern(regexp = "[a-zA-Z0-9.,/+]{10,}", message = "Enter valid Address")
    private String address;
    @NotNull(message = "City can't be Empty")
    @Pattern(regexp = "[a-zA-Z]{3,}", message = "Invalid City name")
    private String city;
    @NotNull(message = "State can't be Empty")
    @Pattern(regexp = "[a-zA-Z]{3,}", message = "Invalid State name ")
    private String state;
    @NotNull(message = "Phone number Can't be Empty")
    @Pattern(regexp = "[6789]\\d{9}", message = "Phone number should like +91 6123456789")
    private String phoneNumber;
    @NotNull(message = "Zip Can't be Empty")
    @Pattern(regexp = "[0-9]{4,}", message = "Zip code should be at least 4 numbers")
    private String zip;
    @NotNull(message = "Email-ID  Can't be Empty ")
    @Pattern(regexp = "(\\w+[.+-]?)*@\\w+(\\.+[a-zA-Z]{2,4})*", message = "Invalid Email, Enter correct Email")
    private String emailId;
    @NotNull(message = "Password Can't be Empty ")
    @Pattern(regexp = "(?=.*?[A-Z])(?=.*?[0-9])(?=.*?[!@#$%^&*_()+-])[A-Za-z0-9!@#$%^&()*+_-]{8,}"
            , message = "Password should have AtLeast one (capital ,small,special character,numeric) minimum 8 characters")
    private String password;
}
