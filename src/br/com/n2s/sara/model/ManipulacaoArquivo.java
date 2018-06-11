package br.com.n2s.sara.model;

import java.io.*;

import br.com.n2s.sara.model.Constantes;
import org.apache.commons.io.FilenameUtils;

public class ManipulacaoArquivo {

	public String eventoTrilhaNome;


	public String getEventoTrilhaNome() {
		return eventoTrilhaNome;
	}

	public void setEventoTrilhaNome(String eventoTrilhaNome) {
		this.eventoTrilhaNome = eventoTrilhaNome;
	}

	private ManipulacaoArquivo ManipulacaoArquivo() {
		// TODO Auto-generated method stub
		return null;
	}
		// TODO Auto-generated constructor stub
		
		public static String pegaExtensao (File usuarioArquivo) {
			String fileName = usuarioArquivo.getName();
			String extensao= "."+FilenameUtils.getExtension(fileName);                     
			extensao = extensao.toLowerCase();
			return extensao;
		}
		
		public static String pegaNome (File usuarioArquivo) {
			String fileName = usuarioArquivo.getName();                    
			String soNome = FilenameUtils.getBaseName(fileName);			
			return soNome;
		}
		
		 
		 public static String fileToString(File file) {
		        String result = null;
		        //limpa para n�o ter lixo de mem�ria
		        DataInputStream in = null;
		        //salva em partes do stream
		        try {
		            File f = file;
		            //cria um ponteiro para n�o manipular direto
		            byte[] buffer = new byte[(int) f.length()];
		            
		            in = new DataInputStream(new FileInputStream(f));
		            //inputString reestrutura 
		            in.readFully(buffer);
		            //joga para o buffer do fluxo para o buffer
		            result = new String(buffer);
		            //converte buffer para string
		            in.close();
		            //in close
		        } catch (IOException e) {
		            throw new RuntimeException("IO problem in fileToString", e);
		        }
		        return result;
		    }
		
		 
		//recebe o arquivo do upload da pagina
		public String gravarArquivo(File usuarioArquivo, String evento, String trilha) throws IOException {
			
			String diretorioGravacao = new String();
			
			if (usuarioArquivo.length()>= 0) { // para o edital
				
				String stringParaGravar = fileToString(usuarioArquivo); 
				String nomeArquivo = ManipulacaoArquivo.pegaNome(usuarioArquivo);
				String extensao = ManipulacaoArquivo.pegaExtensao(usuarioArquivo);
				diretorioGravacao = Constantes.getDocumentsDir()+File.separator+evento+File.separator+trilha;
				File diretorio = new File(diretorioGravacao);
								
				if(!diretorio.exists()) {
					diretorio.mkdirs();			
				}
				File arqGravacao = File.createTempFile(nomeArquivo, extensao, diretorio);
				ManipulacaoArquivo arquivo = ManipulacaoArquivo();
				arquivo.setEventoTrilhaNome(trilha);
			
			}		
				return diretorioGravacao;
			
		}
		
	
		
				
}
        	
    