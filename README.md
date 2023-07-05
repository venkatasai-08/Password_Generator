INTRODUCTION:

The given Java program generates a random password of a specified length and constructs an email address by combining the provided user ID with the generated password. It uses predefined character sets for numbers, letters (both uppercase and lowercase), and symbols to create a diverse pool of characters for the password. The program prompts the user to enter an email ID and the desired password length, validates the input, generates the password, and constructs the email address. Finally, it displays the generated password and email address on the console.

TOPICS COVERD USED IN JAVA:

1. `NUMBERS`, `CHARACTERS`, and `SYMBOLS`: These are three constants declared as strings, representing the character sets to be used for generating the password. `NUMBERS` contains digits from 0 to 9, `CHARACTERS` contains both uppercase and lowercase letters, and `SYMBOLS` contains a set of special symbols.

2. `generatePassword` method: This method takes an integer `length` as a parameter and returns a randomly generated password of the specified length. It concatenates the `CHARACTERS`, `NUMBERS`, and `SYMBOLS` strings into the `characters` string. It then uses a `SecureRandom` object to generate random indices within the bounds of the `characters` string and appends the corresponding characters to a `StringBuilder` object. Finally, it returns the generated password as a string.

3. `generateEmail` method: This method takes two strings, `user` and `password`, as parameters and constructs an email address by appending the `user` string with the `domain` string (which is hardcoded as "@gmail.com"). The resulting email address is returned as a string.

4. `main` method: This is the entry point of the program. It prompts the user to enter an email ID and the desired length for the password using a `Scanner` object. It validates the user input and checks for empty input or negative password length. If the input is valid, it generates a random password using the `generatePassword` method and constructs an email address using the `generateEmail` method. Finally, it prints the generated password and email address to the console.

The code demonstrates concepts such as random number generation, string manipulation, user input validation, and basic console I/O operations in Java.


PACKAGES:
import java.security.SecureRandom;
import java.util.Scanner;
