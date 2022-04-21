package banditi;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Vagon {
	
	List<Bandit> banditi_lista = new LinkedList<Bandit>();

	public Vagon() {
		
	}

	public void dodajBandita(Bandit bandit) {
			banditi_lista.add(bandit);
	}

	public boolean sadrziBandita(Bandit bandit) { //pitaj za ovu metodu kako se zove
		if(banditi_lista.contains(bandit)==true) {
			return true;
		}else {
			return false;
		}
	}
	
	public void ukloniBandita(Bandit bandit){ //pitaj za ovu metodu kako se zove i jel se stavlja bandit, ili se stavlja njegov redni broj
		if(sadrziBandita(bandit)==true) {
			banditi_lista.remove(bandit);
		}
	}

	public int dohvatiBrojBandita() {
		return banditi_lista.size();
	}

	public Bandit dohvatiBandita(int i) {
		return banditi_lista.get(i);
	}
	
	@Override
	public String toString() {
		StringBuilder sb= new StringBuilder();
		sb.append("[");
		for(int i=0 ; i<banditi_lista.size(); i++ ) {
			sb.append(banditi_lista.get(i));
			if(i!=banditi_lista.size()-1) {
				sb.append(",");
			}
		}
		sb.append("]");
		return sb.toString();
	}
	
	

	
}
