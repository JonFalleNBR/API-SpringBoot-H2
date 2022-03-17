package br.com.alura.forum;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.data.web.config.EnableSpringDataWebSupport;

/*
 Com a anotação EnableSpring DataWebSupport, conseguimos habilitar o suporte para o Spring pegar as requisições e
 transferir para os parametros da URL e repassar para o Spring data |
 Isso tem relação com o metodo Pageable do metodo lista
  -------------------
  A anotação @EnableCaching habilita o uso do Cache dentro da aplicação.
  O cache otimiza todo o sistema, com um retorno mais rapido para o úsuario.
 */

@SpringBootApplication
@EnableSpringDataWebSupport
@EnableCaching
public class ForumApplication {
	public static void main(String[] args) {
		SpringApplication.run(ForumApplication.class, args);
	}

}
