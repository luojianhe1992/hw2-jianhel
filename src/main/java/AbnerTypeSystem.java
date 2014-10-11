

/* First created by JCasGen Thu Oct 09 21:40:31 EDT 2014 */

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Thu Oct 09 21:40:31 EDT 2014
 * XML source: /home/jianhe/workspace/hw4-jianhel/src/main/java/resources/AbnerTypeSystemDescriptor.xml
 * @generated */
public class AbnerTypeSystem extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(AbnerTypeSystem.class);
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
  protected AbnerTypeSystem() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public AbnerTypeSystem(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public AbnerTypeSystem(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public AbnerTypeSystem(JCas jcas, int begin, int end) {
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
  //* Feature: GeneName

  /** getter for GeneName - gets 
   * @generated
   * @return value of the feature 
   */
  public String getGeneName() {
    if (AbnerTypeSystem_Type.featOkTst && ((AbnerTypeSystem_Type)jcasType).casFeat_GeneName == null)
      jcasType.jcas.throwFeatMissing("GeneName", "AbnerTypeSystem");
    return jcasType.ll_cas.ll_getStringValue(addr, ((AbnerTypeSystem_Type)jcasType).casFeatCode_GeneName);}
    
  /** setter for GeneName - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setGeneName(String v) {
    if (AbnerTypeSystem_Type.featOkTst && ((AbnerTypeSystem_Type)jcasType).casFeat_GeneName == null)
      jcasType.jcas.throwFeatMissing("GeneName", "AbnerTypeSystem");
    jcasType.ll_cas.ll_setStringValue(addr, ((AbnerTypeSystem_Type)jcasType).casFeatCode_GeneName, v);}    
   
    
  //*--------------*
  //* Feature: StartPoint

  /** getter for StartPoint - gets The start point of the gen
   * @generated
   * @return value of the feature 
   */
  public int getStartPoint() {
    if (AbnerTypeSystem_Type.featOkTst && ((AbnerTypeSystem_Type)jcasType).casFeat_StartPoint == null)
      jcasType.jcas.throwFeatMissing("StartPoint", "AbnerTypeSystem");
    return jcasType.ll_cas.ll_getIntValue(addr, ((AbnerTypeSystem_Type)jcasType).casFeatCode_StartPoint);}
    
  /** setter for StartPoint - sets The start point of the gen 
   * @generated
   * @param v value to set into the feature 
   */
  public void setStartPoint(int v) {
    if (AbnerTypeSystem_Type.featOkTst && ((AbnerTypeSystem_Type)jcasType).casFeat_StartPoint == null)
      jcasType.jcas.throwFeatMissing("StartPoint", "AbnerTypeSystem");
    jcasType.ll_cas.ll_setIntValue(addr, ((AbnerTypeSystem_Type)jcasType).casFeatCode_StartPoint, v);}    
   
    
  //*--------------*
  //* Feature: EndPoint

  /** getter for EndPoint - gets the end point of the gene
   * @generated
   * @return value of the feature 
   */
  public int getEndPoint() {
    if (AbnerTypeSystem_Type.featOkTst && ((AbnerTypeSystem_Type)jcasType).casFeat_EndPoint == null)
      jcasType.jcas.throwFeatMissing("EndPoint", "AbnerTypeSystem");
    return jcasType.ll_cas.ll_getIntValue(addr, ((AbnerTypeSystem_Type)jcasType).casFeatCode_EndPoint);}
    
  /** setter for EndPoint - sets the end point of the gene 
   * @generated
   * @param v value to set into the feature 
   */
  public void setEndPoint(int v) {
    if (AbnerTypeSystem_Type.featOkTst && ((AbnerTypeSystem_Type)jcasType).casFeat_EndPoint == null)
      jcasType.jcas.throwFeatMissing("EndPoint", "AbnerTypeSystem");
    jcasType.ll_cas.ll_setIntValue(addr, ((AbnerTypeSystem_Type)jcasType).casFeatCode_EndPoint, v);}    
  }

    