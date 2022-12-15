package com.microservice.msemail.repositories;

import com.microservice.msemail.models.EmailModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface EmailRepository  extends JpaRepository<EmailModel, UUID> {

}
