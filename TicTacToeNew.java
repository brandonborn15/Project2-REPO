import java.util.Scanner;
import java.util.*;
import java.io.*;
public class TicTacToeNew {
    static Scanner sc = new Scanner(System.in);
    static LinkedList checkDupes = new LinkedList();
    static String player1Name, player2Name; // custom player names
    static int player1NameTurn, player2NameTurn; //selection for who goes
    static int xTally, yTally; //tallies for player wins
    static String one = "1";
    static String two = "2";
    static String three= "3";
    static String four = "4";
    static String five = "5";
    static String six = "6";
    static String seven = "7";
    static String eight= "8";
    static String nine = "9";
    static int turnCount = 0;//initial count of moves
    static String choice = "";//initial string until chnged by the scanner
    static String player1Symbol;
    static String player2Symbol;
        public static void main(String[] args){
            namesSet();
            playerSet();
            play();
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
                player1Symbol = sc.next().toLowerCase();
                if(player1Symbol=="x"){
                    player1Symbol = "x";
                    player2Symbol="o";
                    }
                else player2Symbol="x";
                    System.out.print("  => " + player2Name+ " will play with the '" + player2Symbol + " symbol.\n");
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
            static void play() {
                clearBoard();//gives the game play board a fresh start making sure thre are no present x's or o's
                draw();// prints out the game play board for the players to see
                turnCount = 0;//sets the turn count to 0 because no one has moved yet
                while (turnCount <= 8) {
                    /* This loop repeats for as long as the players havent run out of moves
                     * yet ones the max amount of moves have been over played the game wouldnt
                     * work because there is no room to play*/
                    player1();
                    checkWin();
                    player2();
                    checkWin();
            }
        }
            static void clearBoard(){
                    //to make sure the game board is cleared each String is manually changed to its specific number of corrispondance 
                    checkDupes.clear(); // clears the LinkedList that is used to make sure no key is entered twice in one game
                    one = "1";
                    two = "2";
                    three= "3";
                    four = "4";
                    five = "5";
                    six = "6";
                    seven = "7";
                    eight= "8";
                    nine = "9";
                    turnCount = 0; // used to keep track of turns to end the game when there is no win
            }
            static void draw(){
                /*This draw method prints out the game board by seperating all the squares if the game board to visuall 
                *look the same as a normal TicTacToe game should
                *It simply prints out every string in its order by seperating them by brackets and new line spaces*/
                System.out.println(one + "|" + two + "|" + three + "\n" + four + "|" + five +"|" + six + "\n" + seven + "|" + eight + "|" + nine +"\n");
            }
    public static void player1(){
        turnCount= turnCount+1;//for every turn player x moves, the turn count will be added plus 1
        System.out.println(player1Name+", enter the number that corresponds to the cell: "); //simply tells the player what to do (instructions)
        choice = sc.next();//opens the scanner so an option may be typed
            if(turnCount>=4){
                //no person can win after moving once or twice so this stops the check method from running constantly and allows it to check after 5 turns have passed by
                checkWin();
        }
            if(one.equals(choice) && !checkDupes.contains(choice)){//if the persons input correctly matches the options on the game play board and is not been a moved used ny another player or by the same player already the code will continue to proceed
                    one =player1Symbol;//the number sting will now become an s to represent player x has made a move in that position
                    checkDupes.add(choice);//adds the string number to a list that will be the proof of somone moving in that position
                    draw();//again draws out the game play table so the players can see the current places availible and not availible to move
        }
                else if(two.equals(choice) && !checkDupes.contains(choice)){
                    two =player1Symbol;
                    checkDupes.add(choice);
                    draw();
                }
                else if(three.equals(choice) && !checkDupes.contains(choice)){
                    three =player1Symbol;
                    checkDupes.add(choice);
                    draw();
                }
                else if(four.equals(choice) && !checkDupes.contains(choice)){
                    four =player1Symbol;
                    checkDupes.add(choice);
                    draw();
                }
                else if(five.equals(choice) && !checkDupes.contains(choice)){
                    five =player1Symbol;
                    checkDupes.add(choice);
                    draw();
                }
                else if(six.equals(choice) && !checkDupes.contains(choice)){
                    six =player1Symbol;
                    checkDupes.add(choice);
                    draw();
                }
                else if(seven.equals(choice) && !checkDupes.contains(choice)){
                    seven =player1Symbol;
                    checkDupes.add(choice);
                    draw();
                }
                else if(eight.equals(choice) && !checkDupes.contains(choice)){
                    eight =player1Symbol;
                    checkDupes.add(choice);
                    draw();
                }
                else if(nine.equals(choice) && !checkDupes.contains(choice)){
                    nine =player1Symbol;
                    checkDupes.add(choice);
                    draw();
                }
                else{
                    //if a player inputs a string that does not match the given options then it would print invalid and give them another try
                    //there are infinite amount of trys
                    System.out.println("invalid input, try again: ");
                    player1();
                }
    }
    public static void player2(){
        //the same process repeats itelf for player o only thing changed is the o peing printed on the game play table instead of an x
        turnCount= turnCount+1;
        System.out.println(player2Name+", enter the number that corresponds to the cell: ");
        choice = sc.next();
            if(turnCount>=4){
                checkWin();
        }
            if(one.equals(choice) && !checkDupes.contains(choice)){
                one =player2Symbol;//the number sting will now become an s to represent player o has made a move in that position
                checkDupes.add(choice);
                draw();
        }
                else if(two.equals(choice) && !checkDupes.contains(choice)){
                    two =player2Symbol;
                    checkDupes.add(choice);
                    draw();
                }
                else if(three.equals(choice) && !checkDupes.contains(choice)){
                    three =player2Symbol;
                    checkDupes.add(choice);
                    draw();
                }
                else if(four.equals(choice) && !checkDupes.contains(choice)){
                    four =player2Symbol;
                    checkDupes.add(choice);
                    draw();
                }
                else if(five.equals(choice) && !checkDupes.contains(choice)){
                    five =player2Symbol;
                    checkDupes.add(choice);
                    draw();
                }
                else if(six.equals(choice) && !checkDupes.contains(choice)){
                    six =player2Symbol;
                    checkDupes.add(choice);
                    draw();
                }
                else if(seven.equals(choice) && !checkDupes.contains(choice)){
                    seven =player2Symbol;
                    checkDupes.add(choice);
                    draw();
                }
                else if(eight.equals(choice) && !checkDupes.contains(choice)){
                    eight =player2Symbol;
                    checkDupes.add(choice);
                    draw();
                }
                else if(nine.equals(choice) && !checkDupes.contains(choice)){
                    nine =player2Symbol;
                    checkDupes.add(choice);
                    draw();
                }
               else{
                    System.out.println("invalid input, try again: ");
                    player2();
                }
        }
        public static void checkWin(){
        /*In each of the 8 possible scenerios that have been coded are the only 8 ways a person can win on a 3x3
           TicTacToe board 3 across 3 down or 2 sideways wins, this code takes all 8 scenerios and tests them
           to be true or not and if one scenerio deems to be true, the the winning player will be announced and 
           given an option to replay the game*/
        if(one.equals(two) && two.equals(three)){
            System.out.println("player "+one+" Wins! Enter 1 to play again, or 0 to exit: ");
            choice = sc.next();
                if(choice.equals("1")){
                // to replay the game press 1 and everything will be forced to reset itself back to its default corrospondance or 0
                play();
            }
            else{
                //if not wanting to play again the scanner will be closed and the program will close itself so it does not run on forever
                sc.close();
                System.exit(0);
            }
            /*This process will repeat itself for every win scenerio*/
            }
            else if(one.equals(four) && four.equals(seven)){
            System.out.println("player "+one+" Wins! Enter 1 to play again, or 0 to exit: ");
            choice = sc.next();
                if(choice.equals("1")){
                play();
            }
                else{
                sc.close();
                System.exit(0);
            }
            }
            else if(one.equals(five) && five.equals(nine)){
                System.out.println("player "+one+" Wins! Enter 1 to play again, or 0 to exit: ");
                choice = sc.next();
                if(choice.equals("1")){
                    play();
            }
                else{
                sc.close();
                System.exit(0);
            }
            }
            else if(two.equals(five) && five.equals(eight)){
                System.out.println("player "+two+" Wins! Enter 1 to play again, or 0 to exit: ");
                choice = sc.next();
                if(choice.equals("1")){
                    play();
            }
                else{
                    sc.close();
                    System.exit(0);
                }
            }
            else if(three.equals(six) && six.equals(nine)){
                System.out.println("player "+three+" Wins! Enter 1 to play again, or 0 to exit: !");
                choice = sc.next();
                if(choice.equals("1")){
                    play();
            }
                else{
                    sc.close();
                    System.exit(0);
            }
            }
            else if(seven.equals(five) && five.equals(three)){
                System.out.println("player "+seven+" Wins! Enter 1 to play again, or 0 to exit: !");
                choice = sc.next();
                if(choice.equals("1")){
                    play();
            }
                else{
                    sc.close();
                    System.exit(0);
            }
            }
            else if(four.equals(five) && four.equals(six)){
                System.out.println("player "+four+" Wins! Enter 1 to play again, or 0 to exit: !");
                choice = sc.next();
                if(choice.equals("1")){
                    play();
            }
                else{
                    sc.close();
                    System.exit(0);
            }
            }
            
            else if(seven.equals(eight) && eight.equals(nine)){
                System.out.println("player "+seven+" Wins! Enter 1 to play again, or 0 to exit: !");
                choice = sc.next();
                if(choice.equals("1")){
                    play();
            }
                else{
                    sc.close();
                    System.exit(0);
            }
            }
            else if(turnCount==9){
            /*If the turn count has reached its max of 9(no more moves), the game will print out 
            *there is no winner and will repeat the options of playing again or quitting the game
            *completly*/
                System.out.println("No Winner. Enter 1 to play again, or 0 to exit: ");
                if(choice.equals("1")){
                    play();
            }
                else{
                    sc.close();
                    System.exit(0);
            }
            }
        }
}
 

            
 
