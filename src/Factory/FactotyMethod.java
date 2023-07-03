package Factory;

import departments.*;
import java.util.Scanner;
import Tester.AddContent;
import Tester.Test;

public class FactotyMethod {
	private static Scanner sc = new Scanner(System.in);
	static Test test = new Test();

	public static int docter(int ch) {
		switch (ch) {
		case 1:
			Doctor doctor = new Doctor();
			Doctor d = AddContent.AddNew_doctor(doctor);
			test.addDoctor(d);
			break;
		case 2:
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("id \t Name\t Specilist \t Qualification \t Room No.");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			test.printDoctor();
			break;
		}
		System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
		return sc.nextInt();

	}

	public int patient(int ch) {

		switch (ch) {

		case 1:
			Patient patient = new Patient();
			Patient p = AddContent.new_patient(patient);
			test.addPatient(p);
			break;
		case 2:
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("id \t Name \t    Disease \t Gender \t Admit Status \t Age");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			test.printPatient();
			break;
		case 3:
			System.out.print("Enter Patient Id :");
			test.takeAppoinment(sc.nextInt());
			break;
		case 4:
			System.out.print("Enter Patient Id :");
			boolean status = test.removePestient(sc.nextInt());
			if (status)
				System.out.println("Patient Remove Succesfully ");

			break;
		case 5:
			System.out.print("Enter your Id for pay bill  :");
			double payBill = test.calculateBill(sc.nextInt());
			System.out.println("You need to pay " + payBill + " Rs");
			System.out.println("Thank you .......................");
			break;
		}
		System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
		return sc.nextInt();

	}

	public int Medical(int ch) {
		switch (ch) {
		case 1:
			Medical medical = new Medical();
			Medical m = AddContent.new_Lab(medical);
			test.addLab(m);
			break;
		case 2:
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("Name \t Company \t   Expiry Date \t Cost");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			test.printMedical();
			break;
		}
		System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
		return sc.nextInt();

	}

	public int lab(int ch) {
		switch (ch) {
		case 1:
			Lab lab = new Lab();
			Lab l = AddContent.new_Lab(lab);
			test.addLab(l);
			break;
		case 2:
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("Fecilities  \t Cost");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			test.printLab();
			break;
		}
		System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
		return sc.nextInt();
	}

	public int staff(int ch) {
		switch (ch) {
		case 1:
			Staff staff = new Staff();
			Staff s = AddContent.new_Staff(staff);
			test.addStaff(s);
			break;
		case 2:
			test.printStaff();
			break;
		}
		System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
		return sc.nextInt();

	}
}
