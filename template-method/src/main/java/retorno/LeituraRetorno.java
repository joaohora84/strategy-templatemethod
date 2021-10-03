package retorno;

import java.time.format.DateTimeFormatter;

public interface LeituraRetorno {
	
	DateTimeFormatter DATA_FORMATADA = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	DateTimeFormatter DATA_HORA_FORMATADA = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
	
	public Boleto processarLinhaArquivo(String[] vetorLinhaArq);

}
