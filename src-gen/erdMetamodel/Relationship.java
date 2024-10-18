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
 *   <li>{@link erdMetamodel.Relationship#getTargetTable <em>Target Table</em>}</li>
 *   <li>{@link erdMetamodel.Relationship#getSource <em>Source</em>}</li>
 *   <li>{@link erdMetamodel.Relationship#getSourceTable <em>Source Table</em>}</li>
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
	 * @see #setTarget(Attribute)
	 * @see erdMetamodel.ErdMetamodelPackage#getRelationship_Target()
	 * @model
	 * @generated
	 */
	Attribute getTarget();

	/**
	 * Sets the value of the '{@link erdMetamodel.Relationship#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Attribute value);

	/**
	 * Returns the value of the '<em><b>Target Table</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Table</em>' reference.
	 * @see #setTargetTable(Entity)
	 * @see erdMetamodel.ErdMetamodelPackage#getRelationship_TargetTable()
	 * @model
	 * @generated
	 */
	Entity getTargetTable();

	/**
	 * Sets the value of the '{@link erdMetamodel.Relationship#getTargetTable <em>Target Table</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Table</em>' reference.
	 * @see #getTargetTable()
	 * @generated
	 */
	void setTargetTable(Entity value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Attribute)
	 * @see erdMetamodel.ErdMetamodelPackage#getRelationship_Source()
	 * @model
	 * @generated
	 */
	Attribute getSource();

	/**
	 * Sets the value of the '{@link erdMetamodel.Relationship#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Attribute value);

	/**
	 * Returns the value of the '<em><b>Source Table</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Table</em>' reference.
	 * @see #setSourceTable(Entity)
	 * @see erdMetamodel.ErdMetamodelPackage#getRelationship_SourceTable()
	 * @model
	 * @generated
	 */
	Entity getSourceTable();

	/**
	 * Sets the value of the '{@link erdMetamodel.Relationship#getSourceTable <em>Source Table</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Table</em>' reference.
	 * @see #getSourceTable()
	 * @generated
	 */
	void setSourceTable(Entity value);

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
