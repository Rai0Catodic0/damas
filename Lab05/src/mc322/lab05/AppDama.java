package mc322.lab05;

public class AppDama {
	public static void main(String args[]) {
		if (args.length == 2) {
			executaJogo(args[0], args[1]);
		}
	}

	public static String[] executaJogo(String caminhoEntrada, String caminhoSaida) {
		CSVHandling csv = new CSVHandling();
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
		String saida[] = new String[64];
		char letras[] = {'a','b','c','d','e','f','g','h'};
		char numeros[] = {'8','7','6','5','4','3','2','1'};
		int k=0;
        for(int i = 0; i < 8 ; i++){
            for(int j = 7 ; j >=0 ; j--){
                if(dama.tabuleiro[j][i]==null){
                    char estado[] = {letras[i], numeros[j], '_'};
                    saida[k] = new String(estado);
                }
                else{
                    char estado[] = {letras[i], numeros[j], dama.tabuleiro[j][i].representacao};
                    saida[k] = new String(estado);
                }
                k++;
            }
        }
		csv.exportState(saida);
		return estados;
	}

}
