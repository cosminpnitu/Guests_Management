//package project1_2;
//
//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class Main {
//	private static GuestsList gList;
//
//	public static void main(String[] args) {
//		String option, s, s1, s2, s3, s4;
//		Scanner sc = new Scanner(System.in);
//		
//		
//		ArrayList<Guest> att = new ArrayList<Guest>();
//		att.add(new Guest("Cosmin", "Nitu", "cosminpnitu@gmail.com", "0742000001"));
//		att.add(new Guest("Corina", "Nitu", "corina@gmail.com", "0742000002"));
//		att.add(new Guest("Corina", "Nita", "iulia@gmail.com", "0742000003"));
//		gList = new GuestsList(2, att);
//
//		do {
//			System.out.println("\nIntroduceti optiunea dumneavoastra (quit pt a iesi): ");
//			System.out.println("add / update / remove / search / check / guests / waitlist / available / guests_no / waitlist_no / subscribe_no / quit");
//			option = sc.nextLine();
//			switch (option) {
//				case "add":
//					System.out.println("Ati ales sa introduceti un participant nou!");
//					System.out.println("Introduceti first name: ");
//					s1 = sc.nextLine();
//					System.out.println("Introduceti last name: ");
//					s2 = sc.nextLine();
//					System.out.println("Introduceti emailul: ");
//					s3 = sc.nextLine();
//					System.out.println("Introduceti phone: ");
//					s4 = sc.nextLine();
//					gList.add(new Guest(s1, s2, s3, s4));
//					break;
//				case "remove":
//					System.out.println("Ati ales sa stergeti un participant! Sa cautam participantul");
//					System.out.println("Dupa ce camp doriti sa cautati? (First Name & Last Name (a), Email (b) or Phone Number (b))");
//					s = sc.nextLine();
//					switch(s) {		
//						case "a":
//							System.out.println("Introduceti First Name:");
//							s1 = sc.nextLine();
//							System.out.println("Introduceti Last Name:");
//							s2 = sc.nextLine();
//							if (gList.checkProcedure(s1, s2, null, null) == null) {
//								System.out.println("Nu exista participantul cautat");
//								break;
//							}
//							gList.remove(s1, s2, null, null);
//							break;
//						case "b":
//							System.out.println("Introduceti emailul:");
//							s1 = sc.nextLine();
//							if (gList.checkProcedure(null, null, s1, null) == null) {
//								System.out.println("Nu exista participantul cautat");
//								break;
//							}
//							gList.remove(null, null, s1, null);
//							break;
//						case "c":
//							System.out.println("Introduceti emailul:");
//							s1 = sc.nextLine();
//							if (gList.checkProcedure(null, null, null, s1) == null) {
//								System.out.println("Nu exista participantul cautat");
//								break;
//							}
//							gList.remove(null, null, null, s1);
//							break;
//					}					
//					break;	
//				case "update":
//					System.out.println("Ati ales sa actualizati datele unui participant! Dupa ce camp doriti sa cautati? (First Name & Last Name (a), Email (b) or Phone Number (b))");
//					s = sc.nextLine();
//					switch(s) {		
//						case "a":
//							System.out.println("Introduceti First Name:");
//							s1 = sc.nextLine();
//							System.out.println("Introduceti Last Name:");
//							s2 = sc.nextLine();
//							if (gList.checkProcedure(s1, s2, null, null) == null) {
//								System.out.println("Nu exista participantul cautat");
//								break;
//							}
//							gList.display(gList.checkProcedure(s1, s2, null, null));
//							System.out.println("Ce doriti sa actualizati? (First Name (a), Last Name (b), Email (c) or Phone Number (d))");
//							s3 = sc.nextLine();
//							System.out.println("Introduceti noul camp conform optiunii dumneavoastra: ");
//							s4 = sc.nextLine();
//							if (s3.equals("a")) {
//								gList.checkProcedure(s1, s2, null, null).setFirstName(s4);
//							} else if (s3.equals("b")) {
//								gList.checkProcedure(s1, s2, null, null).setLastName(s4);
//							} else if (s3.equals("c")) {
//								gList.checkProcedure(s1, s2, null, null).setEmail(s4);
//							} else if (s3.equals("d")) {
//								gList.checkProcedure(s1, s2, null, null).setPhoneNumber(s4);
//							} else System.out.println("Optiune incorecta!");
//							break;
//						case "b":
//							System.out.println("Introduceti emailul:");
//							s1 = sc.nextLine();
//							if (gList.checkProcedure(null, null, s1, null) == null) {
//								System.out.println("Nu exista participantul cautat");
//								break;
//							}
//							System.out.println("Ce doriti sa actualizati? (First Name (a), Last Name (b), Email (c) or Phone Number (d))");
//							s3 = sc.nextLine();
//							System.out.println("Introduceti noul camp conform optiunii dumneavoastra: ");
//							s4 = sc.nextLine();
//							if (s3.equals("a")) {
//								gList.checkProcedure(null, null, s1, null).setFirstName(s4);
//							} else if (s3.equals("b")) {
//								gList.checkProcedure(null, null, s1, null).setLastName(s4);
//							} else if (s3.equals("c")) {
//								gList.checkProcedure(null, null, s1, null).setEmail(s4);
//							} else if (s3.equals("d")) {
//								gList.checkProcedure(null, null, s1, null).setPhoneNumber(s4);
//							} else System.out.println("Optiune incorecta!");
//							break;
//						case "c":
//							System.out.println("Introduceti Phone Number:");
//							s1 = sc.nextLine();
//							if (gList.checkProcedure(null, null, null, s1) == null) {
//								System.out.println("Nu exista participantul cautat");
//							}
//							System.out.println("Ce doriti sa actualizati? (First Name (a), Last Name (b), Email (c) or Phone Number (d))");
//							s3 = sc.nextLine();
//							System.out.println("Introduceti noul camp conform optiunii dumneavoastra: ");
//							s4 = sc.nextLine();
//							if (s3.equals("a")) {
//								gList.checkProcedure(null, null, null, s1).setFirstName(s4);
//							} else if (s3.equals("b")) {
//								gList.checkProcedure(null, null, null, s1).setLastName(s4);
//							} else if (s3.equals("c")) {
//								gList.checkProcedure(null, null, null, s1).setEmail(s4);
//							} else if (s3.equals("d")) {
//								gList.checkProcedure(null, null, null, s1).setPhoneNumber(s4);
//							} else System.out.println("Optiune incorecta!");
//							break;
//					}					
//					break;		
//				case "check":
//					System.out.println("Ati ales sa vedeti daca o persoana este inscrisa la eveniment");
//					System.out.println("Dupa ce camp doriti sa cautati? (FirstName&LastName (a), Email (b) or Phone Number (c))");
//					s = sc.nextLine();
//					switch (s) {
//						case "a":
//						System.out.println("Introduceti First Name");
//						s1 = sc.nextLine();
//						System.out.println("Introduceti Last Name");
//						s2 = sc.nextLine();
//						gList.checkName(s1, s2);
//						break;
//					case "b":
//						System.out.println("Introduceti emailul");
//						s1 = sc.nextLine();
//						gList.checkEmail(s1);
//						break;
//					case "c":
//						System.out.println("Introduceti Phone Number");
//						s1 = sc.nextLine();
//						gList.checkPhoneNumber(s1);
//						break;
//					default:
//						System.out.println("Optiune necunoscuta! La revedere!");
//					break;	
//					}
//					break;
//				case "guests":
//					System.out.println("Ati ales sa vedeti lista de participanti!");
//					gList.guests();
//					break;
//				case "waitlist":
//					System.out.println("Ati ales sa vedeti lista de asteptare!");
//					gList.waitlist();
//					break;	
//				case "available":
//					System.out.println("Sa vedem cate locuri mai sunt disponibile la eveniment!");
//					System.out.println(gList.available());
//					break;	
//				case "guests_no":
//					System.out.println("Sa vedem cate persoane participa la eveniment!");
//					System.out.println(gList.guests_no());
//					break;	
//				case "waitlist_no":
//					System.out.println("Sa vedem cate persoane sunt pe lista de asteptare!");
//					System.out.println(gList.waitlist_no());
//					break;
//				case "subscribe_no":
//					System.out.println("Sa vedem numarul total de persoane inscrise!");
//					System.out.println(gList.subscribe_no());
//					break;
//				case "search":
//					System.out.println("Ati ales sa cautati persoane din lista noastra!");
//					System.out.println("Introduceti caracterele cautate: ");
//					s = sc.nextLine();
//					gList.search(s);
//					break;
//				case "quit":
//					System.out.println("La revedere! Va mai asteptam pe la noi");
//					break;
//				default:
//					System.out.println("Optiune incorecta! Reincercati");
//			}
//		} while (!option.equals("quit"));
//		sc.close();
//	}
//}
