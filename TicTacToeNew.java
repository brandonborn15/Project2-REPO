import java.util.Scanner;
import java.util.*;
import java.io.*;
public class TicTacToeNew {
    /* part1 variables */
    static Scanner sc = new Scanner(System.in);
    static LinkedList checkDupes = new LinkedList();
    static String player1Name, player2Name; 
    static int player1NameTurn, player2NameTurn; 
    static int xTally, yTally; 
    static String one = "1";
    static String two = "2";
    static String three= "3";
    static String four = "4";
    static String five = "5";
    static String six = "6";
    static String seven = "7";
    static String eight= "8";
    static String nine = "9";
    static int turnCount = 0;
    static String choice = "";
    static String player1Symbol;
    static String player2Symbol;
    /*------------------------------------------------------*/
    /*part2 setup*/
    /*------------------------------------------------------*/
    public static void main(String[] args){
        namesSet();
        playerSet();
        playerOrder();
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
        if(player1Symbol.equals("x")){
            player1Symbol = "x";
            player2Symbol= "o";
        }
        else {
            player1Symbol = "o";
            player2Symbol= "x";
        }
        System.out.print("  => " + player2Name+ " will play with the '" + player2Symbol + " symbol.\n");
            }
    static void playerOrder(){
        System.out.print("\n  " + player1Name + ", would you like to play first (y/n)? ");
        char playerAns = sc.next().toLowerCase().charAt(0);
        if (playerAns == 'y') {
            player1NameTurn = 0;
            player2NameTurn = 1;
        }
        else {
            player1NameTurn = 1;
            player2NameTurn = 0;
        }
    }
    /*--------------------------------------- */
    /*part3 game functions*/
    /*--------------------------------------- */
    static void play() {
        clearBoard();
        draw();
        turnCount = 0;
        while (turnCount <= 8) {
            if(player1NameTurn==0){
                player1();
                checkWin();
                player2();
                checkWin();
            }
            else {
                player2();
                checkWin();
                player1();
                checkWin(); 
            }
        }
    }
    static void draw(){
        System.out.println(one + "|" + two + "|" + three + "\n" + four + "|" + five +"|" + six + "\n" + seven + "|" + eight + "|" + nine +"\n");
    }
    static void clearBoard(){
        checkDupes.clear(); 
        one = "1";
        two = "2";
        three= "3";
        four = "4";
        five = "5";
        six = "6";
        seven = "7";
        eight= "8";
        nine = "9";
        turnCount = 0; 
    }
    static void player1(){
        turnCount= turnCount+1;
        System.out.println(player1Name+", enter the number that corresponds to the cell: "); 
        choice = sc.next();
        if(turnCount>=4){
            checkWin();
        }
        if(one.equals(choice) && !checkDupes.contains(choice)){
            one =player1Symbol;
            checkDupes.add(choice);
            draw();
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
            System.out.println("invalid input, try again: ");
            player1();
        }
    }
    public static void player2(){
        turnCount= turnCount+1;
        System.out.println(player2Name+", enter the number that corresponds to the cell: ");
        choice = sc.next();
        if(turnCount>=4){
            checkWin();
        }
        if(one.equals(choice) && !checkDupes.contains(choice)){
            one =player2Symbol;
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
    /*--------------------------------------- */
    /*part4 game check*/
    /*--------------------------------------- */
    public static void checkWin(){
        if(one.equals(two) && two.equals(three)){
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
                play();
            }
            else{
                sc.close();
                System.exit(0);
            }
        }
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
                play();
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
                play();
            }
            else{
                sc.close();
                System.exit(0);
            }
        }
        else if(two.equals(five) && five.equals(eight)){
            if(one.equals("x")){
                xTally++;
            }
            else{
                yTally++;
            }
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
            if(one.equals("x")){
                xTally++;
            }
            else{
                yTally++;
            }
            System.out.println("Winner tally: " + player1Name + " : " + xTally + " " + player2Name + ": " + yTally);
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
                play();
            }
            else{
                sc.close();
                System.exit(0);
            }
        }
        else if(seven.equals(eight) && eight.equals(nine)){
            if(one.equals("x")){
                xTally++;
                }
            else{
                yTally++;
            }
            System.out.println("Winner tally: " + player1Name + " : " + xTally + " " + player2Name + ": " + yTally);
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
            if(one.equals("x")){
                xTally++;
            }
            else{
                yTally++;
            }
            System.out.println("Winner tally: X - " + xTally + " " + player2Name + ": " + yTally);
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
