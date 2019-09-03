import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Leitor leitor = new Leitor();
		Scanner entrada = new Scanner(System.in);
		InsertionSort is = new InsertionSort();
		SelectionSort ss = new SelectionSort();
		String sorting = "a"; 
		while(true) {
			
			System.out.println("Escolha que tipo de ordenação você quer SelectionSort (S) ou InsertionSort (I) ou digite 0 para sair:");
			sorting = entrada.nextLine();
 			if(sorting.equals("0")) {
				break;
			}
			System.out.println("Escolha o arquivo que deseja ler:");
			String arquivo = entrada.nextLine();
			int[] lista = leitor.le("../instancias-num/"+arquivo);	
			if(sorting.equals("I") || sorting.equals("i")) {
				is.sorting(lista);
		
				for(int i=0; i<lista.length;i++)
					System.out.println(lista[i]);
			} else if (sorting.equals("S") || sorting.equals("s")) {
				ss.sorting(lista);
		
				for(int i=0; i<lista.length;i++)
					System.out.println(lista[i]);
			}
		}
						
		
	}

}
