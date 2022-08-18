package com.bridgelabz.addressbookspring.service;

import com.bridgelabz.addressbookspring.dto.AddressBookDTO;
import com.bridgelabz.addressbookspring.model.AddressBookModel;
import com.bridgelabz.addressbookspring.util.ResponseUtil;

import java.util.List;

public interface IAddressBookService {
    AddressBookModel addContact(AddressBookDTO addressBookDTO);

    AddressBookModel updateContact(Long id, AddressBookDTO addressBookDTO, String token);

    List<AddressBookModel> getEmployees(String token);

    AddressBookModel deleteContact(Long id, String token);

    AddressBookModel getEmp(Long id, String token);

    ResponseUtil login(String emailId, String password);

    List<AddressBookModel> sorting();

    List<AddressBookModel> findByCityName(String city);

    List<AddressBookModel> findByStateName(String state);

    List<AddressBookModel> sortByLastName();

}
