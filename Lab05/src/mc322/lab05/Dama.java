package mc322.lab05;

public class Dama {
    int linha ,coluna;
    boolean black ;
    Dama( int linha, int coluna, boolean black ){
        this.linha = linha;
        this.coluna = coluna;
        this.black = black;
    }
    
    public boolean mover(int iOrigem,int jOrigem, int iDestino,int jDestino,char[] caminho) {
    	boolean ehValido = true;
    	int len;
    	if(iOrigem-iDestino>0) {
    		len = iOrigem-iDestino;
    	}
    	else {
    		len = iDestino-iOrigem;
    	}
    	System.out.println(len);
    	int obstaculos=0;
    	for(int i = 0;i<len;i++) {
    		if(caminho[i]=='X') {
    			obstaculos++;
    			continue;
    		}
    		else if(caminho[i]=='0') {
    			ehValido = false;
    			break;
    		}
    		obstaculos = 0;
    	}
    	if(obstaculos!=0) {
    		ehValido = false;
    	}
    	return ehValido;
    }

}
