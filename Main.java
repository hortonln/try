/**
* This class is the Main java. This program is a model for GUI for Spanish Trivia Question
* @author Jiun Kim, Angela Lopez, Lauren Horton
* @version 12.8.2020
*/
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

