/*triviaQuestions.add(0, "What country has the largest waterfall in the world?");
triviaQuestions.add(1,"What is the Capital of Brazil?");
triviaQuestions.add(2,"What city has the most Spanish speakers in the United States?");
triviaQuestions.add(3,"What country does not have yellow in its flag?");
triviaQuestions.add(4,"Each country is an island except?");
triviaQuestions.add(5,"In how many countries is Spanish the official language?")*/
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Main {
 public static void main(String args[]) {
   SwingUtilities.invokeLater(new Runnable() {
     public void run() {
        new Game();
     }
   });
 }
} 

