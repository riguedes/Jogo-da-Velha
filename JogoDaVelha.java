//Inclus�o de pacote
package game;

//Inclus�o de Classe
public class JogoDaVelha {
	 private boolean EndGame = false;
	    private boolean Valid = true;
	    private int contador = 0;
	    private int grade[][] = new int[3][3];

//Inclus�o de condi��o do campo do jogo
	    public boolean getValid() {
	        return Valid;
	    }

//Inclus�o da funcionalidade do contador durante a jogabilidade
	    public void setContador(int contador) {
	        this.contador += contador;
	    }

//Condi��o do fim do jogo
	    public boolean getEndGame() {
	        return EndGame;
	    }

//Inicializa��o da grade
	    public JogoDaVelha() {
	        for (int i = 0; i < 3; i++){
	            for (int j = 0; j < 3; j++) {
	                grade[i][j] = StatusPlace.EMPTY.valorGrade;
	            }
	        }
	    }

//Condi��es do preenchimento da grade de cada jogador
	    public void Player1 (int line, int column) {
	        if (this.grade[line][column] == StatusPlace.EMPTY.valorGrade) {
	            this.grade[line][column] = StatusPlace.PLAYER_ONE.valorGrade;
	            Valid = true;
	        } else {
	            System.out.println("This move cannot be performed, try again!");
	            Valid = false;
	        }
	    }

	    public void Player2 (int line, int column) {
	        if (this.grade[line][column] == StatusPlace.EMPTY.valorGrade) {
	            this.grade[line][column] = StatusPlace.PLAYER_ONE.valorGrade;
	            Valid = true;
	        } else {
	            System.out.println("This move cannot be performed, try again!");
	            Valid = false;
	        }
	    }

//Sa�da de dados da grade
	    public void imprimir() {
	        System.out.println("   Column0  Column1  Column2  ");
	        System.out.println("Line0  " + grade[0][0] + "  " + grade[0][1] + "  " + grade [0][2]);
	        System.out.println("Line1  " + grade[1][0] + "  " + grade[1][1] + "  " + grade [1][2]);
	        System.out.println("Line2  " + grade[2][0] + "  " + grade[2][1] + "  " + grade [2][2]);
	        System.out.println(" \n\n");
	    }

//CCondi��es para declara��o de vit�ria para cada jogador	    
	    public void Wins() {
	        if (
	                           grade[0][0] == StatusPlace.PLAYER_ONE.valorGrade
	                                   && grade[0][1] == StatusPlace.PLAYER_ONE.valorGrade
	                                   && grade[0][2] == StatusPlace.PLAYER_ONE.valorGrade
	                        || grade[1][0] == StatusPlace.PLAYER_ONE.valorGrade
	                                   && grade[1][1] == StatusPlace.PLAYER_ONE.valorGrade
	                                   && grade[1][2] == StatusPlace.PLAYER_ONE.valorGrade
	                        || grade[2][0] == StatusPlace.PLAYER_ONE.valorGrade
	                                   && grade[2][1] == StatusPlace.PLAYER_ONE.valorGrade
	                                   && grade[2][2] == StatusPlace.PLAYER_ONE.valorGrade
	                        || grade[0][0] == StatusPlace.PLAYER_ONE.valorGrade
	                                   && grade[1][1] == StatusPlace.PLAYER_ONE.valorGrade
	                                   && grade[2][2] == StatusPlace.PLAYER_ONE.valorGrade
	                                   || grade[0][2] == StatusPlace.PLAYER_ONE.valorGrade
	                                   && grade[1][1] == StatusPlace.PLAYER_ONE.valorGrade
	                                   && grade[2][0] == StatusPlace.PLAYER_ONE.valorGrade
	                        || grade[0][0] == StatusPlace.PLAYER_ONE.valorGrade
	                                   && grade[1][0] == StatusPlace.PLAYER_ONE.valorGrade
	                                   && grade[2][0] == StatusPlace.PLAYER_ONE.valorGrade
	                        || grade[0][1] == StatusPlace.PLAYER_ONE.valorGrade
	                                   && grade[1][1] == StatusPlace.PLAYER_ONE.valorGrade
	                                   && grade[2][1] == StatusPlace.PLAYER_ONE.valorGrade
	                        || grade[0][2] == StatusPlace.PLAYER_ONE.valorGrade
	                                   && grade[1][2] == StatusPlace.PLAYER_ONE.valorGrade
	                                   && grade[2][2] == StatusPlace.PLAYER_ONE.valorGrade

	        ) {
	            EndGame = true;
	            System.out.println("\n\nPlayer 1 Wins!!!");
	        } else if (
	        		grade[0][0] == StatusPlace.PLAYER_TWO.valorGrade
                    	&& grade[0][1] == StatusPlace.PLAYER_TWO.valorGrade
                    	&& grade[0][2] == StatusPlace.PLAYER_TWO.valorGrade
                    || grade[1][0] == StatusPlace.PLAYER_TWO.valorGrade
                    	&& grade[1][1] == StatusPlace.PLAYER_TWO.valorGrade
                    	&& grade[1][2] == StatusPlace.PLAYER_TWO.valorGrade
                    || grade[2][0] == StatusPlace.PLAYER_TWO.valorGrade
                    	&& grade[2][1] == StatusPlace.PLAYER_TWO.valorGrade
                    	&& grade[2][2] == StatusPlace.PLAYER_TWO.valorGrade
                    || grade[0][0] == StatusPlace.PLAYER_TWO.valorGrade
                    	&& grade[1][1] == StatusPlace.PLAYER_TWO.valorGrade
                    	&& grade[2][2] == StatusPlace.PLAYER_TWO.valorGrade
                    || grade[0][2] == StatusPlace.PLAYER_TWO.valorGrade
                    	&& grade[1][1] == StatusPlace.PLAYER_TWO.valorGrade
                    	&& grade[2][0] == StatusPlace.PLAYER_TWO.valorGrade
                    || grade[0][0] == StatusPlace.PLAYER_TWO.valorGrade
                    	&& grade[1][0] == StatusPlace.PLAYER_TWO.valorGrade
                    	&& grade[2][0] == StatusPlace.PLAYER_TWO.valorGrade
                    || grade[0][1] == StatusPlace.PLAYER_TWO.valorGrade
                    	&& grade[1][1] == StatusPlace.PLAYER_TWO.valorGrade
                    	&& grade[2][1] == StatusPlace.PLAYER_TWO.valorGrade
                    || grade[0][2] == StatusPlace.PLAYER_TWO.valorGrade
                    	&& grade[1][2] == StatusPlace.PLAYER_TWO.valorGrade
                    	&& grade[2][2] == StatusPlace.PLAYER_TWO.valorGrade            
	        ) {
	            EndGame = true;
	            System.out.println("\n\nPlayer 2 Wins!! ");
	        } else if (contador == 9){
	            EndGame = true;
	            System.out.println("\n\nDraw!! ");

	        }
	    }


	}
