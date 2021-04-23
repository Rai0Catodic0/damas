package mc322.lab05;

public class Dama {
	int i,j;
	char tipo;
	boolean preto;
	Dama(int i, int j, boolean preto){
		this.i = i;
		this.j = j;
		this.preto = preto;
		if(preto) {
			this.tipo = 'P';
		} else {
			this.tipo = 'B';
		}
	}
}
