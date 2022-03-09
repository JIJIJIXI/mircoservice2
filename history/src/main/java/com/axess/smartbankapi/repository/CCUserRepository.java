package com.axess.smartbankapi.repository;

import com.axess.smartbankapi.model.CCUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CCUserRepository extends JpaRepository<CCUser, Long>{
	
	Optional<CCUser> findByUserIdAndPassword(String userId, String password);

}
