package mc322.lab05;

public class Dama {
    int diagonalSuperiorDireita;
    int diagonalSuperiorEsquerda;
    int diagonalInferiorDireita;
    int diagonalInferiorEsquerda;
    int linha ,coluna;
    boolean black ;
    Dama(int diagonalSuperiorD, int diagonalSuperiorE,int diagonalInferiorD, int diagonalInferiorE, int coluna, int linha, boolean black ){
        this.diagonalSuperiorDireita = diagonalSuperiorD;
        this.diagonalSuperiorEsquerda = diagonalSuperiorE;
        this.diagonalInferiorDireita  = diagonalInferiorD;
        this.diagonalInferiorEsquerda = diagonalInferiorE;
        this.linha = linha;
        this.coluna = coluna;
        this.black = black;
    }
}
