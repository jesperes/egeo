/**
 */
package egeo.gpx.util;

import egeo.gpx.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see egeo.gpx.GpxPackage
 * @generated
 */
public class GpxSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GpxPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GpxSwitch() {
		if (modelPackage == null) {
			modelPackage = GpxPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case GpxPackage.BOUNDS_TYPE: {
				BoundsType boundsType = (BoundsType)theEObject;
				T result = caseBoundsType(boundsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GpxPackage.COPYRIGHT_TYPE: {
				CopyrightType copyrightType = (CopyrightType)theEObject;
				T result = caseCopyrightType(copyrightType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GpxPackage.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				T result = caseDocumentRoot(documentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GpxPackage.EMAIL_TYPE: {
				EmailType emailType = (EmailType)theEObject;
				T result = caseEmailType(emailType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GpxPackage.EXTENSIONS_TYPE: {
				ExtensionsType extensionsType = (ExtensionsType)theEObject;
				T result = caseExtensionsType(extensionsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GpxPackage.GPX_TYPE: {
				GpxType gpxType = (GpxType)theEObject;
				T result = caseGpxType(gpxType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GpxPackage.LINK_TYPE: {
				LinkType linkType = (LinkType)theEObject;
				T result = caseLinkType(linkType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GpxPackage.METADATA_TYPE: {
				MetadataType metadataType = (MetadataType)theEObject;
				T result = caseMetadataType(metadataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GpxPackage.PERSON_TYPE: {
				PersonType personType = (PersonType)theEObject;
				T result = casePersonType(personType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GpxPackage.PTSEG_TYPE: {
				PtsegType ptsegType = (PtsegType)theEObject;
				T result = casePtsegType(ptsegType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GpxPackage.PT_TYPE: {
				PtType ptType = (PtType)theEObject;
				T result = casePtType(ptType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GpxPackage.RTE_TYPE: {
				RteType rteType = (RteType)theEObject;
				T result = caseRteType(rteType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GpxPackage.TRKSEG_TYPE: {
				TrksegType trksegType = (TrksegType)theEObject;
				T result = caseTrksegType(trksegType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GpxPackage.TRK_TYPE: {
				TrkType trkType = (TrkType)theEObject;
				T result = caseTrkType(trkType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GpxPackage.WPT_TYPE: {
				WptType wptType = (WptType)theEObject;
				T result = caseWptType(wptType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bounds Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bounds Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoundsType(BoundsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Copyright Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Copyright Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCopyrightType(CopyrightType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentRoot(DocumentRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Email Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Email Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEmailType(EmailType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extensions Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extensions Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtensionsType(ExtensionsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGpxType(GpxType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Link Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Link Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLinkType(LinkType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Metadata Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Metadata Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMetadataType(MetadataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Person Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Person Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePersonType(PersonType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ptseg Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ptseg Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePtsegType(PtsegType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pt Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pt Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePtType(PtType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rte Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rte Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRteType(RteType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trkseg Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trkseg Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrksegType(TrksegType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trk Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trk Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrkType(TrkType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wpt Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wpt Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWptType(WptType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //GpxSwitch
