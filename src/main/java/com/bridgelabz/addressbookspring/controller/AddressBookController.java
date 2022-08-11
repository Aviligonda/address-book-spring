package com.bridgelabz.addressbookspring.controller;

import com.bridgelabz.addressbookspring.dto.AddressBookDTO;
import com.bridgelabz.addressbookspring.model.AddressBookModel;
import com.bridgelabz.addressbookspring.service.IAddressBookService;
import com.bridgelabz.addressbookspring.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/addressbook")
public class AddressBookController {
    @Autowired
    IAddressBookService addressBookService;

    @PostMapping("/addcontact")
    public AddressBookModel addContact(@RequestBody AddressBookDTO addressBookDTO) {
        return addressBookService.addContact(addressBookDTO);
    }

    @PutMapping("/updatecontact/{id}")
    public AddressBookModel updateContact(@PathVariable Long id, @RequestBody AddressBookDTO addressBookDTO,@RequestHeader String token) {
        return addressBookService.updateContact(id, addressBookDTO,token);
    }

    @GetMapping("/getemployees")
    public List<AddressBookModel> getEmployees(@RequestHeader String token) {
        return addressBookService.getEmployees(token);
    }

    @DeleteMapping("/deletecontact/{id}")
    public AddressBookModel deleteContact(@PathVariable Long id,@RequestHeader String token) {
        return addressBookService.deleteContact(id,token);
    }

    @GetMapping("/getemp/{id}")
    public AddressBookModel getEmp(@PathVariable Long id,@RequestHeader String token) {
        return addressBookService.getEmp(id,token);
    }

    @PostMapping("/login")
    public ResponseUtil login(@RequestParam String emailId, @RequestParam String password) {
        return addressBookService.login(emailId, password);
    }

}
