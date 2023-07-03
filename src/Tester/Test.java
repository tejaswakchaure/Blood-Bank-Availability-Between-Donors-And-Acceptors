package Tester;

import  departments.*;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Test {

	private static Scanner sc = new Scanner(System.in);
	List<Doctor> doctors = new ArrayList<>();
	List<Patient> patients = new ArrayList<>();
	List<Staff> staffs = new ArrayList<>();
	List<Lab> labs = new ArrayList<>();
	List<Medical> medicals = new ArrayList<>();

	public void addDoctor(Doctor d) {
		if (this.doctors != null) {
			this.doctors.add(d);
			System.out.println("Add Succesfully");
		}

	}

	public void addPatient(Patient p) {
		if (this.patients != null) {
			this.patients.add(p);
		}

	}

	public void addStaff(Staff s) {
		if (this.staffs != null) {
			this.staffs.add(s);
		}

	}

	public void addLab(Lab l) {
		if (this.labs != null) {
			this.labs.add(l);
		}

	}

	public void addLab(Medical m) {
		if (this.medicals != null) {
			this.medicals.add(m);
		}

	}

	public void printDoctor() {
		if (this.doctors != null) {
			for (Doctor doctor : doctors) {
				System.out.println(doctor);
			}
		}

	}

	public void printPatient() {
		if (this.patients != null) {
			for (Patient patient : patients) {
				System.out.println(patient);
			}
		}

	}

	public void printMedical() {
		if (this.medicals != null) {
			for (Medical medical : medicals) {
				System.out.println(medical);
			}
		}

	}

	public void printLab() {
		if (this.labs != null) {
			for (Lab lab : labs) {
				System.out.println(lab);
			}
		}

	}

	public void printStaff() {
		if (this.staffs != null) {
			for (Staff staff : staffs) {
				System.out.println(staff);
			}
		}

	}

	public boolean removePestient(int id) {
		if (this.patients != null) {
			for (Patient patient : patients) {
				if (patient.getId() == id) {
					patients.remove(patient);
					return true;
				} else {
					System.out.println("Patient not found. !!!!!!!!!!!!!!!!!!!");
				}
			}
		}
		return false;

	}

	public void takeAppoinment(int id) {
		if (patients != null) {
			if (this.doctors != null) {
				System.out.println("These are Doctors Available .........");
				for (Doctor doctor : doctors) {
					System.out.println(doctor);
				}
				while (this.doctors != null) {
					System.out.print("select Doctor Id according to your problem  :");
					int i = sc.nextInt();
					for (Doctor doctor2 : doctors) {
						if (doctor2.getId() == i) {
							for (Patient patient : patients) {
								if (patient.getId() == id) {
									System.out.print(" Enter time  :");
									double time = sc.nextDouble();
									System.out.println("Congratulation Doctor " + doctor2 + " Accept your request ");
									System.out.println("Doctor Appoin at " + time + " PM  ");
									break;
								} else {
									System.out.println("Doctor not Available !!!!!  Your request not Approwed !!!!!");
								}

							}

						} else {
							System.out.println("Doctor not found !!!!!!!!!!!!!!");
						}

					}

				}
				

			}
		} else {
			System.out.println("Patient not found !!!!!!!!!!!!!!");
		}

	}

	public double calculateBill(int id) {
		double finalBill = 0;
		if (this.patients != null) {
			for (Patient patient : patients) {
				if (patient.getId() == id) {
					System.out.println("How many days you are admited ???");
					System.out.println("Please enter in numbers  :");
					int days = sc.nextInt();
					int doctorFees = 300;
					if (days > 0) {
						finalBill = doctorFees + days * 50;
						return finalBill;
					} else {
						finalBill = doctorFees;
						return finalBill;
					}

				} else {
					System.out.println("Patient not found. !!!!!!!!!!!!!!!!!!!");
				}
			}

		}
		return finalBill;

	}

}
