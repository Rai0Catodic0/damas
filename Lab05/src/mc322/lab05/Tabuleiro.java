package mc322.lab05;

import java.lang.Math;

public class Tabuleiro {
	Peça tabuleiro[][] = new Peça[8][8];
	int numeroDePinos = 32;
	Tabuleiro() {
		for(int i=0;i<8;i++) {
			for(int j = 0; j<8; j++) {
				if(i>2&&i<4) {
					tabuleiro[i][j] = null;
				} else if(i==5 || i==7) {
					if(j%2==0) {
						tabuleiro[i][j]= new Dama(i,j,false);
					}
				} else if (i==6 && j%2 != 0) {
					tabuleiro[i][j]=new Dama(i,j,false);
				} else if(i==0||i==2) {
					if(j%2!=0) {
						tabuleiro[i][j]=new Dama(i,j,true);
					}
				}else if(i==1 && j%2==0) {
					tabuleiro[i][j] = new Dama(i,j,true);
				}
			}
		}
		tabuleiro[4][5]=new Dama(4,5,true);

	}

	String Apresentar() {
		int indice = 0;
		char[] representacao = new char[72];
		char[] numeros = {'8','7','6','5','4','3','2','1'};
		char[] letras = {' ','a',' ','b',' ','c',' ','d',' ','e',' ','f',' ','g',' ','h'};
		for(int i=0;i<8;i++) {
			System.out.print(numeros[i]+" ");
			for(int j = 0; j<8; j++) {
				if(tabuleiro[i][j]==null) {
					System.out.print("- ");
					representacao[indice] = '-';
					indice++;
				} else {
					System.out.print(tabuleiro[i][j].representacao+" ");
					representacao[indice] = tabuleiro[i][j].representacao;
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
		int iOrigem = 56-comando.charAt(1);
		int jDestino = comando.charAt(3)-97;
		int iDestino = 56-comando.charAt(4);
		
		int tamanho = Math.abs(iOrigem-iDestino); //tamanho do caminho
		int count = 0;
		char caminho[] = new char[tamanho];
		
		if(jOrigem<jDestino && iOrigem>iDestino) {
			int i = iOrigem-1;
			int j = jOrigem + 1;
			//aumenta j e diminui i
			while(count<tamanho) {
				if(tabuleiro[i][j]==null) {
					caminho[count]='-';
				} else {
					if(tabuleiro[iOrigem][jOrigem].black != tabuleiro[i][j].black) {
						caminho[count]='X';
					}else {
						caminho[count]='0';
					}
				}
				count++;
				j++;
				i--;
			}
			int ehValido[] = tabuleiro[iOrigem][jOrigem].Mover(iOrigem,jOrigem, iDestino,jDestino,caminho);
			if(ehValido[0]==1) {
				tabuleiro[iDestino][jDestino] = tabuleiro[iOrigem][jOrigem];
				tabuleiro[iOrigem][jOrigem]= null;
				if(ehValido[1]!=-1) { //peça capturada
					tabuleiro[iOrigem-ehValido[1]-1][jOrigem+ehValido[1]+1] = null;
				}
			}
		} else if(jOrigem<jDestino && iOrigem<iDestino) {
			int i = iOrigem+1;
			int j = jOrigem + 1;
			//aumenta j e aumenta i
			while(count<tamanho) {
				if(tabuleiro[i][j]==null) {
					caminho[count]='-';
				} else {
					if(tabuleiro[iOrigem][jOrigem].black != tabuleiro[i][j].black) {
						caminho[count]='X';
					}else {
						caminho[count]='0';
					}
				}
				count++;
				j++;
				i++;
			}
			int ehValido[] = tabuleiro[iOrigem][jOrigem].Mover(iOrigem,jOrigem, iDestino,jDestino,caminho);
			if(ehValido[0]==1) {
				tabuleiro[iDestino][jDestino] = tabuleiro[iOrigem][jOrigem];
				tabuleiro[iOrigem][jOrigem]= null;
				if(ehValido[1]!=-1) { //peça capturada
					tabuleiro[iOrigem+ehValido[1]+1][jOrigem+ehValido[1]+1] = null;
				}
			}
		} else if(jOrigem>jDestino && iOrigem<iDestino) {
			int i = iOrigem+1;
			int j = jOrigem - 1;
			//diminui j e aumenta i
			while(count<tamanho) {
				if(tabuleiro[i][j]==null) {
					caminho[count]='-';
				} else {
					if(tabuleiro[iOrigem][jOrigem].black != tabuleiro[i][j].black) {
						caminho[count]='X';
					}else {
						caminho[count]='0';
					}
				}
				count++;
				j--;
				i++;
			}
			int ehValido[] = tabuleiro[iOrigem][jOrigem].Mover(iOrigem,jOrigem, iDestino,jDestino,caminho);
			if(ehValido[0]==1) {
				tabuleiro[iDestino][jDestino] = tabuleiro[iOrigem][jOrigem];
				tabuleiro[iOrigem][jOrigem]= null;
				if(ehValido[1]!=-1) { //peça capturada
					tabuleiro[iOrigem+ehValido[1]+1][jOrigem-ehValido[1]-1] = null;
				}
			}
		} else {
			int i = iOrigem-1;
			int j = jOrigem-1;
			//diminui j e diminui i
			while(count<tamanho) {
				if(tabuleiro[i][j]==null) {
					caminho[count]='-';
				} else {
					if(tabuleiro[iOrigem][jOrigem].black != tabuleiro[i][j].black) {
						caminho[count]='X';
					}else {
						caminho[count]='0';
					}
				}
				count++;
				j--;
				i--;
			}
			int ehValido[] = tabuleiro[iOrigem][jOrigem].Mover(iOrigem,jOrigem, iDestino,jDestino,caminho);
			if(ehValido[0]==1) {
				tabuleiro[iDestino][jDestino] = tabuleiro[iOrigem][jOrigem];
				tabuleiro[iOrigem][jOrigem]= null;
				if(ehValido[1]!=-1) { //peça capturada
					tabuleiro[iOrigem-ehValido[1]-1][jOrigem-ehValido[1]-1] = null;
				}
			}
		}
		//System.out.printf("jOrigem: %d\niOrigem: %d\njDestino: %d\niDestino: %d\n", jOrigem, iOrigem, jDestino, iDestino);
	}

}
