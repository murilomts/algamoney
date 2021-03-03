package com.estudo.algamoney.api.resource;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.estudo.algamoney.api.model.Categoria;
import com.estudo.algamoney.api.repository.CategoriaRepository;

@RestController
@RequestMapping("/categorias")
public class CategoriaResource {

	@Autowired
	private CategoriaRepository categoriaRepository;
	
	@GetMapping
	public List<Categoria> buscar(){
		return categoriaRepository.findAll();
	}
	
	@GetMapping("/{id}")
	public Optional<Categoria> buscarPorId(@PathVariable Long id) {
		return categoriaRepository.findById(id);
	}
	
	public void criar(@RequestBody Categoria categoria) {
		Categoria categoriaSalva = categoriaRepository.save(categoria);
	}
}
