package com.tavant.scrum_board.repositories;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.tavant.scrum_board.models.User;

@Repository
public interface UserRepositories extends JpaRepository<User, String> {

	// write a customize query

	public User findByUserId(String userId);

	// it delete team that is assign user
	@Modifying(clearAutomatically = true)
	@Query(value = "UPDATE user u SET u.user_team_name='NONE' WHERE u.user_id=:id", nativeQuery = true)
	@Transactional
	public void deleteAssignUserId(@Param("id") String userId);
	
	// it delete team that is assign user
	@Modifying(clearAutomatically = true)
	@Query(value = "UPDATE task t SET t.user_id=0 WHERE t.task_id=:id", nativeQuery = true)
	@Transactional
	public void deleteAssignTaskId(@Param("id") int userId);

	
	
}
