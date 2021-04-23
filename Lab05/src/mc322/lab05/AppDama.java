package mc322.lab05;

public class AppDama {
	public static void main(String args[]) {
		//CSVReader csv = new CSVReader();
	    //csv.setDataSource("");
	    //String commands[] = csv.requestCommands();
		String commands[] = {"4c:5e","3d:4e"};
		executaJogo(commands);
	}
	
	public static void executaJogo(String commands[]) {
		Tabuleiro dama = new Tabuleiro();
		int n = commands.length;
		System.out.printf("Tabuleiro Inicial\n");
		dama.Apresentar();
		for(int i = 0; i<n; i++) {
			dama.Mover(commands[i]);
			System.out.println();
			System.out.print("Source: "+commands[i].charAt(0)+commands[i].charAt(1)+"\n");
			System.out.print("Target: "+commands[i].charAt(3)+commands[i].charAt(4)+"\n");
		}
	}
	
}
