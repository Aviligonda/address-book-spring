package com.bridgelabz.addressbookspring.controller;

import com.bridgelabz.addressbookspring.dto.AddressBookDTO;
import com.bridgelabz.addressbookspring.model.AddressBookModel;
import com.bridgelabz.addressbookspring.service.IAddressBookService;
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
    public AddressBookModel updateContact(@PathVariable Long id, @RequestBody AddressBookDTO addressBookDTO) {
        return addressBookService.updateContact(id, addressBookDTO);
    }

    @GetMapping("/getemployees")
    public List<AddressBookModel> getEmployees() {
        return addressBookService.getEmployees();
    }

    @DeleteMapping("/deletecontact/{id}")
    public AddressBookModel deleteContact(@PathVariable Long id) {
        return addressBookService.deleteContact(id);
    }

    @GetMapping("/getemp/{id}")
    public AddressBookModel getEmp(@PathVariable Long id) {
        return addressBookService.getEmp(id);
    }

}
