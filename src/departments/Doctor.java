package departments;

public class Doctor implements Comparable<Doctor> {
	private String name, specilist, appoint, doc_qual;
	private int roomNo, id;

	public Doctor() {

	}

	public Doctor(int id, String name, String specilist, String appoint, String doc_qual, int roomNo) {
		this.id = id;
		this.name = name;
		this.specilist = specilist;
		this.appoint = appoint;
		this.doc_qual = doc_qual;
		this.roomNo = roomNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSpecilist() {
		return specilist;
	}

	public void setSpecilist(String specilist) {
		this.specilist = specilist;
	}

	public String getAppoint() {
		return appoint;
	}

	public void setAppoint(String appoint) {
		this.appoint = appoint;
	}

	public String getDoc_qual() {
		return doc_qual;
	}

	public void setDoc_qual(String doc_qual) {
		this.doc_qual = doc_qual;
	}

	public int getRoomNo() {
		return roomNo;
	}

	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return String.format("%-10d%-10s%-15s%-15s%-15d", this.id, this.name, this.specilist,
				this.doc_qual, this.roomNo);
	}

	@Override
	public int compareTo(Doctor o) {

		return this.id - o.id;
	}

}
