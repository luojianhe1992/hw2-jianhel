

import org.apache.uima.analysis_component.JCasAnnotator_ImplBase;
import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.cas.FSIterator;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.tcas.Annotation;

import abner.Tagger;


public class AbnerAnalysisEngine extends JCasAnnotator_ImplBase {

  @Override
  public void process(JCas aJCas) throws AnalysisEngineProcessException {
    // TODO Auto-generated method stub
    
    //
    
    
      
    //
    System.out.println("&&&&&&&&&& the AbnerAnalysisEngine.java begins to run &&&&&&&&&&");
    
    
    JCas jcas = aJCas;
    
    //use the iterator to iterate to get the all sentence ID and sentenceContent from the JCas
    FSIterator<Annotation> it = jcas.getAnnotationIndex(SentenceTypeSystem.type).iterator();
    
    //use the class from the Abner, Tagger to annotate the genes from the JCas
    Tagger t = new Tagger();
    
    /*
     * define several variants
     * the begin is to store the start position of the genes
     * the end is to store the end position of the genes
     * the count is to store the number of genes 
     */
    int begin;
    int end;
    int count = 0;
    
    //use the iterator to get the sentenceId and sentenceContent from the JCas
    while(it.hasNext()){
          SentenceTypeSystem ann = (SentenceTypeSystem)it.get();  
          String senContent = ann.getSentenceContent();
          String senId = ann.getSentenceID();
          count++;
      
          //invoke the function of tokenize from abner
          t.tokenize(senContent);

     
          //define the String[][] to store, and use the function getEntities from abner
          String[][] ents = t.getEntities(senContent);
          String gene;
          
        
          for (int i = 0; i < ents[0].length; i++) {
            
          gene = ents[0][i]; 
            
          begin = senContent.indexOf(gene);
            
          end = begin + gene.length();
         
            
          if(begin != -1){
            
            begin = begin - countBlank(senContent.substring(0,begin)) ;
            end = begin + gene.length() - countBlank(gene) - 1;
            jianhelTypeSystem j = new jianhelTypeSystem (aJCas);  
            j.setFnTypeSystem1(senId);  
            j.setFnTypeSystem4(gene); 
            j.setFnTypeSystem2(begin);
            j.setFnTypeSystem3(end);
            j.addToIndexes();         
            System.out.println("the answer is: "+j.getFnTypeSystem1()+"|"+j.getFnTypeSystem2()+" "+j.getFnTypeSystem3()+"|"+j.getFnTypeSystem4());      
          }   
        } 
        it.next();      
    }
    System.out.println("&&&&&&&&&& the AbnerAnalysisEngine.java has run &&&&&&&&&&"); 
  }

  //the function is defined to count the number of blank in the sentence
  private int countBlank(String s){
    int count = 0;
    for(int i = 0; i < s.length(); i++) {
        if(Character.isWhitespace(s.charAt(i))) {
             count++;
          }
       }
     return count;
  
  }
}
    
      
    
    
    

    
    
    
    


