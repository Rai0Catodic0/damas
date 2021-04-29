package mc322.lab05;

public class Peão {
    int linha ,coluna;
    boolean black ;
    Peão(int linha, int coluna, boolean black ){
        this.linha = linha;
        this.coluna = coluna;
        this.black = black;
    }

    public boolean mover(int iOrigem, int jOrigem, int iDestino, int jDestino, char[] caminho){
        boolean ehValido = true;
        if(linha != iOrigem || coluna != jOrigem) {
        	ehValido = false;
        }
    	int len = (iDestino - iOrigem);
    	int peca = 0;
    	for(int i=0; i<len;i++) {
    		if(caminho[i] != '-') {
    			peca++;
    			if(peca>=2) {
    				break;
    			}
    			continue;
    		}
    		if(caminho[i]=='0') {
    			return false;
    		}
    		peca = 0;
    	}
    	if(peca>=1) {
    		ehValido = false;
    	}

    	return ehValido;
    }

}
