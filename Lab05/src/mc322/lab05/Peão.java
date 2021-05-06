<<<<<<< HEAD
package mc322.lab05;
=======
package mc322.lab05; 
>>>>>>> 2da7a403d540e263f2f544d07a1cf01e99132149

public class Peão extends Peça {
    Peão(int linha, int coluna, boolean black ){
       super(linha, coluna, black );
        if(black){
          representacao = 'p';
        } else {
          representacao = 'b';
        }
    }
    public int[] Mover(int iOrigem, int jOrigem, int iDestino, int jDestino, char[] caminho){
    	boolean ehValido = true;
    	int retorno[] = new int[2];
    	retorno[1] = -1;
    	int len;
    	len = caminho.length;
    	int obstaculos = 0;
    	for(int i = 0; i<len;i++){
    		if(caminho[i]=='X'){
    			retorno[1]=i;
    			obstaculos++;
    			continue;
			}
    		else if(caminho[i]=='0'){
    			ehValido = false;
    			break;
			}
    		obstaculos = 0;
		}
    	if(obstaculos != 0){
    		ehValido = false;
		}
    	if(ehValido){
    		retorno[0]=1;
		}
    	else{
    		retorno[0]=0;
		}
    	return retorno;
    }


}
