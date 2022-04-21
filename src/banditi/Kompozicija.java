package banditi;

import java.util.LinkedList;
import java.util.List;

public class Kompozicija {
	
	
	List<Vagon> vagoni_lista = new LinkedList<Vagon>();
	Smer smer_vagona;
	
	public Kompozicija() {}

	public void dodajVagon(Vagon vagon) {
		vagoni_lista.add(vagon);
		
	}

	public Vagon dohvatiVagon(Bandit bandit) throws GNepostojeciVagon {
		for(Vagon v:vagoni_lista) {
			if(v.sadrziBandita(bandit)==true) {return v;}
		}
		/*for(int i=0; i<vagoni_lista.size(); i++) {
			if(vagoni_lista.get(i).sadrziBandita(bandit)==true) {
				return vagoni_lista.get(i);
			}
		}*/
		throw new GNepostojeciVagon();
		
		
		
		
	}
	
	public Vagon dohvatiSusedniVagon(Vagon vagon, Smer smer) throws GNepostojeciVagon {
		if(smer.compareTo(smer_vagona.ISPRED)!=0) {
			int broj_vagona=vagoni_lista.indexOf(vagon);
			if(broj_vagona != vagoni_lista.size()-1) {
			return vagoni_lista.get(broj_vagona+1);
			}else {
				throw new GNepostojeciVagon();
			}
		}else {
			int broj_vagona=vagoni_lista.indexOf(vagon);
			if(broj_vagona != 0) {
			return vagoni_lista.get(broj_vagona-1);
			}else {
				throw new GNepostojeciVagon();
			}
			
		}
		
	} 

	@Override
	public String toString() {
		StringBuilder sb= new StringBuilder();
		for(int i=0; i<vagoni_lista.size(); i++) {
			sb.append(vagoni_lista.get(i));
			if(i!=vagoni_lista.size()-1) {
				sb.append("_");
			}
		}
		return sb.toString();
	}
	
	

}
