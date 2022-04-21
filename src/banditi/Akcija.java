package banditi;

public abstract class Akcija {

	Kompozicija kompozicija;
	
	public Akcija(Kompozicija k) {
		kompozicija=k;
		
	}

	public abstract void izvrsi(Bandit dohvatiBandita) throws GNepostojeciVagon;

}
