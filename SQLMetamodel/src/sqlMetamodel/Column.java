/**
 */
package sqlMetamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Column</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sqlMetamodel.Column#getName <em>Name</em>}</li>
 *   <li>{@link sqlMetamodel.Column#getDataType <em>Data Type</em>}</li>
 *   <li>{@link sqlMetamodel.Column#isIsNullable <em>Is Nullable</em>}</li>
 *   <li>{@link sqlMetamodel.Column#isIsUnique <em>Is Unique</em>}</li>
 *   <li>{@link sqlMetamodel.Column#isIsAutoIncrement <em>Is Auto Increment</em>}</li>
 *   <li>{@link sqlMetamodel.Column#isIsPrimaryKey <em>Is Primary Key</em>}</li>
 * </ul>
 *
 * @see sqlMetamodel.SqlMetamodelPackage#getColumn()
 * @model
 * @generated
 */
public interface Column extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see sqlMetamodel.SqlMetamodelPackage#getColumn_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link sqlMetamodel.Column#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Data Type</b></em>' attribute.
	 * The literals are from the enumeration {@link sqlMetamodel.SQLDataType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Type</em>' attribute.
	 * @see sqlMetamodel.SQLDataType
	 * @see #setDataType(SQLDataType)
	 * @see sqlMetamodel.SqlMetamodelPackage#getColumn_DataType()
	 * @model
	 * @generated
	 */
	SQLDataType getDataType();

	/**
	 * Sets the value of the '{@link sqlMetamodel.Column#getDataType <em>Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Type</em>' attribute.
	 * @see sqlMetamodel.SQLDataType
	 * @see #getDataType()
	 * @generated
	 */
	void setDataType(SQLDataType value);

	/**
	 * Returns the value of the '<em><b>Is Nullable</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Nullable</em>' attribute.
	 * @see #setIsNullable(boolean)
	 * @see sqlMetamodel.SqlMetamodelPackage#getColumn_IsNullable()
	 * @model default="true" required="true"
	 * @generated
	 */
	boolean isIsNullable();

	/**
	 * Sets the value of the '{@link sqlMetamodel.Column#isIsNullable <em>Is Nullable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Nullable</em>' attribute.
	 * @see #isIsNullable()
	 * @generated
	 */
	void setIsNullable(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Unique</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Unique</em>' attribute.
	 * @see #setIsUnique(boolean)
	 * @see sqlMetamodel.SqlMetamodelPackage#getColumn_IsUnique()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isIsUnique();

	/**
	 * Sets the value of the '{@link sqlMetamodel.Column#isIsUnique <em>Is Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Unique</em>' attribute.
	 * @see #isIsUnique()
	 * @generated
	 */
	void setIsUnique(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Auto Increment</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Auto Increment</em>' attribute.
	 * @see #setIsAutoIncrement(boolean)
	 * @see sqlMetamodel.SqlMetamodelPackage#getColumn_IsAutoIncrement()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isIsAutoIncrement();

	/**
	 * Sets the value of the '{@link sqlMetamodel.Column#isIsAutoIncrement <em>Is Auto Increment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Auto Increment</em>' attribute.
	 * @see #isIsAutoIncrement()
	 * @generated
	 */
	void setIsAutoIncrement(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Primary Key</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Primary Key</em>' attribute.
	 * @see #setIsPrimaryKey(boolean)
	 * @see sqlMetamodel.SqlMetamodelPackage#getColumn_IsPrimaryKey()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isIsPrimaryKey();

	/**
	 * Sets the value of the '{@link sqlMetamodel.Column#isIsPrimaryKey <em>Is Primary Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Primary Key</em>' attribute.
	 * @see #isIsPrimaryKey()
	 * @generated
	 */
	void setIsPrimaryKey(boolean value);

} // Column
