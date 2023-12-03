package examentp;

import java.util.Arrays;

public class Epreuve{

private	Candidat tab[];
private String  denomination;
private int nbrmaxpart;
private int nbreffectif;
private boolean etat;


public Epreuve(String denomination, int max) {
	
	this.denomination = denomination;
	this.nbrmaxpart = max;
	
	tab=new Candidat[max];
	
}


@Override public String toString() {
	String s= " denomination : " + this.denomination+ ", etat : " + etat +"  les noms des candidats : ( ";
	for(int i=0;i<this.nbreffectif;i++) {
		s+=" | "+tab[i].getNon()+" | ";
	}
	s+= " )";	
	return s;
}

void ajoutCandidat(Candidat a) {
	if(!estTerminee() && this.nbreffectif<this.nbrmaxpart) {
		tab[this.nbreffectif]=a;
		this.nbreffectif++;
	}else {
		System.out.println("Impossible le nombre maximum est pas atteint!!!!!");
	}
}


void terminer () {
	this.etat=true;
}

boolean estTerminee() {
	return etat;
}
	
Resultat getRecord() {
	Resultat max=null;
	 max=tab[0].getResultat();
	for (int i=1;i<this.nbreffectif;i++) {
		if(tab[i].getResultat().compareTo(max)==1) {
			max=tab[i].getResultat();
		}
		}
	return max;
	}

Candidat getVinqueur(){
	Resultat r = getRecord();
	if (estTerminee()) {
		for (int i=0; i<this.nbreffectif; i++) {
			if ((tab[i].getResultat()).compareTo(r) == 0) {
				System.out.println(" le candidat vinqueur est : ");
				return tab[i];
			}
		}
	}
	else {
		System.out.println(" epreuve est terminer ! ");
	}
	return null;
}

void fixeResultat(int id, Resultat r) throws IllegalUpdateException {
	if(etat) {
		throw new IllegalUpdateException(" error") ;
	}
	else {
		for(int i=0;i<this.nbreffectif;i++) {
			if(tab[i].getId()==id) {
				tab[i].setResultat(r);
				break;
				}
			}
		}
}
 
 Resultat getResultat(int id) {
	 for (int i=0;i<this.nbreffectif;i++) {
		 if(tab[i].getId()==id) {
			 return tab[i].getResultat();
		 }
	 }
	return null;
 }
}
