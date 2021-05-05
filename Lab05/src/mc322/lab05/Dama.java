package mc322.lab05;

public class Dama extends Peça {
    Dama( int linha, int coluna, boolean black ){
    	super(linha, coluna, black);
        if(black){
          representacao = 'P';
        } else {
          representacao = 'B';
        }
    }

    public int[] Mover(int iOrigem,int jOrigem, int iDestino,int jDestino,char[] caminho) {
    	int retorno[] = new int [2];
    	retorno[1] = -1;
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
    			retorno[1]=i;
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
    	if(ehValido) {
    		retorno[0]=1;
    	} else {
    		retorno[0]=0;
    	}
    	return retorno;
    }

}
