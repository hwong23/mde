/**
 * generated by Xtext 2.10.0
 */
package org.xtext.grupox.teamwork;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Teamwork</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.grupox.teamwork.Teamwork#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see org.xtext.grupox.teamwork.TeamworkPackage#getTeamwork()
 * @model
 * @generated
 */
public interface Teamwork extends EObject
{
  /**
   * Returns the value of the '<em><b>Elements</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elements</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elements</em>' attribute list.
   * @see org.xtext.grupox.teamwork.TeamworkPackage#getTeamwork_Elements()
   * @model unique="false"
   * @generated
   */
  EList<String> getElements();

} // Teamwork
