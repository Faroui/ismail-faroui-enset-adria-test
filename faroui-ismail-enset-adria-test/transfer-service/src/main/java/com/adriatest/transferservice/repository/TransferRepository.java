package com.adriatest.transferservice.repository;

import com.adriatest.transferservice.entities.Transfer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface TransferRepository extends JpaRepository<Transfer, Long> {

}