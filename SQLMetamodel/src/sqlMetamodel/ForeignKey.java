/**
 */
package sqlMetamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Foreign Key</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sqlMetamodel.ForeignKey#getName <em>Name</em>}</li>
 *   <li>{@link sqlMetamodel.ForeignKey#getReferencedTable <em>Referenced Table</em>}</li>
 *   <li>{@link sqlMetamodel.ForeignKey#getReferencedColumns <em>Referenced Columns</em>}</li>
 *   <li>{@link sqlMetamodel.ForeignKey#getColumns <em>Columns</em>}</li>
 * </ul>
 *
 * @see sqlMetamodel.SqlMetamodelPackage#getForeignKey()
 * @model
 * @generated
 */
public interface ForeignKey extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see sqlMetamodel.SqlMetamodelPackage#getForeignKey_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link sqlMetamodel.ForeignKey#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Referenced Table</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Table</em>' reference.
	 * @see #setReferencedTable(Table)
	 * @see sqlMetamodel.SqlMetamodelPackage#getForeignKey_ReferencedTable()
	 * @model required="true"
	 * @generated
	 */
	Table getReferencedTable();

	/**
	 * Sets the value of the '{@link sqlMetamodel.ForeignKey#getReferencedTable <em>Referenced Table</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referenced Table</em>' reference.
	 * @see #getReferencedTable()
	 * @generated
	 */
	void setReferencedTable(Table value);

	/**
	 * Returns the value of the '<em><b>Referenced Columns</b></em>' reference list.
	 * The list contents are of type {@link sqlMetamodel.Column}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Columns</em>' reference list.
	 * @see sqlMetamodel.SqlMetamodelPackage#getForeignKey_ReferencedColumns()
	 * @model
	 * @generated
	 */
	EList<Column> getReferencedColumns();

	/**
	 * Returns the value of the '<em><b>Columns</b></em>' reference list.
	 * The list contents are of type {@link sqlMetamodel.Column}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Columns</em>' reference list.
	 * @see sqlMetamodel.SqlMetamodelPackage#getForeignKey_Columns()
	 * @model
	 * @generated
	 */
	EList<Column> getColumns();

} // ForeignKey
