import java.util.ArrayList;

public class CountingSort {
	
	public CountingSort() {}
	
	public void sorting(int[] lista, int[] listaOrdenada, int maiorElemento, int menorElemento) {
		
		//Constroi o vetor auxiliar e coloca zero em todas as posicoes
		int[] aux = new int[maiorElemento+1];
		for(int i=0;i<=maiorElemento;i++)
			aux[i]=0;
		
		//Conta o numero de ocorencias de um numero
		for(int i=0;i<lista.length;i++) {
			aux[lista[i]] += 1;
		}		

		//Ajusta o array auxiliar
		for(int i=1;i<=maiorElemento;i++) 
			aux[i] += aux[i-1];
		
		//Coloca os valores nas posicoes certas do vetor de saida
		for(int i=lista.length-1; i>=0;i--) {
			listaOrdenada[aux[lista[i]]-1] = lista[i];
			aux[lista[i]] -= 1;
		}
		
		
	}
	
	public void rSorting(int[] lista, int[] listaOrdenada, int maiorElemento, int menorElemento, int exp) {
		
		//Constroi o vetor auxiliar e coloca zero em todas as posicoes
		int[] aux = new int[maiorElemento+1];
		for(int i=0;i<=maiorElemento;i++)
			aux[i]=0;
		
		//Conta o numero de ocorencias de um numero
		for(int i=0;i<lista.length;i++) {
			if(lista[i] >= exp) {
				int y = lista[i]/exp;
				while(y>9)
					y = y%10;
				aux[y] += 1;
			} else {
				aux[0] += 1;
			}
		}		

		//Ajusta o array auxiliar
		for(int i=1;i<=maiorElemento;i++) 
			aux[i] += aux[i-1];
		
		//Coloca os valores nas posicoes certas do vetor de saida fazendo tratamento para chave negativa
		for(int i=lista.length-1; i>=0;i--) {
			if(lista[i] >= exp) {
				int y = lista[i]/exp;
				while(y>9)
					y = y%10;
				listaOrdenada[aux[y]-1] = lista[i];
				aux[y] -= 1;
			} else {
				listaOrdenada[aux[0]-1] = lista[i];
				aux[0] -= 1;
			}
		}
		
	}
}
