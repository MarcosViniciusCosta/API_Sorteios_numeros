package Sorteio.Sorteios_caixa.Sorteios_caixa.Service;

import java.util.List;
import org.springframework.stereotype.Service;

import Sorteio.Sorteios_caixa.Sorteios_caixa.Domain.Aposta;
import Sorteio.Sorteios_caixa.Sorteios_caixa.auxiliary.GenerateNumbers;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ApostaService 
{

	
	private final Aposta aposta;
	
	
	private final GenerateNumbers gerador;
	
	
	
	
	public List<Integer> gerarAposta(int quantidadeValores,int valorMaximoDaUnidade)
	{
		
		//inserindo o primeiro valor, nao precisa verificar se já foi sorteado
		
		aposta.adicionarNumeroSorteado(gerarValorAleatorio(valorMaximoDaUnidade));
		
		
		//inserindo os demais valores
		for(int cont=0;cont<quantidadeValores-1;cont++) 
		{
			int novo_valor = gerarValorAleatorio(valorMaximoDaUnidade);
			
			while(aposta.numeroJaSorteado(novo_valor))
			{
				novo_valor = gerarValorAleatorio(valorMaximoDaUnidade);
			}
			
			aposta.adicionarNumeroSorteado(novo_valor);
		}
		
		return aposta.getNumerosSorteados();
	}
	
	private int gerarValorAleatorio(int valorMaximoDaUnidade)
	{
		// valorMaximodaUnidade = 25 gera de 0 a 24
		return (gerador.GenerateInteger(valorMaximoDaUnidade)+1);
	}
	
	public void limparLista()
	{
		if(aposta != null) 
		{
			aposta.limparLista();
		}
		
	}
	
	
}
