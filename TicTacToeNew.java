import java.util.Scanner;
import java.util.*;
import java.io.*;
public class TicTacToeNew {
    static Scanner sc = new Scanner(System.in);
    static LinkedList checkDupes = new LinkedList();
    static String player1Name;
    static String player2Name;
    static int player1NameTurn;
    static int player2NameTurn;

        public static void main(String[] args){
            namesSet();
            playerSet();
        }
            static void namesSet(){
                System.out.print(" Please, enter Player 1's name: ");
                player1Name = sc.next();
                /*------------------------------------*/
                System.out.print("  Please, enter Player 2's name: ");
                player2Name = sc.next();
            }
            static void playerSet(){
                System.out.print("\n  " + player1Name+ ", choose a symbol to play with, \"x\" or \"o\"? ");
                char player1Symbol = sc.next().toLowerCase().charAt(0);
                 /*------------------------------------*/
                char player2Symbol = (player1Symbol == 'x') ? 'o' : 'x';
                System.out.print("  => " + player2Name+ " will play with the '" + ((player1Symbol == 'x') ? 'o' : 'x' )+ "' symbol.\n");
            }
            static void playerOrder(){
                System.out.print("\n  " + player1Name + ", would you like to play first (y/n)? ");
                char playerAns = sc.next().toLowerCase().charAt(0);
                    if (playerAns == 'y') {
                        player1NameTurn = 0;
                        player2NameTurn =1;
                    }
                    else {
                        player1NameTurn = 1;
                        player2NameTurn =0;
                    }
            }
            /*--------------------------------------- */
            public static void play() {
                clearBoard();//gives the game play board a fresh start making sure thre are no present x's or o's
                draw();// prints out the game play board for the players to see
                turnCount = 0;//sets the turn count to 0 because no one has moved yet
                while (turnCount <= 8) {
                    /* This loop repeats for as long as the players havent run out of moves
                     * yet ones the max amount of moves have been over played the game wouldnt
                     * work because there is no room to play*/
                    playerX();
                    checkWin();
                    playerO();
                    checkWin();
                }
            
 }
