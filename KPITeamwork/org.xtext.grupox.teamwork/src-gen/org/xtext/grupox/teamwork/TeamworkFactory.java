/**
 * generated by Xtext 2.10.0
 */
package org.xtext.grupox.teamwork;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.grupox.teamwork.TeamworkPackage
 * @generated
 */
public interface TeamworkFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  TeamworkFactory eINSTANCE = org.xtext.grupox.teamwork.impl.TeamworkFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Teamwork</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Teamwork</em>'.
   * @generated
   */
  Teamwork createTeamwork();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  TeamworkPackage getTeamworkPackage();

} //TeamworkFactory