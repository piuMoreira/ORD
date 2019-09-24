import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Leitor leitor = new Leitor();
		Scanner entrada = new Scanner(System.in);
		MergeSort m = new MergeSort();
		QuickSort q = new QuickSort();
		String sorting = "a"; 
		while(true) {
			
			System.out.println("Escolha que tipo de ordenação você quer MergeSort (M) ou QuickSort (Q) ou digite 0 para sair:");
			sorting = entrada.nextLine();
 			if(sorting.equals("0")) {
				break;
			}
			System.out.println("Escolha o arquivo que deseja ler:");
			String arquivo = entrada.nextLine();
			int[] lista = leitor.le("../instancias-num/"+arquivo);	
			if(sorting.equals("M") || sorting.equals("m")) {
				m.sorting(lista,0,lista.length-1);
		
				for(int i=0; i<lista.length;i++)
					System.out.println(lista[i]);
			} else if (sorting.equals("Q") || sorting.equals("q")) {
			    m.sorting(lista,0,lista.length-1);
				for(int i=0; i<lista.length;i++)
					System.out.println(lista[i]);
			}
		}
						
		
	}

}
