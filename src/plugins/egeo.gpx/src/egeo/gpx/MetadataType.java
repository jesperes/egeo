/**
 */
package egeo.gpx;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Metadata Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 				Information about the GPX file, author, and copyright restrictions goes in the
 * 				metadata section. Providing rich,
 * 				meaningful information about your GPX files allows others to search for and
 * 				use your GPS data.
 * 			
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link egeo.gpx.MetadataType#getName <em>Name</em>}</li>
 *   <li>{@link egeo.gpx.MetadataType#getDesc <em>Desc</em>}</li>
 *   <li>{@link egeo.gpx.MetadataType#getAuthor <em>Author</em>}</li>
 *   <li>{@link egeo.gpx.MetadataType#getCopyright <em>Copyright</em>}</li>
 *   <li>{@link egeo.gpx.MetadataType#getLink <em>Link</em>}</li>
 *   <li>{@link egeo.gpx.MetadataType#getTime <em>Time</em>}</li>
 *   <li>{@link egeo.gpx.MetadataType#getKeywords <em>Keywords</em>}</li>
 *   <li>{@link egeo.gpx.MetadataType#getBounds <em>Bounds</em>}</li>
 *   <li>{@link egeo.gpx.MetadataType#getExtensions <em>Extensions</em>}</li>
 * </ul>
 * </p>
 *
 * @see egeo.gpx.GpxPackage#getMetadataType()
 * @model extendedMetaData="name='metadataType' kind='elementOnly'"
 * @generated
 */
public interface MetadataType extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 						The name of the GPX file.
	 * 					
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see egeo.gpx.GpxPackage#getMetadataType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link egeo.gpx.MetadataType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 						A description of the contents of the GPX file.
	 * 					
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Desc</em>' attribute.
	 * @see #setDesc(String)
	 * @see egeo.gpx.GpxPackage#getMetadataType_Desc()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='desc'"
	 * @generated
	 */
	String getDesc();

	/**
	 * Sets the value of the '{@link egeo.gpx.MetadataType#getDesc <em>Desc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Desc</em>' attribute.
	 * @see #getDesc()
	 * @generated
	 */
	void setDesc(String value);

	/**
	 * Returns the value of the '<em><b>Author</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 						The person or organization who created the GPX file.
	 * 					
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Author</em>' containment reference.
	 * @see #setAuthor(PersonType)
	 * @see egeo.gpx.GpxPackage#getMetadataType_Author()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='author'"
	 * @generated
	 */
	PersonType getAuthor();

	/**
	 * Sets the value of the '{@link egeo.gpx.MetadataType#getAuthor <em>Author</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author</em>' containment reference.
	 * @see #getAuthor()
	 * @generated
	 */
	void setAuthor(PersonType value);

	/**
	 * Returns the value of the '<em><b>Copyright</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 						Copyright and license information governing use of the file.
	 * 					
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Copyright</em>' containment reference.
	 * @see #setCopyright(CopyrightType)
	 * @see egeo.gpx.GpxPackage#getMetadataType_Copyright()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='copyright'"
	 * @generated
	 */
	CopyrightType getCopyright();

	/**
	 * Sets the value of the '{@link egeo.gpx.MetadataType#getCopyright <em>Copyright</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Copyright</em>' containment reference.
	 * @see #getCopyright()
	 * @generated
	 */
	void setCopyright(CopyrightType value);

	/**
	 * Returns the value of the '<em><b>Link</b></em>' containment reference list.
	 * The list contents are of type {@link egeo.gpx.LinkType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 						URLs associated with the location described in the file.
	 * 					
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Link</em>' containment reference list.
	 * @see egeo.gpx.GpxPackage#getMetadataType_Link()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='link'"
	 * @generated
	 */
	EList<LinkType> getLink();

	/**
	 * Returns the value of the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 						The creation date of the file.
	 * 					
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Time</em>' attribute.
	 * @see #setTime(XMLGregorianCalendar)
	 * @see egeo.gpx.GpxPackage#getMetadataType_Time()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='element' name='time'"
	 * @generated
	 */
	XMLGregorianCalendar getTime();

	/**
	 * Sets the value of the '{@link egeo.gpx.MetadataType#getTime <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time</em>' attribute.
	 * @see #getTime()
	 * @generated
	 */
	void setTime(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Keywords</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 						Keywords associated with the file. Search engines or databases can use
	 * 						this information to classify the data.
	 * 					
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Keywords</em>' attribute.
	 * @see #setKeywords(String)
	 * @see egeo.gpx.GpxPackage#getMetadataType_Keywords()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='keywords'"
	 * @generated
	 */
	String getKeywords();

	/**
	 * Sets the value of the '{@link egeo.gpx.MetadataType#getKeywords <em>Keywords</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Keywords</em>' attribute.
	 * @see #getKeywords()
	 * @generated
	 */
	void setKeywords(String value);

	/**
	 * Returns the value of the '<em><b>Bounds</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 						Minimum and maximum coordinates which describe the extent of the
	 * 						coordinates in the file.
	 * 					
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bounds</em>' containment reference.
	 * @see #setBounds(BoundsType)
	 * @see egeo.gpx.GpxPackage#getMetadataType_Bounds()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='bounds'"
	 * @generated
	 */
	BoundsType getBounds();

	/**
	 * Sets the value of the '{@link egeo.gpx.MetadataType#getBounds <em>Bounds</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bounds</em>' containment reference.
	 * @see #getBounds()
	 * @generated
	 */
	void setBounds(BoundsType value);

	/**
	 * Returns the value of the '<em><b>Extensions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 						You can add extend GPX by adding your own elements from another
	 * 						schema here.
	 * 					
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Extensions</em>' containment reference.
	 * @see #setExtensions(ExtensionsType)
	 * @see egeo.gpx.GpxPackage#getMetadataType_Extensions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='extensions'"
	 * @generated
	 */
	ExtensionsType getExtensions();

	/**
	 * Sets the value of the '{@link egeo.gpx.MetadataType#getExtensions <em>Extensions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extensions</em>' containment reference.
	 * @see #getExtensions()
	 * @generated
	 */
	void setExtensions(ExtensionsType value);

} // MetadataType
