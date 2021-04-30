package mc322.lab05;

public class AppDama {
	public static void main(String args[]) {
		//CSVReader csv = new CSVReader();
	    //csv.setDataSource("/home/jessica/damas/Lab05/src/db/teste02.csv");
	    //String commands[] = csv.requestCommands();
		//String commands[] = {"4c:5e","3d:4e"};
		//executaJogo(commands);
		//Dama p = new Dama(1,5,true);
		//char[] vetor = {'-','-','-','-','X','-'};
		//System.out.println(p.mover(7,0, 1, 5, vetor));
		
		Tabuleiro tab = new Tabuleiro();
		tab.Apresentar();
		//tab.Mover("c3:b4");
		//tab.Apresentar();

	}

	public static void executaJogo(String commands[]) {
		Tabuleiro dama = new Tabuleiro();
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
	}

}
