programa
{
	
	funcao inicio()

	{

		inteiro linha
		linha = 0
		cadeia agenda [][]={{"João","São Paulo","(11) 9999-5241"},{"Maria","Riberirão Preto","(16) 9999-8596"},{"Ana","Manaus", "(92) 9999-8574"}}

		faca{

				escreva("Nome: " + agenda[linha][0] + " - Cidade: " + agenda[linha][1] + " - Telefone: " + agenda[linha][2] + "\n" + "\n" )
				
				linha++
			
			}enquanto(linha <=2)

	}

}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 271; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */