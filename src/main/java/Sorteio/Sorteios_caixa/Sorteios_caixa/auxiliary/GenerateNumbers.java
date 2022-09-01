package Sorteio.Sorteios_caixa.Sorteios_caixa.auxiliary;

import java.util.Random;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class GenerateNumbers {

	private Random gerador;
	
	public GenerateNumbers()
	{
		gerador = new Random();
	}
	
	public int GenerateInteger(int valorMaximoDaUnidade)
	{
		return gerador.nextInt(valorMaximoDaUnidade);
	}
}
