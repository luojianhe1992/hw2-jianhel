
/* First created by JCasGen Thu Oct 09 21:40:31 EDT 2014 */

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/** 
 * Updated by JCasGen Thu Oct 09 21:40:31 EDT 2014
 * @generated */
public class AbnerTypeSystem_Type extends Annotation_Type {
  /** @generated 
   * @return the generator for this type
   */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (AbnerTypeSystem_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = AbnerTypeSystem_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new AbnerTypeSystem(addr, AbnerTypeSystem_Type.this);
  			   AbnerTypeSystem_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new AbnerTypeSystem(addr, AbnerTypeSystem_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = AbnerTypeSystem.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("AbnerTypeSystem");
 
  /** @generated */
  final Feature casFeat_GeneName;
  /** @generated */
  final int     casFeatCode_GeneName;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getGeneName(int addr) {
        if (featOkTst && casFeat_GeneName == null)
      jcas.throwFeatMissing("GeneName", "AbnerTypeSystem");
    return ll_cas.ll_getStringValue(addr, casFeatCode_GeneName);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setGeneName(int addr, String v) {
        if (featOkTst && casFeat_GeneName == null)
      jcas.throwFeatMissing("GeneName", "AbnerTypeSystem");
    ll_cas.ll_setStringValue(addr, casFeatCode_GeneName, v);}
    
  
 
  /** @generated */
  final Feature casFeat_StartPoint;
  /** @generated */
  final int     casFeatCode_StartPoint;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getStartPoint(int addr) {
        if (featOkTst && casFeat_StartPoint == null)
      jcas.throwFeatMissing("StartPoint", "AbnerTypeSystem");
    return ll_cas.ll_getIntValue(addr, casFeatCode_StartPoint);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setStartPoint(int addr, int v) {
        if (featOkTst && casFeat_StartPoint == null)
      jcas.throwFeatMissing("StartPoint", "AbnerTypeSystem");
    ll_cas.ll_setIntValue(addr, casFeatCode_StartPoint, v);}
    
  
 
  /** @generated */
  final Feature casFeat_EndPoint;
  /** @generated */
  final int     casFeatCode_EndPoint;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getEndPoint(int addr) {
        if (featOkTst && casFeat_EndPoint == null)
      jcas.throwFeatMissing("EndPoint", "AbnerTypeSystem");
    return ll_cas.ll_getIntValue(addr, casFeatCode_EndPoint);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setEndPoint(int addr, int v) {
        if (featOkTst && casFeat_EndPoint == null)
      jcas.throwFeatMissing("EndPoint", "AbnerTypeSystem");
    ll_cas.ll_setIntValue(addr, casFeatCode_EndPoint, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public AbnerTypeSystem_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_GeneName = jcas.getRequiredFeatureDE(casType, "GeneName", "uima.cas.String", featOkTst);
    casFeatCode_GeneName  = (null == casFeat_GeneName) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_GeneName).getCode();

 
    casFeat_StartPoint = jcas.getRequiredFeatureDE(casType, "StartPoint", "uima.cas.Integer", featOkTst);
    casFeatCode_StartPoint  = (null == casFeat_StartPoint) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_StartPoint).getCode();

 
    casFeat_EndPoint = jcas.getRequiredFeatureDE(casType, "EndPoint", "uima.cas.Integer", featOkTst);
    casFeatCode_EndPoint  = (null == casFeat_EndPoint) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_EndPoint).getCode();

  }
}



    