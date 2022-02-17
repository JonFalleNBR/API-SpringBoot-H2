package br.com.alura.forum.repository;

import br.com.alura.forum.modelo.Topico;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TopicoRepository extends JpaRepository<Topico, Long> {

    List<Topico> findByCursoNome(String nomeCurso); // CursoNome é a forma de puxar atributo nome na classe Curso, que tem relação com a classe Topico, a que esta sendo colocada dentro deste repositório
}
