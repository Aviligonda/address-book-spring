package com.bridgelabz.addressbookspring.controller;

import com.bridgelabz.addressbookspring.service.IAddressBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/addressbook")
public class AddressBookController {
    @Autowired
    IAddressBookService addressBookService;

}
