package mc322.lab05;

public class AppDama {
	public static void main(String args[]) {
		executaJogo(args[0], args[1]);
	}

	public static String[] executaJogo(String caminhoEntrada, String caminhoSaida) {
		CSVReader csv = new CSVReader();
	    csv.setDataSource(caminhoEntrada);
	    csv.setDataExport(caminhoSaida);
		Tabuleiro dama = new Tabuleiro();
		String commands[] = csv.requestCommands();
		int n = commands.length;
		String[] estados = new String[n];
		System.out.printf("Tabuleiro Inicial\n");
		dama.Apresentar();
		for(int i = 0; i<n; i++) {
			dama.Mover(commands[i]);
			System.out.println();
			System.out.print("Source: "+commands[i].charAt(0)+commands[i].charAt(1)+"\n");
			System.out.print("Target: "+commands[i].charAt(3)+commands[i].charAt(4)+"\n");
			estados[i] = dama.Apresentar();
		}
		String estadoFinalTabuleiro = estados[n-1];
		String saida[] = new String[64];
		char letras[] = {'a','b','c','d','e','f','g','h'};
		char numeros[] = {'8','7','6','5','4','3','2','1'};
		int k = 0;
		int l = 0;
		for(int i = 0; i < 8 ; i++){
			for(int j = 0 ; j < 8; j++){
				if(estadoFinalTabuleiro.charAt(k)!='\n') {
					char estado[] = {letras[j], numeros[i], estadoFinalTabuleiro.charAt(k)};
					saida[l] = new String(estado);
					System.out.println(saida[l]);
					l++;
				}
				k++;
			}
			k++;
		}
		csv.exportState(saida);
		return estados;
	}

}
