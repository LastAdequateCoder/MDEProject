/**
 */
package sqlMetamodel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import sqlMetamodel.Column;
import sqlMetamodel.ForeignKey;
import sqlMetamodel.SqlMetamodelPackage;
import sqlMetamodel.Table;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Foreign Key</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sqlMetamodel.impl.ForeignKeyImpl#getName <em>Name</em>}</li>
 *   <li>{@link sqlMetamodel.impl.ForeignKeyImpl#getReferencedTable <em>Referenced Table</em>}</li>
 *   <li>{@link sqlMetamodel.impl.ForeignKeyImpl#getReferencedColumns <em>Referenced Columns</em>}</li>
 *   <li>{@link sqlMetamodel.impl.ForeignKeyImpl#getColumns <em>Columns</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ForeignKeyImpl extends MinimalEObjectImpl.Container implements ForeignKey {
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
	 * The cached value of the '{@link #getReferencedTable() <em>Referenced Table</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedTable()
	 * @generated
	 * @ordered
	 */
	protected Table referencedTable;

	/**
	 * The cached value of the '{@link #getReferencedColumns() <em>Referenced Columns</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedColumns()
	 * @generated
	 * @ordered
	 */
	protected EList<Column> referencedColumns;

	/**
	 * The cached value of the '{@link #getColumns() <em>Columns</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumns()
	 * @generated
	 * @ordered
	 */
	protected EList<Column> columns;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ForeignKeyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SqlMetamodelPackage.Literals.FOREIGN_KEY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SqlMetamodelPackage.FOREIGN_KEY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Table getReferencedTable() {
		if (referencedTable != null && referencedTable.eIsProxy()) {
			InternalEObject oldReferencedTable = (InternalEObject)referencedTable;
			referencedTable = (Table)eResolveProxy(oldReferencedTable);
			if (referencedTable != oldReferencedTable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SqlMetamodelPackage.FOREIGN_KEY__REFERENCED_TABLE, oldReferencedTable, referencedTable));
			}
		}
		return referencedTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table basicGetReferencedTable() {
		return referencedTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReferencedTable(Table newReferencedTable) {
		Table oldReferencedTable = referencedTable;
		referencedTable = newReferencedTable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SqlMetamodelPackage.FOREIGN_KEY__REFERENCED_TABLE, oldReferencedTable, referencedTable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Column> getReferencedColumns() {
		if (referencedColumns == null) {
			referencedColumns = new EObjectResolvingEList<Column>(Column.class, this, SqlMetamodelPackage.FOREIGN_KEY__REFERENCED_COLUMNS);
		}
		return referencedColumns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Column> getColumns() {
		if (columns == null) {
			columns = new EObjectResolvingEList<Column>(Column.class, this, SqlMetamodelPackage.FOREIGN_KEY__COLUMNS);
		}
		return columns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SqlMetamodelPackage.FOREIGN_KEY__NAME:
				return getName();
			case SqlMetamodelPackage.FOREIGN_KEY__REFERENCED_TABLE:
				if (resolve) return getReferencedTable();
				return basicGetReferencedTable();
			case SqlMetamodelPackage.FOREIGN_KEY__REFERENCED_COLUMNS:
				return getReferencedColumns();
			case SqlMetamodelPackage.FOREIGN_KEY__COLUMNS:
				return getColumns();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SqlMetamodelPackage.FOREIGN_KEY__NAME:
				setName((String)newValue);
				return;
			case SqlMetamodelPackage.FOREIGN_KEY__REFERENCED_TABLE:
				setReferencedTable((Table)newValue);
				return;
			case SqlMetamodelPackage.FOREIGN_KEY__REFERENCED_COLUMNS:
				getReferencedColumns().clear();
				getReferencedColumns().addAll((Collection<? extends Column>)newValue);
				return;
			case SqlMetamodelPackage.FOREIGN_KEY__COLUMNS:
				getColumns().clear();
				getColumns().addAll((Collection<? extends Column>)newValue);
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
			case SqlMetamodelPackage.FOREIGN_KEY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SqlMetamodelPackage.FOREIGN_KEY__REFERENCED_TABLE:
				setReferencedTable((Table)null);
				return;
			case SqlMetamodelPackage.FOREIGN_KEY__REFERENCED_COLUMNS:
				getReferencedColumns().clear();
				return;
			case SqlMetamodelPackage.FOREIGN_KEY__COLUMNS:
				getColumns().clear();
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
			case SqlMetamodelPackage.FOREIGN_KEY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SqlMetamodelPackage.FOREIGN_KEY__REFERENCED_TABLE:
				return referencedTable != null;
			case SqlMetamodelPackage.FOREIGN_KEY__REFERENCED_COLUMNS:
				return referencedColumns != null && !referencedColumns.isEmpty();
			case SqlMetamodelPackage.FOREIGN_KEY__COLUMNS:
				return columns != null && !columns.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //ForeignKeyImpl
