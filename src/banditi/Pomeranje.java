package banditi;

public class Pomeranje extends Akcija{

	Smer smer;
	
	public Pomeranje(Kompozicija k, Smer s) {
		super(k);
		smer=s;
	}

	@Override
	public void izvrsi(Bandit bandit) throws GNepostojeciVagon {
		for(Vagon vg: kompozicija.vagoni_lista) {
			if(vg.sadrziBandita(bandit)==true) {
			Vagon v= kompozicija.dohvatiVagon(bandit);
			
			if(kompozicija.vagoni_lista.indexOf(v) != kompozicija.vagoni_lista.size()-1 && kompozicija.vagoni_lista.indexOf(v)!=0) {
				v.ukloniBandita(bandit);
				Vagon v_susedni=kompozicija.dohvatiSusedniVagon(v, smer);
				v_susedni.dodajBandita(bandit);
				}
			}
		}
	}
	
	@Override
	public String toString() {
		StringBuilder sb= new StringBuilder();
		
		sb.append("Pomeranje: ");
		sb.append(smer);
		
		return sb.toString();
	}

}
