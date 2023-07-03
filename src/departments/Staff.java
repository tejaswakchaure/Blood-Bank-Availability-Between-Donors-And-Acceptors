package departments;

public class Staff {
	 private String  name, desg, Gender;
	    private int id;
	    private float salary;
	    
	    public Staff() {
		
		}
	   
	    public Staff( int id, String name, String desg, String gender, float salary) {
			this.id = id;
			this.name = name;
			this.desg = desg;
			Gender = gender;
			this.salary = salary;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDesg() {
			return desg;
		}

		public void setDesg(String desg) {
			this.desg = desg;
		}

		public String getGender() {
			return Gender;
		}

		public void setGender(String gender) {
			Gender = gender;
		}
		public float getSalary() {
			return salary;
		}

		public void setSalary(float salary) {
			this.salary = salary;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		@Override
		public String toString() {
			return String.format("%-10d%-10s%-10s%-10f",this.id,this.name,this.Gender,this.salary);
		}

	    
}



