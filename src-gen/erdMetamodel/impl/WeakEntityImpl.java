/**
 */
package erdMetamodel.impl;

import erdMetamodel.ErdMetamodelPackage;
import erdMetamodel.ErdMetamodelTables;
import erdMetamodel.Relationship;
import erdMetamodel.WeakEntity;

import java.lang.reflect.InvocationTargetException;

import java.util.Map;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.ocl.pivot.evaluation.Executor;

import org.eclipse.ocl.pivot.ids.TypeId;

import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;

import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;

import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.IntegerValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Weak Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link erdMetamodel.impl.WeakEntityImpl#getIdentifyingRelationship <em>Identifying Relationship</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WeakEntityImpl extends EntityImpl implements WeakEntity {
	/**
	 * The cached value of the '{@link #getIdentifyingRelationship() <em>Identifying Relationship</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifyingRelationship()
	 * @generated
	 * @ordered
	 */
	protected Relationship identifyingRelationship;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WeakEntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ErdMetamodelPackage.Literals.WEAK_ENTITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Relationship getIdentifyingRelationship() {
		if (identifyingRelationship != null && identifyingRelationship.eIsProxy()) {
			InternalEObject oldIdentifyingRelationship = (InternalEObject) identifyingRelationship;
			identifyingRelationship = (Relationship) eResolveProxy(oldIdentifyingRelationship);
			if (identifyingRelationship != oldIdentifyingRelationship) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ErdMetamodelPackage.WEAK_ENTITY__IDENTIFYING_RELATIONSHIP, oldIdentifyingRelationship,
							identifyingRelationship));
			}
		}
		return identifyingRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relationship basicGetIdentifyingRelationship() {
		return identifyingRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIdentifyingRelationship(Relationship newIdentifyingRelationship) {
		Relationship oldIdentifyingRelationship = identifyingRelationship;
		identifyingRelationship = newIdentifyingRelationship;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ErdMetamodelPackage.WEAK_ENTITY__IDENTIFYING_RELATIONSHIP, oldIdentifyingRelationship,
					identifyingRelationship));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean IdentifyingRelationshipExists(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "WeakEntity::IdentifyingRelationshipExists";
		try {
			/**
			 *
			 * inv IdentifyingRelationshipExists:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = not self.identifyingRelationship.oclIsUndefined()
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					ErdMetamodelPackage.Literals.WEAK_ENTITY___IDENTIFYING_RELATIONSHIP_EXISTS__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, ErdMetamodelTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			} else {
				final /*@NonInvalid*/ Boolean result = ValueUtil.TRUE_VALUE;
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE
						.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object) null, diagnostics, context,
								(Object) null, severity_0, result, ErdMetamodelTables.INT_0)
						.booleanValue();
				IF_le = logDiagnostic;
			}
			return IF_le;
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
		case ErdMetamodelPackage.WEAK_ENTITY__IDENTIFYING_RELATIONSHIP:
			if (resolve)
				return getIdentifyingRelationship();
			return basicGetIdentifyingRelationship();
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
		case ErdMetamodelPackage.WEAK_ENTITY__IDENTIFYING_RELATIONSHIP:
			setIdentifyingRelationship((Relationship) newValue);
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
		case ErdMetamodelPackage.WEAK_ENTITY__IDENTIFYING_RELATIONSHIP:
			setIdentifyingRelationship((Relationship) null);
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
		case ErdMetamodelPackage.WEAK_ENTITY__IDENTIFYING_RELATIONSHIP:
			return identifyingRelationship != null;
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
		case ErdMetamodelPackage.WEAK_ENTITY___IDENTIFYING_RELATIONSHIP_EXISTS__DIAGNOSTICCHAIN_MAP:
			return IdentifyingRelationshipExists((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //WeakEntityImpl
