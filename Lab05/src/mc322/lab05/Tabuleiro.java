package mc322.lab05;

public class Tabuleiro {
	Peão peoes[][] = new Peão[7][7];
	Dama damas[][] = new Dama[7][7];
	int numeroDePinos = 32;
	Tabuleiro() {
		for(int i=0;i<8;i++) {
			for(int j = 0; j<8; j++) {
				if(i>2&&i<4) {
					peoes[i][j] = null;
				} else if(i==5 || i==7) {
					if(j%2==0) {
						peoes[i][j]=new Peão(i,j,true);
					}
				} else if (i==6 && j%2 != 0) {
					peoes[i][j]=new Peão(i,j,true);
				} else if(i==0||i==2) {
					if(j%2!=0) {
						peoes[i][j]=new Peão(i,j,false);
					}
				}else if(i==1 && j%2==0) {
					peoes[i][j] = new Peão(i,j,false);
				}
				damas[i][j] = null;
			}
		}

	}

	String Apresentar() {
		for(int i=0;i<8;i++) {
			for(int j = 0; j<8; j++) {
				//System.out.print(); -> printar atributo do peão
				//fazer lógica para ver se é dama ou peão e printar espaço só se 
				//os dois estão vazios
			}
		}
	}

	void Mover(String comando) {
		//transformar coordenadas
		int jOrigem = comando.charAt(0)-97;
		int iOrigem = 55-comando.charAt(1);
		int jDestino = comando.charAt(3)-97;
		int iDestino = 55-comando.charAt(4);
		
	}

}
