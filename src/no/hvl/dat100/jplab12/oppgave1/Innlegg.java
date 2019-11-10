package no.hvl.dat100.jplab12.oppgave1;

import no.hvl.dat100.jplab12.common.TODO;

public abstract class Innlegg {

	// TODO - deklarering av objektvariable
	protected int id;
	protected String bruker;
	protected String dato;
	protected int likes;

	public Innlegg() {

	}

	public Innlegg(int id, String bruker, String dato) {

		// TODO
		this.id = id;
		this.bruker = bruker;
		this.dato = dato;
	}

	public Innlegg(int id, String bruker, String dato, int likes) {

		// TODO - START
		this.id = id;
		this.bruker = bruker;
		this.dato = dato;
		this.likes = likes;
	}

	public String getBruker() {

		return this.bruker;
	}

	public void setBruker(String bruker) {

		this.bruker = bruker;
	}

	public String getDato() {

		return this.dato;
	}

	public void setDato(String dato) {
		
		this.dato = dato;
	}

	public int getId() {
		
		return this.id;
	}

	public int getLikes() {
		
		return this.likes;
	}

	public void doLike() {
		
		this.likes += 1;	
	}

	public boolean erLik(Innlegg innlegg) {
		
		if (this.id == innlegg.getId()) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String toString() {

		String s = (this.getId() + "\n" + this.getBruker() + "\n" + this.getDato() + "\n" + this.getLikes() + "\n");
		return s;
	}

	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {

		throw new UnsupportedOperationException(TODO.method());

	}
}
