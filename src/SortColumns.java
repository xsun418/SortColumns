import java.util.ArrayList;
import java.util.List; 

public class SortColumns { //creating a class SortColumns

    static List minDeletionSize(String[] A) { //creating a function minDeletionSize ... since it is static we can use it without creating object
        List myList = new ArrayList(); //creating a list to store all the index of unsorted characters

//for loop to check if all words/numbers are of same length
        for (int i = 0; i < A.length; i++) {
            if (A[i].length() != A[1].length()) { //comparing all words with first word length
                myList.add(-1); // if any word length is not equal with other then add -1 to the list
                return myList; // return the list
            }
        }

// for loop to check for capital letters if there is a capital letter 

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length(); j++) {

//we cannot use A[i][j] so we have to use charAt to get character at a position ex:A[ j ] gives word at position j and A[ j].charAt[i] gives ith character at j position word
                if (Character.isUpperCase(A[i].charAt(j))) { //  checkif there is a capital letter
                    myList.add(-1); // add -1 to the list and return it , do not check for other conditions
                    return myList; //return the list
                }
            }
        }

// for loop to check if charcaters at index i are sorted properly

        for (int i = 0; i < A[1].length(); i++) {
            for (int j = 0; j < A.length; j++) { // j refers to the words number or index
                if (j + 1 != A.length) { // check until last word

                    if (A[j].charAt(i) - A[j + 1].charAt(i) > 0) { // if the characters are sorted in the index properly then we will get negative number else positive
                        if (!myList.contains(i)) { // if the list does not contain the index
                            myList.add(i); // then add the index to the list
                        }
                    }
                }
            }
        }
        return myList; // return the index list
    }

    public static void main(String[] args) { // creating a main function
        String[] A = {"zyx","wvu","tsr"}; // creating a array of words
        List output = minDeletionSize(A); // get the list and store it in output

// for loop to print the index numbers
        System.out.print("{ ");
        for (int i = 0; i < output.size(); i++) {
            System.out.print(output.get(i)+" ");
        }
        System.out.print("}");
    }

}