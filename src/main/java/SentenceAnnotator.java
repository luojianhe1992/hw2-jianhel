

import org.apache.uima.analysis_component.JCasAnnotator_ImplBase;
import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.jcas.JCas;


public class SentenceAnnotator extends JCasAnnotator_ImplBase {

  @Override
  public void process(JCas aJCas) throws AnalysisEngineProcessException {
    // TODO Auto-generated method stub
    
    
    
    
    //
    System.out.println("&&&&&&&&&& the SentenceAnnotator.java begin to run &&&&&&&&&");
    
    
    JCas jcas = aJCas;
    
    //store the JCas with String and remove the space
    String text = jcas.getDocumentText().trim();
    
    //split the text with "\n"
    String contents[] = text.split("\\n");
    

    //
    System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^"+"content'length is:"+contents.length+"^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
  
    //
    for(int i = 0; i < contents.length; i++){
      //what if we do not know the length of ID
      //making things safer
      
      //remember the position of the space
      int space = contents[i].indexOf(" ");
      
      
      String sentenceId = contents[i].substring(0, space);
      String sentenceContent = contents[i].substring(space).trim();
      
     
      SentenceTypeSystem sen = new SentenceTypeSystem(jcas);
      
      
      //set the SentenceID, the SentenceContent, and add the SentenceTypeSystem to Indexes
      sen.setSentenceID(sentenceId);
      sen.setSentenceContent(sentenceContent);
      sen.addToIndexes();
      
      /*
      System.out.println("********************");
      System.out.println();
      System.out.println(sen.getSentenceID());
      System.out.println(sen.getSentenceContent());
      System.out.println();
      System.out.println("********************");
      */
    
    
    }
    
    
    System.out.println("&&&&&&&&&& the SentenceAnnotator.java has run &&&&&&&&&&");
    
  }
  
}

  
  
    
    
    

