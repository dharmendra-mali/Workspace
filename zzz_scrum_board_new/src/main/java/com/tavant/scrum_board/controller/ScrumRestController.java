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
import com.tavant.scrum_board.models.Task;
import com.tavant.scrum_board.repositories.ScrumRepositories;
import com.tavant.scrum_board.repositories.TaskRepositories;

@RestController
@RequestMapping("/scrum_api")
public class ScrumRestController {

	@Autowired
	private ScrumRepositories scrumRepositories;

	@Autowired
	private TaskRepositories taskRepositories;

	@GetMapping("/scrum")
	public List<Scrum> scrumList() {
		return scrumRepositories.findAll();
	}

	@PostMapping("/save")
	@ResponseStatus(HttpStatus.OK)
	public Scrum createtScrum(@RequestBody Scrum scrum) {
		return scrumRepositories.save(scrum);
	}

	@GetMapping("/scrum/{scrumname}")
	public Scrum getTeam(@PathVariable("scrumname") String scrumName) {

		return scrumRepositories.findByScrumName(scrumName);

	}

	@DeleteMapping("/delete/{scrumname}")
	public void deleteTeam(@PathVariable("scrumname") String scrumName) {

		Scrum tempScrum = scrumRepositories.findByScrumName(scrumName);

		List<Task> scrumTasks = tempScrum.getTasks();
		int length = scrumTasks.size();
		int[] tasksId = new int[100];
		int j = 0;
		for (Task task : scrumTasks) {

			tasksId[j] = task.getTaskid();
			j++;

		}
		scrumRepositories.deleteByScrumName(scrumName);

		for (int i = length - 1; i >= 0; i--) {

			System.out.println("task id is = " + tasksId[i]);
			taskRepositories.deleteById(tasksId[i]);
		}

	}

	@PutMapping("update_scrum")
	public void updateScrum(@RequestBody Scrum tempScrum) {

		Scrum localTempscrum = scrumRepositories.findByScrumName(tempScrum.getScrumName());
		System.err.println(localTempscrum.getScrumName());
		List<Task> list = localTempscrum.getTasks();

		for (Task tempTask : list) {

			localTempscrum.getTasks().remove(tempTask);
			System.err.println(tempTask.getTaskid());

		}
		localTempscrum.getTasks().forEach((e) -> System.out.println(e.getNotes()));
		System.out.println("----------------");
		taskRepositories.findAll().forEach((e) -> System.out.println(e.getNotes()));
		scrumRepositories.deleteByScrumName(localTempscrum.getScrumName());
		for (Task tempTask : tempScrum.getTasks()) {
			taskRepositories.save(tempTask);

		}
		scrumRepositories.save(tempScrum);

	}

	@PutMapping("/release/{story}/{scrumName}")
	public void deAssignTask(@PathVariable("story") String story, @PathVariable("scrumName") String scrumName) {

		Scrum tempscrum = scrumRepositories.findByScrumName(scrumName);
		System.out.println("task is =" + story);
		System.out.println("scrum name= " + tempscrum.getScrumName());
		List<Task> taskList = tempscrum.getTasks();
		System.out.println(taskList.toString());

		for (Task task : taskList) {
			System.out.println("task nodes is = " + task.getNotes());
			if (task.getNotes().equals(story)) {
				// tempscrum.getTasks().remove(task);
				taskRepositories.delete(task);

			}

		}
		scrumRepositories.save(tempscrum);

	}

}
