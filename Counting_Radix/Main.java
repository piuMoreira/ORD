import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountingSort cs = new CountingSort();
		RadixSort rs = new RadixSort();
		Leitor leitor = new Leitor();
		int[] lista = leitor.le("instancias-num/num.1000.1.in");
		int[] listaOrdenada = new int[lista.length];
		int maiorElemento = lista[0];
		int menorElemento = lista[0];
		
		//Pega maior e menor elemento da lista
		for(int i=0;i<lista.length;i++) {
			if(lista[i] > maiorElemento)
				maiorElemento = lista[i];
			if(lista[i] < menorElemento)
				menorElemento = lista[i];
		}
				
		//Tratamento caso tenha chave negativa 1/2
		if(menorElemento<0) {
			for(int i=0;i<lista.length;i++) 
				lista[i] -= menorElemento;
					
			maiorElemento -= menorElemento;
		}
		
		//Chamada do sorting
		rs.sorting(lista, listaOrdenada, maiorElemento, menorElemento);
		
		//Tratamento caso tenha chave negativa 2/2
		if(menorElemento<0)
			for(int i=0; i<listaOrdenada.length;i++)
				listaOrdenada[i]+=menorElemento;
		
				
		for(int i=0; i<lista.length;i++)
			System.out.println(listaOrdenada[i]);
	}

}
