package lab2;

public class Main {
	public static void main(String[] args) {
		Asztal asztal = new Asztal();
		asztal.ujJatek();
		asztal.addJatekos(new Kezdo("Csima"));
		asztal.addJatekos(new Kezdo("Ricsa"));
		asztal.addJatekos(new Kezdo("Zan"));
		asztal.addJatekos(new Robot());
	}

}
