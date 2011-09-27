import static org.junit.Assert.*;

import org.junit.Test;

import Autores.Autores;

public class AutoresTest {

	@Test
	public void deveFormatarNomeSobrenomeAutor1() {
		String nomeFormatado = Autores.formata("joao silva");
		assertEquals("SILVA, Joao", nomeFormatado);
	}

	@Test
	public void deveFormatarNomeSobrenomeAutor2() {
		String nomeFormatado = Autores.formata("paulo coelho");
		assertEquals("COELHO, Paulo", nomeFormatado);
	}

	@Test
	public void deveFormatarNomeSobrenomeAutor3() {
		String nomeFormatado = Autores.formata("celso de araujo");
		assertEquals("ARAUJO, Celso de", nomeFormatado);
	}

}
