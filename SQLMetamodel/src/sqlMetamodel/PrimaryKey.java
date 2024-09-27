/**
 */
package sqlMetamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Primary Key</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sqlMetamodel.PrimaryKey#getColumns <em>Columns</em>}</li>
 * </ul>
 *
 * @see sqlMetamodel.SqlMetamodelPackage#getPrimaryKey()
 * @model
 * @generated
 */
public interface PrimaryKey extends EObject {
	/**
	 * Returns the value of the '<em><b>Columns</b></em>' reference list.
	 * The list contents are of type {@link sqlMetamodel.Column}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Columns</em>' reference list.
	 * @see sqlMetamodel.SqlMetamodelPackage#getPrimaryKey_Columns()
	 * @model
	 * @generated
	 */
	EList<Column> getColumns();

} // PrimaryKey
