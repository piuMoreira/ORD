
public class InsertionSort {
	public InsertionSort() {}
	
	public void sorting(int[] lista) {
		int elemento,i,j;
		for(i=0; i<lista.length;i++) {
			elemento = lista[i];
			j=i;
			while(j>0 && lista[j-1]>elemento) {
				lista[j] = lista[j-1];
				j-=1;
			}
			lista[j]=elemento;
		}
	}
}
