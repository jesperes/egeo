/**
 */
package se.eskilson.egeo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Log Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see se.eskilson.egeo.EgeoPackage#getLogType()
 * @model
 * @generated
 */
public enum LogType implements Enumerator {
	/**
	 * The '<em><b>Found It</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FOUND_IT_VALUE
	 * @generated
	 * @ordered
	 */
	FOUND_IT(0, "FoundIt", "FoundIt"),

	/**
	 * The '<em><b>Did Not Find</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DID_NOT_FIND_VALUE
	 * @generated
	 * @ordered
	 */
	DID_NOT_FIND(0, "DidNotFind", "DidNotFind"),

	/**
	 * The '<em><b>Needs Maintenance</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NEEDS_MAINTENANCE_VALUE
	 * @generated
	 * @ordered
	 */
	NEEDS_MAINTENANCE(0, "NeedsMaintenance", "NeedsMaintenance");

	/**
	 * The '<em><b>Found It</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Found It</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FOUND_IT
	 * @model name="FoundIt"
	 * @generated
	 * @ordered
	 */
	public static final int FOUND_IT_VALUE = 0;

	/**
	 * The '<em><b>Did Not Find</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Did Not Find</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DID_NOT_FIND
	 * @model name="DidNotFind"
	 * @generated
	 * @ordered
	 */
	public static final int DID_NOT_FIND_VALUE = 0;

	/**
	 * The '<em><b>Needs Maintenance</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Needs Maintenance</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NEEDS_MAINTENANCE
	 * @model name="NeedsMaintenance"
	 * @generated
	 * @ordered
	 */
	public static final int NEEDS_MAINTENANCE_VALUE = 0;

	/**
	 * An array of all the '<em><b>Log Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final LogType[] VALUES_ARRAY = new LogType[] { FOUND_IT,
			DID_NOT_FIND, NEEDS_MAINTENANCE, };

	/**
	 * A public read-only list of all the '<em><b>Log Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<LogType> VALUES = Collections
			.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Log Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LogType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LogType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Log Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LogType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LogType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Log Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LogType get(int value) {
		switch (value) {
		case FOUND_IT_VALUE:
			return FOUND_IT;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private LogType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} //LogType
