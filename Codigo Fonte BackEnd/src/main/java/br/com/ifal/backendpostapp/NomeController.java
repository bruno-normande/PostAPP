package br.com.ifal.backendpostapp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NomeController {

	@RequestMapping("/retorneNome")
	public String retorneNome(@RequestParam(value = "nome") String name, @RequestParam(value = "sobreNome") String sobreNome) {
		return name + " " + sobreNome;
	}
	
	
	@RequestMapping("/soma")
	public String retorneNome(@RequestParam(value = "num1") int num1, @RequestParam(value = "num2") int num2) {
		int resultado = num1 + num2;
		return Integer.toString(resultado);
	}
	
	// efetuar login
	// cadastro do usuario
	// cadastro do posto
	// consulta do usuario
	// consulta do posto (com avaliacao)
	// listar todos os posto (com avaliacao)
	// listar todos os usuarios
	// cadastro avaliacao do posto
	
}