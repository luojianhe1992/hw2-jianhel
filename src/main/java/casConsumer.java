

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import org.apache.uima.cas.CAS;
import org.apache.uima.cas.CASException;
import org.apache.uima.cas.FSIterator;
import org.apache.uima.collection.CasConsumer_ImplBase;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.tcas.Annotation;
import org.apache.uima.resource.ResourceProcessException;






public class casConsumer extends CasConsumer_ImplBase {

  @Override
  public void processCas(CAS aCAS) throws ResourceProcessException {
    // TODO Auto-generated method stub
    
    //
    System.out.println("&&&&&&&&&& the casConsumer.java begins to run &&&&&&&&&&");
    
    
    
    JCas jcas;
    
    //define the class evaluator
    Evaluater evaluater = new Evaluater();
    
    //define the output file's directory
    String path = "./hw1-jianhel.out";
    try {
      jcas = aCAS.getJCas();
      
      
      //set evaluater's answer text's directory
      String pathname = "./src/main/resources/data/sample.out"; //set answer file's path 
      
      //invoke the function to set the answer text's directory
      evaluater.setAnswerText(pathname);
      
      //use the FileWriter and BufferedWriter to output the result
      FileWriter fw = new FileWriter(path,true);   
      BufferedWriter bw = new BufferedWriter(fw); 
      
      //use the iterator 
      FSIterator<Annotation> it = jcas.getAnnotationIndex(jianhelTypeSystem.type).iterator();
      
      //define the variant total_ans to store the total number of the answer
      int total_ans = 0;
      
      //use the iterator to iterate to consume all the result
      while(it.hasNext())
      {
        
        
        jianhelTypeSystem j = (jianhelTypeSystem) it.next();
        
        //use the bufferwriter to store the sentenceId, start point and end point of the gene, and the gene name
        bw.write(j.getFnTypeSystem1() + "|" + j.getFnTypeSystem2() + " " + j.getFnTypeSystem3() + 
                  "|" + j.getFnTypeSystem4());
        bw.newLine();
        
        //invoke the judgeAnswer function to judge if the gene annotated by the annotator is right or false
        evaluater.judgeAnswer(j.getFnTypeSystem4());
        total_ans++;
      }
      
      //close the bufferwriter and filewriter
      bw.close();
      fw.close();
      
      evaluater.setAnswernum(total_ans);
      
    } catch (CASException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
    
    //invoke the function of printReport in evaluator class
    evaluater.printReport();
  
    
    System.out.println("&&&&&&&&&& the casConsumer.java has run &&&&&&&&&&");
    

  }

}
