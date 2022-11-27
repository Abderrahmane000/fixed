package tp3;
import java.util.Scanner;

public class Test {
	public static Liste creationListe(Liste L) {
		Scanner s = new Scanner(System.in);
		System.out.println("Entrer le nombre d'elements de la Liste: ");
		int nb = s.nextInt();
		if(nb==0) {
			return L;
		}else {
			Element []table = new Element[L.getLmax()];
			L.setTab(table);
			for(int i=0;i<nb;i++) {
				System.out.println("Entrer la valeur de l'element n "+i);
				Element e = new Element(s.nextInt());
				L = L.inserer(L,i,e);
				
			}
			return L;
		}
	}
	
	public static void affichageListe(Liste L) {
		for(int ind =0;ind<L.LongueurIter(L);ind++) {
			System.out.println(L.acces(L, ind));
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("************* Partie 1 ****************");
		Liste liste1 = new Liste();
		liste1 = liste1.listeVide();
		creationListe(liste1);
		if(liste1.estVide(liste1)) {
			System.out.println("La liste est vide");
		}else {
			System.out.println("Les elements de la liste sont : ");
			affichageListe(liste1);
		}
		
		System.out.println("************* Partie 2 ****************");
		if(liste1.estVide(liste1)) {
			System.out.println("La liste est vide");
		} else if (liste1.LongueurIter(liste1) == 1) {
			affichageListe(liste1);
			} else {
			System.out.println(liste1.inverse(liste1));
			affichageListe(liste1);
		}
		System.out.println("************* Partie 3 ****************");
		if(liste1.estVide(liste1)) {
			System.out.println("La liste est vide");
		} else if (liste1.LongueurIter(liste1) == 1) {
			affichageListe(liste1);
			} else {
			System.out.println(liste1.queue(liste1));
		}
		System.out.println("************* Partie 4 ****************");
		
		Liste liste2 = new Liste();
		liste2 = liste2.listeVide();
		creationListe(liste2);
		if(liste2.estVide(liste2)) {
			System.out.println("La liste est vide");
		}else {
			System.out.println("Les elements de la liste sont : ");
			affichageListe(liste2);
		}
		
		if (liste1.estVide(liste1) && liste2.estVide(liste2))
			System.out.println("Le resultat de la concatenation est une liste vide");
		
		if (liste1.estVide(liste1)) {
			System.out.println("le resultat de la concatenation est: ");
			affichageListe(liste2);
		}
		
		if(liste2.estVide(liste2)) {
			System.out.println("Le resultat de la concatenation est: ");
			affichageListe(liste1);
		} else if (liste1.LongueurIter(liste1)+ liste2.LongueurIter(liste2) > liste1.getLmax()) {
			System.out.println("La concatenation est impossible!");
		}else {
			affichageListe(liste1.concatener(liste1, liste2));
		}
	}
	
	
}
