import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Leitor {

	public Leitor() {
	}

	public int[] le(String endereco) {
		int[] lista = null;
		try {
			FileReader arq = new FileReader(endereco);
			BufferedReader lerArq = new BufferedReader(arq);

			
			int tamanhoDaLista = Integer.parseInt(lerArq.readLine());
			lista = new int[tamanhoDaLista];
			String linha = lerArq.readLine();
			int i=0;
			while (linha != null) {
				lista[i] = Integer.parseInt(linha);
				linha = lerArq.readLine();
				i++;
			}

			arq.close();
		} catch (IOException e) {
			System.err.printf("Erro na abertura do arquivo: %s.\n", e.getMessage());
		}
		return lista;
	}
}
