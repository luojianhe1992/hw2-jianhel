import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.uima.cas.CAS;
import org.apache.uima.cas.CASException;
import org.apache.uima.collection.CollectionException;
import org.apache.uima.collection.CollectionReader_ImplBase;
import org.apache.uima.jcas.JCas;
import org.apache.uima.resource.ResourceConfigurationException;
import org.apache.uima.resource.ResourceInitializationException;
import org.apache.uima.util.FileUtils;
import org.apache.uima.util.Progress;
import org.apache.uima.util.ProgressImpl;


public class collectionReader extends CollectionReader_ImplBase {

  
  /*
  @Override
  public void getNext(CAS aCAS) throws IOException, CollectionException {
    // TODO Auto-generated method stub

  }

  @Override
  public boolean hasNext() throws IOException, CollectionException {
    // TODO Auto-generated method stub
    return false;
  }

  @Override
  public Progress[] getProgress() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public void close() throws IOException {
    // TODO Auto-generated method stub

  }
  */
  
  
  
  
  
  
  
  
  
  
  //use the String InputDirectory to store the directory of the input file
  public static final String PARAM_INPUTDIR = "InputDirectory";
  
  
  //use the ArrayList to store my input files
  private ArrayList<File> myFiles;

  
  //use the myCurrentIndex to store the file's current index
  private int myCurrentIndex;

  /**
   * @see org.apache.uima.collection.CollectionReader_ImplBase#initialize()
   */
  
  
  //the initialize function is to put the sample.in file into the system.
  public void initialize() throws ResourceInitializationException {
    
  File directory = new File(((String) getConfigParameterValue(PARAM_INPUTDIR)).trim());

    
    //    /home/jianhe/workspace/hw4-jianhel/src/main/resources/data/sample.in

    //    File directory = new File(((String) getConfigParameterValue(PARAM_INPUTDIR)).trim());
    
    myCurrentIndex = 0;

    // if input directory does not exist or is not a directory, throw exception
    
    
    /*
    if (!directory.exists() || !directory.isDirectory()) {
      throw new ResourceInitializationException(ResourceConfigurationException.DIRECTORY_NOT_FOUND,
              new Object[] { PARAM_INPUTDIR, this.getMetaData().getName(), directory.getPath() });
    }
    
    */

    // get list of files in the specified directory, and subdirectories if the
    // parameter PARAM_SUBDIR is set to True
    myFiles = new ArrayList<File>();
    
    //use the funciotn addFilesFromDir which define below to transfer the data
    addFilesFromDir(directory);
    
    
    
    System.out.println("&&&&&&&&&& the collectionReader.java has run &&&&&&&&&&");
    
    
  }
  
  /**
   * This method adds "hw1.in" file in the directory passed in as a parameter to myFiles.
   * 
   * @param dir
   */
  
  //define the function addFilesFromDir
  private void addFilesFromDir(File dir) {
    File[] files = dir.listFiles();
    for (int i = 0; i < files.length; i++) {
     
      //read the file name "sample.in"
      if(files[i].getName().equals("sample.in"))
      {
        
        //add the file into myFiles
        myFiles.add(files[i]);
        break;
      }
    }
  }

  /**
   * @see org.apache.uima.collection.CollectionReader#hasNext()
   */
  public boolean hasNext() {
    return myCurrentIndex < myFiles.size();
  }

  /**
   * @see org.apache.uima.collection.CollectionReader#getNext(org.apache.uima.cas.CAS)
   */
  public void getNext(CAS aCAS) throws IOException, CollectionException {
    JCas jcas;
    try {
      jcas = aCAS.getJCas();
    } catch (CASException e) {
      throw new CollectionException(e);
    }

    // open input stream to file
    File file = (File) myFiles.get(myCurrentIndex++);
    String text = FileUtils.file2String(file);
      // put document in CAS
    jcas.setDocumentText(text);

  }

  /**
   * @see org.apache.uima.collection.base_cpm.BaseCollectionReader#close()
   */
  public void close() throws IOException {
  }

  /**
   * @see org.apache.uima.collection.base_cpm.BaseCollectionReader#getProgress()
   */
  

  public Progress[] getProgress() {
    return new Progress[] { new ProgressImpl(myCurrentIndex, myFiles.size(), Progress.ENTITIES) };
  }
  
  
  
  
  

}
