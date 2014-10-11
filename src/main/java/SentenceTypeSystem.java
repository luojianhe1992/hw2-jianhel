

/* First created by JCasGen Thu Oct 09 22:33:46 EDT 2014 */

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Fri Oct 10 00:42:39 EDT 2014
 * XML source: /home/jianhe/workspace/hw4-jianhel/src/main/resources/SentenceTypeSystemDescriptor.xml
 * @generated */
public class SentenceTypeSystem extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(SentenceTypeSystem.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated
   * @return index of the type  
   */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected SentenceTypeSystem() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public SentenceTypeSystem(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public SentenceTypeSystem(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public SentenceTypeSystem(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** 
   * <!-- begin-user-doc -->
   * Write your own initialization here
   * <!-- end-user-doc -->
   *
   * @generated modifiable 
   */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: SentenceID

  /** getter for SentenceID - gets 
   * @generated
   * @return value of the feature 
   */
  public String getSentenceID() {
    if (SentenceTypeSystem_Type.featOkTst && ((SentenceTypeSystem_Type)jcasType).casFeat_SentenceID == null)
      jcasType.jcas.throwFeatMissing("SentenceID", "SentenceTypeSystem");
    return jcasType.ll_cas.ll_getStringValue(addr, ((SentenceTypeSystem_Type)jcasType).casFeatCode_SentenceID);}
    
  /** setter for SentenceID - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setSentenceID(String v) {
    if (SentenceTypeSystem_Type.featOkTst && ((SentenceTypeSystem_Type)jcasType).casFeat_SentenceID == null)
      jcasType.jcas.throwFeatMissing("SentenceID", "SentenceTypeSystem");
    jcasType.ll_cas.ll_setStringValue(addr, ((SentenceTypeSystem_Type)jcasType).casFeatCode_SentenceID, v);}    
   
    
  //*--------------*
  //* Feature: SentenceContent

  /** getter for SentenceContent - gets 
   * @generated
   * @return value of the feature 
   */
  public String getSentenceContent() {
    if (SentenceTypeSystem_Type.featOkTst && ((SentenceTypeSystem_Type)jcasType).casFeat_SentenceContent == null)
      jcasType.jcas.throwFeatMissing("SentenceContent", "SentenceTypeSystem");
    return jcasType.ll_cas.ll_getStringValue(addr, ((SentenceTypeSystem_Type)jcasType).casFeatCode_SentenceContent);}
    
  /** setter for SentenceContent - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setSentenceContent(String v) {
    if (SentenceTypeSystem_Type.featOkTst && ((SentenceTypeSystem_Type)jcasType).casFeat_SentenceContent == null)
      jcasType.jcas.throwFeatMissing("SentenceContent", "SentenceTypeSystem");
    jcasType.ll_cas.ll_setStringValue(addr, ((SentenceTypeSystem_Type)jcasType).casFeatCode_SentenceContent, v);}    
  }

    