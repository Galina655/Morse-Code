
/**
 * CSC-223 CS2 Week #12 Binary Trees </br>
 * JF Chapter #19 Listing 19.6 - 19.9 </br>
 * DUE DATE:
 * DATE SUBMITTED:
 * PROGRAMMED BY: Galina Karabelova
 * DESCRIPTION: This program decodes a morse code into English text
 *
 */
 

package backpainanalyzer;
import jsjf.*;
import java.util.*;
import java.io.*;
/**
 *
 * @author Anita
 */
public class BackPainAnalyzer {

   /**
    * Dr. DoTell Intel diagnoses the cause of back pain
    *     * @param args the command line arguments
     */
   public static void main(String[] args) throws FileNotFoundException {
//       System.out.println(" Dr. DoTell Intel here to help. "
//               + "So, you are having back pain....");
//     DecisionTree expert = new DecisionTree("input.txt");
//      System.out.println(" This tree has " + expert.size() + " nodes\n"
//              + expert);
//      System.out.println("Here are the elements" + expert);
//            
//       expert.evaluate();


        MorseCodeTree morse = new MorseCodeTree();
        morse.translate();
     
    }

}
//S A M P L E   O U T P U T

//Please enter the morse code you'd like to be translated. 
//Separate each letter with space,each word with | and the end
//of the sentence with # > 
//.. |.-.. --- ...- . |.--. .-. --- --. .-. .- -- -- .. -. --. #
//I LOVE PROGRAMMING



//Please enter the morse code you'd like to be translated. 
//Separate each letter with space,each word with | and the end 
//of the sentence with # > 
//... --- ... #
//SOS


//Please enter the morse code you'd like to be translated. 
//Separate each letter with space,each word with | and the end 
//of the sentence with # > 
//.. ... |- .... .- - | -.-- --- ..- .-. | ..-. .. -. .- .-.. |
//.- -. ... .-- . .-. #
//IS THAT  YOUR  FINAL  ANSWER


