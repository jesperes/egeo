/**
 */
package egeo.gpx;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Copyright Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 				Information about the copyright holder and any license governing use of this
 * 				file. By linking to an appropriate license,
 * 				you may place your data into the public domain or grant additional
 * 				usage rights.
 * 			
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link egeo.gpx.CopyrightType#getYear <em>Year</em>}</li>
 *   <li>{@link egeo.gpx.CopyrightType#getLicense <em>License</em>}</li>
 *   <li>{@link egeo.gpx.CopyrightType#getAuthor <em>Author</em>}</li>
 * </ul>
 * </p>
 *
 * @see egeo.gpx.GpxPackage#getCopyrightType()
 * @model extendedMetaData="name='copyrightType' kind='elementOnly'"
 * @generated
 */
public interface CopyrightType extends EObject {
	/**
	 * Returns the value of the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 						Year of copyright.
	 * 					
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Year</em>' attribute.
	 * @see #setYear(XMLGregorianCalendar)
	 * @see egeo.gpx.GpxPackage#getCopyrightType_Year()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.GYear"
	 *        extendedMetaData="kind='element' name='year'"
	 * @generated
	 */
	XMLGregorianCalendar getYear();

	/**
	 * Sets the value of the '{@link egeo.gpx.CopyrightType#getYear <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Year</em>' attribute.
	 * @see #getYear()
	 * @generated
	 */
	void setYear(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>License</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 						Link to external file containing license text.
	 * 					
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>License</em>' attribute.
	 * @see #setLicense(String)
	 * @see egeo.gpx.GpxPackage#getCopyrightType_License()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='element' name='license'"
	 * @generated
	 */
	String getLicense();

	/**
	 * Sets the value of the '{@link egeo.gpx.CopyrightType#getLicense <em>License</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>License</em>' attribute.
	 * @see #getLicense()
	 * @generated
	 */
	void setLicense(String value);

	/**
	 * Returns the value of the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 					Copyright holder (TopoSoft, Inc.)
	 * 				
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Author</em>' attribute.
	 * @see #setAuthor(String)
	 * @see egeo.gpx.GpxPackage#getCopyrightType_Author()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='author'"
	 * @generated
	 */
	String getAuthor();

	/**
	 * Sets the value of the '{@link egeo.gpx.CopyrightType#getAuthor <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author</em>' attribute.
	 * @see #getAuthor()
	 * @generated
	 */
	void setAuthor(String value);

} // CopyrightType
