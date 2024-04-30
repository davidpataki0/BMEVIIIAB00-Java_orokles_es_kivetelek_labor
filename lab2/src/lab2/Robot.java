package lab2;

public class Robot extends Jatekos{
	public int ID;
	public static int IDcount = 0;
	
	public Robot() {
		ID = IDcount++;
	}
	
	public String toString() {
		return "Robot" + ID;
	}
	
	public void lep()
	{
		System.out.println(toString());
		System.out.println("Korszam: " + asztal.getKor());
		System.out.println("Tet: " + asztal.getTet());
	}
}
