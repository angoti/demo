package br.edu.iftm.demo.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.iftm.demo.domain.Categoria;
import br.edu.iftm.demo.repository.CategoriaRepository;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository categoriaRepository;

	public List<Categoria> buscaTodos() {
		List<Categoria> retorno = new ArrayList<Categoria>();
		Iterator<Categoria> i = categoriaRepository.findAll().iterator();
		while (i.hasNext()) {
			retorno.add(i.next());
		}
		return retorno;
	}

	public void novo(Categoria novaCategoria) {
		categoriaRepository.save(novaCategoria);
	}

	public void atualiza(Categoria cat, Integer id) {
		cat.setId(id);
		categoriaRepository.save(cat);
	}

	public void excluir(Integer id) {
		categoriaRepository.deleteById(id);
	}
}
