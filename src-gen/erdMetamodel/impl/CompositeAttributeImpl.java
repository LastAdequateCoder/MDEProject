/**
 */
package erdMetamodel.impl;

import erdMetamodel.Attribute;
import erdMetamodel.CompositeAttribute;
import erdMetamodel.ErdMetamodelPackage;
import erdMetamodel.ErdMetamodelTables;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.ocl.pivot.evaluation.Executor;

import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;

import org.eclipse.ocl.pivot.library.collection.CollectionIsEmptyOperation;

import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;

import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;

import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.OrderedSetValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Composite Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link erdMetamodel.impl.CompositeAttributeImpl#getSubAttributes <em>Sub Attributes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompositeAttributeImpl extends MinimalEObjectImpl.Container implements CompositeAttribute {
	/**
	 * The cached value of the '{@link #getSubAttributes() <em>Sub Attributes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribute> subAttributes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositeAttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ErdMetamodelPackage.Literals.COMPOSITE_ATTRIBUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Attribute> getSubAttributes() {
		if (subAttributes == null) {
			subAttributes = new EObjectResolvingEList<Attribute>(Attribute.class, this,
					ErdMetamodelPackage.COMPOSITE_ATTRIBUTE__SUB_ATTRIBUTES);
		}
		return subAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean SubAttributesExist(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "CompositeAttribute::SubAttributesExist";
		try {
			/**
			 *
			 * inv SubAttributesExist:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[?] = not self.subAttributes->isEmpty()
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					ErdMetamodelPackage.Literals.COMPOSITE_ATTRIBUTE___SUB_ATTRIBUTES_EXIST__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, ErdMetamodelTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			} else {
				final /*@NonInvalid*/ List<Attribute> subAttributes = this.getSubAttributes();
				final /*@NonInvalid*/ OrderedSetValue BOXED_subAttributes = idResolver
						.createOrderedSetOfAll(ErdMetamodelTables.ORD_CLSSid_Attribute, subAttributes);
				final /*@NonInvalid*/ boolean isEmpty = CollectionIsEmptyOperation.INSTANCE
						.evaluate(BOXED_subAttributes).booleanValue();
				final /*@NonInvalid*/ Boolean result;
				if (!isEmpty) {
					result = ValueUtil.TRUE_VALUE;
				} else {
					if (isEmpty) {
						result = ValueUtil.FALSE_VALUE;
					} else {
						result = null;
					}
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE
						.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object) null, diagnostics, context,
								(Object) null, severity_0, result, ErdMetamodelTables.INT_0)
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
		case ErdMetamodelPackage.COMPOSITE_ATTRIBUTE__SUB_ATTRIBUTES:
			return getSubAttributes();
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
		case ErdMetamodelPackage.COMPOSITE_ATTRIBUTE__SUB_ATTRIBUTES:
			getSubAttributes().clear();
			getSubAttributes().addAll((Collection<? extends Attribute>) newValue);
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
		case ErdMetamodelPackage.COMPOSITE_ATTRIBUTE__SUB_ATTRIBUTES:
			getSubAttributes().clear();
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
		case ErdMetamodelPackage.COMPOSITE_ATTRIBUTE__SUB_ATTRIBUTES:
			return subAttributes != null && !subAttributes.isEmpty();
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
		case ErdMetamodelPackage.COMPOSITE_ATTRIBUTE___SUB_ATTRIBUTES_EXIST__DIAGNOSTICCHAIN_MAP:
			return SubAttributesExist((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //CompositeAttributeImpl
