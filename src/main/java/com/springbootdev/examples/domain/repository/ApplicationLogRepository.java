package com.springbootdev.examples.domain.repository;

import com.springbootdev.examples.domain.model.ApplicationLog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApplicationLogRepository extends JpaRepository<ApplicationLog,Long>
{

}
