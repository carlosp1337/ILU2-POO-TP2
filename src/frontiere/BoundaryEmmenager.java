package frontiere;

import java.util.Scanner;

import controleur.ControlEmmenager;

public class BoundaryEmmenager {
	private ControlEmmenager controlEmmenager;

	public BoundaryEmmenager(ControlEmmenager controlEmmenager) {
		this.controlEmmenager = controlEmmenager;
	}

	public void emmenager(String nomVisiteur) {
		if (controlEmmenager.isHabitant(nomVisiteur)) {
			System.out.println(
					"Mais vous Ãªtes dÃ©jÃ  un habitant du village !");
		} else {
			StringBuilder question = new StringBuilder();
			question.append("ÃŠtes-vous :\n");
			question.append("1 - un druide.\n");
			question.append("2 - un gaulois.\n");
			int choixUtilisateur = -1;
			do {
				choixUtilisateur = Clavier.entrerEntier(question.toString());
				switch (choixUtilisateur) {
				case 1:
					emmenagerDruide(nomVisiteur);
					break;

				case 2:
					//TODO a completer
					StringBuilder questionVillageois = new StringBuilder();
					questionVillageois.append("Bienvenue villageois" +nomVisiteur);
					questionVillageois.append("Quelle est votre force ?");
					Scanner scan = new Scanner(System.in);
					String ForceVillageois = scan.nextLine();
					break;

				default:
					System.out
							.println("Vous devez choisir le chiffre 1 ou 2 !");
					break;
				}
			} while (choixUtilisateur != 1 && choixUtilisateur != 2);
		}
	}

	private void emmenagerDruide(String nomVisiteur) {
		StringBuilder questionDruide = new StringBuilder();
		questionDruide.append("Bienvenue druide" +nomVisiteur);
		int ForceDruide = Clavier.entrerEntier("Quelle est votre force ?");
		int effetPotionMax;
		int effetPotionMin;
		do {
			System.out.println("Attention Druide, vous êtes trompé entre le minimum et le maximum");
			effetPotionMin = Clavier.entrerEntier("Quelle est la force de potion la plus faible que vous produisez ?");
			effetPotionMax = Clavier.entrerEntier("Quelle est la force de potion la plus forte que vous produisez ?");
		} while ( effetPotionMax < effetPotionMin ) ;
		System.out.println("Le druide " +nomVisiteur + ": « Bonjour, je suis le druide " +nomVisiteur +" et ma potion peut aller d'une force" +effetPotionMin +" à "+effetPotionMax);
	}
}
