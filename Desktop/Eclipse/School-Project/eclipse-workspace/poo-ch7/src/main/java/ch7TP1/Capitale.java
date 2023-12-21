package ch7TP1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Capitale extends Ville {

	private List<Monument> monuments = new ArrayList<>();

	public Capitale(String name, int population, List<Monument> monuments) {
		super(name, population);
	}

	public void addMonument ( Monument monument) {
		if (!this.monuments.contains(monument)) { 
			this.monuments.add(monument);
		}

	}

	public List<Monument> getMonuments() {
		return Collections.unmodifiableList(monuments);

	}

}
