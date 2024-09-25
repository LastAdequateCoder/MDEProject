/**
 */
package erdMetamodel.impl;

import erdMetamodel.Attribute;
import erdMetamodel.DataTypes;
import erdMetamodel.ErdMetamodelPackage;
import erdMetamodel.ErdMetamodelTables;

import java.lang.reflect.InvocationTargetException;

import java.util.Map;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.ocl.pivot.evaluation.Executor;

import org.eclipse.ocl.pivot.ids.EnumerationLiteralId;
import org.eclipse.ocl.pivot.ids.TypeId;

import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;

import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;

import org.eclipse.ocl.pivot.utilities.ClassUtil;
import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.IntegerValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link erdMetamodel.impl.AttributeImpl#getName <em>Name</em>}</li>
 *   <li>{@link erdMetamodel.impl.AttributeImpl#isIsPrimaryKey <em>Is Primary Key</em>}</li>
 *   <li>{@link erdMetamodel.impl.AttributeImpl#getDataType <em>Data Type</em>}</li>
 *   <li>{@link erdMetamodel.impl.AttributeImpl#isIsComposite <em>Is Composite</em>}</li>
 *   <li>{@link erdMetamodel.impl.AttributeImpl#isIsDerived <em>Is Derived</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttributeImpl extends MinimalEObjectImpl.Container implements Attribute {
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
	 * The default value of the '{@link #getDataType() <em>Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataType()
	 * @generated
	 * @ordered
	 */
	protected static final DataTypes DATA_TYPE_EDEFAULT = DataTypes.INT;

	/**
	 * The cached value of the '{@link #getDataType() <em>Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataType()
	 * @generated
	 * @ordered
	 */
	protected DataTypes dataType = DATA_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsComposite() <em>Is Composite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsComposite()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_COMPOSITE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsComposite() <em>Is Composite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsComposite()
	 * @generated
	 * @ordered
	 */
	protected boolean isComposite = IS_COMPOSITE_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsDerived() <em>Is Derived</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDerived()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_DERIVED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsDerived() <em>Is Derived</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDerived()
	 * @generated
	 * @ordered
	 */
	protected boolean isDerived = IS_DERIVED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ErdMetamodelPackage.Literals.ATTRIBUTE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ErdMetamodelPackage.ATTRIBUTE__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ErdMetamodelPackage.ATTRIBUTE__IS_PRIMARY_KEY,
					oldIsPrimaryKey, isPrimaryKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataTypes getDataType() {
		return dataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDataType(DataTypes newDataType) {
		DataTypes oldDataType = dataType;
		dataType = newDataType == null ? DATA_TYPE_EDEFAULT : newDataType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ErdMetamodelPackage.ATTRIBUTE__DATA_TYPE, oldDataType,
					dataType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsComposite() {
		return isComposite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsComposite(boolean newIsComposite) {
		boolean oldIsComposite = isComposite;
		isComposite = newIsComposite;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ErdMetamodelPackage.ATTRIBUTE__IS_COMPOSITE,
					oldIsComposite, isComposite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsDerived() {
		return isDerived;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsDerived(boolean newIsDerived) {
		boolean oldIsDerived = isDerived;
		isDerived = newIsDerived;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ErdMetamodelPackage.ATTRIBUTE__IS_DERIVED,
					oldIsDerived, isDerived));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean ValidDataType(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Attribute::ValidDataType";
		try {
			/**
			 *
			 * inv ValidDataType:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[?] = self.dataType = DataTypes::INT or self.dataType = DataTypes::VARCHAR or self.dataType = DataTypes::DATE
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					ErdMetamodelPackage.Literals.ATTRIBUTE___VALID_DATA_TYPE__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, ErdMetamodelTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			} else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ DataTypes dataType_1 = this.getDataType();
					final /*@NonInvalid*/ EnumerationLiteralId BOXED_dataType_1 = dataType_1 == null ? null
							: ErdMetamodelTables.ENUMid_DataTypes
									.getEnumerationLiteralId(ClassUtil.nonNullState(dataType_1.getName()));
					final /*@NonInvalid*/ boolean eq = BOXED_dataType_1 == ErdMetamodelTables.ELITid_INT;
					final /*@NonInvalid*/ Boolean or;
					if (eq) {
						or = ValueUtil.TRUE_VALUE;
					} else {
						final /*@NonInvalid*/ boolean eq_0 = BOXED_dataType_1 == ErdMetamodelTables.ELITid_VARCHAR;
						if (eq_0) {
							or = ValueUtil.TRUE_VALUE;
						} else {
							or = ValueUtil.FALSE_VALUE;
						}
					}
					final /*@Thrown*/ Boolean result;
					if (or == ValueUtil.TRUE_VALUE) {
						result = ValueUtil.TRUE_VALUE;
					} else {
						final /*@NonInvalid*/ boolean eq_1 = BOXED_dataType_1 == ErdMetamodelTables.ELITid_DATE;
						if (eq_1) {
							result = ValueUtil.TRUE_VALUE;
						} else {
							if (or == null) {
								result = null;
							} else {
								result = ValueUtil.FALSE_VALUE;
							}
						}
					}
					CAUGHT_result = result;
				} catch (Exception e) {
					CAUGHT_result = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE
						.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object) null, diagnostics, context,
								(Object) null, severity_0, CAUGHT_result, ErdMetamodelTables.INT_0)
						.booleanValue();
				local_0 = logDiagnostic;
			}
			return local_0;
		} catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ErdMetamodelPackage.ATTRIBUTE__NAME:
			return getName();
		case ErdMetamodelPackage.ATTRIBUTE__IS_PRIMARY_KEY:
			return isIsPrimaryKey();
		case ErdMetamodelPackage.ATTRIBUTE__DATA_TYPE:
			return getDataType();
		case ErdMetamodelPackage.ATTRIBUTE__IS_COMPOSITE:
			return isIsComposite();
		case ErdMetamodelPackage.ATTRIBUTE__IS_DERIVED:
			return isIsDerived();
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
		case ErdMetamodelPackage.ATTRIBUTE__NAME:
			setName((String) newValue);
			return;
		case ErdMetamodelPackage.ATTRIBUTE__IS_PRIMARY_KEY:
			setIsPrimaryKey((Boolean) newValue);
			return;
		case ErdMetamodelPackage.ATTRIBUTE__DATA_TYPE:
			setDataType((DataTypes) newValue);
			return;
		case ErdMetamodelPackage.ATTRIBUTE__IS_COMPOSITE:
			setIsComposite((Boolean) newValue);
			return;
		case ErdMetamodelPackage.ATTRIBUTE__IS_DERIVED:
			setIsDerived((Boolean) newValue);
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
		case ErdMetamodelPackage.ATTRIBUTE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case ErdMetamodelPackage.ATTRIBUTE__IS_PRIMARY_KEY:
			setIsPrimaryKey(IS_PRIMARY_KEY_EDEFAULT);
			return;
		case ErdMetamodelPackage.ATTRIBUTE__DATA_TYPE:
			setDataType(DATA_TYPE_EDEFAULT);
			return;
		case ErdMetamodelPackage.ATTRIBUTE__IS_COMPOSITE:
			setIsComposite(IS_COMPOSITE_EDEFAULT);
			return;
		case ErdMetamodelPackage.ATTRIBUTE__IS_DERIVED:
			setIsDerived(IS_DERIVED_EDEFAULT);
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
		case ErdMetamodelPackage.ATTRIBUTE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case ErdMetamodelPackage.ATTRIBUTE__IS_PRIMARY_KEY:
			return isPrimaryKey != IS_PRIMARY_KEY_EDEFAULT;
		case ErdMetamodelPackage.ATTRIBUTE__DATA_TYPE:
			return dataType != DATA_TYPE_EDEFAULT;
		case ErdMetamodelPackage.ATTRIBUTE__IS_COMPOSITE:
			return isComposite != IS_COMPOSITE_EDEFAULT;
		case ErdMetamodelPackage.ATTRIBUTE__IS_DERIVED:
			return isDerived != IS_DERIVED_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case ErdMetamodelPackage.ATTRIBUTE___VALID_DATA_TYPE__DIAGNOSTICCHAIN_MAP:
			return ValidDataType((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", isPrimaryKey: ");
		result.append(isPrimaryKey);
		result.append(", dataType: ");
		result.append(dataType);
		result.append(", isComposite: ");
		result.append(isComposite);
		result.append(", isDerived: ");
		result.append(isDerived);
		result.append(')');
		return result.toString();
	}

} //AttributeImpl
