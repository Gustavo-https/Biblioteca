package biblioteca.bibliotecario.Repository;

import biblioteca.bibliotecario.Model.Bibliotecario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BibliotecarioRepository extends JpaRepository<Bibliotecario, Long> {
}
