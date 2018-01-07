package by.htp_gvozdev.task.bean;

public abstract class Production {

	private String name;
	private double power;
	private String type;
	private double consumption;
	private boolean turn;

	public Production(String name, String type, double power, double consumption, boolean turn) {
		this.name = name;
		this.type = type;
		this.power = power;
		this.consumption = consumption;
		this.turn = turn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPower() {
		return power;
	}

	public void setPower(double power) {
		this.power = power;
	}

	public double getConsumption() {
		return consumption;
	}

	public void setConsumption(double consumption) {
		this.consumption = consumption;
	}

	public boolean isTurn() {
		return turn;
	}

	public void setTurn(boolean turn) {
		this.turn = turn;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
