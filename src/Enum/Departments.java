package Enum;

import java.util.Scanner;

public enum Departments {

	EXIT, DOCTOR, Patients, Medicines, Laboratories, Staff,Default;
     
	public static Departments menuList() throws ArrayIndexOutOfBoundsException  {
		Scanner sc = new Scanner(System.in);
		System.out.println("\nMAIN MENU");
		System.out.println("************************************************************************************");
		System.out.println("1. Doctors \n2. Patients \n3. Medicines \n4. Laboratories \n5. Staff .");
		System.out.println("************************************************************************************");

		int choice = sc.nextInt();
		return Departments.values()[choice];
	}
   
}
