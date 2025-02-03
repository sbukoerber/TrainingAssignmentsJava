package com.bankapp.repo;

import com.bankapp.entities.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.beans.JavaBean;
@Repository
    public interface AccountRepo extends JpaRepository<Account, Integer> {

    }

