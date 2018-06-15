package teste;

import static org.junit.Assert.*;

import java.io.File;

import org.junit.Test;

import br.com.n2s.sara.model.ManipulacaoArquivo;

public class TestFile {

	@Test
	public void test() {
		
		
		String a = "ksjdfçlajsgçlaj";
		ManipulacaoArquivo arquivo = new ManipulacaoArquivo();
		File file = arquivo.StringToFile(a);

		
	}

}
