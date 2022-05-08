## Goal
To make a virtual pet program, using JAVA, and learning abstraction..

## Input
This program has an optional input, as the 'filename'. If the input is not passed, then the file 'petData.txt' will be used as default file. The file must be in CSV format. If the input file does not exist, then the program uses sample data, which is hardcoded into the program.

This program opens the file indicated in 'filename' and fills in the pets information from the filename. The same file will be used to save the pets information.

## Output
The program prompts the user to input according to the main menu options..
If the user want to add or rmove a pet or list all pets available.
if the user want to interact with pet such as playing, feeding the pet or changing the pet name. 
if the user want to exit.
Also, before exiting the program, all the pet data will be saved in the file indicated in 'filename'.

## Steps
If an argument is passed, then use it as the DB path, otherwise, use 'petData.txt' as the DB path. DB is a text file in CSV format.

### Read database
If the DB file does not exist, fill the accounts with the sample hardcoded data.
If the DB file does exist, then fill the accounts from that.

### petMainMenu
Show the main menu.
Get the option from the user.
if the user choose to add a pet it will give the user option to choose what type of pet he/she want to add such as dog or cat..
If user want to interact with the pet it will call method through the inherited pet classes where the user can feed or play with the pet.
