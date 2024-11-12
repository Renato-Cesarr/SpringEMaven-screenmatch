package br.com.Magna.screenmatch.service;

public interface iConverteDados {
	<T> T obterDados (String json, Class<T> classe);

}
