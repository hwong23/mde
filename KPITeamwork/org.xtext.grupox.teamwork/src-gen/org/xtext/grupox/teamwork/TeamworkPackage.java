/**
 * generated by Xtext 2.10.0
 */
package org.xtext.grupox.teamwork;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.xtext.grupox.teamwork.TeamworkFactory
 * @model kind="package"
 * @generated
 */
public interface TeamworkPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "teamwork";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/grupox/Teamwork";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "teamwork";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  TeamworkPackage eINSTANCE = org.xtext.grupox.teamwork.impl.TeamworkPackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.grupox.teamwork.impl.TeamworkImpl <em>Teamwork</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.grupox.teamwork.impl.TeamworkImpl
   * @see org.xtext.grupox.teamwork.impl.TeamworkPackageImpl#getTeamwork()
   * @generated
   */
  int TEAMWORK = 0;

  /**
   * The feature id for the '<em><b>Elements</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEAMWORK__ELEMENTS = 0;

  /**
   * The number of structural features of the '<em>Teamwork</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEAMWORK_FEATURE_COUNT = 1;


  /**
   * Returns the meta object for class '{@link org.xtext.grupox.teamwork.Teamwork <em>Teamwork</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Teamwork</em>'.
   * @see org.xtext.grupox.teamwork.Teamwork
   * @generated
   */
  EClass getTeamwork();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.grupox.teamwork.Teamwork#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Elements</em>'.
   * @see org.xtext.grupox.teamwork.Teamwork#getElements()
   * @see #getTeamwork()
   * @generated
   */
  EAttribute getTeamwork_Elements();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  TeamworkFactory getTeamworkFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.xtext.grupox.teamwork.impl.TeamworkImpl <em>Teamwork</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.grupox.teamwork.impl.TeamworkImpl
     * @see org.xtext.grupox.teamwork.impl.TeamworkPackageImpl#getTeamwork()
     * @generated
     */
    EClass TEAMWORK = eINSTANCE.getTeamwork();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TEAMWORK__ELEMENTS = eINSTANCE.getTeamwork_Elements();

  }

} //TeamworkPackage
