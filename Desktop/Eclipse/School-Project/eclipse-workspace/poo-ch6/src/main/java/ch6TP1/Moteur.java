package ch6TP1;

public class Moteur {

	private Boolean on;
	private Integer speed;
	private Integer maxSpeed;

	public Moteur(Boolean on, Integer speed, Integer maxSpeed) {
		if (maxSpeed <= 100   || maxSpeed >= 300){
			throw new IllegalArgumentException("pas bon");}
		this.on = on;
		this.speed = speed;
		this.maxSpeed = maxSpeed;

	}

	public Boolean getOn() {
		return on;
	}

	public void setOn(Boolean on) {
		this.on = on;
	}

	public Integer getSpeed() {
		return speed;
	}

	public void setSpeed(Integer speed) {
		this.speed = speed;
	}

	public Integer getMaxSpeed() {
		return maxSpeed;
	}

	public void setYear(Integer maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	
}
