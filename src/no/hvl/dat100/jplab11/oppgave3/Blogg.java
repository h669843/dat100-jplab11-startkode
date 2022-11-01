package no.hvl.dat100.jplab11.oppgave3;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.*;

public class Blogg {

	protected Innlegg[] innleggtabell;
	protected int nesteledig;
	

	public Blogg() {
		this.innleggtabell = new Innlegg[20];
	}

	public Blogg(int lengde) {
		this.innleggtabell = new Innlegg[lengde];
		this.nesteledig = 0;
	}

	public int getAntall() {
		return nesteledig;
	}
	
	public Innlegg[] getSamling() {
		return innleggtabell;

	}
	
	public int finnInnlegg(Innlegg innlegg) {

		for (int i = 0; i <innleggtabell.length; i++) {

			if(innleggtabell[i] == null){
				return -1;
			}
			if(innleggtabell[i].erLik(innlegg)){
				return i;

			}

		}
		return -1;
	}

	public boolean finnes(Innlegg innlegg) {

		if (finnInnlegg(innlegg) >= 0) {
			return true;
		}
		return false;
	}

	public boolean ledigPlass() {

		if (nesteledig < innleggtabell.length) {
			return true;
		}
		return false;
	}
	
    public boolean leggTil(Innlegg innlegg) {

		if (finnes(innlegg) == false && nesteledig < innleggtabell.length) {
			innleggtabell[nesteledig] = innlegg;
			nesteledig++;
			return true;
		}
		return false;
	}
	
    public String toString() {
		String teksten = "" + nesteledig + "\n";
		for (int i = 0; i < nesteledig; i++) {
			teksten += innleggtabell[i].toString();
		}
		return teksten;
	}

	// valgfrie oppgaver nedenfor
	
	public void utvid() {
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public boolean leggTilUtvid(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
		
	}
	
	public boolean slett(Innlegg innlegg) {
		
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public int[] search(String keyword) {
		
		throw new UnsupportedOperationException(TODO.method());

	}
}