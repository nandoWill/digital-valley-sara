package br.com.n2s.sara.model;

import java.io.*;

import model.Constantes;

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
			String extensao= "";
			String ext[]=fileName.split(".");
			int i = ext.length;
			
			extensao = "."+ ext[i-1];
			extensao = extensao.toLowerCase();
			return extensao;
		}
		
		public static String pegaNome (File usuarioArquivo) {
			String fileName = usuarioArquivo.getName();
			String soNome = "";
			String soNomeArquivo[]= fileName.split(".");
			soNome= soNomeArquivo[0];
			return soNome;
		}
		
		 
		 public static String fileToString(File file) {
		        String result = null;
		        //limpa para não ter lixo de memória
		        DataInputStream in = null;
		        //salva em partes do stream
		        try {
		            File f = file;
		            //cria um ponteiro para não manipular direto
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
		public String gravarArquivo(File usuarioArquivo, String evento, String trilha) {
			
			String diretorioGravacao = new String();
			
			if (usuarioArquivo.length()>= 0) { // para o edital
				
				String stringParaGravar = fileToString(usuarioArquivo); 
				String nomeArquivo = ManipulacaoArquivo.pegaNome(usuarioArquivo);
				String extensao = ManipulacaoArquivo.pegaExtensao(usuarioArquivo);
				diretorioGravacao = "Constantes.getDocumentsDir()+File.separator+evento+File.separator+trilha";
				File diretorio = new File(diretorioGravacao);
				
				if(!diretorio.exists()) {
					diretorio.mkdirs();			
				}
				diretorioGravacao = diretorioGravacao+nomeArquivo+extensao;
				File arqGravacao = new File (stringParaGravar, diretorioGravacao);//primeiro toda a string e grava no diretório
				arqGravacao.mkdir();
				ManipulacaoArquivo arquivo = ManipulacaoArquivo();
				arquivo.setEventoTrilhaNome(trilha);
			
			}		
				return diretorioGravacao;
			
		}
		
	
		
				
}
        	
    