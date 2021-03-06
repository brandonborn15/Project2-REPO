# Setup
1. Players will enter their names to make the game more user personalized
2. Players will pick either if they want to play with either symbol of "X" or "O"
3. Players will decide who will make the first move

# How To Play
1. A grid will be displayed labeled 1-9, each number represents the position to place a symbol of "X" or "O"
2. Enter the number you wish to move and your symbol will be placed in that position and it will be the next players turn
3. First player that gets 3 symbols in a row in any direction wins the game
4. The game will automatically keep a tally, press 1 to replay another or 0 to end the game.
5. If no player wins it will be considered  draw no one wins and will give the option to retry another game

# Things To Remember
1. There are a total of 9 moves once the 9 moves are complete the game will create a draw and give options to try again
2. Once count equals 5 test method should run
3. After every turn print the layout of how the table appears
4. When test finds a matched scenario determine if it is player 1 or 2 that wins (after print the player who wins)
5. Create a (count int) to count the measures of turns there are
6. When deciding to replay the game, a count tally keeps track of player wins

# Objective:
For this assignment we were tasked with creating an updated version of our Tic-Tac-Toe games from the first homework assignment.
Collaborating with our new group members and compiling all of our original code to create a new and improved version of our own games.

# Project Approach:
1. Program will be written in Java 9.0.4
2. Review of each others code from the previous assignment so we can figure out the direction we would like to take as a group.
3. Group members will submit their changes to our github repository with proper documentation to go along with each commit.
   a. After each submission we will report to our basecamp discussion on the changes made so everyone is on the same page going forward.
4. UML Diagram will be made to outline our class definition before we begin to write our code.
   a. This will be made on Draw.io and explicates how a user will move through our system.
5. Class and Function diagram will be made to show the functions we will have for our respective classes.
6. Function definitions will be given to explain their own unique purpose within the program.

# Program Requirements
1. Initial class definition.
2. Create a game board for our tic-tac-toe game.
   a. The board must be updated after each player’s respective moves.
3. System must be able to distinguish between player X and player O (two person game).
   a. Create an option for players to enter their own names.
4. Report to the players whose turn it is after a move is made.
5. Game board should automatically update after a legal move is made. This will be achieved by efficient data structures that utilize a
   minimum amount of memory to ensure that the program runs smoothly and efficiently.
6. System must prohibit players from making an illegal move in a location that already has a space
   a. Report a message to the player that this is an invalid move, and they must try again
7. System must recognize a win as three of their moves matching vertical, horizontally, or diagonally.
8. System must recognize if a draw is found; meaning that neither play can win.
9. After a “win” has been found report to the players if a player has won the game
10. When the players are finished playing, prompt them to either replay the game or exit the program
   a. Should the players choose to continue playing keep a tally of how many times they have each won
