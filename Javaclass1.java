import javax.swing.*;

/** This program will first take two inputs, firstly a sentence and then a letter
 * The program will then show: number of letters in the sentence, the amount of the input letter
 * and also index placements of given input letter
 *
 * @author Gustav Blomdahl
 * @since 2020-07-05
 */

public class Javaclass1 {

    public static void main(String[] arg) {

        //The user gives an input, both a sentence and also a letter
        String sentence = JOptionPane.showInputDialog("Enter a sentence") ;
        String letter = JOptionPane.showInputDialog("Enter a letter") ;

        //If the user doesn´t give a letter that occurs within the input sentence, a message will appear
        if (sentence.indexOf(letter) < 0)
            JOptionPane.showMessageDialog(null, "Enter a sentence and one letter within that sentence" + "\nPlease try again!");
        else

        //Counts the occurrences of the given input letter
        try{
        int occurrences = 0 ;
        int place ;
        for (place = 0; place < sentence.length() ; place=place +1) {
            if (sentence.charAt(place) == letter.charAt(0))
                occurrences=occurrences+1 ;

        }

        // Identifies the first location of the input letter
        int first ;
        first = sentence.indexOf(letter);

        // Identifies the last location of the input letter
        int last ;
        last = sentence.lastIndexOf(letter) ;

        // Output that is depending if the instructions were followed or not
        if (sentence.length() > 1 && letter.length() > 0)
            if (occurrences<=1)
                JOptionPane.showMessageDialog(null, " The sentence has " + sentence.length() +" letters" + " \n The sign " + letter + " appears " + occurrences + " time" + "\n The first place of " + letter + " is at index number" + first + "\n The last place of " + letter + "is at index number  " + last);
            else
                JOptionPane.showMessageDialog(null, " The sentence has " + sentence.length() +" letters" + " \n The sign " + letter + " appears " + occurrences + " times" + "\n The first place of " + letter + " is at index number" + first + "\n The last place of " + letter + " is at index number " + last);

            else
             JOptionPane.showMessageDialog(null, "Please enter both a sentence and one letter");
            }
        catch(StringIndexOutOfBoundsException Exception) {
            JOptionPane.showMessageDialog(null, "Please enter both a sentence and a letter");

        }
    }
}


