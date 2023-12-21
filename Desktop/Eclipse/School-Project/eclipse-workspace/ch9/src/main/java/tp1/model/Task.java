package tp1.model;

import lombok.Getter;
import lombok.Setter;

@ Getter
@ Setter

public class Task {
	
	Task previousTask;
	Task nextTask;
    String state;
    int timeSpentInDay;
    String text;

    public Task(Task previousTask, Task nextTask, String state, int timeSpentInDay, String text) {
        this.previousTask = previousTask;
        this.nextTask = nextTask;
        this.state = state;
        this.timeSpentInDay = timeSpentInDay;
        this.text = text;
    }

    public void changeState(String newState) {
        this.state = newState;
    }

}
