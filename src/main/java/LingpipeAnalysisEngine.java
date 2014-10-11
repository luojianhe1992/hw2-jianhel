

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.uima.UimaContext;
import org.apache.uima.analysis_component.JCasAnnotator_ImplBase;
import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.jcas.JCas;
import org.apache.uima.resource.ResourceInitializationException;

import com.aliasi.chunk.Chunk;
import com.aliasi.chunk.Chunker;
import com.aliasi.chunk.Chunking;
import com.aliasi.util.AbstractExternalizable;


public class LingpipeAnalysisEngine extends JCasAnnotator_ImplBase {

  static final String PARAM_INPUTDIR = "modlefile"; 
  Chunker chunker = null;

  @Override
  public void initialize(UimaContext aContext) throws ResourceInitializationException {
    super.initialize(aContext);
    
    Object model_path = aContext.getConfigParameterValue(PARAM_INPUTDIR);
  
    try {
      chunker = (Chunker) AbstractExternalizable.readResourceObject((String) model_path);
    } catch (IOException e1) {
      e1.printStackTrace();
    } catch (ClassNotFoundException e1) {
      e1.printStackTrace();
    }
    
  }
  
  @Override
  public void process(JCas aJCas) throws AnalysisEngineProcessException {
    // TODO Auto-generated method stub

    //using the lingpiep method
    
    
    
    System.out.println("&&&&&&&&&& the LingpipeAnalysisEngine.java begins to run &&&&&&&&&&");
    
    
    String text = aJCas.getDocumentText();
    int begin = 0; 
    int end = 0;
    
    //lingpipe solution
    
    //File modelFile = new File("./src/main/resources/model/ne-en-bio-genetag.HmmChunker");
    
    
     
    Pattern pattern = Pattern.compile("\n");
    Matcher matcher = pattern.matcher(text);
    while ( matcher.find() ) {
      end = matcher.start();
      String wholeSentence = text.substring(begin , end);
      String[] idAndContent = wholeSentence.split(" " , 2);
      Chunking chunking = chunker.chunk(idAndContent[1]);
      Iterator<Chunk> it = chunking.chunkSet().iterator();
      while(it.hasNext())
      {
        Chunk c = it.next();
        int offset = 0;
        int inneroffset = 0;
        //System.out.println(fields[1]);
        for(int i=0; i<c.start(); i++)
        {
          if(idAndContent[1].charAt(i) == ' ') 
            offset++;
        }
        for(int i=c.start(); i<c.end(); i++)
        {
          if(idAndContent[1].charAt(i) == ' ') 
            inneroffset++;
        }
        
        jianhelTypeSystem j = new jianhelTypeSystem(aJCas);
        j.setFnTypeSystem1(idAndContent[0]);
        j.setFnTypeSystem4(idAndContent[1].substring(c.start(), c.end()));
        j.setFnTypeSystem2(c.start()-offset);
        j.setFnTypeSystem3(c.end()-offset-inneroffset-1);
        j.addToIndexes();
        
        System.out.println("the answer is: "+j.getFnTypeSystem1()+"|"+j.getFnTypeSystem2()+" "+j.getFnTypeSystem3()+"|"+j.getFnTypeSystem4());
        
      }
      
      begin = matcher.end();
    }
   
    System.out.println("&&&&&&&&&& the LingpipeAnalysisEngine.java has run &&&&&&&&&&");
    
  }

}
