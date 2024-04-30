package lab2;

import java.util.Random;

public class Asztal {
	private Jatekos[] jatekosok = new Jatekos[0];
	private double tet;
	private int kor;
	private double goal;
	
	public void ujJatek()
	{
		tet = 0;
		kor = 0;
		Random random = new Random();
		goal = random.nextDouble() * 100;
	}
	
	public void addJatekos(Jatekos j)
	{
		if(jatekosok.length < 10) {
			Jatekos[] tmp = new Jatekos[jatekosok.length + 1];
			for(int i = 0; i < jatekosok.length; i++) {
				tmp[i] = jatekosok[i];
			}
			tmp[jatekosok.length] = j;
			jatekosok = tmp;
			j.asztal = this;
		}
	}
	
	public int getKor()
	{
		return kor;
	}
	
	public void emel(double d)
	{
		tet += d;
	}
	
	public void kor() //throws NincsJatekos
	{
		/*if(jatekosok.length == 0) {
			throw new NincsJatekos("Az asztalnál nem ül senki!");
		}*/
		if(kor == -1) {
			System.out.println("Vege a jateknak!");
			return;
		}
		kor++;
		for(int i = 0; i < jatekosok.length; i++)
		{
			jatekosok[i].lep();
			if(tet > goal && tet < (goal * 1.1)) {
				System.out.println("A " + i + ". jatekos nyert!");
			}
		}
	}
	
	public double getTet()
	{
		return 0;
	}
}
