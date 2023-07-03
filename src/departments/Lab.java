package departments;

public class Lab {
	private String fecility;
	private int lab_cost;

	public Lab() {

	}

	public Lab(String fecility, int lab_cost) {
		this.fecility = fecility;
		this.lab_cost = lab_cost;
	}

	public String getFecility() {
		return fecility;
	}

	public void setFecility(String fecility) {
		this.fecility = fecility;
	}

	public int getLab_cost() {
		return lab_cost;
	}

	public void setLab_cost(int lab_cost) {
		this.lab_cost = lab_cost;
	}

	@Override
	public String toString() {
		return String.format("%-15s%-15d", this.fecility, this.lab_cost);
	}

}
