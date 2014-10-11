
/* First created by JCasGen Fri Oct 10 16:54:04 EDT 2014 */

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
 * Updated by JCasGen Fri Oct 10 16:54:04 EDT 2014
 * @generated */
public class GeneTagTypeSystem_Type extends Annotation_Type {
  /** @generated 
   * @return the generator for this type
   */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (GeneTagTypeSystem_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = GeneTagTypeSystem_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new GeneTagTypeSystem(addr, GeneTagTypeSystem_Type.this);
  			   GeneTagTypeSystem_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new GeneTagTypeSystem(addr, GeneTagTypeSystem_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = GeneTagTypeSystem.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("GeneTagTypeSystem");
 
  /** @generated */
  final Feature casFeat_SentenceId;
  /** @generated */
  final int     casFeatCode_SentenceId;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getSentenceId(int addr) {
        if (featOkTst && casFeat_SentenceId == null)
      jcas.throwFeatMissing("SentenceId", "GeneTagTypeSystem");
    return ll_cas.ll_getStringValue(addr, casFeatCode_SentenceId);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setSentenceId(int addr, String v) {
        if (featOkTst && casFeat_SentenceId == null)
      jcas.throwFeatMissing("SentenceId", "GeneTagTypeSystem");
    ll_cas.ll_setStringValue(addr, casFeatCode_SentenceId, v);}
    
  
 
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
      jcas.throwFeatMissing("GeneName", "GeneTagTypeSystem");
    return ll_cas.ll_getStringValue(addr, casFeatCode_GeneName);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setGeneName(int addr, String v) {
        if (featOkTst && casFeat_GeneName == null)
      jcas.throwFeatMissing("GeneName", "GeneTagTypeSystem");
    ll_cas.ll_setStringValue(addr, casFeatCode_GeneName, v);}
    
  
 
  /** @generated */
  final Feature casFeat_GeneBegin;
  /** @generated */
  final int     casFeatCode_GeneBegin;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getGeneBegin(int addr) {
        if (featOkTst && casFeat_GeneBegin == null)
      jcas.throwFeatMissing("GeneBegin", "GeneTagTypeSystem");
    return ll_cas.ll_getIntValue(addr, casFeatCode_GeneBegin);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setGeneBegin(int addr, int v) {
        if (featOkTst && casFeat_GeneBegin == null)
      jcas.throwFeatMissing("GeneBegin", "GeneTagTypeSystem");
    ll_cas.ll_setIntValue(addr, casFeatCode_GeneBegin, v);}
    
  
 
  /** @generated */
  final Feature casFeat_GeneEnd;
  /** @generated */
  final int     casFeatCode_GeneEnd;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getGeneEnd(int addr) {
        if (featOkTst && casFeat_GeneEnd == null)
      jcas.throwFeatMissing("GeneEnd", "GeneTagTypeSystem");
    return ll_cas.ll_getStringValue(addr, casFeatCode_GeneEnd);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setGeneEnd(int addr, String v) {
        if (featOkTst && casFeat_GeneEnd == null)
      jcas.throwFeatMissing("GeneEnd", "GeneTagTypeSystem");
    ll_cas.ll_setStringValue(addr, casFeatCode_GeneEnd, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public GeneTagTypeSystem_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_SentenceId = jcas.getRequiredFeatureDE(casType, "SentenceId", "uima.cas.String", featOkTst);
    casFeatCode_SentenceId  = (null == casFeat_SentenceId) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_SentenceId).getCode();

 
    casFeat_GeneName = jcas.getRequiredFeatureDE(casType, "GeneName", "uima.cas.String", featOkTst);
    casFeatCode_GeneName  = (null == casFeat_GeneName) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_GeneName).getCode();

 
    casFeat_GeneBegin = jcas.getRequiredFeatureDE(casType, "GeneBegin", "uima.cas.Integer", featOkTst);
    casFeatCode_GeneBegin  = (null == casFeat_GeneBegin) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_GeneBegin).getCode();

 
    casFeat_GeneEnd = jcas.getRequiredFeatureDE(casType, "GeneEnd", "uima.cas.String", featOkTst);
    casFeatCode_GeneEnd  = (null == casFeat_GeneEnd) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_GeneEnd).getCode();

  }
}



    