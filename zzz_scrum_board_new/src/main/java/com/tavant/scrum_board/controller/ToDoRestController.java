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

import com.tavant.scrum_board.models.ToDo;
import com.tavant.scrum_board.repositories.ToDoRepositories;

@RestController
@RequestMapping("/todo_api")
public class ToDoRestController {

	@Autowired
	private ToDoRepositories toDoRepositories;

	@GetMapping("/todo")
	public List<ToDo> taskList() {
		return toDoRepositories.findAll();
	}

	@PostMapping("/save")
	@ResponseStatus(HttpStatus.OK)
	public void createTask(@RequestBody ToDo todo) {
		toDoRepositories.save(todo);
	}

	@GetMapping("/todo/{userid}")
	public ToDo getTask(@PathVariable("userid") String userId) {

		return toDoRepositories.findByDoTO(userId);

	}

	@DeleteMapping("/delete/{userid}")
	public void deleteTask(@PathVariable("userid") String userid) {

		toDoRepositories.deleteToDo(userid);

	}

	@PutMapping("/update_todo")
	public void updateToDo(@RequestBody ToDo tempToDo) {

		toDoRepositories.save(tempToDo);
	}

}
