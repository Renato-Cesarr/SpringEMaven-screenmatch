package br.com.Magna.screenmatch;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.Magna.screeenmatch.model.DadosSerie;
import br.com.Magna.screenmatch.service.ConsumoApi;
import br.com.Magna.screenmatch.service.ConverteDados;

@SpringBootApplication
public class ScreenmatchApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(ScreenmatchApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		
		ConsumoApi consumoApi = new ConsumoApi();
		String json = consumoApi.ObterDados("https://www.omdbapi.com/?t=The_Flash&Season=1&apikey=be87fb02");
	//	System.out.println(json);
	//	json = consumoApi.ObterDados("https://coffee.alexflipnote.dev/random.json");
		
		System.out.println(json);
		ConverteDados converter = new ConverteDados();
		DadosSerie dados = converter.obterDados(json, DadosSerie.class);
		System.out.println(dados);

	}

	

}
