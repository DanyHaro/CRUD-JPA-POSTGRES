package pe.edu.upeu.apirest.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.upeu.apirest.Entity.Usuario;
import pe.edu.upeu.apirest.Service.UsuarioService;

@CrossOrigin(origins="http://localhost:5432", maxAge = 3600)
@RestController
@RequestMapping("/usuario")
public class UsuarioController {
	@Autowired
	UsuarioService usuarioservice;
	
	//METODOS HTTP
	
	@GetMapping("/")
	public List<Usuario> traerTodo(){
		return usuarioservice.leerTodo();
	}
	
	@GetMapping("/{id}")
	public Usuario traerUno(@PathVariable Long id) {
		return usuarioservice.read(id);
	}
	
	@PostMapping("/add")
	public String crear(@RequestBody Usuario usuario) {
		usuarioservice.create(usuario);
		return "Usuario creado !";
	}
	
	@DeleteMapping("/{id}")
	public String eliminar(@PathVariable Long id) {
		usuarioservice.delete(id);
		return "Usuario eliminado !";
	}
	
	@PutMapping("/update/{id}")
	public String modificar(@RequestBody Usuario usuario,@PathVariable Long id) {
		/*El @RequestBody, recibe el objeto enviado.*/
		
		
		Usuario user = usuarioservice.read(id);
		user.setNombres(usuario.getNombres());
		user.setCorreo(usuario.getCorreo());
		user.setTelefono(usuario.getTelefono());
		
		usuarioservice.create(user);
		/*usuario.setIdpersona(id);
		usuarioservice.update(usuario);*/
		return "Usuario actualizado !";
	}
}













