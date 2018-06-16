package cz.alisma.alej.text.wrapping;

public class Opakuj {
	public static String opakuj(String opakuj, int pocet) {
		String opak = "";
		while (pocet > 0) {
			pocet--;
			opak += opakuj;
		}
		return opak;
	}

}
