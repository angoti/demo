package br.edu.iftm.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.iftm.demo.domain.Categoria;
import br.edu.iftm.demo.service.CategoriaService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/categorias")
public class CategoriaController {

	@Autowired
	CategoriaService serv;

	@GetMapping
	public List<Categoria> listar() {
		return serv.buscaTodos();
	}

	@PostMapping()
	public void cadastrar(@RequestBody Categoria novaCategoria) {
		serv.novo(novaCategoria);
	}
	

}
