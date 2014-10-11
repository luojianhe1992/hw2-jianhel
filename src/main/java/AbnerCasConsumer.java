import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import org.apache.uima.cas.CAS;
import org.apache.uima.cas.CASException;
import org.apache.uima.cas.FSIterator;
import org.apache.uima.collection.CasConsumer_ImplBase;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.tcas.Annotation;
import org.apache.uima.resource.ResourceProcessException;


public class AbnerCasConsumer extends CasConsumer_ImplBase {

  @Override
  public void processCas(CAS aCAS) throws ResourceProcessException {
    // TODO Auto-generated method stub

    
    
    
    JCas jcas;
    Evaluater evaluater = new Evaluater();
    String path = "./hw1-jianhel.out";
    try {
      jcas = aCAS.getJCas();
      
      
      //set evaluater's answer text
      String pathname = "./src/main/resources/data/sample.out"; //set answer file's path 
      evaluater.setAnswerText(pathname);
      
      FileWriter fw = new FileWriter(path,true);   
      BufferedWriter bw = new BufferedWriter(fw); 
      
      //use iterator
      FSIterator<Annotation> it = jcas.getAnnotationIndex(GeneTagTypeSystem.type).iterator();
      int total_ans = 0;
      while(it.hasNext())
      {
        /*
        jianhelTypeSystem j = (jianhelTypeSystem) it.next();
          bw.write(j.getFnTypeSystem1() + "|" + j.getFnTypeSystem2() + " " + j.getFnTypeSystem3() + 
                  "|" + j.getFnTypeSystem4());
        bw.newLine();
        evaluater.judgeAnswer(j.getFnTypeSystem4());
        total_ans++;
        */
        
        
        GeneTagTypeSystem gt = (GeneTagTypeSystem) it.next();
        
        bw.write(gt.getSentenceId()+"|"+gt.getGeneBegin()+" "+gt.getGeneEnd()+"|"+gt.getGeneName());
        
        bw.newLine();
        
        evaluater.judgeAnswer(gt.getGeneName());
        
        total_ans++;
        
      }
      
      bw.close();
      fw.close();
      evaluater.setAnswernum(total_ans);
      
    } catch (CASException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
    evaluater.printReport();
  
    

  
    
    
    
    
    
    
    
  }

}
