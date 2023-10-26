package frontiere;

import java.util.Scanner;

import controleur.ControlPrendreEtal;

public class BoundaryPrendreEtal {
	private ControlPrendreEtal controlPrendreEtal;
	private Scanner scan = new Scanner(System.in);

	public BoundaryPrendreEtal(ControlPrendreEtal controlChercherEtal) {
		this.controlPrendreEtal = controlChercherEtal;
	}

	public void prendreEtal(String nomVendeur) {
		//TODO a completer
		if(controlPrendreEtal.verifierIdentite(nomVendeur)==false)
		{
			StringBuilder question = new StringBuilder();
			question.append("Je suis désolée Panoramix mais il\r\n"
					+ "faut être un habitant de notre\r\n"
					+ "village pour commercer ici.\r\n"
					+ ")");
			System.out.println(question);
		}
		installerVendeur(nomVendeur);
		
	}

	private void installerVendeur(String nomVendeur) {
		//TODO a completer
		String produit=null;
		int nb=0;
		if(controlPrendreEtal.resteEtals()==true)
		{
			StringBuilder question = new StringBuilder();
			question.append("c'est parfait il me reste un etal pour vous");
			question.append(" il me faudrait quelques renseignements ");
			question.append(" Quel produit souhaitez vous vendre ");
			System.out.println(question);
			String prod = new Scanner(System.in).nextLine();
			System.out.println( prod );
			produit=prod;
			nb=Clavier.entrerEntier("combien souhaitez-vous vendre");
			
			System.out.println("le vendeur"+" "+nomVendeur+" "+"s'est installé a l'etal n"+" "+controlPrendreEtal.prendreEtal(nomVendeur,produit,nb));
		}
		else
		{
			System.out.println("Desolée"+" "+nomVendeur+" "+"je n'ai plus d'etal qui ne soit pas deja occupe");
		}
	}
}
