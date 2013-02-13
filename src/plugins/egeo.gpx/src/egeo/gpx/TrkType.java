/**
 */
package egeo.gpx;

import java.math.BigInteger;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trk Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 				trk represents a track - an ordered list of points describing a path.
 * 			
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link egeo.gpx.TrkType#getName <em>Name</em>}</li>
 *   <li>{@link egeo.gpx.TrkType#getCmt <em>Cmt</em>}</li>
 *   <li>{@link egeo.gpx.TrkType#getDesc <em>Desc</em>}</li>
 *   <li>{@link egeo.gpx.TrkType#getSrc <em>Src</em>}</li>
 *   <li>{@link egeo.gpx.TrkType#getLink <em>Link</em>}</li>
 *   <li>{@link egeo.gpx.TrkType#getNumber <em>Number</em>}</li>
 *   <li>{@link egeo.gpx.TrkType#getType <em>Type</em>}</li>
 *   <li>{@link egeo.gpx.TrkType#getExtensions <em>Extensions</em>}</li>
 *   <li>{@link egeo.gpx.TrkType#getTrkseg <em>Trkseg</em>}</li>
 * </ul>
 * </p>
 *
 * @see egeo.gpx.GpxPackage#getTrkType()
 * @model extendedMetaData="name='trkType' kind='elementOnly'"
 * @generated
 */
public interface TrkType extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 						GPS name of track.
	 * 					
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see egeo.gpx.GpxPackage#getTrkType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link egeo.gpx.TrkType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Cmt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 						GPS comment for track.
	 * 					
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cmt</em>' attribute.
	 * @see #setCmt(String)
	 * @see egeo.gpx.GpxPackage#getTrkType_Cmt()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='cmt'"
	 * @generated
	 */
	String getCmt();

	/**
	 * Sets the value of the '{@link egeo.gpx.TrkType#getCmt <em>Cmt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cmt</em>' attribute.
	 * @see #getCmt()
	 * @generated
	 */
	void setCmt(String value);

	/**
	 * Returns the value of the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 						User description of track.
	 * 					
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Desc</em>' attribute.
	 * @see #setDesc(String)
	 * @see egeo.gpx.GpxPackage#getTrkType_Desc()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='desc'"
	 * @generated
	 */
	String getDesc();

	/**
	 * Sets the value of the '{@link egeo.gpx.TrkType#getDesc <em>Desc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Desc</em>' attribute.
	 * @see #getDesc()
	 * @generated
	 */
	void setDesc(String value);

	/**
	 * Returns the value of the '<em><b>Src</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 						Source of data. Included to give user some idea of reliability and
	 * 						accuracy of data.
	 * 					
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Src</em>' attribute.
	 * @see #setSrc(String)
	 * @see egeo.gpx.GpxPackage#getTrkType_Src()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='src'"
	 * @generated
	 */
	String getSrc();

	/**
	 * Sets the value of the '{@link egeo.gpx.TrkType#getSrc <em>Src</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Src</em>' attribute.
	 * @see #getSrc()
	 * @generated
	 */
	void setSrc(String value);

	/**
	 * Returns the value of the '<em><b>Link</b></em>' containment reference list.
	 * The list contents are of type {@link egeo.gpx.LinkType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 						Links to external information about track.
	 * 					
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Link</em>' containment reference list.
	 * @see egeo.gpx.GpxPackage#getTrkType_Link()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='link'"
	 * @generated
	 */
	EList<LinkType> getLink();

	/**
	 * Returns the value of the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 						GPS track number.
	 * 					
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Number</em>' attribute.
	 * @see #setNumber(BigInteger)
	 * @see egeo.gpx.GpxPackage#getTrkType_Number()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NonNegativeInteger"
	 *        extendedMetaData="kind='element' name='number'"
	 * @generated
	 */
	BigInteger getNumber();

	/**
	 * Sets the value of the '{@link egeo.gpx.TrkType#getNumber <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number</em>' attribute.
	 * @see #getNumber()
	 * @generated
	 */
	void setNumber(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 						Type (classification) of track.
	 * 					
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see egeo.gpx.GpxPackage#getTrkType_Type()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='type'"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link egeo.gpx.TrkType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

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
	 * @see egeo.gpx.GpxPackage#getTrkType_Extensions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='extensions'"
	 * @generated
	 */
	ExtensionsType getExtensions();

	/**
	 * Sets the value of the '{@link egeo.gpx.TrkType#getExtensions <em>Extensions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extensions</em>' containment reference.
	 * @see #getExtensions()
	 * @generated
	 */
	void setExtensions(ExtensionsType value);

	/**
	 * Returns the value of the '<em><b>Trkseg</b></em>' containment reference list.
	 * The list contents are of type {@link egeo.gpx.TrksegType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 						A Track Segment holds a list of Track Points which are logically
	 * 						connected in order. To represent a single GPS track where GPS
	 * 						reception was lost, or the GPS receiver was turned off, start a
	 * 						new Track Segment for each continuous span of track data.
	 * 					
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Trkseg</em>' containment reference list.
	 * @see egeo.gpx.GpxPackage#getTrkType_Trkseg()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='trkseg'"
	 * @generated
	 */
	EList<TrksegType> getTrkseg();

} // TrkType
