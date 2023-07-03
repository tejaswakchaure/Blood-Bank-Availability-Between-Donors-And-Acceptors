package Tester;

import departments.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class AddContent {
	private static Scanner sc = new Scanner(System.in);

	public static Doctor AddNew_doctor(Doctor doctor) throws InputMismatchException {

			System.out.println("Please Enter your detail  :");
			System.out.print("id:-");
			doctor.setId(sc.nextInt());
			sc.nextLine();
			System.out.print("name:-");
			doctor.setName(sc.nextLine());
			System.out.print("specilization:-");
			doctor.setSpecilist(sc.nextLine());
			System.out.print("qualification:-");
			doctor.setDoc_qual(sc.nextLine());
			System.out.print("room no.:-");
			doctor.setRoomNo(sc.nextInt());
			return doctor;
		

	}

	public static Patient new_patient(Patient patient) throws InputMismatchException {
			System.out.println("Please Enter your detail  :");
			System.out.print("id:-");
			patient.setId(sc.nextInt());
			sc.nextLine();
			System.out.print("name:-");
			patient.setName(sc.nextLine());
			System.out.print("disease:-");
			patient.setDisease(sc.nextLine());
			System.out.print("Gender:-");
			patient.setGender(sc.nextLine());
			System.out.print("admit_status:-");
			patient.setAdmit_status(sc.nextLine());
			System.out.print("age:-");
			patient.setAge(sc.nextInt());
	

		return patient;
	}

	public static Staff new_Staff(Staff staff) throws InputMismatchException {
		
			System.out.print("id:-");
			staff.setId(sc.nextInt());
			sc.nextLine();
			System.out.print("name:-");
			staff.setName(sc.nextLine());
			System.out.print("desigination:-");
			staff.setDesg(sc.nextLine());
			System.out.print("Gender:-");
			staff.setGender(sc.nextLine());
			System.out.print("salary:-");
			staff.setSalary(sc.nextFloat());
		

		return staff;
	}

	public static Lab new_Lab(Lab lab) throws InputMismatchException {

			System.out.println("fecility:-");
			lab.setFecility(sc.next());
			System.out.println("cost:-");
			lab.setLab_cost(sc.nextInt());

		

		return lab;
	}

	public static Medical new_Lab(Medical medical) throws InputMismatchException {

			System.out.print("name:-");
			medical.setMed_name(sc.nextLine());

			System.out.print("comp:-");
			medical.setMed_comp(sc.nextLine());
			System.out.print("exp_date:-");
			medical.setExp_date(sc.nextLine());
			System.out.print("cost:-");
			medical.setMed_cost(sc.nextInt());

			System.out.print("no of unit:-");
			medical.setCount(sc.nextInt());
	

		return medical;
	}

}
