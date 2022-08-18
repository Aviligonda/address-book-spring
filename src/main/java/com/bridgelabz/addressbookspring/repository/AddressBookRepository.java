package com.bridgelabz.addressbookspring.repository;

import com.bridgelabz.addressbookspring.model.AddressBookModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface AddressBookRepository extends JpaRepository<AddressBookModel, Long> {
    Optional<AddressBookModel> findByEmailId(String emailId);

    List<AddressBookModel> findByCityContainsIgnoreCase(String city);

    @Query(value = "select * from address_book order by last_name", nativeQuery = true)
    List<AddressBookModel> sortingByLastName();

    @Query(value = "select * from address_book where state=:state", nativeQuery = true)
    List<AddressBookModel> findByState(String state);
}
