/**
 */
package egeo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Attribute</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see egeo.EgeoPackage#getAttribute()
 * @model
 * @generated
 */
public enum Attribute implements Enumerator
{
  /**
   * The '<em><b>Recommended For Kids</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #RECOMMENDED_FOR_KIDS_VALUE
   * @generated
   * @ordered
   */
  RECOMMENDED_FOR_KIDS(6, "RecommendedForKids", "RecommendedForKids"),

  /**
   * The '<em><b>Takes Less Than An Hour</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #TAKES_LESS_THAN_AN_HOUR_VALUE
   * @generated
   * @ordered
   */
  TAKES_LESS_THAN_AN_HOUR(7, "TakesLessThanAnHour", "TakesLessThanAnHour"),

  /**
   * The '<em><b>Available At All Times</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #AVAILABLE_AT_ALL_TIMES_VALUE
   * @generated
   * @ordered
   */
  AVAILABLE_AT_ALL_TIMES(13, "AvailableAtAllTimes", "AvailableAtAllTimes"),

  /**
   * The '<em><b>Recommended At Night</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #RECOMMENDED_AT_NIGHT_VALUE
   * @generated
   * @ordered
   */
  RECOMMENDED_AT_NIGHT(14, "RecommendedAtNight", "RecommendedAtNight"),

  /**
   * The '<em><b>Available During Winter</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #AVAILABLE_DURING_WINTER_VALUE
   * @generated
   * @ordered
   */
  AVAILABLE_DURING_WINTER(15, "AvailableDuringWinter", "AvailableDuringWinter"),

  /**
   * The '<em><b>Bicycles</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #BICYCLES_VALUE
   * @generated
   * @ordered
   */
  BICYCLES(32, "Bicycles", "Bicycles");

  /**
   * The '<em><b>Recommended For Kids</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Recommended For Kids</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #RECOMMENDED_FOR_KIDS
   * @model name="RecommendedForKids"
   * @generated
   * @ordered
   */
  public static final int RECOMMENDED_FOR_KIDS_VALUE = 6;

  /**
   * The '<em><b>Takes Less Than An Hour</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Takes Less Than An Hour</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #TAKES_LESS_THAN_AN_HOUR
   * @model name="TakesLessThanAnHour"
   * @generated
   * @ordered
   */
  public static final int TAKES_LESS_THAN_AN_HOUR_VALUE = 7;

  /**
   * The '<em><b>Available At All Times</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Available At All Times</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #AVAILABLE_AT_ALL_TIMES
   * @model name="AvailableAtAllTimes"
   * @generated
   * @ordered
   */
  public static final int AVAILABLE_AT_ALL_TIMES_VALUE = 13;

  /**
   * The '<em><b>Recommended At Night</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Recommended At Night</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #RECOMMENDED_AT_NIGHT
   * @model name="RecommendedAtNight"
   * @generated
   * @ordered
   */
  public static final int RECOMMENDED_AT_NIGHT_VALUE = 14;

  /**
   * The '<em><b>Available During Winter</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Available During Winter</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #AVAILABLE_DURING_WINTER
   * @model name="AvailableDuringWinter"
   * @generated
   * @ordered
   */
  public static final int AVAILABLE_DURING_WINTER_VALUE = 15;

  /**
   * The '<em><b>Bicycles</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Bicycles</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #BICYCLES
   * @model name="Bicycles"
   * @generated
   * @ordered
   */
  public static final int BICYCLES_VALUE = 32;

  /**
   * An array of all the '<em><b>Attribute</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final Attribute[] VALUES_ARRAY =
    new Attribute[]
    {
      RECOMMENDED_FOR_KIDS,
      TAKES_LESS_THAN_AN_HOUR,
      AVAILABLE_AT_ALL_TIMES,
      RECOMMENDED_AT_NIGHT,
      AVAILABLE_DURING_WINTER,
      BICYCLES,
    };

  /**
   * A public read-only list of all the '<em><b>Attribute</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<Attribute> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Attribute</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Attribute get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      Attribute result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Attribute</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Attribute getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      Attribute result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Attribute</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Attribute get(int value)
  {
    switch (value)
    {
      case RECOMMENDED_FOR_KIDS_VALUE: return RECOMMENDED_FOR_KIDS;
      case TAKES_LESS_THAN_AN_HOUR_VALUE: return TAKES_LESS_THAN_AN_HOUR;
      case AVAILABLE_AT_ALL_TIMES_VALUE: return AVAILABLE_AT_ALL_TIMES;
      case RECOMMENDED_AT_NIGHT_VALUE: return RECOMMENDED_AT_NIGHT;
      case AVAILABLE_DURING_WINTER_VALUE: return AVAILABLE_DURING_WINTER;
      case BICYCLES_VALUE: return BICYCLES;
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
  private Attribute(int value, String name, String literal)
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
  
} //Attribute
