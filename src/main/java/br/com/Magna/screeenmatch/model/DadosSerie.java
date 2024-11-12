package br.com.Magna.screeenmatch.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosSerie(@JsonAlias("Title") String titulo, 
						@JsonAlias("totalSeasons") Integer totalTemporadas,
						@JsonAlias("imbdRating") String avaliacao) {
	
	

	
}