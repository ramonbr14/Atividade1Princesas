package br.edu.aranoua.ramonsantos.princesas.servicos;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import br.edu.aranoua.ramonsantos.princesas.modelo.Princesas;

@Service
public class PrincesasServices {
	List<Princesas> princesas = new ArrayList<Princesas>();
	
	public Princesas obterPrincesa(int princes) {
		return princesas.get(princes);
	}
	
	public List<Princesas> obterPrincesas(){
		return princesas;
	}
	
	public Princesas criarPrincesas(Princesas princesa) {
		princesas.add(princesa);
		int i = princesas.size()-1;
		princesas.get(i).setId((long) i);
		return princesas.get(i);
	}
	
	public Princesas atualizarPrincesa(int id, Princesas princesa) {
		princesa.setId((long) id);
		princesas.set(id, princesa);
		return princesas.get(id);	
	}
	
	public void excluirPrincesa(int id) {
		princesas.remove(id);
	}

}
