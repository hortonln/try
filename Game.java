import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*; 
import java.util.ArrayList;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedWriter;


//thoughts:
//need a counter to sum up all the points
//radio buttons for the options
//3 labels? welcome label, directions label, correct/incorrect label

public class Game implements ActionListener{

JButton submit;
JButton nextButton;
JRadioButton jRadioButton1; 
JRadioButton jRadioButton2; 
JRadioButton jRadioButton3; 
JRadioButton jRadioButton4; 
JLabel welcome, prompt, response, totalScore;
ButtonGroup group;

//this is to keep track of the points
int score;

ArrayList <Question> triviaQuestions = new ArrayList<Question>();


//ArrayList<Question> triviaQuestions;
 



Game(){

score = 0; 

//ArrayList<Type> arrayListName = new ArrayList<Type>();
//ArrayList<String> restaurants = new ArrayList<String>(); 

////ArrayList <Question> triviaQuestions = new ArrayList<Question>();
String filename;
FileReader myFile;

filename = "trivia.txt";
String question = "", option1 = "", option2 = "", option3 = "", option4 = "", correctAnswer = "", points = "";
   

      try 
      {
        myFile = new FileReader(filename);
        BufferedReader reader = new BufferedReader(myFile);
     
           
       while (reader.ready()) 
        {
          question = reader.readLine();
          option1 = reader.readLine();
          option2 = reader.readLine();
          option3 = reader.readLine();
          option4 = reader.readLine();
          correctAnswer = reader.readLine();
          points = reader.readLine();
       
          System.out.println(question + "\n" + option1 + "\n" + option2 + "\n" + option3 + "\n"+ option4);
       
            Question theQuestion = new Question(question, option1, option2, option3, option4, Integer.parseInt(correctAnswer), Integer.parseInt(points)); 

            triviaQuestions.add(theQuestion);
            
       } 
       
       reader.close();
       } 

       catch (IOException exception) {
         System.out.println("An error occurred: " + exception);}

      

    FileWriter toWriteFile; 
    try
      { 
        toWriteFile = new FileWriter("score.txt"); 
        BufferedWriter output = new BufferedWriter(toWriteFile); 

        output.flush();
        output.close(); 
      } 
      catch (IOException excpt) 
      { 
        excpt.printStackTrace(); 
      }
      

JFrame frame = new JFrame("Spanish Trivia");
	frame.setLayout(new FlowLayout());
  frame.setSize(400, 350);

jRadioButton1 = new JRadioButton(option1);
jRadioButton2 = new JRadioButton(option2);
jRadioButton3 = new JRadioButton(option3);
jRadioButton4 = new JRadioButton(option4);

group = new ButtonGroup();
group.add(jRadioButton1);
group.add(jRadioButton2);
group.add(jRadioButton3);
group.add(jRadioButton4);

submit = new JButton("Submit Answer");
nextButton = new JButton("Continue");

submit.addActionListener(this);
nextButton.addActionListener(this);


welcome = new JLabel("Welcome to Spanish Trivia");
totalScore = new JLabel("Total Points: " + points);
prompt = new JLabel(question);
response = new JLabel("");

frame.add(welcome);
frame.add(totalScore);
frame.add(prompt);
frame.add(jRadioButton1);
frame.add(jRadioButton2);
frame.add(jRadioButton3);
frame.add(jRadioButton4);
frame.add(response);
frame.add(submit);
frame.add(nextButton);



frame.setVisible(true);
//frame.getContentPane().removeAll();
//frame.repaint();

}

void NextQuestion(){
  
  //triviaQuestions = new ArrayList<Question>();
  int i = 0;   
  
  if (i < triviaQuestions.size()) {
    i++;
	System.out.println(triviaQuestions.get(i));
  }

  else {
    
  }


}

public void actionPerformed(ActionEvent ae) 
{


  int option1 = 1;
  int option2 = 2;
  int option3 = 3;
  int option4 = 4;



  if(ae.getActionCommand().equals("Submit Answer"))
    {

      if (jRadioButton1.isSelected())
      {
       

        if (Question.getCorrectAnswer() == 1)
        {
          response.setText("Correct! You earned 5 points");
          score = score + Question.getPoints();
        }

        else 
        {
          response.setText("incorrect.");
        }
        
      }    
    
      else if (jRadioButton2.isSelected())
      {
        if (Question.getCorrectAnswer() == 2)
        {
          response.setText("Correct! You earned 5 points");
        }

        else 
        {
          response.setText("incorrect.");
        }   
      }

      else if(jRadioButton3.isSelected())
      {
        if (option3 == Question.getCorrectAnswer())
        {
          response.setText("Correct! You earned 5 points");
        }

        else 
        {
          response.setText("incorrect.");
        }  
      }
      else 
      {
      
        if (option4 == Question.correctAnswer)
        {
          response.setText("Correct! You earned 5 points");
          //score = score + Question.getPoints();
        }

        else 
        {
          response.setText("incorrect.");
        } 
      }

      totalScore.setText("Total Points: " + score);
    }


  else if (ae.getActionCommand().equals("Continue"))
  {

    group.clearSelection();
    //you want to make sure the next question appears
    //add new method - maybe repaint method    

    NextQuestion();

    //frame.setVisible(false);
    //frame.getContentPane().removeAll();


   } 

    
  
  else
  {
    response.setText("Please click submit or continue");
  }



}



}





 