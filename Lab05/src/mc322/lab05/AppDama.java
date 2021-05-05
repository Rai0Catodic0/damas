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
		///transformar em vetor de string no formato (a1_,a2b....etc).
		///escrever no csv com expor state
		return estados;
	}

}
