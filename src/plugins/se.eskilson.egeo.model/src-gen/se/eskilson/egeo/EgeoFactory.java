/**
 */
package se.eskilson.egeo;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see se.eskilson.egeo.EgeoPackage
 * @generated
 */
public interface EgeoFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  EgeoFactory eINSTANCE = se.eskilson.egeo.impl.EgeoFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Database</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Database</em>'.
   * @generated
   */
  Database createDatabase();

  /**
   * Returns a new object of class '<em>Attribute</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Attribute</em>'.
   * @generated
   */
  Attribute createAttribute();

  /**
   * Returns a new object of class '<em>Description</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Description</em>'.
   * @generated
   */
  Description createDescription();

  /**
   * Returns a new object of class '<em>Coordinate</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Coordinate</em>'.
   * @generated
   */
  Coordinate createCoordinate();

  /**
   * Returns a new object of class '<em>User</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>User</em>'.
   * @generated
   */
  User createUser();

  /**
   * Returns a new object of class '<em>Cache</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Cache</em>'.
   * @generated
   */
  Cache createCache();

  /**
   * Returns a new object of class '<em>Log</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Log</em>'.
   * @generated
   */
  Log createLog();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  EgeoPackage getEgeoPackage();

} //EgeoFactory
