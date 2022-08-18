package com.bridgelabz.addressbookspring.controller;

import com.bridgelabz.addressbookspring.dto.AddressBookDTO;
import com.bridgelabz.addressbookspring.model.AddressBookModel;
import com.bridgelabz.addressbookspring.service.IAddressBookService;
import com.bridgelabz.addressbookspring.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/addressbook")
public class AddressBookController {
    @Autowired
    IAddressBookService addressBookService;

    @PostMapping("/addcontact")
    public AddressBookModel addContact(@Valid @RequestBody AddressBookDTO addressBookDTO) {
        return addressBookService.addContact(addressBookDTO);
    }

    @PutMapping("/updatecontact/{id}")
    public AddressBookModel updateContact(@Valid @PathVariable Long id,
                                          @RequestBody AddressBookDTO addressBookDTO,
                                          @RequestHeader String token) {
        return addressBookService.updateContact(id, addressBookDTO, token);
    }

    @GetMapping("/getemployees")
    public List<AddressBookModel> getEmployees(@RequestHeader String token) {
        return addressBookService.getEmployees(token);
    }

    @DeleteMapping("/deletecontact/{id}")
    public AddressBookModel deleteContact(@PathVariable Long id
            , @RequestHeader String token) {
        return addressBookService.deleteContact(id, token);
    }

    @GetMapping("/getemp/{id}")
    public AddressBookModel getEmp(@PathVariable Long id,
                                   @RequestHeader String token) {
        return addressBookService.getEmp(id, token);
    }

    @PostMapping("/login")
    public ResponseUtil login(@RequestParam String emailId,
                              @RequestParam String password) {
        return addressBookService.login(emailId, password);
    }

    @GetMapping("/sorting")
    public List<AddressBookModel> sorting() {
        return addressBookService.sorting();
    }

    @GetMapping("/findByCityName")
    public List<AddressBookModel> findByCityName(@RequestParam String city) {
        return addressBookService.findByCityName(city);
    }

    @GetMapping("/findByState")
    public List<AddressBookModel> findByState(@RequestParam String state) {
        return addressBookService.findByStateName(state);
    }

    @GetMapping("/sortByLastName")
    public List<AddressBookModel> sortByLastName() {
        return addressBookService.sortByLastName();
    }
}
