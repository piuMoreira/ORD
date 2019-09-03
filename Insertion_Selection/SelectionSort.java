
public class SelectionSort {
	public SelectionSort() {}
	
	public void sorting(int[] lista) {
		int menor,aux,i,j;
		for(i=0;i<lista.length-1;i++) {
			menor = i;
			for(j=i+1;j<lista.length;j++) {
				if(lista[j]<lista[menor])
					menor = j;
			}
			if(menor != i) {
				aux = lista[i];
				lista[i] = lista[menor];
				lista[menor] = aux;
			}
		}
	}
}
