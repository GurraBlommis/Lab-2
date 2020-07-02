import javax.swing.*;

/** This program will first take two inputs, firstly a sentence and then a letter
 * The program will then show: number of letters in the sentence, the amount of the input letter
 * and also index placements of given input letter
 */

public class Javaclass1 {

    public static void main(String[] arg) {

        //The user gives an input, both a sentence and also a letter
        String sentence = JOptionPane.showInputDialog("Enter a sentence") ;
        String letter = JOptionPane.showInputDialog("Enter a letter") ;

        //Counts the instances of the given input letter
        int instances = 0 ;
        int place ;
        for (place = 0; place < sentence.length() ; place=place +1) {
            if (sentence.charAt(place) == letter.charAt(0))
                instances=instances+1 ;

        }

        // Identifies the first location of the input letter
        int first ;
        first = sentence.indexOf(letter);

        // Identifies the last location of the input letter
        int last ;
        last = sentence.lastIndexOf(letter) ;

        // Output that is depending if the instructions were followed or not
        if (sentence.length()!=0 && letter.length()>=1)
            if (instances<=1)
                JOptionPane.showMessageDialog(null, " The sentence has " + sentence.length() +" letters" + " \n The sign " + letter + " appears " + instances + " times" + "\n The first place of " + letter + " is at index number" + first + "\n The last place of " + letter + "is at index number  " + last);
            else
                JOptionPane.showMessageDialog(null, " The sentence has " + sentence.length() +" letters" + " \n The sign " + letter + " appears " + instances + " times" + "\n The first place of " + letter + " is at index number" + first + "\n The last place of " + letter + " is at index number " + last);

         else
             JOptionPane.showMessageDialog(null, "Please enter both a sentence and one letter");



    }
    }

