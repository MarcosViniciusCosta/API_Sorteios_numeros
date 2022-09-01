package Sorteio.Sorteios_caixa.Sorteios_caixa.Domain;


import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;


import lombok.Data;
@Data
@Component
public class Aposta 
{
	private List<Integer> numerosSorteados;
	
	public Aposta() {
		numerosSorteados = new ArrayList<Integer>();
	}
	
	public boolean numeroJaSorteado(int valor)
	{
		return numerosSorteados.contains(valor);
	}
	
	public void adicionarNumeroSorteado(int valor)
	{
		numerosSorteados.add(valor);
	}
	
	public void limparLista() 
	{
		numerosSorteados.clear();
	}
}
