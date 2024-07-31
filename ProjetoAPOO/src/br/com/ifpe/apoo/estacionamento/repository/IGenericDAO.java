package br.com.ifpe.apoo.estacionamento.repository;




public interface IGenericDAO <T> {
	
	public void add(T t);
	public void remove(String t);
	public void update(T t);
	public T consult(String t);

}
