package br.edu.iftm.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.iftm.demo.domain.Categoria;

@Repository
public interface CategoriaRepository extends CrudRepository<Categoria, Integer> {
	
}
