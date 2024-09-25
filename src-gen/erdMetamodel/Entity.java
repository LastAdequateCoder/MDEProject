/**
 */
package erdMetamodel;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link erdMetamodel.Entity#getName <em>Name</em>}</li>
 *   <li>{@link erdMetamodel.Entity#getRelationships <em>Relationships</em>}</li>
 *   <li>{@link erdMetamodel.Entity#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link erdMetamodel.Entity#getForeignKeys <em>Foreign Keys</em>}</li>
 * </ul>
 *
 * @see erdMetamodel.ErdMetamodelPackage#getEntity()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='UniqueAttributeNames'"
 * @generated
 */
public interface Entity extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see erdMetamodel.ErdMetamodelPackage#getEntity_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link erdMetamodel.Entity#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Relationships</b></em>' containment reference list.
	 * The list contents are of type {@link erdMetamodel.Relationship}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relationships</em>' containment reference list.
	 * @see erdMetamodel.ErdMetamodelPackage#getEntity_Relationships()
	 * @model containment="true"
	 * @generated
	 */
	EList<Relationship> getRelationships();

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link erdMetamodel.Attribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see erdMetamodel.ErdMetamodelPackage#getEntity_Attributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attribute> getAttributes();

	/**
	 * Returns the value of the '<em><b>Foreign Keys</b></em>' reference list.
	 * The list contents are of type {@link erdMetamodel.Attribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Foreign Keys</em>' reference list.
	 * @see erdMetamodel.ErdMetamodelPackage#getEntity_ForeignKeys()
	 * @model
	 * @generated
	 */
	EList<Attribute> getForeignKeys();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\tEntity.allInstances()-&gt;isUnique(e | e.name)'"
	 * @generated
	 */
	boolean UniqueEntityName(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\tself.attributes-&gt;exists(a | a.isPrimaryKey = true)'"
	 * @generated
	 */
	boolean EntityHasPrimaryKey(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n            self.attributes-&gt;isUnique(a | a.name)'"
	 * @generated
	 */
	boolean UniqueAttributeNames(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Entity
