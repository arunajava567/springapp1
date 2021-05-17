package com.capgemini.springApp1.repositories;
import com.capgemini.springApp1.models.Speaker;

import org.springframework.data.jpa.repository.JpaRepository;
public interface SpeakerRepository extends JpaRepository<Speaker, Long>{

	

}
