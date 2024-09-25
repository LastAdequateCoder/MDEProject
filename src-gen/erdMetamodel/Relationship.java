/**
 */
package erdMetamodel;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link erdMetamodel.Relationship#getName <em>Name</em>}</li>
 *   <li>{@link erdMetamodel.Relationship#getTarget <em>Target</em>}</li>
 *   <li>{@link erdMetamodel.Relationship#getSource <em>Source</em>}</li>
 *   <li>{@link erdMetamodel.Relationship#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see erdMetamodel.ErdMetamodelPackage#getRelationship()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='RelationshipNameNotEmpty'"
 * @generated
 */
public interface Relationship extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see erdMetamodel.ErdMetamodelPackage#getRelationship_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link erdMetamodel.Relationship#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Entity)
	 * @see erdMetamodel.ErdMetamodelPackage#getRelationship_Target()
	 * @model
	 * @generated
	 */
	Entity getTarget();

	/**
	 * Sets the value of the '{@link erdMetamodel.Relationship#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Entity value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Entity)
	 * @see erdMetamodel.ErdMetamodelPackage#getRelationship_Source()
	 * @model
	 * @generated
	 */
	Entity getSource();

	/**
	 * Sets the value of the '{@link erdMetamodel.Relationship#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Entity value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link erdMetamodel.RelationshipType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see erdMetamodel.RelationshipType
	 * @see #setType(RelationshipType)
	 * @see erdMetamodel.ErdMetamodelPackage#getRelationship_Type()
	 * @model
	 * @generated
	 */
	RelationshipType getType();

	/**
	 * Sets the value of the '{@link erdMetamodel.Relationship#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see erdMetamodel.RelationshipType
	 * @see #getType()
	 * @generated
	 */
	void setType(RelationshipType value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n            not self.source.oclIsUndefined() and not self.target.oclIsUndefined()'"
	 * @generated
	 */
	boolean ValidSourceAndTarget(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n            not self.name.oclIsUndefined() and self.name.size() &gt; 0'"
	 * @generated
	 */
	boolean RelationshipNameNotEmpty(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Relationship
