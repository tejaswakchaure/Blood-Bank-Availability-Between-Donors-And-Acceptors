package main;

import java.util.InputMismatchException;
import java.util.Scanner;

import Enum.Departments;
import Factory.FactotyMethod;

import exceptions.IncorrectPassword;

public class MyProgram {
	private static Scanner sc = new Scanner(System.in);

	public static int AddDEntry() {
		
		System.out.println("1.Add New Entry.");
		System.out.println("2.Existing List.");
		int choice = sc.nextInt();
		return choice;
	}

	public static int AddDEntry1() {
		System.out.println("1.Add New Entry.");
		System.out.println("2.Existing List.");
		System.out.println("3.Take Appoinment ");
		System.out.println("4.we can remove patients");
		System.out.println("5.Paybill");
		int choice = sc.nextInt();
		return choice;

	}

	@SuppressWarnings("static-access")
	public static void main(String[] args) {

		FactotyMethod fm = new FactotyMethod();
		String pwd;
		int status = 1, ch;
		Departments choice;
		while (true) {
			try {

				System.out.print("Enter password :: ");
				pwd = sc.nextLine();
				if (!pwd.equals("Team_83")) {
					throw new IncorrectPassword("Incorrect password\nType correct password");
				} else {
					System.out.println("Welcome User !!!");
					System.out.println(
							"\n************************************************************************************");
					System.out.println("             Welcome to Hospital Management System Project in Java   ");
					System.out.println(
							"************************************************************************************");
					int sh = 1;
					while (status == 1) {
						while ((choice = Departments.menuList()) != Departments.EXIT) {
							switch (choice) {
							case DOCTOR:
								System.out.println(
										"************************************************************************************");
								System.out.println("                        DOCTOR SECTION");
								System.out.println(
										"************************************************************************************");
								while (sh == 1) {
									while ((ch = MyProgram.AddDEntry()) != 0) {
										try {
											sh = fm.docter(ch);
										} catch (InputMismatchException e) {
											System.out.println("Enter Number .......\nInputMismatchException Occurs");

										}
										if (sh != 1) {
											break;
										}

									}

								}
								sh = 1;
								break;

							case Patients:
								System.out.println(
										"************************************************************************************");
								System.out.println("                     **PATIENT SECTION**");
								System.out.println(
										"************************************************************************************");
								while (sh == 1) {

									while ((ch = MyProgram.AddDEntry1()) != 0) {
										try {
											sh = fm.patient(ch);
										} catch (InputMismatchException e) {
											System.out.println("Enter Number .......\nInputMismatchException Occurs");

										}
										if (sh != 1) {
											break;
										}
									}
								}
								sh = 1;
								break;
							case Medicines:
								System.out.println(
										"************************************************************************************");
								System.out.println("                         MEDICINE SECTION");
								System.out.println(
										"************************************************************************************");
								while (sh == 1) {
									while ((ch = MyProgram.AddDEntry()) != 0) {
										try {
											sh = fm.Medical(ch);
										} catch (InputMismatchException e) {
											System.out.println("Enter Number .......\nInputMismatchException Occurs");

										}
										if (sh != 1) {
											break;
										}
									}
								}
								sh = 1;
								break;
							case Laboratories:
								System.out.println(
										"************************************************************************************");
								System.out.println("                      LABORATORY SECTION");
								System.out.println(
										"************************************************************************************");
								while (sh == 1) {

									while ((ch = MyProgram.AddDEntry()) != 0) {
										try {
											sh = fm.lab(ch);
										} catch (InputMismatchException e) {
											System.out.println("Enter Number .......\nInputMismatchException Occurs");

										}
										if (sh != 1) {
											break;
										}
									}
								}
								sh = 1;
								break;
							case Staff:
								System.out.println(
										"************************************************************************************");
								System.out.println("                         STAFF SECTION");
								System.out.println(
										"************************************************************************************");
								while (sh == 1) {
									while ((ch = MyProgram.AddDEntry()) != 0) {
										try {
											sh = fm.staff(ch);
										} catch (InputMismatchException e) {
											System.out.println("Enter Number .......\nInputMismatchException Occurs");

										}
										if (sh != 1) {
											break;
										}
									}
								}
								sh = 1;
								break;
							case Default:
								System.out.println(" You Have Enter Wrong Choice!!!");

							}
							System.out.println("\nReturn to MAIN MENU Press 1");
							status = sc.nextInt();
						}
					}
				}

			} catch (IncorrectPassword e) {
				System.out.println(" wrong Password !!!!!!!!!!!");
				System.out.println(" Please enter again :");
			} catch (InputMismatchException e) {
				System.out.println(" wrong Input !!!!!!!!!!!!!! ");
				System.out.println("Please enter again");

			}

			catch (Exception ex) {
				System.out.println("Something is wrong !!!!!!!!!!!!!!");
				ex.printStackTrace();
			}

		}
	}

}
