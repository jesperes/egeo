/**
 */
package se.eskilson.egeo.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import se.eskilson.egeo.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see se.eskilson.egeo.EgeoPackage
 * @generated
 */
public class EgeoAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static EgeoPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EgeoAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = EgeoPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EgeoSwitch<Adapter> modelSwitch =
    new EgeoSwitch<Adapter>()
    {
      @Override
      public Adapter caseDatabase(Database object)
      {
        return createDatabaseAdapter();
      }
      @Override
      public Adapter caseAttribute(Attribute object)
      {
        return createAttributeAdapter();
      }
      @Override
      public Adapter caseDescription(Description object)
      {
        return createDescriptionAdapter();
      }
      @Override
      public Adapter caseCoordinate(Coordinate object)
      {
        return createCoordinateAdapter();
      }
      @Override
      public Adapter caseUser(User object)
      {
        return createUserAdapter();
      }
      @Override
      public Adapter caseCache(Cache object)
      {
        return createCacheAdapter();
      }
      @Override
      public Adapter caseLog(Log object)
      {
        return createLogAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link se.eskilson.egeo.Database <em>Database</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see se.eskilson.egeo.Database
   * @generated
   */
  public Adapter createDatabaseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link se.eskilson.egeo.Attribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see se.eskilson.egeo.Attribute
   * @generated
   */
  public Adapter createAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link se.eskilson.egeo.Description <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see se.eskilson.egeo.Description
   * @generated
   */
  public Adapter createDescriptionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link se.eskilson.egeo.Coordinate <em>Coordinate</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see se.eskilson.egeo.Coordinate
   * @generated
   */
  public Adapter createCoordinateAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link se.eskilson.egeo.User <em>User</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see se.eskilson.egeo.User
   * @generated
   */
  public Adapter createUserAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link se.eskilson.egeo.Cache <em>Cache</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see se.eskilson.egeo.Cache
   * @generated
   */
  public Adapter createCacheAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link se.eskilson.egeo.Log <em>Log</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see se.eskilson.egeo.Log
   * @generated
   */
  public Adapter createLogAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //EgeoAdapterFactory
