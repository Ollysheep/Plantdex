package tp1.model;

import lombok.Getter;
import lombok.Setter;

@ Getter
@ Setter

public class Provider extends Person {
	
	private float averageDailyRate;

	public Provider(String name, String surname, String job, int yearOfExperience, float averageDailyRate) {
		super(name, surname, job, yearOfExperience);
		this.averageDailyRate = averageDailyRate;
	}
	
	public void changeStateOfTask(Task tache, String newState) {
        tache.changeState(newState);
    }

    public double calculateTheRemuneration() {
        return 0.0;
    }

}
