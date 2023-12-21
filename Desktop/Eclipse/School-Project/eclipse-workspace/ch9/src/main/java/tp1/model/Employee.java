package tp1.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@ Getter
@ Setter

public class Employee extends Person {
	
	private float averageDailyRate;
	private List<Project> workedProjects;

	public Employee(String name, String surname, String job, int yearOfExperience, float averageDailyRate) {
		super(name, surname, job, yearOfExperience);
		this.averageDailyRate = averageDailyRate;
		this.workedProjects = new ArrayList <>();
	}
	
    public void createProject(LocalDate startDate, LocalDate endDate, boolean state) {
        Project newProject = new Project(startDate, endDate, state);
        workedProjects.add(newProject);
    }

    public void addTask(Project projet, Task tache) {
        projet.addTask(tache);
    }

}
