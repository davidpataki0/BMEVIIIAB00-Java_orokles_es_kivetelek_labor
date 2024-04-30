package lab2;

public abstract class Jatekos {
	protected Asztal asztal;
	
	public void lep()
	{
		System.out.println("Korszam: " + asztal.getKor());
		System.out.println("Tet: " + asztal.getTet());
	}
	
	public void setAsztal(Asztal a)
	{
		
	}
}
