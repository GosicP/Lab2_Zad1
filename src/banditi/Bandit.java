package banditi;

public class Bandit {
	
	public enum Tim {A, B}
	private Tim tim;
	private int broj_zlatnika;
	
	public Bandit(Tim t) {
		tim=t;
		broj_zlatnika=50;
	}

	public Tim dohvatiTim() {
		return tim;
	}

	public int dohvatiBrojZlatnika() {
		return broj_zlatnika;
	}
	
	public void promeniBrojZlatnika(int vrednost) {
		broj_zlatnika+=vrednost;
	}
	
	@Override
	public String toString() {
		StringBuilder sb= new StringBuilder();
		sb.append(tim);
		sb.append(broj_zlatnika);
		return sb.toString();
	}
}
