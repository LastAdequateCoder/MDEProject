/**
 */
package sqlMetamodel.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import sqlMetamodel.Column;
import sqlMetamodel.SQLDataType;
import sqlMetamodel.SqlMetamodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Column</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sqlMetamodel.impl.ColumnImpl#getName <em>Name</em>}</li>
 *   <li>{@link sqlMetamodel.impl.ColumnImpl#getDataType <em>Data Type</em>}</li>
 *   <li>{@link sqlMetamodel.impl.ColumnImpl#isIsNullable <em>Is Nullable</em>}</li>
 *   <li>{@link sqlMetamodel.impl.ColumnImpl#isIsUnique <em>Is Unique</em>}</li>
 *   <li>{@link sqlMetamodel.impl.ColumnImpl#isIsAutoIncrement <em>Is Auto Increment</em>}</li>
 *   <li>{@link sqlMetamodel.impl.ColumnImpl#isIsPrimaryKey <em>Is Primary Key</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ColumnImpl extends MinimalEObjectImpl.Container implements Column {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDataType() <em>Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataType()
	 * @generated
	 * @ordered
	 */
	protected static final SQLDataType DATA_TYPE_EDEFAULT = SQLDataType.INT;

	/**
	 * The cached value of the '{@link #getDataType() <em>Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataType()
	 * @generated
	 * @ordered
	 */
	protected SQLDataType dataType = DATA_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsNullable() <em>Is Nullable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsNullable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_NULLABLE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isIsNullable() <em>Is Nullable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsNullable()
	 * @generated
	 * @ordered
	 */
	protected boolean isNullable = IS_NULLABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsUnique() <em>Is Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsUnique()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_UNIQUE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsUnique() <em>Is Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsUnique()
	 * @generated
	 * @ordered
	 */
	protected boolean isUnique = IS_UNIQUE_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsAutoIncrement() <em>Is Auto Increment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAutoIncrement()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_AUTO_INCREMENT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsAutoIncrement() <em>Is Auto Increment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAutoIncrement()
	 * @generated
	 * @ordered
	 */
	protected boolean isAutoIncrement = IS_AUTO_INCREMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsPrimaryKey() <em>Is Primary Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsPrimaryKey()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_PRIMARY_KEY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsPrimaryKey() <em>Is Primary Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsPrimaryKey()
	 * @generated
	 * @ordered
	 */
	protected boolean isPrimaryKey = IS_PRIMARY_KEY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ColumnImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SqlMetamodelPackage.Literals.COLUMN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SqlMetamodelPackage.COLUMN__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SQLDataType getDataType() {
		return dataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDataType(SQLDataType newDataType) {
		SQLDataType oldDataType = dataType;
		dataType = newDataType == null ? DATA_TYPE_EDEFAULT : newDataType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SqlMetamodelPackage.COLUMN__DATA_TYPE, oldDataType, dataType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsNullable() {
		return isNullable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsNullable(boolean newIsNullable) {
		boolean oldIsNullable = isNullable;
		isNullable = newIsNullable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SqlMetamodelPackage.COLUMN__IS_NULLABLE, oldIsNullable, isNullable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsUnique() {
		return isUnique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsUnique(boolean newIsUnique) {
		boolean oldIsUnique = isUnique;
		isUnique = newIsUnique;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SqlMetamodelPackage.COLUMN__IS_UNIQUE, oldIsUnique, isUnique));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsAutoIncrement() {
		return isAutoIncrement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsAutoIncrement(boolean newIsAutoIncrement) {
		boolean oldIsAutoIncrement = isAutoIncrement;
		isAutoIncrement = newIsAutoIncrement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SqlMetamodelPackage.COLUMN__IS_AUTO_INCREMENT, oldIsAutoIncrement, isAutoIncrement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsPrimaryKey() {
		return isPrimaryKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsPrimaryKey(boolean newIsPrimaryKey) {
		boolean oldIsPrimaryKey = isPrimaryKey;
		isPrimaryKey = newIsPrimaryKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SqlMetamodelPackage.COLUMN__IS_PRIMARY_KEY, oldIsPrimaryKey, isPrimaryKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SqlMetamodelPackage.COLUMN__NAME:
				return getName();
			case SqlMetamodelPackage.COLUMN__DATA_TYPE:
				return getDataType();
			case SqlMetamodelPackage.COLUMN__IS_NULLABLE:
				return isIsNullable();
			case SqlMetamodelPackage.COLUMN__IS_UNIQUE:
				return isIsUnique();
			case SqlMetamodelPackage.COLUMN__IS_AUTO_INCREMENT:
				return isIsAutoIncrement();
			case SqlMetamodelPackage.COLUMN__IS_PRIMARY_KEY:
				return isIsPrimaryKey();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SqlMetamodelPackage.COLUMN__NAME:
				setName((String)newValue);
				return;
			case SqlMetamodelPackage.COLUMN__DATA_TYPE:
				setDataType((SQLDataType)newValue);
				return;
			case SqlMetamodelPackage.COLUMN__IS_NULLABLE:
				setIsNullable((Boolean)newValue);
				return;
			case SqlMetamodelPackage.COLUMN__IS_UNIQUE:
				setIsUnique((Boolean)newValue);
				return;
			case SqlMetamodelPackage.COLUMN__IS_AUTO_INCREMENT:
				setIsAutoIncrement((Boolean)newValue);
				return;
			case SqlMetamodelPackage.COLUMN__IS_PRIMARY_KEY:
				setIsPrimaryKey((Boolean)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SqlMetamodelPackage.COLUMN__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SqlMetamodelPackage.COLUMN__DATA_TYPE:
				setDataType(DATA_TYPE_EDEFAULT);
				return;
			case SqlMetamodelPackage.COLUMN__IS_NULLABLE:
				setIsNullable(IS_NULLABLE_EDEFAULT);
				return;
			case SqlMetamodelPackage.COLUMN__IS_UNIQUE:
				setIsUnique(IS_UNIQUE_EDEFAULT);
				return;
			case SqlMetamodelPackage.COLUMN__IS_AUTO_INCREMENT:
				setIsAutoIncrement(IS_AUTO_INCREMENT_EDEFAULT);
				return;
			case SqlMetamodelPackage.COLUMN__IS_PRIMARY_KEY:
				setIsPrimaryKey(IS_PRIMARY_KEY_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SqlMetamodelPackage.COLUMN__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SqlMetamodelPackage.COLUMN__DATA_TYPE:
				return dataType != DATA_TYPE_EDEFAULT;
			case SqlMetamodelPackage.COLUMN__IS_NULLABLE:
				return isNullable != IS_NULLABLE_EDEFAULT;
			case SqlMetamodelPackage.COLUMN__IS_UNIQUE:
				return isUnique != IS_UNIQUE_EDEFAULT;
			case SqlMetamodelPackage.COLUMN__IS_AUTO_INCREMENT:
				return isAutoIncrement != IS_AUTO_INCREMENT_EDEFAULT;
			case SqlMetamodelPackage.COLUMN__IS_PRIMARY_KEY:
				return isPrimaryKey != IS_PRIMARY_KEY_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", dataType: ");
		result.append(dataType);
		result.append(", isNullable: ");
		result.append(isNullable);
		result.append(", isUnique: ");
		result.append(isUnique);
		result.append(", isAutoIncrement: ");
		result.append(isAutoIncrement);
		result.append(", isPrimaryKey: ");
		result.append(isPrimaryKey);
		result.append(')');
		return result.toString();
	}

} //ColumnImpl
