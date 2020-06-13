package com.tavant.scrum_board.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.tavant.scrum_board.models.Scrum;
import com.tavant.scrum_board.models.Team;
import com.tavant.scrum_board.models.User;
import com.tavant.scrum_board.repositories.ScrumRepositories;
import com.tavant.scrum_board.repositories.TeamRepositories;
import com.tavant.scrum_board.repositories.UserRepositories;

@RestController
@RequestMapping("/team_api")
public class TeamRestController {

	@Autowired
	private TeamRepositories teamRepositories;
	@Autowired
	private UserRepositories userRepositories;
	
	
	@Autowired
	private ScrumRepositories scrumRepositories;

	@GetMapping("/team")
	public List<Team> teamList() {
		return teamRepositories.findAll();
	}

	@PostMapping("/save")
	@ResponseStatus(HttpStatus.OK)
	public void createTeam(@RequestBody Team team) {
		teamRepositories.save(team);
	}

	@GetMapping("/team/{teamid}")
	public Team getTeam(@PathVariable("teamid") String teamId) {

		return teamRepositories.findByTeamName(teamId);

	}

	// write a method to go update user table
	@DeleteMapping("/delete/{teamName}")
	public void deleteTeam(@PathVariable String teamName) {

		Team tempTeam = teamRepositories.findByTeamName(teamName);
		teamRepositories.deleteById(teamName);
		List<User> list = tempTeam.getTeamUsers();
		for (User tempUser : list) {
			userRepositories.deleteAssignUserId(tempUser.getUserId());
		}
		List<Scrum> scrums = scrumRepositories.findAll();
		for(Scrum scrum : scrums){
			if(scrum.getTeam().getTeamName().equals(tempTeam.getTeamName())){
				
				scrum.getTeam().setTeamName("NONE");
				scrumRepositories.save(scrum);
			}
		}
//		Scrum local=ScrumRepositories.
		
	}

	@PutMapping("/save_user/{teamName}/{userid}")
	public void createTeamUser(@PathVariable(name = "teamName") String teamName,
			@PathVariable(name = "userid") String userId) {

		Team tempteam = teamRepositories.findByTeamName(teamName);
		User tempUser = userRepositories.findByUserId(userId);
		tempteam.addUser(tempUser);
		teamRepositories.save(tempteam);

	}

	@PutMapping("/save_users/{teamName}")
	public void createTeamUsers(@PathVariable(name = "teamName") String teamName, @RequestBody String[] userArray) {

		Team tempteam = teamRepositories.findByTeamName(teamName);

		for (String integer : userArray) {

			User tempUser = userRepositories.findByUserId(integer);
			tempteam.addUser(tempUser);
		}

		teamRepositories.save(tempteam);

	}

	@PostMapping("addUserToTeam")
	public void addUserTOTeam(@RequestBody Team tempTeam) {

		Team local = teamRepositories.findByTeamName(tempTeam.getTeamName());

		local.addUser(tempTeam.getTeamUsers().get(0));
		teamRepositories.save(local);

	}

	@PutMapping("/delete_user")
	public void deleteTeamUser(@RequestBody Team tempTeam) {

		User user = tempTeam.getTeamUsers().get(0);

		userRepositories.delete(user);
		user.setUserTeamName("NONE");
		userRepositories.save(user);

	}

}
