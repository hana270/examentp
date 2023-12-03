package examentp;

public class main {
public static void main(String[] args) {
	
	Epreuve e1=new Epreuve("denomiration",10);
	Candidat c1=new Candidat(1,"Hana");
	Candidat c2=new Candidat(2,"Amal");
	Candidat c3=new Candidat(3,"Salma");
	
	e1.ajoutCandidat(c1);
	e1.ajoutCandidat(c2);
	e1.ajoutCandidat(c3);
	
	System.out.println("***********Epreuve : ***************");
	System.out.println(e1.toString()+"\n");
	
	
	ResultatOral r1 = new ResultatOral ('A');
	ResultatOral r2 = new ResultatOral ('B');
	ResultatOral r3 = new ResultatOral ('C');
	try {
		e1.fixeResultat(1, r1);
		e1.fixeResultat(2, r2);
		e1.fixeResultat(3, r3);
	}
	catch ( IllegalUpdateException a){
		System.out.println("erreur");
		a.getMessage();
		a.printStackTrace();
	}
	e1.terminer();
	
	System.out.println("Resultat Record : "+e1.getRecord()+"\n");
	System.out.println(e1.getVinqueur());
	
	
}
}
