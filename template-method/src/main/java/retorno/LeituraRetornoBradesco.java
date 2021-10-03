package retorno;

import java.time.LocalDate;

public class LeituraRetornoBradesco implements LeituraRetorno {

	@Override
	public Boleto processarLinhaArquivo(String[] vetorLinhaArq) {

		Boleto boleto = new Boleto();

		boleto.setId(Integer.parseInt(vetorLinhaArq[0]));
		boleto.setCodBanco(vetorLinhaArq[1]);
		boleto.setAgencia(vetorLinhaArq[2]);
		boleto.setContaBancaria(vetorLinhaArq[3]);
		boleto.setDataVencimento(LocalDate.parse(vetorLinhaArq[4], DATA_FORMATADA));
		boleto.setDataPagamento(LocalDate.parse(vetorLinhaArq[5], DATA_HORA_FORMATADA).atTime(0, 0, 0));
		boleto.setCpfCliente(vetorLinhaArq[6]);
		boleto.setValor(Double.parseDouble(vetorLinhaArq[7]));
		boleto.setMulta(Double.parseDouble(vetorLinhaArq[8]));
		boleto.setJuros(Double.parseDouble(vetorLinhaArq[9]));

		return boleto;
	}

}
