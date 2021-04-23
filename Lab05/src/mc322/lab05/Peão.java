package mc322.lab05;

public class Peão {

    int diagonalDireita;
    int diagonalEsquerda;
    int linha ,coluna;
    boolean black ;
    char representacao;
    Peão(int diagonalD, int diagonalE, int coluna, int linha, boolean black ){
        this.diagonalDireita = diagonalD;
        this.diagonalEsquerda = diagonalE;
        this.linha = linha;
        this.coluna = coluna;
        this.black = black;
        if(black) {
        	this.representacao = 'p';
        } else {
        	this.representacao = 'b';
        }
    }

    public boolean mover(int iOrigem, int jOrigem, int iDestino, int jDestino){
        continue;
    }

}
