package examentp;

public class ResultatOral implements Resultat{
private char appreciation;


public ResultatOral(char a) {
    if((a=='A' ) || (a=='B' )|| (a=='C')) {
        this.appreciation = a;
    }
}

@Override
public String toString() {
	return this.getClass().getSimpleName()+"Appreciation :"+this.appreciation;
}
	@Override
	public int compareTo(Resultat r) {
		int c=0;
		if(r instanceof ResultatOral) {
			if(this.appreciation==((ResultatOral) r).getAppreciation()) {
				c= 0;
			}else if(this.appreciation > ((ResultatOral) r).getAppreciation()) {
			c= 1;
			}else {
			c= -1;
			}
		}
		return c;
}

	
public char getAppreciation() {
		return appreciation;
	}

public void setAppreciation(char appreciation) {

		this.appreciation = appreciation;
	
	
	
	}

	
	
	

}
