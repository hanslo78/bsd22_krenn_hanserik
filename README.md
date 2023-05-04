# Hangmen

## Description

This is a simple command-line Hangmen game implemented in Java. The game reads a text file containing a list of words
and randomly chooses one of them for the user to guess. The user has 12 tries to guess the word by suggesting letters
that might be in the word.

## How to install

1. First, download the zip file containing the code to your local computer.
2. Extract the contents of the zip file to a directory of your choice.

## How to use

To run the game, compile and run the Hangmen.java file in a command-line interface.

```
javac Hangmen.java
java Hangmen filename.txt
```

Replace filename.txt with the name of the text file containing the list of words you want to use in the game. The file
should be located in the same directory as the Hangmen.java file.

## Rules

The user is presented with a blank word and has to guess the word by suggesting letters. The game starts with a simple
menu displaying the number of words in the text file.

The user can only suggest a single letter at a time. The game keeps track of the letters already suggested by the user,
and will not allow the user to suggest a letter that has already been suggested.

The game ends when the user guesses the word correctly or uses all 12 tries. If the user guesses the word correctly, the
game will move on to the next word in the list until there are no more words to guess. If the user uses all 12 tries
without guessing the word, the game will display a "YOU LOSE" message and move on to the next word in the list.


## About the author

I wrote this project in my first semester of University so the code is not very pretty. I will try cleaning up the code 
in the near and would always take some suggestions to optimise my code!

* [Link to my GitHub](https://github.com/hanslo78)

* [Link to my university](https://www.campus02.at/)


### Links to other exercises

* [Exercise1](exercise1.md)
* [Exercise2](exercise2.md)