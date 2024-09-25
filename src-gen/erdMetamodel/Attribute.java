/**
 */
package erdMetamodel;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link erdMetamodel.Attribute#getName <em>Name</em>}</li>
 *   <li>{@link erdMetamodel.Attribute#isIsPrimaryKey <em>Is Primary Key</em>}</li>
 *   <li>{@link erdMetamodel.Attribute#getDataType <em>Data Type</em>}</li>
 *   <li>{@link erdMetamodel.Attribute#isIsComposite <em>Is Composite</em>}</li>
 *   <li>{@link erdMetamodel.Attribute#isIsDerived <em>Is Derived</em>}</li>
 * </ul>
 *
 * @see erdMetamodel.ErdMetamodelPackage#getAttribute()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ValidDataType'"
 * @generated
 */
public interface Attribute extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see erdMetamodel.ErdMetamodelPackage#getAttribute_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link erdMetamodel.Attribute#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Is Primary Key</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Primary Key</em>' attribute.
	 * @see #setIsPrimaryKey(boolean)
	 * @see erdMetamodel.ErdMetamodelPackage#getAttribute_IsPrimaryKey()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isIsPrimaryKey();

	/**
	 * Sets the value of the '{@link erdMetamodel.Attribute#isIsPrimaryKey <em>Is Primary Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Primary Key</em>' attribute.
	 * @see #isIsPrimaryKey()
	 * @generated
	 */
	void setIsPrimaryKey(boolean value);

	/**
	 * Returns the value of the '<em><b>Data Type</b></em>' attribute.
	 * The default value is <code>"INT"</code>.
	 * The literals are from the enumeration {@link erdMetamodel.DataTypes}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Type</em>' attribute.
	 * @see erdMetamodel.DataTypes
	 * @see #setDataType(DataTypes)
	 * @see erdMetamodel.ErdMetamodelPackage#getAttribute_DataType()
	 * @model default="INT"
	 * @generated
	 */
	DataTypes getDataType();

	/**
	 * Sets the value of the '{@link erdMetamodel.Attribute#getDataType <em>Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Type</em>' attribute.
	 * @see erdMetamodel.DataTypes
	 * @see #getDataType()
	 * @generated
	 */
	void setDataType(DataTypes value);

	/**
	 * Returns the value of the '<em><b>Is Composite</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Composite</em>' attribute.
	 * @see #setIsComposite(boolean)
	 * @see erdMetamodel.ErdMetamodelPackage#getAttribute_IsComposite()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isIsComposite();

	/**
	 * Sets the value of the '{@link erdMetamodel.Attribute#isIsComposite <em>Is Composite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Composite</em>' attribute.
	 * @see #isIsComposite()
	 * @generated
	 */
	void setIsComposite(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Derived</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Derived</em>' attribute.
	 * @see #setIsDerived(boolean)
	 * @see erdMetamodel.ErdMetamodelPackage#getAttribute_IsDerived()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isIsDerived();

	/**
	 * Sets the value of the '{@link erdMetamodel.Attribute#isIsDerived <em>Is Derived</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Derived</em>' attribute.
	 * @see #isIsDerived()
	 * @generated
	 */
	void setIsDerived(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n            self.dataType = DataTypes::INT or self.dataType = DataTypes::VARCHAR or self.dataType = DataTypes::DATE'"
	 * @generated
	 */
	boolean ValidDataType(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Attribute
