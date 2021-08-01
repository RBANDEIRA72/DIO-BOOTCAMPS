programa
{
	
	funcao inicio()

	{

		inteiro linha, coluna
		linha = 0
		coluna = 0
		cadeia cesta [][]={{"Pera","100"},{"Jaca","200"},{"Maça","900"},{"Uva","89"}}

		faca{

				escreva("Produto: ")
				escreva(cesta[linha][coluna] + "\n")
				coluna++
				escreva("Quantidade: ")
				escreva(cesta[linha][coluna] + "\n")
				
				linha++
				coluna = 0
			
			}enquanto(linha <=3)

	}

}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 277; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */