import java.util.Scanner;
import java.util.*;
import java.io.*;
/*--------------------------------------------------------------------------------------------------------------------------------------------------------- */
public class TicTacToeNew {
    /*--------------------------------------------------------------------------------------------------------------------------------------------------------- */
    /* part1 variables */
    /*--------------------------------------------------------------------------------------------------------------------------------------------------------- */
    static Scanner sc = new Scanner(System.in);
    static LinkedList checkDupes = new LinkedList(); //a list that holds all the spaces that have been used already
    static String player1Name, player2Name;
    static int player1NameTurn, player2NameTurn;
    static int xTally, yTally; //the count for all the players individual wins
    static String one = "1";// holds the "locations" of the game board
    static String two = "2";
    static String three= "3";
    static String four = "4";
    static String five = "5";
    static String six = "6";
    static String seven = "7";
    static String eight= "8";
    static String nine = "9";
    static int turnCount = 0; //counts the number of turns so there is no too many turns played
    static String choice = "";
    static String player1Symbol;
    static String player2Symbol;
    static int retryCount;
    static LinkedList<String> comp = new LinkedList<String>();
    /*--------------------------------------------------------------------------------------------------------------------------------------------------------- */
    /*------------------------------------------------------*/
    /*part2 setup*/
    /*------------------------------------------------------*/
    /*--------------------------------------------------------------------------------------------------------------------------------------------------------- */
    public static void main(String[] args){
        namesSet();
        playerSet();
        if(player2Name.equals("comp")){//follows a computer only game method if played by yourself
            playComp();
        }
        playerOrder();
        play();
    }
    /*--------------------------------------------------------------------------------------------------------------------------------------------------------- */
    static void namesSet(){
        //opens a scanner for the users to imput their name so its a personalixed game instead of saying player x and player o
        System.out.print(" Please, enter Player 1's name: ");
        player1Name = sc.next();
        /*------------------------------------*/
        System.out.print("  If you wish to play against the computer type (Comp): Else ");
        System.out.print("  Please, enter Player 2's name: ");
        player2Name = sc.next();
    }
    /*--------------------------------------------------------------------------------------------------------------------------------------------------------- */
    static void playerSet(){
        System.out.print("\n  " + player1Name+ ", choose a symbol to play with, \"x\" or \"o\"? ");
        // tells the first player to pick what symbol they want to play as, and the other player gets the other symbol
        player1Symbol = sc.next().toLowerCase();//sets the players input at a lowercase automatically
        if(player1Symbol.equals("x")){
            player1Symbol = "x";
            player2Symbol= "o";
        }
        else {
            player1Symbol = "o";
            player2Symbol= "x";
        }
        System.out.print("  => " + player2Name+ " will play with the '" + player2Symbol + " symbol.\n");//re-states what player is which symbol
    }
    /*--------------------------------------------------------------------------------------------------------------------------------------------------------- */
    static void playerOrder(){
        System.out.print("\n  " + player1Name + ", would you like to play first (y/n)? ");// asks if player 1 wants to make the forst move or not
        char playerAns = sc.next().toLowerCase().charAt(0);
        // the below if statement shows if the answer is yes then player one has the first move which relates to the play method, if no then the oppisite
        if (playerAns == 'y') {
            player1NameTurn = 0;
            player2NameTurn = 1;
        }
        else {
            player1NameTurn = 1;
            player2NameTurn = 0;
        }
    }
    /*--------------------------------------------------------------------------------------------------------------------------------------------------------- */
    /*--------------------------------------- */
    /*part3 game functions*/
    /*--------------------------------------- */
    /*--------------------------------------------------------------------------------------------------------------------------------------------------------- */
    static void play() {//runs the game in a loop for unlimited games unless told to end the loop and the code will stop running
        clearBoard();//resets the board
        draw();// draws the board
        turnCount = 0;// resets the count to 0
        while (turnCount <= 8) {//runs the game as long as the count is up to 9
            if(player1NameTurn==0){
                //of the first player wishes to go first order
                player1();
                checkWin();
                player2();
                checkWin();
            }
            else {
                // if the second player wishes to go first order
                player2();
                checkWin();
                player1();
                checkWin();
            }
        }
    }
    /*--------------------------------------------------------------------------------------------------------------------------------------------------------- */
    static void draw(){
        // creates the game board
        System.out.println(one + "|" + two + "|" + three + "\n" + four + "|" + five +"|" + six + "\n" + seven + "|" + eight + "|" + nine +"\n");
    }
    /*--------------------------------------------------------------------------------------------------------------------------------------------------------- */
    static void clearBoard(){
        checkDupes.clear(); // clears the linkedlist so it can be empty for a new game
        one = "1";//sets all the locations back to their original numbers
        two = "2";
        three= "3";
        four = "4";
        five = "5";
        six = "6";
        seven = "7";
        eight= "8";
        nine = "9";
        turnCount = 0; // resets the turn count back to 0
    }
    /*--------------------------------------------------------------------------------------------------------------------------------------------------------- */
    static void player1(){//allows the 1st player to  make their moves or tells them that their moves are invalid, prints the game board with the new turn, counts the number of turns, and checks for a win
        turnCount= turnCount+1; //adds to the turn count for evey move
        System.out.println(player1Name+", enter the number that corresponds to the cell: "); // directions to place a move
        choice = sc.next();
        if(turnCount>=4){//checks the win if there are 5 or more moves played because the is a possibility of a win for the player who goes first
            checkWin();
        }
        //shows all the options for a player mocing into one of the 9 spaces avalible and turns the designated location into the players number, only for player 1
        if(one.equals(choice) && !checkDupes.contains(choice)){//checks if the location has ben used already
            one =player1Symbol;
            checkDupes.add(choice);//adds the designated location into the linkedlist so it cannot be used again
            if(player2Name.equals("comp")){//only in the case of playing the computer, the comp linked list gets erased one by one to limit its options of play locations
            comp.remove(choice);//
            }
            draw();//re-draws the new game table with the charcter in the designated location
        }
        else if(two.equals(choice) && !checkDupes.contains(choice)){
            two =player1Symbol;
            checkDupes.add(choice);
            if(player2Name.equals("comp")){
            comp.remove(choice);
            }
            draw();
        }
        else if(three.equals(choice) && !checkDupes.contains(choice)){
            three =player1Symbol;
            checkDupes.add(choice);
            if(player2Name.equals("comp")){
            comp.remove(choice);
            }
            draw();
        }
        else if(four.equals(choice) && !checkDupes.contains(choice)){
            four =player1Symbol;
            checkDupes.add(choice);
            if(player2Name.equals("comp")){
            comp.remove(choice);
            }
            draw();
        }
        else if(five.equals(choice) && !checkDupes.contains(choice)){
            five =player1Symbol;
            checkDupes.add(choice);
            if(player2Name.equals("comp")){
            comp.remove(choice);
            }
            draw();
        }
        else if(six.equals(choice) && !checkDupes.contains(choice)){
            six =player1Symbol;
            checkDupes.add(choice);
            if(player2Name.equals("comp")){
            comp.remove(choice);
            }
            draw();
        }
        else if(seven.equals(choice) && !checkDupes.contains(choice)){
            seven =player1Symbol;
            checkDupes.add(choice);
            if(player2Name.equals("comp")){
            comp.remove(choice);
            }
            draw();
        }
        else if(eight.equals(choice) && !checkDupes.contains(choice)){
            eight =player1Symbol;
            checkDupes.add(choice);
            if(player2Name.equals("comp")){
            comp.remove(choice);
            }
            draw();
                }
        else if(nine.equals(choice) && !checkDupes.contains(choice)){
            nine =player1Symbol;
            checkDupes.add(choice);
            if(player2Name.equals("comp")){
            comp.remove(choice);
            }
            draw();
        }
        else{
            //if no one has input an option used already it tells the player to try again
            System.out.println("invalid input, try again: ");
            retryCount++; //counts for the players amount of retrys
            if(retryCount==3){//if the number of retrys hits 3 it will skip the players turn and have it go to the next player
            turnCount=turnCount-1;
            System.out.println("amount of retys have been reached " +player2Name+ "your turn");
            player2();
            }
            else{
            player1();
            }
        }
        retryCount=0;
    }
    /*--------------------------------------------------------------------------------------------------------------------------------------------------------- */
    public static void player2(){//allows the 2nd player to  make their moves or tells them that their moves are invalid, prints the game board ith the new turn, counts the number of turns, and checks for a win
        turnCount= turnCount+1;//adds to the turn count for evey move
        System.out.println(player2Name+", enter the number that corresponds to the cell: ");// directions to place a move
        choice = sc.next();
        if(turnCount>=4){//checks the win if there are 5 or more moves played because the is a possibility of a win for the player who goes first
            checkWin();
        }
        //shows all the options for a player mocing into one of the 9 spaces avalible and turns the designated location into the players number, only for player 2
        if(one.equals(choice) && !checkDupes.contains(choice)){//checks if the location has ben used already
            one =player2Symbol;
            checkDupes.add(choice);//adds the designated location into the linkedlist so it cannot be used again
            draw();//re-draws the new game table with the charcter in the designated location
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
            //if no one has input an option used already it tells the player to try again
            System.out.println("invalid input, try again: ");
            retryCount++;
            if(retryCount==3){
            turnCount=turnCount-1;
            System.out.println("amount of retys have been reached " +player1Name+ "your turn");
            player1();
            }
            else{
            player2();
            }
        }
        retryCount=0;
    }
    /*--------------------------------------------------------------------------------------------------------------------------------------------------------- */
    /*--------------------------------------- */
    /*part4 comp v player*/
    /*--------------------------------------- */
    /*--------------------------------------------------------------------------------------------------------------------------------------------------------- */
    static void playComp(){
        comp.clear();//clears out the comp list so when the game gets restarted no doubles will exist in the list
        clearBoard();//resets the board
        draw();// draws the board
        turnCount = 0;// resets the count to 0
        comp.add(one); comp.add(two); comp.add(three); comp.add(four); comp.add(five); comp.add(six);comp.add(seven);comp.add(eight); comp.add(nine);
        while (turnCount <= 8) {//runs the game as long as the count is up to 9
                //of the first player wishes to go first order
                player1();//player one moves
                checkWin();
                Comp();//computer moves by itself
                checkWin();
        }
    }
    /*--------------------------------------------------------------------------------------------------------------------------------------------------------- */
    static void Comp(){
        turnCount+=1;
        Collections.shuffle(comp);//creates a mixed order for the computer to pick
        choice = comp.get(0);//the first element in the mixed linked list is what gets picked
        if(turnCount>=4){//checks the win if there are 5 or more moves played because the is a possibility of a win for the player who goes first
            checkWin();
        }
        //shows all the options for a player mocing into one of the 9 spaces avalible and turns the designated location into the players number, only for player 2
        if(one.equals(choice) && !checkDupes.contains(choice)){//checks if the location has ben used already
            one =player2Symbol;
            checkDupes.add(choice);//adds the designated location into the linkedlist so it cannot be used again
            comp.remove(choice);
            draw();//re-draws the new game table with the charcter in the designated location
        }
        else if(two.equals(choice) && !checkDupes.contains(choice)){
            two =player2Symbol;
            checkDupes.add(choice);
            comp.remove(choice);
            draw();
        }
        else if(three.equals(choice) && !checkDupes.contains(choice)){
            three =player2Symbol;
            checkDupes.add(choice);
            comp.remove(choice);
            draw();
        }
        else if(four.equals(choice) && !checkDupes.contains(choice)){
            four =player2Symbol;
            checkDupes.add(choice);
            comp.remove(choice);
            draw();
        }
        else if(five.equals(choice) && !checkDupes.contains(choice)){
            five =player2Symbol;
            checkDupes.add(choice);
            comp.remove(choice);
            draw();
        }
        else if(six.equals(choice) && !checkDupes.contains(choice)){
            six =player2Symbol;
            checkDupes.add(choice);
            comp.remove(choice);
            draw();
        }
        else if(seven.equals(choice) && !checkDupes.contains(choice)){
            seven =player2Symbol;
            checkDupes.add(choice);
            comp.remove(choice);
            draw();
        }
        else if(eight.equals(choice) && !checkDupes.contains(choice)){
            eight =player2Symbol;
            checkDupes.add(choice);
            comp.remove(choice);
            draw();
        }
        else if(nine.equals(choice) && !checkDupes.contains(choice)){
            nine =player2Symbol;
            checkDupes.add(choice);
            comp.remove(choice);
            draw();
        }
        else{
        Comp();
        }
        Collections.sort(comp);
        }
    /*--------------------------------------------------------------------------------------------------------------------------------------------------------- */
    /*--------------------------------------- */
    /*part5 game check*/
    /*--------------------------------------- */
    /*--------------------------------------------------------------------------------------------------------------------------------------------------------- */
    public static void checkWin(){
        //checks all of the 9 possibilities of a win for a player
        if(one.equals(two) && two.equals(three)){
            if(one.equals("x")){//if the winner is an x then the players whos symbol is x gets a win tally for how many wins they have over the other player
                xTally++;
            }
            else{//if the winner is an o then the players whos symbol is o gets a win tally for how many wins they have over the other player
                yTally++;
            }
            System.out.println("Winner tally: " + player1Name + " : " + xTally + " " + player2Name + ": " + yTally);// prints the players names and their tally wins
            System.out.println("player "+one+" Wins! Enter 1 to play again, or 0 to exit: "); // sayes who wins and options to play again
            choice = sc.next();
            if(choice.equals("1")){//to play again
                if(player2Name.equals("comp")){
                playComp();
                }
                else{
                play();
                }
            }
            else{//to end the game completly
                sc.close();
                System.exit(0);
            }
        }//repetition from above down for the rest of the win scenarios
        else if(one.equals(four) && four.equals(seven)){
            if(one.equals("x")){
                xTally++;
            }
            else{
                yTally++;
            }
            System.out.println("Winner tally: " + player1Name + " : " + xTally + " " + player2Name + ": " + yTally);
            System.out.println("player "+one+" Wins! Enter 1 to play again, or 0 to exit: ");
            choice = sc.next();
            if(choice.equals("1")){
                if(player2Name.equals("comp")){
                playComp();
                }
                else{
                play();
                }
            }
            else{
                sc.close();
                System.exit(0);
            }
        }
        else if(one.equals(five) && five.equals(nine)){
            if(one.equals("x")){
                xTally++;
            }
            else{
                yTally++;
            }
            System.out.println("Winner tally: " + player1Name + " : " + xTally + " " + player2Name + ": " + yTally);
            System.out.println("player "+one+" Wins! Enter 1 to play again, or 0 to exit: ");
            choice = sc.next();
            if(choice.equals("1")){
                if(player2Name.equals("comp")){
                playComp();
                }
                else{
                play();
                }
            }
            else{
                sc.close();
                System.exit(0);
            }
        }
        else if(two.equals(five) && five.equals(eight)){
            if(two.equals("x")){
                xTally++;
            }
            else{
                yTally++;
            }
            System.out.println("Winner tally: " + player1Name + " : " + xTally + " " + player2Name + ": " + yTally);
            System.out.println("player "+two+" Wins! Enter 1 to play again, or 0 to exit: ");
            choice = sc.next();
            if(choice.equals("1")){
                if(player2Name.equals("comp")){
                playComp();
                }
                else{
                play();
                }
            }
            else{
                sc.close();
                System.exit(0);
            }
        }
        else if(three.equals(six) && six.equals(nine)){
            if(three.equals("x")){
                xTally++;
            }
            else{
                yTally++;
            }
            System.out.println("Winner tally: " + player1Name + " : " + xTally + " " + player2Name + ": " + yTally);
            System.out.println("player "+three+" Wins! Enter 1 to play again, or 0 to exit: !");
            choice = sc.next();
            if(choice.equals("1")){
                if(player2Name.equals("comp")){
                playComp();
                }
                else{
                play();
                }
            }
            else{
                sc.close();
                System.exit(0);
            }
        }
        else if(seven.equals(five) && five.equals(three)){
            if(seven.equals("x")){
                xTally++;
            }
            else{
                yTally++;
            }
            System.out.println("Winner tally: " + player1Name + " : " + xTally + " " + player2Name + ": " + yTally);
            System.out.println("player "+seven+" Wins! Enter 1 to play again, or 0 to exit: !");
            choice = sc.next();
            if(choice.equals("1")){
                if(player2Name.equals("comp")){
                playComp();
                }
                else{
                play();
                }
            }
            else{
                sc.close();
                System.exit(0);
            }
        }
        else if(four.equals(five) && four.equals(six)){
            if(four.equals("x")){
                xTally++;
            }
            else{
                yTally++;
            }
            System.out.println("Winner tally: " + player1Name + " : " + xTally + " " + player2Name + ": " + yTally);
            System.out.println("player "+four+" Wins! Enter 1 to play again, or 0 to exit: !");
            choice = sc.next();
            if(choice.equals("1")){
                if(player2Name.equals("comp")){
                playComp();
                }
                else{
                play();
                }
            }
            else{
                sc.close();
                System.exit(0);
            }
        }
        else if(seven.equals(eight) && eight.equals(nine)){
            if(seven.equals("x")){
                xTally++;
                }
            else{
                yTally++;
            }
            System.out.println("Winner tally: " + player1Name + " : " + xTally + " " + player2Name + ": " + yTally);
            System.out.println("player "+seven+" Wins! Enter 1 to play again, or 0 to exit: !");
            choice = sc.next();
            if(choice.equals("1")){
                if(player2Name.equals("comp")){
                playComp();
                }
                else{
                play();
                }
            }
            else{
                sc.close();
                System.exit(0);
            }
        }
        else if(turnCount==9){
            System.out.println("Winner tally: X : " + xTally + " " + player2Name + ": " + yTally);
            System.out.println("No Winner. Enter 1 to play again, or 0 to exit: ");
            choice = sc.next();
            if(choice.equals("1")){
                if(player2Name.equals("comp")){
                playComp();
                }
                else{
                play();
                }
            }
            else{
                sc.close();
                System.exit(0);
            }
        }
    }
}
