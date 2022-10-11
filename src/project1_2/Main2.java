package project1_2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main2 {
	private static GuestsList gList;
	private static final Scanner sc = new Scanner(System.in);

	private static void add() {
		String s1, s2, s3, s4;
		System.out.println("Ati ales sa introduceti un participant nou!");
		System.out.println("Introduceti first name: ");
		s1 = sc.nextLine();
		System.out.println("Introduceti last name: ");
		s2 = sc.nextLine();
		System.out.println("Introduceti emailul: ");
		s3 = sc.nextLine();
		System.out.println("Introduceti phone: ");
		s4 = sc.nextLine();
		gList.add(new Guest(s1, s2, s3, s4));
	}

	private static void remove() {
		String s, s1, s2;
		
		System.out.println("Ati ales sa stergeti un participant! Sa cautam participantul");
		System.out.println("Dupa ce camp doriti sa cautati? (First Name & Last Name (a), Email (b) or Phone Number (b))");
		s = sc.nextLine();
		switch(s) {		
			case "a":
				System.out.println("Introduceti First Name:");
				s1 = sc.nextLine();
				System.out.println("Introduceti Last Name:");
				s2 = sc.nextLine();
				Guest g = new Guest(s1, s2, "blabla", "blabla");
				gList.remove(g);
				break;
			case "b":
				System.out.println("Introduceti emailul:");
				s1 = sc.nextLine();
				g = new Guest("blabla", "blabla", s1, "blabla");
				gList.remove(g);
				break;
			case "c":
				System.out.println("Introduceti emailul:");
				s1 = sc.nextLine();
				g = new Guest("blabla", "blabla", "blabla", s1);
				gList.remove(g);
				break;
		}			
	}
	private static void update() {
		String option, s1, s2, s3, s4;
		System.out.println("Ati ales sa actualizati datele unui participant! Dupa ce camp doriti sa cautati? (First Name & Last Name (a), Email (b) or Phone Number (b))");
		option = sc.nextLine();
		switch(option) {		
			case "a":
				System.out.println("Introduceti First Name:");
				s1 = sc.nextLine();
				System.out.println("Introduceti Last Name:");
				s2 = sc.nextLine();
				Guest g = new Guest(s1, s2, "blabla", "blabla");
				if (gList.checkProcedure(g) == null) {
					System.out.println("Nu exista participantul cautat");
					break;
				}
				gList.display(gList.checkProcedure(g));
				System.out.println("Ce doriti sa actualizati? (First Name (a), Last Name (b), Email (c) or Phone Number (d))");
				s3 = sc.nextLine();
				System.out.println("Introduceti noul camp conform optiunii dumneavoastra: ");
				s4 = sc.nextLine();
				if (s3.equals("a")) {
					gList.checkProcedure(g).setFirstName(s4);
				} else if (s3.equals("b")) {
					gList.checkProcedure(g).setLastName(s4);
				} else if (s3.equals("c")) {
					gList.checkProcedure(g).setEmail(s4);
				} else if (s3.equals("d")) {
					gList.checkProcedure(g).setPhoneNumber(s4);
				} else System.out.println("Optiune incorecta!");
				break;
			case "b":
				System.out.println("Introduceti emailul:");
				s1 = sc.nextLine();
				 g = new Guest("blabla", "blabla", s1, "blabla");

				if (gList.checkProcedure(g) == null) {
					System.out.println("Nu exista participantul cautat");
					break;
				}
				System.out.println("Ce doriti sa actualizati? (First Name (a), Last Name (b), Email (c) or Phone Number (d))");
				s3 = sc.nextLine();
				System.out.println("Introduceti noul camp conform optiunii dumneavoastra: ");
				s4 = sc.nextLine();
				if (s3.equals("a")) {
					gList.checkProcedure(g).setFirstName(s4);
				} else if (s3.equals("b")) {
					gList.checkProcedure(g).setLastName(s4);
				} else if (s3.equals("c")) {
					gList.checkProcedure(g).setEmail(s4);
				} else if (s3.equals("d")) {
					gList.checkProcedure(g).setPhoneNumber(s4);
				} else System.out.println("Optiune incorecta!");
				break;
			case "c":
				System.out.println("Introduceti Phone Number:");
				s1 = sc.nextLine();
				 g = new Guest("blabla", "blabla", "blabla", s1);

				if (gList.checkProcedure(g) == null) {
					System.out.println("Nu exista participantul cautat");
				}
				System.out.println("Ce doriti sa actualizati? (First Name (a), Last Name (b), Email (c) or Phone Number (d))");
				s3 = sc.nextLine();
				System.out.println("Introduceti noul camp conform optiunii dumneavoastra: ");
				s4 = sc.nextLine();
				if (s3.equals("a")) {
					gList.checkProcedure(g).setFirstName(s4);
				} else if (s3.equals("b")) {
					gList.checkProcedure(g).setLastName(s4);
				} else if (s3.equals("c")) {
					gList.checkProcedure(g).setEmail(s4);
				} else if (s3.equals("d")) {
					gList.checkProcedure(g).setPhoneNumber(s4);
				} else System.out.println("Optiune incorecta!");
				break;
		}				
	}
	private static void check() {
		String option, s1, s2;
		System.out.println("Ati ales sa vedeti daca o persoana este inscrisa la eveniment");
		System.out.println("Dupa ce camp doriti sa cautati? (FirstName&LastName (a), Email (b) or Phone Number (c))");
		option = sc.nextLine();
		switch (option) {
			case "a":
			System.out.println("Introduceti First Name");
			s1 = sc.nextLine();
			System.out.println("Introduceti Last Name");
			s2 = sc.nextLine();
			Guest g = new Guest(s1, s2, "blabla", "blabla");
			gList.check(g);
			break;
		case "b":
			System.out.println("Introduceti emailul");
			s1 = sc.nextLine();
			g = new Guest("blabla", "blabla", s1, "blabla");
			gList.check(g);
			break;
		case "c":
			System.out.println("Introduceti Phone Number");
			s1 = sc.nextLine();
			g = new Guest("blabla", "blabla", "blabla", s1);
			gList.check(g);
			break;
		default:
			System.out.println("Optiune necunoscuta! La revedere!");
		break;	
		}
	}
	private static void guests() {
		System.out.println("Ati ales sa vedeti lista de participanti!");
		gList.guests();
	}
	private static void waitlist() {
		System.out.println("Ati ales sa vedeti lista de asteptare!");
		gList.waitlist();
	}
	private static void available() {
		System.out.println("Sa vedem cate locuri mai sunt disponibile la eveniment!");
		System.out.println(gList.available());
	}
	private static void guests_no() {
		System.out.println("Sa vedem cate persoane participa la eveniment!");
		System.out.println(gList.guests_no());
	}
	private static void waitlist_no() {
		System.out.println("Sa vedem cate persoane sunt pe lista de asteptare!");
		System.out.println(gList.waitlist_no());
	}
	private static void subscribe_no() {
		System.out.println("Sa vedem numarul total de persoane inscrise!");
		System.out.println(gList.subscribe_no());
	}
	private static void search() {
		String s;
		System.out.println("Ati ales sa cautati persoane din lista noastra!");
		System.out.println("Introduceti caracterele cautate: ");
		s = sc.nextLine();
		gList.search(s);
	}
	
	public static void main(String[] args) {
		String option;
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Guest> att = new ArrayList<Guest>();
		att.add(new Guest("Cosmin", "Nitu", "cosminpnitu@gmail.com", "0742000001"));
		att.add(new Guest("Corina", "Nitu", "corina@gmail.com", "0742000002"));
		att.add(new Guest("Corina", "Nita", "iulia@gmail.com", "0742000003"));
		gList = new GuestsList(2, att);

		do {
			System.out.println("\nIntroduceti optiunea dumneavoastra (quit pt a iesi): ");
			System.out.println("add / update / remove / search / check / guests / waitlist / available / guests_no / waitlist_no / subscribe_no / quit");
			option = sc.nextLine();
			switch (option) {
				case "add":
					add();
					break;
				case "remove":
					remove();	
					break;	
				case "update":
					update();	
					break;		
				case "check":
					check();
					break;
				case "guests":
					guests();
					break;
				case "waitlist":
					waitlist();
					break;	
				case "available":
					available();
					break;	
				case "guests_no":
					guests_no();
					break;	
				case "waitlist_no":
					waitlist_no();
					break;
				case "subscribe_no":
					subscribe_no();
					break;
				case "search":
					search();
					break;
				case "quit":
					System.out.println("La revedere! Va mai asteptam pe la noi");
					break;
				default:
					System.out.println("Optiune incorecta! Reincercati");
			}
		} while (!option.equals("quit"));
		sc.close();
	}
}
