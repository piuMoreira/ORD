
public class RadixSort {
	RadixSort() {}
	
	public void sorting(int[] lista, int[] listaOrdenada, int maiorElemento, int menorElemento) {
		CountingSort cs = new CountingSort();
		for(int exp=1; (maiorElemento/exp)>0;exp*=10) {
			cs.rSorting(lista, listaOrdenada, 9, menorElemento,exp);
			lista = listaOrdenada.clone();
		}
	}
}