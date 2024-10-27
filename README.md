Letter Occurrence Counter
In this exercise, the Main class contains the program's main method. This program is designed to read a string entered by the user and count the occurrences of each letter of the alphabet, ignoring case. The results are stored in an array named nb_occurrences with a size of 26.

Implementation Details
Reading the String:

The program begins by creating a Scanner instance to read user input and prompts the user to enter a string.
It then checks that the string's length does not exceed 100 characters.
String Normalization:

To simplify counting, the string is converted to lowercase using the toLowerCase() method.
Counting Occurrences:

An array nb_occurrences of size 26 is created to store the number of occurrences of each letter. Each index corresponds to a letter of the alphabet (0 for 'a', 1 for 'b', etc.).
A for-each loop iterates through each character in the string. If the character is a letter (between 'a' and 'z'), the corresponding counter in the array is incremented.
Displaying Results:

After counting occurrences, the program displays the number of times each letter appears, showing only the letters that appear at least once. Each letter is converted to uppercase for display using Character.toUpperCase().
Error Handling:

If the entered string exceeds 100 characters, an error message is displayed, prompting the user to enter a shorter string.
