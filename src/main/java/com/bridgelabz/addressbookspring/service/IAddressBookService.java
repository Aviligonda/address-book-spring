package com.bridgelabz.addressbookspring.service;

import com.bridgelabz.addressbookspring.dto.AddressBookDTO;
import com.bridgelabz.addressbookspring.model.AddressBookModel;

import java.util.List;

public interface IAddressBookService {
    AddressBookModel addContact(AddressBookDTO addressBookDTO);

    AddressBookModel updateContact(Long id, AddressBookDTO addressBookDTO);

    List<AddressBookModel> getEmployees();

    AddressBookModel deleteContact(Long id);

    AddressBookModel getEmp(Long id);
}
