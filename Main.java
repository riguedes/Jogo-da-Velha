//Inclusão de pacote
package game;

//Inclusão de scanner
import java.util.Scanner;

//Função Principal
public class Main {

	public static void main(String[] args) {
		
//Inicialização do JogoDaVelha.java
	        Scanner read = new Scanner(System.in);
	        JogoDaVelha game = new JogoDaVelha();
	        int line, column;

	        System.out.println();

//Condições da jogabilidade do jogo da velha
	        while (!game.getEndGame()) {

	            game.imprimir();

	            do {
	                System.out.println("Player 1 \nYour chance: ");
	                System.out.print("Line: ");
	                line = read.nextInt();

	                System.out.print("Column: ");
	                column = read.nextInt();

	                game.Player1(line, column);
	            } while (!game.getValid());

	            game.setContador(1);
	            game.Wins();
	            if (game.getEndGame()) {
	                break;
	            }


	            game.imprimir();

	            do {
	                System.out.println("Player 2 \nYour choice: ");
	                System.out.print("Line: ");
	                line = read.nextInt();

	                System.out.print("Column: ");
	                column = read.nextInt();

	                game.Player2(line, column);
	            } while (!game.getValid());

	            game.setContador(1);
	            game.Wins();
	            if (game.getEndGame()) {
	                break;
	            }

	        }

	        System.out.println("Thank You! \nScore: \n");
	        game.imprimir();
	    }


	}

