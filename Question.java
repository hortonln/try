/**
* This class print out a Questions.
* @author Jiun Kim, Angela Lopez, Lauren Horton
* @version 12.8.2020
*/

/**Declare instance variables*/

class Question{

public String question;
public String option1;
public String option2;
public String option3;
public String option4;
public static int correctAnswer;
public static int points; 


/**
* This is a counstructor
* @param
*/
Question(String theQuestion, String anOption1, String anOption2, String anOption3, String anOption4, int theCorrectAnswer, int thePoints) {
  question = theQuestion;
  option1 = anOption1;
  option2 = anOption2;
  option3 = anOption3;
  option4 = anOption4;
  correctAnswer = theCorrectAnswer;
  points = thePoints;
}

/**
* This method is an accessor method.
* This method returns a question to the user.
* @return getQuestion (The value input as a String).
*/

String getQuestion(){
  return question;
}
String getOption1(){
  return option1;
}

String getOption2(){
  return option2;
}

String getOption3(){
  return option3;
}
String getOption4(){
  return option4;
}

static int getCorrectAnswer(){
  return correctAnswer;
}

static int getPoints(){
  return points;
}








}