package mc322.lab05;

public class Peão extends Peça {
    Peão(int linha, int coluna, boolean black ){
       super(linha, coluna, black );
        if(black){
          representacao = 'p';
        } else {
          representacao = 'b';
        }
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
