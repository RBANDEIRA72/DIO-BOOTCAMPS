programa
{
	
	funcao inicio()
	{
		real vendas_jan, vendas_fev, vendas_mar, vendas_abr, total, media
		cadeia vendedor

		escreva("Digite o nome do vendedor: ")
		leia(vendedor)

		escreva("Digite o valor de vendas do " + vendedor + ", referente ao mês de Janeiro: ")
		leia(vendas_jan)

		escreva("Digite o valor de vendas do " + vendedor + ", referente ao mês de Fevereiro: ")
		leia(vendas_fev)
		
		escreva("Digite o valor de vendas do " + vendedor + ", referente ao mês de Março: ")
		leia(vendas_mar)		

		escreva("Digite o valor de vendas do " + vendedor + ", referente ao mês de Abril: ")
		leia(vendas_abr)

		total = vendas_jan + vendas_fev + vendas_mar + vendas_abr
		media = total / 4

		escreva("O vendedor: " + vendedor +", efetuou o total de vendas de R$ " + total + " e a média: " + media + " por mês.")

		
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 616; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */