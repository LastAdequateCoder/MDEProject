/**
 */
package sqlMetamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sqlMetamodel.Table#getName <em>Name</em>}</li>
 *   <li>{@link sqlMetamodel.Table#getColumns <em>Columns</em>}</li>
 *   <li>{@link sqlMetamodel.Table#getPrimaryKey <em>Primary Key</em>}</li>
 *   <li>{@link sqlMetamodel.Table#getForeignKeys <em>Foreign Keys</em>}</li>
 *   <li>{@link sqlMetamodel.Table#getIndexes <em>Indexes</em>}</li>
 * </ul>
 *
 * @see sqlMetamodel.SqlMetamodelPackage#getTable()
 * @model
 * @generated
 */
public interface Table extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see sqlMetamodel.SqlMetamodelPackage#getTable_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link sqlMetamodel.Table#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Columns</b></em>' containment reference list.
	 * The list contents are of type {@link sqlMetamodel.Column}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Columns</em>' containment reference list.
	 * @see sqlMetamodel.SqlMetamodelPackage#getTable_Columns()
	 * @model containment="true"
	 * @generated
	 */
	EList<Column> getColumns();

	/**
	 * Returns the value of the '<em><b>Primary Key</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primary Key</em>' reference.
	 * @see #setPrimaryKey(PrimaryKey)
	 * @see sqlMetamodel.SqlMetamodelPackage#getTable_PrimaryKey()
	 * @model
	 * @generated
	 */
	PrimaryKey getPrimaryKey();

	/**
	 * Sets the value of the '{@link sqlMetamodel.Table#getPrimaryKey <em>Primary Key</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primary Key</em>' reference.
	 * @see #getPrimaryKey()
	 * @generated
	 */
	void setPrimaryKey(PrimaryKey value);

	/**
	 * Returns the value of the '<em><b>Foreign Keys</b></em>' reference list.
	 * The list contents are of type {@link sqlMetamodel.ForeignKey}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Foreign Keys</em>' reference list.
	 * @see sqlMetamodel.SqlMetamodelPackage#getTable_ForeignKeys()
	 * @model
	 * @generated
	 */
	EList<ForeignKey> getForeignKeys();

	/**
	 * Returns the value of the '<em><b>Indexes</b></em>' reference list.
	 * The list contents are of type {@link sqlMetamodel.Index}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Indexes</em>' reference list.
	 * @see sqlMetamodel.SqlMetamodelPackage#getTable_Indexes()
	 * @model
	 * @generated
	 */
	EList<Index> getIndexes();

} // Table
