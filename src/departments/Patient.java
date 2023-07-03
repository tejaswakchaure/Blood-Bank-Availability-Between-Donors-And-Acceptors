package departments;

public class Patient {
	private String name, disease, Gender, admit_status;
	private int age, id;

	public Patient() {
		
	}

	public Patient(String name, String disease, String gender, String admit_status, int age, int id) {
		super();
		this.name = name;
		this.disease = disease;
		Gender = gender;
		this.admit_status = admit_status;
		this.age = age;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDisease() {
		return disease;
	}

	public void setDisease(String disease) {
		this.disease = disease;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	public String getAdmit_status() {
		return admit_status;
	}

	public void setAdmit_status(String admit_status) {
		this.admit_status = admit_status;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return String.format("%-10d%-10s%-15s%-15s%-15s%-15d", this.id, this.name, this.disease, this.Gender,this.admit_status, this.age);
	}

}
