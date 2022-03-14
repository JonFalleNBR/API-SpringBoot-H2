package br.com.alura.forum;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.web.config.EnableSpringDataWebSupport;

@SpringBootApplication
@EnableSpringDataWebSupport // Com essa anotação, conseguimos habilitar o suporte pro Spring pegar as requisições e transferir para os parametros da URL e repassar para o Spring data | Isso tem relação com o metodo Pageable do metodo lista
public class ForumApplication {
	public static void main(String[] args) {
		SpringApplication.run(ForumApplication.class, args);
	}

}
