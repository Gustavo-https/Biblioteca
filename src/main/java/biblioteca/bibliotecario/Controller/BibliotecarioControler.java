package biblioteca.bibliotecario.Controller;

import biblioteca.bibliotecario.Model.Bibliotecario;
import biblioteca.bibliotecario.Service.BibliotecarioService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Bibliotecario")
public class BibliotecarioControler {

    private final BibliotecarioService service;

    public BibliotecarioControler(BibliotecarioService service) {
        this.service = service;
    }

    @GetMapping
    public List<Bibliotecario> getALL() {
        return service.getALL();
    }

    @PostMapping
    public Bibliotecario create(@RequestBody Bibliotecario bibliotecario) {
        return service.save(bibliotecario);
    }

    @DeleteMapping("/Bibliotecario")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }

    @PutMapping("/{id}")
    public Bibliotecario update(@PathVariable Long id, @RequestBody Bibliotecario bibliotecario) {
        return service.update(id, bibliotecario);
    }

}
