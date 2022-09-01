package Sorteio.Sorteios_caixa.Sorteios_caixa.Controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import Sorteio.Sorteios_caixa.Sorteios_caixa.Service.ApostaService;
import lombok.RequiredArgsConstructor;


@RestController
@RequestMapping("aposta")
@RequiredArgsConstructor
public class ApostaController 
{

	private final ApostaService apostaService;
	
	
	@GetMapping
	public ResponseEntity<List<Integer>> gerarApostaMegaSena(@RequestParam Integer quantidade,
			@RequestParam Integer valorMaximo)
	{ 
		apostaService.limparLista();
		return  ResponseEntity.ok(apostaService.gerarAposta(quantidade,valorMaximo));
	}
	
	
	
}
