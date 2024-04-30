package lab2;

public class Kezdo extends Jatekos{
	private String nev;
	
	public Kezdo(String neve) {
		nev = neve;
	}
	
	public String toString() {
		return nev;
	}
	
	public void lep()
	{
		System.out.println(toString());
		System.out.println("Korszam: " + asztal.getKor());
		System.out.println("Tet: " + asztal.getTet());
	}
}
