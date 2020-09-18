Xizhe Sun

You are given an array A of N lowercase letter strings, all of the same length.

You may choose any set of deletion indices, and for each string, you delete all
the characters in those indices

Return the indices of the columns in A that are not in sorted order. Return an
empty set of indices (i.e. {}) if all columns are in order. Return {-1} if there are
any errors.

First import all the necessary packages to use for List and Arraylist

Create the SortColumns class

Create a static class called minDeletionSize of type list with array string A as
the parameter

Create a a list to store all the index of unsorted characters

Use a for loop to check if all words/numbers are of same length


Use an if statement within the for loop to compare all words with first word
length. If any word length is not equal with other then add -1 to the list then
return the list

Use for loop to check for capital letters if there is a capital letter
Since A[i][j] cannot be used, charAt is used to get character at a position ex:A[
j ] gives word at position j and A[ j].charAt[i] gives ith character at j position
word

Add -1 to the list and return it , do not check for other conditions then return
the list

Use for loop to check if charcaters at index i are sorted properly

Use an if statement within the for loop to check until last word

Use an if statement within the for loop to check if the characters are sorted in
the index properly in which case we will get negative number else positive
End the method minDeletionSize after returning the list

Create the main method and create an array of words within the main method

Create an object of the List, get the list and store it in the a variable of type
List

Use a for loop within the main to print the index numbers then end the main
method
