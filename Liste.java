package tp3;

public class Liste {
	private static final int LMAX=10000 ;
	private Element tab[] ;
	private int longueur_list ;
	
	
	public static int getLmax() {
		return LMAX;
	}


	public Element[] getTab() {
		return tab;
	}
	public void setTab(Element[] tab) {
		this.tab = tab;
	}
	public int getLongueur_list() {
		return longueur_list;
	}
	public void setLongueur_list(int longueur_list) {
		this.longueur_list = longueur_list;
	}
	public Liste listeVide(){
		Liste L = new Liste() ;
		L.tab = null ;
		L.longueur_list = 0 ;
		return L ;
	}
	public Liste inserer(Liste L, int p, Element e){
		
		if(L.LongueurIter(L) < LMAX) {
			if(L.LongueurIter(L) !=0 && p != (L.LongueurIter(L)+1)) {
				for(int j=L.longueur_list; j >= p ; j--) {
					L.tab[j+1] = L.tab[j];
				}
			}
			L.tab[p] = e;
			L.longueur_list = L.longueur_list + 1;
		}
		else{
		System.out.println("l’insertion est impossible, la liste est saturée");
		}
		return L ;
	}
	
	public Liste supprimer(Liste L,int p) {
		if(L.longueur_list != 1 ) {
			for(int j=p;j<=L.longueur_list-1;j++) {
				L.tab[j] = L.tab[j+1];
			}
		}
		L.longueur_list--;
		return L;
	}
	
	public Element acces(Liste L, int p) {
		return L.tab[p];
	}
	public int LongueurIter(Liste L) {
		return L.longueur_list;
	}
	
	public int Longueur_rec(Liste L) {
		if(L.estVide(L)) {
			return 0;
		}else {
			return 1+Longueur_rec(supprimer(L,1));
		}
	}
	
	public boolean estVide(Liste L) {
		return(L.LongueurIter(L)==0);
	}
	
	public Liste inverse(Liste L) {
		Element x;
		for (int i=0; i<L.longueur_list/2;i++) {
			x = L.tab[i];
			L.tab[i] = L.tab[L.longueur_list-(i+1)];
			L.tab[L.longueur_list-(i+1)] = x;
		}
		return L;
	}
	
	public Element queue (Liste L) {
		return L.acces(L, L.LongueurIter(L)-1);
	}
	
	public Liste concatener (Liste L1, Liste L2) {
		for (int i=1; i<L2.LongueurIter(L2)-1; i++) {
			L1.inserer(L1, L1.LongueurIter(L1)+i ,L2.acces(L2, i));
		}
		return L1;
	}
}
