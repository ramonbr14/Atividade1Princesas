package br.edu.aranoua.ramonsantos.princesas.recursos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.aranoua.ramonsantos.princesas.modelo.Princesas;
import br.edu.aranoua.ramonsantos.princesas.servicos.PrincesasServices;


@RestController
@RequestMapping(value="princesa")
public class PrincesasController {

	@Autowired
	PrincesasServices princesaServices;
	
	@GetMapping
	public ResponseEntity<List<Princesas>> getPrincesas(){
		return ResponseEntity.ok(princesaServices.obterPrincesas());
	}
	
	@PostMapping
	public ResponseEntity<Princesas> postPrincesas(@RequestBody Princesas princesa){
		Princesas princes = princesaServices.criarPrincesas(princesa);
		return ResponseEntity.status(HttpStatus.CREATED).body(princes);
	}
	@PutMapping
	@RequestMapping(value="/{id}")
	public ResponseEntity<Princesas> putPrincesa(@RequestBody Princesas princesas,
			@PathVariable("id") int id){
		return ResponseEntity.ok(princesaServices.atualizarPrincesa(id, princesas));
	}
	
	@DeleteMapping(value="/{id}")
	public ResponseEntity<Void> deletePrincesa(@PathVariable("id") int id){
		princesaServices.excluirPrincesa(id);
		return ResponseEntity.noContent().build();
	}
}
