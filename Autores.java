package Autores;

public class Autores {

	public static String formata(String nomeAutor) {

		String nomeTest = nomeAutor;
		String[] palavras = nomeTest.split(" ");

		if (palavras.length < 3) {
			String nomeLetraMaiuscula = palavras[0].substring(0, 1)
					.toUpperCase();
			String nomeResto = palavras[0].substring(1);
			String sobrenome = palavras[palavras.length - 1].toUpperCase();
			return sobrenome + ", " + nomeLetraMaiuscula + nomeResto;

		} else {

			String nomeLetraMaiuscula = palavras[0].substring(0, 1)
					.toUpperCase();
			String nomeResto = palavras[0].substring(1);
			String sobrenome = palavras[palavras.length - 1].toUpperCase();
			return sobrenome + ", " + nomeLetraMaiuscula + nomeResto + " "
					+ palavras[1];
		}
	}

}
