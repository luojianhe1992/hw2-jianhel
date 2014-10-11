
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * This class can be used to calculate different methods' precision, recall, and FScore.
 * @author jianhel
 *
 */
public class Evaluater {
  
    /*
     * define the variants
     * correct_num is to store the number of correct answer
     * answer_num is to store the number of the answer
     * suppose_num is to store the number of answer in the file sample.out
     * 
     */
    private int correct_num = 0;
    private int answer_num = 0;
    private int supposed_num = 0;
    private String AnswerText = "";
    
    
    //the function is to set the path of the answer file
    public void setAnswerText(String pathname) throws IOException
    {
      File filename = new File(pathname);
      InputStreamReader reader = new InputStreamReader(new FileInputStream(filename)); 
      BufferedReader br = new BufferedReader(reader); 
      StringBuffer sb = new StringBuffer();
      String line = "";  
      line = br.readLine();  
      while (line != null) {  
          line = br.readLine(); //one line each time
          sb.append(line);
          supposed_num++;
      }
      br.close();
      reader.close();
      
      
      //use the AnswerText to store the whole text of the file sample.out
      AnswerText = sb.toString();
    }
    
    
    //the function is to calculate the precision of the whole process
    public double getPrecision()
    {
      return (double)correct_num / answer_num;
    }
    
    //the function is to calculate the recall of the whole process
    public double getRecall()
    {
      return (double)correct_num / supposed_num;
    }
    
    
    //compare the String ans with sample.out file to decide if the ans is right or false
    public void judgeAnswer(String ans)
    {
      if(AnswerText == "") return;
      if(AnswerText.contains(ans))
      {
        correct_num++;
      }
    }
    
    public void setAnswernum(int num)
    {
      answer_num = num;
    }

   
    //the function is to calculate the F-score of the whole process
    public double getfScore()
    {
      double precision = getPrecision();
      double recall = getRecall();
      return 2.0*precision*recall / (precision + recall);
    }
    
    //the function is to print out the report
    public void printReport()
    {
      System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
      
      System.out.println("Correct Num:" + correct_num);
      System.out.println("Total Returned Answer:" + answer_num);
      System.out.println("Supposed Answer Num:" + supposed_num);
      System.out.println("Precision:" + getPrecision());
      System.out.println("Recall:" + getRecall());
      System.out.println("F-socre:" + getfScore());
      
      System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
    }
}