package com.MicroService.email.repositories;

import com.MicroService.email.models.EmailModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmailRepository extends JpaRepository <EmailModel, Long>{


}
