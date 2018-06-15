package teste;

import java.io.File;

import br.com.n2s.sara.model.ManipulacaoArquivo;

public class TesteStringFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "ksjdfçlajsgçlaj";
		ManipulacaoArquivo arquivo = new ManipulacaoArquivo();
		File file = arquivo.StringToFile(a);

	}

}
