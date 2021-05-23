package pe.edu.upeu.apirest.Service;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.apirest.Entity.Usuario;
import pe.edu.upeu.apirest.Repository.UsuarioRepository;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository repository;
	
	//CRUD - CREATE,READ,UPDATE,DELETE.
	//CREATE - save()
	//DELETE - deleteById()
	//GET    - findById()
	
	
	public List<Usuario> leerTodo(){
		List<Usuario> usuarios = new ArrayList<>();
		repository.findAll().forEach(usuarios::add);
		return usuarios;
	}
	
	public Usuario create(Usuario usuarios) {
		return repository.save(usuarios);
	}
	
	//Mandamos el id de un usuario.
	public Usuario read(Long id) {
		return repository.findById(id).get();
	}
	
	public Usuario update(Usuario usuarios) {
		return repository.save(usuarios);
	}
	
	public void delete(Long id) {
		repository.deleteById(id);
	}
	
	
	
}
