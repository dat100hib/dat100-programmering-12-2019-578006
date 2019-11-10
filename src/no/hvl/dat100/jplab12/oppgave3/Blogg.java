package no.hvl.dat100.jplab12.oppgave3;

import no.hvl.dat100.jplab12.common.TODO;
import no.hvl.dat100.jplab12.oppgave1.*;

public class Blogg {

	// TODO: objektvariable
	private Innlegg[] innleggtabell;
	private int nesteledig;

	public Blogg() {
		this.innleggtabell = new Innlegg[20];
		this.nesteledig = 0;
	}

	public Blogg(int lengde) {
		this.nesteledig = 0;
		this.innleggtabell = new Innlegg[lengde];
	}

	public int getAntall() {
		return nesteledig;
	}

	public Innlegg[] getSamling() {
		return innleggtabell;
	}

	public int finnInnlegg(Innlegg innlegg) {

		int p = -1;
		int i = 0;
		while (i < nesteledig && p == -1) {
			if (innleggtabell[i].erLik(innlegg)) {
				p = i;
			}
			i++;
		}
		return p;
	}

	public boolean finnes(Innlegg innlegg) {
		int a = finnInnlegg(innlegg);
		if (a >= 0) {
			return true;
		} else {
			return false;
		}
//		boolean finnes = false;
//		int i = 0;
//		while (i < nesteledig && finnes == false) {
//			finnes = innleggtabell[i].erLik(innlegg);
//			i++;
//		}
//		return finnes;
	}

	public boolean ledigPlass() {
		return this.nesteledig < innleggtabell.length;
	}

	public boolean leggTil(Innlegg innlegg) {
		if (finnes(innlegg)) {
			return false;
		} else {
			if (ledigPlass()) {
				this.innleggtabell[nesteledig] = innlegg;
				nesteledig++;
				return true;
			} else {
				return false;
			}
		}
	}

	public String toString() {
		/*
		 * var sb = new StringBuilder(Integer.toString(nesteledig)).append("\n"); for
		 * (Innlegg innlegg : innleggtabell) { if (innlegg == null) break;
		 * sb.append(innlegg.toString()); } return sb.toString();
		 */

		String tkst = "";
		for (int i = 0; i < nesteledig; i++) {
			tkst += innleggtabell[i];
		}

		return getAntall() + "\n" + tkst;
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