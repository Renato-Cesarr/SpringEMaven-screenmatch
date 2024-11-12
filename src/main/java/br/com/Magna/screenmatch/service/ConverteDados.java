package br.com.Magna.screenmatch.service;

import javax.management.RuntimeErrorException;

import com.fasterxml.jackson.databind.ObjectMapper;

//import br.com.Magna.screeenmatch.model.DadosSerie;

public class ConverteDados implements iConverteDados{

	private ObjectMapper mapper = new ObjectMapper();

	@Override
	public <T> T obterDados(String json, Class<T> classe) {
		// TODO Auto-generated method stub
		try {
			return mapper.readValue(json, classe);

		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}


	
}
