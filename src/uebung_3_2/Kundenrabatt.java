package uebung_3_2;

public class Kundenrabatt {

	public static void main(String[] args) {
		double bestellwert = 2000;
		double bisherigesKundenBestellvolumen = 11000;
		boolean istPremiumKunde = true;

		double rabatt1 = 0;
		double zusatzrabatt1 = 0;
		double gesamtrabatt = 0;

		if (bestellwert >= 100) {
			rabatt1 = 1;
			if (bestellwert >= 500) {
				rabatt1 = 2;
				if (bestellwert >= 2000) {
					rabatt1 = 3;
					if (bestellwert >= 5000) {
						rabatt1 = 5;
					}
				}
			}
		}
		if (istPremiumKunde == true) {
			rabatt1 = rabatt1 * 2;
		}

		if (bisherigesKundenBestellvolumen > 10000) {
			zusatzrabatt1 = 7.5;
			if (bisherigesKundenBestellvolumen > 50000) {
				zusatzrabatt1 = 12.5;
			}
		}

		if (bestellwert * 2 >= bisherigesKundenBestellvolumen) {
			zusatzrabatt1 = 3;
		}

		gesamtrabatt = rabatt1 + zusatzrabatt1;

		if (gesamtrabatt > 15) {
			gesamtrabatt = 15;
			if (istPremiumKunde == true) {
				gesamtrabatt = 20;
			}
		}
		System.out.println("Bestellwert = " + bestellwert);
		System.out.println("Neuer Bestellwert = "
				+ (bestellwert - (bestellwert * (gesamtrabatt / 100))));
	}

}
