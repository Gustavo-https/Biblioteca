package biblioteca.bibliotecario.Service;

import biblioteca.bibliotecario.Model.Bibliotecario;
import biblioteca.bibliotecario.Repository.BibliotecarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BibliotecarioService {
private final BibliotecarioRepository repository;

public BibliotecarioService (BibliotecarioRepository repository){this.repository = repository;}

    public List<Bibliotecario> getALL() {return repository.findAll();}

    public Bibliotecario save(Bibliotecario bibliotecario) {return repository.save(bibliotecario);}

public void delete(Long id){repository.deleteById(id);}

    public Bibliotecario update(Long id, Bibliotecario bibliotecarioAtualizado) {
        return repository.findById(id)
                .map(bibliotecario -> {
                    bibliotecario.setNome(bibliotecarioAtualizado.getNome());
                    bibliotecario.setQuantidade(bibliotecarioAtualizado.getQuantidade());
                    return repository.save(bibliotecario);
                })
                .orElseThrow(() -> new RuntimeException("Bibliotecário não encontrado com o ID: " + id));
    }

}
