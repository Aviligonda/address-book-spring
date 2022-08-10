package com.bridgelabz.addressbookspring.repository;

import com.bridgelabz.addressbookspring.model.AddressBookModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressBookRepository extends JpaRepository<AddressBookModel,Long> {
}
