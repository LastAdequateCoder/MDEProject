/**
 */
package erdMetamodel;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Weak Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link erdMetamodel.WeakEntity#getIdentifyingRelationship <em>Identifying Relationship</em>}</li>
 * </ul>
 *
 * @see erdMetamodel.ErdMetamodelPackage#getWeakEntity()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='IdentifyingRelationshipExists'"
 * @generated
 */
public interface WeakEntity extends Entity {
	/**
	 * Returns the value of the '<em><b>Identifying Relationship</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifying Relationship</em>' reference.
	 * @see #setIdentifyingRelationship(Relationship)
	 * @see erdMetamodel.ErdMetamodelPackage#getWeakEntity_IdentifyingRelationship()
	 * @model required="true"
	 * @generated
	 */
	Relationship getIdentifyingRelationship();

	/**
	 * Sets the value of the '{@link erdMetamodel.WeakEntity#getIdentifyingRelationship <em>Identifying Relationship</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifying Relationship</em>' reference.
	 * @see #getIdentifyingRelationship()
	 * @generated
	 */
	void setIdentifyingRelationship(Relationship value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n            not self.identifyingRelationship.oclIsUndefined()'"
	 * @generated
	 */
	boolean IdentifyingRelationshipExists(DiagnosticChain diagnostics, Map<Object, Object> context);

} // WeakEntity
