package mc322.lab05;

public class Peça {
	int linha ,coluna;
    boolean black ;
    char representacao;
    Peça( int linha, int coluna, boolean black ){
        this.linha = linha;
        this.coluna = coluna;
        this.black = black;
    }
    
    public int[] Mover(int iOrigem,int jOrigem, int iDestino,int jDestino,char[] caminho) {
    	//aplicar filtro
    	int retorno[] = new int[2];
    	retorno[0]=-3;
    	return retorno;
    }
}
