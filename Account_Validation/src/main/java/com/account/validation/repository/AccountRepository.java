package com.account.validation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.account.validation.model.AccountValidation;

public interface AccountRepository extends JpaRepository<AccountValidation, String> {

}
