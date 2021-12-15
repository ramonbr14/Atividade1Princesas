package br.edu.aranoua.ramonsantos.princesas.servicos;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.aranoua.ramonsantos.princesas.modelo.Princesas;
import br.edu.aranoua.ramonsantos.princesas.repository.PrincesasRepository;

@Service
public class PrincesasServices {
	List<Princesas> princesas = new ArrayList<Princesas>();
	
	@Autowired
	PrincesasRepository princesasRepository;
	
	public Optional<Princesas> obterPrincesas(long id) {
		return princesasRepository.findById(id);
	}
	
	public List<Princesas> obterPrincesas(){
		return princesasRepository.findAll();
	}
	
	public List<Princesas> obterPrincesas(String reino){
		return princesasRepository.findByContent(reino);
	}
	
	public Princesas criarPrincesas(Princesas princesa) {
		return princesasRepository.save(princesa);
	}
	
	public Princesas atualizarPrincesa(long id, Princesas princesa) {
		princesa.setId(id);
		return princesasRepository.save(princesa);	
	}
	
	public void excluirPrincesa(long id) {
		princesasRepository.deleteById(id);
	}
}
