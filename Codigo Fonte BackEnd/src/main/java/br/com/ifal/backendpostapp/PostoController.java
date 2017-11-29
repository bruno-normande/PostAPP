package br.com.ifal.backendpostapp;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostoController {

	ArrayList postos = new ArrayList<Posto>();

	@RequestMapping("/incluirPosto")
	public void incluirPosto(@RequestParam(value = "nome") String nome, @RequestParam(value = "preco") String preco) {
		postos.add(new Posto(nome, preco));
	}

	@RequestMapping("/Posto")
	public ArrayList listarPosto() {
		return postos;
	}

}