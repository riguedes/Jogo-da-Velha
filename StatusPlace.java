//Inclus�o de pacote
package game;

//M�todo enum
public enum StatusPlace {
	EMPTY(0), PLAYER_ONE(1) , PLAYER_TWO(2);

    public int valorGrade;
    StatusPlace(int valor) {
        valorGrade = valor;
    }

    public int getValor(){
        return valorGrade;
    }
}

