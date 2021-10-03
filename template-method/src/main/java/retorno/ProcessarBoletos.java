package retorno;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ProcessarBoletos {

	private LeituraRetorno leituraRetorno;

	public ProcessarBoletos(LeituraRetorno leituraRetorno) {
		this.leituraRetorno = leituraRetorno;
	}

	public final List<Boleto> processar(String nomeArquivo) {

		try {
			BufferedReader br = Files.newBufferedReader(Paths.get(nomeArquivo));
			String linha;
			String divisor = ";";
			List<Boleto> boletos = new ArrayList<>();

			while ((linha = br.readLine()) != null) {

				String[] vetor = linha.split(divisor);

				Boleto boleto = leituraRetorno.processarLinhaArquivo(vetor);

				boletos.add(boleto);
				
				System.out.println(boleto);

			}

			return boletos;

		} catch (IOException e) {

			e.printStackTrace();
		}

		return null;

	}

}
