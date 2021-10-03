package retorno;

import java.time.LocalDate;

public class LeituraRetornoBancoBrasil implements LeituraRetorno {

	@Override
	public Boleto processarLinhaArquivo(String[] vetorLinhaArq) {

		Boleto boleto = new Boleto();

		boleto.setId(Integer.parseInt(vetorLinhaArq[0]));
		boleto.setCodBanco(vetorLinhaArq[1]);
		boleto.setDataVencimento(LocalDate.parse(vetorLinhaArq[2], DATA_FORMATADA));
		boleto.setDataPagamento(LocalDate.parse(vetorLinhaArq[3], DATA_FORMATADA).atTime(0, 0, 0));
		boleto.setCpfCliente(vetorLinhaArq[4]);
		boleto.setValor(Double.parseDouble(vetorLinhaArq[5]));
		boleto.setMulta(Double.parseDouble(vetorLinhaArq[6]));
		boleto.setJuros(Double.parseDouble(vetorLinhaArq[7]));

		return boleto;

	}

}
