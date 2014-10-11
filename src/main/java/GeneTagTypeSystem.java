

/* First created by JCasGen Fri Oct 10 16:54:04 EDT 2014 */

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Fri Oct 10 16:54:04 EDT 2014
 * XML source: /home/jianhe/workspace/hw4-jianhel/src/main/resources/GeneTagTypeSystemDescriptor.xml
 * @generated */
public class GeneTagTypeSystem extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(GeneTagTypeSystem.class);
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
  protected GeneTagTypeSystem() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public GeneTagTypeSystem(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public GeneTagTypeSystem(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public GeneTagTypeSystem(JCas jcas, int begin, int end) {
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
  //* Feature: SentenceId

  /** getter for SentenceId - gets 
   * @generated
   * @return value of the feature 
   */
  public String getSentenceId() {
    if (GeneTagTypeSystem_Type.featOkTst && ((GeneTagTypeSystem_Type)jcasType).casFeat_SentenceId == null)
      jcasType.jcas.throwFeatMissing("SentenceId", "GeneTagTypeSystem");
    return jcasType.ll_cas.ll_getStringValue(addr, ((GeneTagTypeSystem_Type)jcasType).casFeatCode_SentenceId);}
    
  /** setter for SentenceId - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setSentenceId(String v) {
    if (GeneTagTypeSystem_Type.featOkTst && ((GeneTagTypeSystem_Type)jcasType).casFeat_SentenceId == null)
      jcasType.jcas.throwFeatMissing("SentenceId", "GeneTagTypeSystem");
    jcasType.ll_cas.ll_setStringValue(addr, ((GeneTagTypeSystem_Type)jcasType).casFeatCode_SentenceId, v);}    
   
    
  //*--------------*
  //* Feature: GeneName

  /** getter for GeneName - gets 
   * @generated
   * @return value of the feature 
   */
  public String getGeneName() {
    if (GeneTagTypeSystem_Type.featOkTst && ((GeneTagTypeSystem_Type)jcasType).casFeat_GeneName == null)
      jcasType.jcas.throwFeatMissing("GeneName", "GeneTagTypeSystem");
    return jcasType.ll_cas.ll_getStringValue(addr, ((GeneTagTypeSystem_Type)jcasType).casFeatCode_GeneName);}
    
  /** setter for GeneName - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setGeneName(String v) {
    if (GeneTagTypeSystem_Type.featOkTst && ((GeneTagTypeSystem_Type)jcasType).casFeat_GeneName == null)
      jcasType.jcas.throwFeatMissing("GeneName", "GeneTagTypeSystem");
    jcasType.ll_cas.ll_setStringValue(addr, ((GeneTagTypeSystem_Type)jcasType).casFeatCode_GeneName, v);}    
   
    
  //*--------------*
  //* Feature: GeneBegin

  /** getter for GeneBegin - gets 
   * @generated
   * @return value of the feature 
   */
  public int getGeneBegin() {
    if (GeneTagTypeSystem_Type.featOkTst && ((GeneTagTypeSystem_Type)jcasType).casFeat_GeneBegin == null)
      jcasType.jcas.throwFeatMissing("GeneBegin", "GeneTagTypeSystem");
    return jcasType.ll_cas.ll_getIntValue(addr, ((GeneTagTypeSystem_Type)jcasType).casFeatCode_GeneBegin);}
    
  /** setter for GeneBegin - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setGeneBegin(int v) {
    if (GeneTagTypeSystem_Type.featOkTst && ((GeneTagTypeSystem_Type)jcasType).casFeat_GeneBegin == null)
      jcasType.jcas.throwFeatMissing("GeneBegin", "GeneTagTypeSystem");
    jcasType.ll_cas.ll_setIntValue(addr, ((GeneTagTypeSystem_Type)jcasType).casFeatCode_GeneBegin, v);}    
   
    
  //*--------------*
  //* Feature: GeneEnd

  /** getter for GeneEnd - gets 
   * @generated
   * @return value of the feature 
   */
  public String getGeneEnd() {
    if (GeneTagTypeSystem_Type.featOkTst && ((GeneTagTypeSystem_Type)jcasType).casFeat_GeneEnd == null)
      jcasType.jcas.throwFeatMissing("GeneEnd", "GeneTagTypeSystem");
    return jcasType.ll_cas.ll_getStringValue(addr, ((GeneTagTypeSystem_Type)jcasType).casFeatCode_GeneEnd);}
    
  /** setter for GeneEnd - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setGeneEnd(String v) {
    if (GeneTagTypeSystem_Type.featOkTst && ((GeneTagTypeSystem_Type)jcasType).casFeat_GeneEnd == null)
      jcasType.jcas.throwFeatMissing("GeneEnd", "GeneTagTypeSystem");
    jcasType.ll_cas.ll_setStringValue(addr, ((GeneTagTypeSystem_Type)jcasType).casFeatCode_GeneEnd, v);}    
  }

    