package examentp;

public class ResultatPoints implements Resultat{
private int ptcumuler;


public ResultatPoints(int pointsCum){
	this.ptcumuler=pointsCum;
}

@Override
public int compareTo(Resultat r) {
	int c=0;
	if(r instanceof ResultatPoints) {
		if(this.ptcumuler==((ResultatPoints) r).getPtcumuler()){
			c= 0 ;
		}else if(this.ptcumuler > ((ResultatPoints) r).getPtcumuler()) {
			c= 1;
		}else {
			c= -1;
		}
	}
return c;
}


@Override
public String toString() {
	return "les points cumules du candidat est ="+this.ptcumuler;
}
	


public int getPtcumuler() {
	return ptcumuler;
}

public void setPtcumuler(int ptcumuler) {
	this.ptcumuler = ptcumuler;
}




}
