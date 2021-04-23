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
		int indice = 0;
		char[] representacao = new char[72];
		char[] numeros = {'8','7','6','5','4','3','2','1'};
		char[] letras = {'a','b','c','d','e','f','g','h'};
		for(int i=0;i<8;i++) {
			System.out.print(numeros[i]);
			for(int j = 0; j<8; j++) {
				if(peoes[i][j]==null && damas[i][j]==null) {
					System.out.print("-");
					representacao[indice] = '-';
					indice++;
				} else if(peoes[i][j]!=null) {
					System.out.print(peoes[i][j].representacao);
					representacao[indice] = peoes[i][j].representacao;
					indice++;
				} else if(damas[i][j]!=null) {
					System.out.print(damas[i][j].representacao);
					representacao[indice] = damas[i][j].representacao;
					indice++;
				}
			}
			System.out.print("\n");
			representacao[indice] = '\n';
			indice++;
		}
		System.out.print(' ');
		System.out.println(letras);
		return new String(representacao);
	}

	void Mover(String comando) {
		//transformar coordenadas
		int jOrigem = comando.charAt(0)-97;
		int iOrigem = 55-comando.charAt(1);
		int jDestino = comando.charAt(3)-97;
		int iDestino = 55-comando.charAt(4);
		
		//aqui pedimos a validação do movimento para a peça envolvida
		//fazemos o movimento e o caminho caso seja válido
		
	}

}
