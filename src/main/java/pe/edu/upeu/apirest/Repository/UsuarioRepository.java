package pe.edu.upeu.apirest.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.apirest.Entity.Usuario;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario,Long> {
	
}
