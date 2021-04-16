package com.professorangoti;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.professorangoti.domain.compartilhandochaveprimária.EnderecoCompartilhandoChavePrimária;
import com.professorangoti.domain.compartilhandochaveprimária.UsuarioCompartilhandoChavePrimária;
import com.professorangoti.domain.embeddable.EnderecoEmbeddable;
import com.professorangoti.domain.embeddable.UsuarioEmbeddable;
import com.professorangoti.domain.usandochaveestrangeira.EnderecoUsandoChaveEstrangeira;
import com.professorangoti.domain.usandochaveestrangeira.UsuarioUsandoChaveEstrangeira;
import com.professorangoti.repository.compartilhandochaveprimária.EnderecoCompartilhandoChavePrimáriaRepository;
import com.professorangoti.repository.compartilhandochaveprimária.UsuarioCompartilhandoChavePrimáriaRepository;
import com.professorangoti.repository.embeddable.UsuarioEmbeddableRepository;
import com.professorangoti.repository.usandocolunajunçãochaveestrangeira.EnderecoUsandoChaveEstrangeiraRepository;
import com.professorangoti.repository.usandocolunajunçãochaveestrangeira.UsuarioUsandoChaveEstrangeiraRepository;

@SpringBootApplication
public class AulaOneToOneApplication implements CommandLineRunner {

	@Autowired
	EnderecoCompartilhandoChavePrimáriaRepository enderecoCompartilhandoChavePrimáriaRepository;
	@Autowired
	UsuarioCompartilhandoChavePrimáriaRepository usuarioCompartilhandoChavePrimáriaRepository;
	
	@Autowired
	EnderecoUsandoChaveEstrangeiraRepository enderecoUsandoChaveEstrangeiraRepository;
	@Autowired
	UsuarioUsandoChaveEstrangeiraRepository usuarioUsandoChaveEstrangeiraRepository;
	
	@Autowired
	UsuarioEmbeddableRepository usuarioEmbeddableRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(AulaOneToOneApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//1. Entidade incorporada
		//entidadeIncorporada();
		
		//2. Compartilhando a chave primária
		//compartilhandoChavePrimaria();
		
		//3. Usando chave estrangeira
		usandoChaveEstrangeira();
	}

	
	
	
	
	
	
	
	
	private void entidadeIncorporada() {
		UsuarioEmbeddable usuario = new UsuarioEmbeddable("Angoti");
		EnderecoEmbeddable endereco = new EnderecoEmbeddable("Rua Primavera", "150 fundos", "38400-000", "Uberlândia" );
		
		usuario.setEnderecoDeEntrega(endereco);
		//usuario.setEnderecoDeCobranca(endereco);
		
		usuarioEmbeddableRepository.save(usuario);	
	}
	
	
	
	
	
	
	

	private void usandoChaveEstrangeira() {
		UsuarioUsandoChaveEstrangeira usuario = new UsuarioUsandoChaveEstrangeira("Angoti");
		EnderecoUsandoChaveEstrangeira endereco = new EnderecoUsandoChaveEstrangeira("Rua Primavera", "150 fundos", "38400-000", "Uberlândia" );
		usuario.setEnderecoDeEntrega(endereco);
		
		enderecoUsandoChaveEstrangeiraRepository.save(endereco);
		usuarioUsandoChaveEstrangeiraRepository.save(usuario);
	}

	
	
	
	
	
	
	
	
	
	
	
	
	private void compartilhandoChavePrimaria() {
		EnderecoCompartilhandoChavePrimária endereco = 
				new EnderecoCompartilhandoChavePrimária(null, "Rua Primavera", "150 fundos", "38400-000", "Uberlândia" );
		enderecoCompartilhandoChavePrimáriaRepository.save(endereco);
		
		UsuarioCompartilhandoChavePrimária usuario = 
				new UsuarioCompartilhandoChavePrimária(endereco.getId(), "Edson");
		
		usuarioCompartilhandoChavePrimáriaRepository.save(usuario);
	}

}
