/**
 */
package egeo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Container Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see egeo.EgeoPackage#getContainerType()
 * @model
 * @generated
 */
public enum ContainerType implements Enumerator
{
  /**
   * The '<em><b>Micro</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #MICRO_VALUE
   * @generated
   * @ordered
   */
  MICRO(0, "Micro", "Micro"),

  /**
   * The '<em><b>Small</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SMALL_VALUE
   * @generated
   * @ordered
   */
  SMALL(0, "Small", "Small"),

  /**
   * The '<em><b>Regular</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #REGULAR_VALUE
   * @generated
   * @ordered
   */
  REGULAR(0, "Regular", "Regular"),

  /**
   * The '<em><b>Large</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #LARGE_VALUE
   * @generated
   * @ordered
   */
  LARGE(0, "Large", "Large"),

  /**
   * The '<em><b>Other</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #OTHER_VALUE
   * @generated
   * @ordered
   */
  OTHER(0, "Other", "Other"),

  /**
   * The '<em><b>Unspecified</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #UNSPECIFIED_VALUE
   * @generated
   * @ordered
   */
  UNSPECIFIED(0, "Unspecified", "Unspecified"),

  /**
   * The '<em><b>Virtual</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #VIRTUAL_VALUE
   * @generated
   * @ordered
   */
  VIRTUAL(0, "Virtual", "Virtual");

  /**
   * The '<em><b>Micro</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Micro</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #MICRO
   * @model name="Micro"
   * @generated
   * @ordered
   */
  public static final int MICRO_VALUE = 0;

  /**
   * The '<em><b>Small</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Small</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #SMALL
   * @model name="Small"
   * @generated
   * @ordered
   */
  public static final int SMALL_VALUE = 0;

  /**
   * The '<em><b>Regular</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Regular</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #REGULAR
   * @model name="Regular"
   * @generated
   * @ordered
   */
  public static final int REGULAR_VALUE = 0;

  /**
   * The '<em><b>Large</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Large</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #LARGE
   * @model name="Large"
   * @generated
   * @ordered
   */
  public static final int LARGE_VALUE = 0;

  /**
   * The '<em><b>Other</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Other</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #OTHER
   * @model name="Other"
   * @generated
   * @ordered
   */
  public static final int OTHER_VALUE = 0;

  /**
   * The '<em><b>Unspecified</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Unspecified</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #UNSPECIFIED
   * @model name="Unspecified"
   * @generated
   * @ordered
   */
  public static final int UNSPECIFIED_VALUE = 0;

  /**
   * The '<em><b>Virtual</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Virtual</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #VIRTUAL
   * @model name="Virtual"
   * @generated
   * @ordered
   */
  public static final int VIRTUAL_VALUE = 0;

  /**
   * An array of all the '<em><b>Container Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final ContainerType[] VALUES_ARRAY =
    new ContainerType[]
    {
      MICRO,
      SMALL,
      REGULAR,
      LARGE,
      OTHER,
      UNSPECIFIED,
      VIRTUAL,
    };

  /**
   * A public read-only list of all the '<em><b>Container Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<ContainerType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Container Type</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ContainerType get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      ContainerType result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Container Type</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ContainerType getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      ContainerType result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Container Type</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ContainerType get(int value)
  {
    switch (value)
    {
      case MICRO_VALUE: return MICRO;
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
  private ContainerType(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //ContainerType
