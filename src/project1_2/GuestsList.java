package project1_2;

import java.util.ArrayList;

public class GuestsList {
	int nrLocuriDispo;
	ArrayList<Guest> attList = new ArrayList<Guest>();
	
	public GuestsList(int nrLocuriDispo, ArrayList<Guest> attendantsList) {
		this.nrLocuriDispo = nrLocuriDispo;
		this.attList = attendantsList;
	}
	
	public int add(Guest g) { //pt add din Main
		if (myEqual(g) != Integer.MIN_VALUE) {
			System.out.println("Sunteti deja inscris in lista");
			return -1;
		}
		else if (attList.size() >= nrLocuriDispo) {
			System.out.println("Te-ai inscris cu succes in lista de asteptare si ai primit numarul de ordine <"+ (attList.size() - this.nrLocuriDispo + 1) +">. Te vom notifica daca un loc devine disponibil");
			attList.add(g);
			return (attList.size() - this.nrLocuriDispo);
		} else System.out.println("Felicitari! Locul tau la eveniment este confirmat. Te asteptam!");
		attList.add(g);
		return 0;
	}
	public void remove(Guest g) { //pt remove din Main
		boolean exists = false;
//		System.out.println("Ati ales sa stergeti: ");
		if (myEqual(g) != Integer.MIN_VALUE) {
			exists = true;
			display(attList.get(myEqual(g)));
			attList.remove(myEqual(g));
		}
		if (exists == false)
			System.out.println("Nu exista niciun participant conform stringului introdus!");
	}
	public boolean check(Guest g) { //check din Main
//		System.out.println("Ati ales sa cautati: ");
		if (myEqual(g) != Integer.MIN_VALUE) {
			display(attList.get(myEqual(g)));				
			if (myEqual(g) < this.nrLocuriDispo)
					System.out.println("Persoana este in lista de participanti");
			else System.out.println("Persoana este inscrisa, dar pe lista de asteptare");
			return true;
		}
		System.out.println("Persoana nu este inscrisa la eveniment!");
		return false;
	}
	public Guest checkProcedure(Guest g) { //pt update din Main
		return attList.get(myEqual(g));
	}
	public int myEqual(Guest g) { //pt reutilizare cod
		if (attList.size() == 0)
			return Integer.MIN_VALUE;
		for (int i = 0; i < attList.size(); i++) {
			if (((attList.get(i).getFirstName().toLowerCase().equals(g.getFirstName().toLowerCase())) &&
				(attList.get(i).getLastName().toLowerCase().equals(g.getLastName().toLowerCase()))) ||
				(attList.get(i).getEmail().toLowerCase().equals(g.getEmail().toLowerCase())) ||
				(attList.get(i).getPhoneNumber().toLowerCase().equals(g.getPhoneNumber().toLowerCase()))) {
				return i;
			}
		}
		return Integer.MIN_VALUE;
	}
	public void search(String s) { //pt search din Main
		for (int i = 0; i < attList.size(); i++) {
			if ((attList.get(i).getFirstName().toLowerCase().indexOf(s.toLowerCase()) >= 0) || (attList.get(i).getLastName().toLowerCase().indexOf(s.toLowerCase()) >= 0) ||
					(attList.get(i).getEmail().toLowerCase().indexOf(s.toLowerCase()) >= 0) || (attList.get(i).getPhoneNumber().toLowerCase().indexOf(s.toLowerCase()) >= 0)) 
				System.out.println("Prenume: " + attList.get(i).getFirstName() + " | Nume: " + attList.get(i).getLastName() + 
						" | Email: " + attList.get(i).getEmail() + " | Phone: " +  attList.get(i).getPhoneNumber());				
		}
	}

	public void guests() {
		int min;
		if (attList.size() == 0) {
			System.out.println("Nu exista oameni inscrisi");
			return;
		}
		min = (attList.size() < this.nrLocuriDispo) ? attList.size() : this.nrLocuriDispo;
		for(int i = 0; i < min; i++) {
			System.out.println(i + 1 + ". Prenume: " + attList.get(i).getFirstName() + " | Nume: " + attList.get(i).getLastName() + 
					" | Email: " + attList.get(i).getEmail() + " | Phone: " +  attList.get(i).getPhoneNumber());
		}
		System.out.println();
	}
	public void waitlist() {
//		System.out.println("Persoanele din lista de asteptare ");
		if (attList.size() <= this.nrLocuriDispo)
			System.out.println("Nu sunt persoane in lista de asteptare");
		else for (int i = this.nrLocuriDispo; i < attList.size(); i++) {
			System.out.println((i + 1 - this.nrLocuriDispo) + ". Prenume: " + attList.get(i).getFirstName() + " | Nume: " + attList.get(i).getLastName() + 
					" | Email: " + attList.get(i).getEmail() + " | Phone: " +  attList.get(i).getPhoneNumber());
		}
		System.out.println();
	}

	public int guests_no() {
		if (attList.size() <= this.nrLocuriDispo)
			return attList.size();
		return this.nrLocuriDispo;
	}
	public int subscribe_no() {
		return attList.size();
	}
	public int waitlist_no() {
		if (this.nrLocuriDispo >= attList.size()) 
			return 0;
		return (attList.size() - this.nrLocuriDispo);

	}
	public int available() {
		if (this.nrLocuriDispo > attList.size())
			return (this.nrLocuriDispo - attList.size());
		return 0;
	}
	
	public void display(Guest g) {
		System.out.println("Prenume: " + g.getFirstName() + " | Nume: " + g.getLastName() + " | Email: " + g.getEmail() + " | Phone: " +  g.getPhoneNumber());
	}
}
