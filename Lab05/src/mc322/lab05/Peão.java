package mc322.lab05;

public class Peão {
	int i,j;
	char tipo;
	boolean preto;
	Peão(int i, int j, boolean preto){
		this.i = i;
		this.j = j;
		this.preto = preto;
		if(preto) {
			this.tipo = 'p';
		} else {
			this.tipo = 'b';
		}
	}
}
