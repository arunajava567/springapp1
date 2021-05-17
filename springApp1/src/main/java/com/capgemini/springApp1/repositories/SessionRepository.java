package com.capgemini.springApp1.repositories;
import com.capgemini.springApp1.models.Session;
import org.springframework.data.jpa.repository.JpaRepository;
public interface SessionRepository extends JpaRepository<Session, Long>{

}
