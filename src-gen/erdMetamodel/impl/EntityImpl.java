/**
 */
package erdMetamodel.impl;

import erdMetamodel.Attribute;
import erdMetamodel.Entity;
import erdMetamodel.ErdMetamodelPackage;
import erdMetamodel.ErdMetamodelTables;
import erdMetamodel.Relationship;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.ocl.pivot.evaluation.Executor;

import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;

import org.eclipse.ocl.pivot.library.classifier.ClassifierAllInstancesOperation;

import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;

import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;

import org.eclipse.ocl.pivot.messages.PivotMessages;

import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.OrderedSetValue;
import org.eclipse.ocl.pivot.values.SetValue;

import org.eclipse.ocl.pivot.values.SetValue.Accumulator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link erdMetamodel.impl.EntityImpl#getName <em>Name</em>}</li>
 *   <li>{@link erdMetamodel.impl.EntityImpl#getRelationships <em>Relationships</em>}</li>
 *   <li>{@link erdMetamodel.impl.EntityImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link erdMetamodel.impl.EntityImpl#getForeignKeys <em>Foreign Keys</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EntityImpl extends MinimalEObjectImpl.Container implements Entity {
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
	 * The cached value of the '{@link #getRelationships() <em>Relationships</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationships()
	 * @generated
	 * @ordered
	 */
	protected EList<Relationship> relationships;

	/**
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribute> attributes;

	/**
	 * The cached value of the '{@link #getForeignKeys() <em>Foreign Keys</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForeignKeys()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribute> foreignKeys;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ErdMetamodelPackage.Literals.ENTITY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ErdMetamodelPackage.ENTITY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Relationship> getRelationships() {
		if (relationships == null) {
			relationships = new EObjectContainmentEList<Relationship>(Relationship.class, this,
					ErdMetamodelPackage.ENTITY__RELATIONSHIPS);
		}
		return relationships;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Attribute> getAttributes() {
		if (attributes == null) {
			attributes = new EObjectContainmentEList<Attribute>(Attribute.class, this,
					ErdMetamodelPackage.ENTITY__ATTRIBUTES);
		}
		return attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Attribute> getForeignKeys() {
		if (foreignKeys == null) {
			foreignKeys = new EObjectResolvingEList<Attribute>(Attribute.class, this,
					ErdMetamodelPackage.ENTITY__FOREIGN_KEYS);
		}
		return foreignKeys;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean UniqueEntityName(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Entity::UniqueEntityName";
		try {
			/**
			 *
			 * inv UniqueEntityName:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[1] = Entity.allInstances()->isUnique(e | e.name)
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					ErdMetamodelPackage.Literals.ENTITY___UNIQUE_ENTITY_NAME__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, ErdMetamodelTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			} else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_erdMetamodel_c_c_Entity = idResolver
							.getClass(ErdMetamodelTables.CLSSid_Entity, null);
					final /*@NonInvalid*/ SetValue allInstances = ClassifierAllInstancesOperation.INSTANCE
							.evaluate(executor, ErdMetamodelTables.SET_CLSSid_Entity, TYP_erdMetamodel_c_c_Entity);
					/*@Thrown*/ Accumulator accumulator = ValueUtil
							.createSetAccumulatorValue(ErdMetamodelTables.SET_CLSSid_Entity);
					Iterator<Object> ITERATOR_e_0 = allInstances.iterator();
					/*@Thrown*/ boolean result;
					while (true) {
						if (!ITERATOR_e_0.hasNext()) {
							result = true;
							break;
						}
						/*@NonInvalid*/ Entity e_0 = (Entity) ITERATOR_e_0.next();
						/**
						 * e.name
						 */
						final /*@NonInvalid*/ String name = e_0.getName();
						//
						if (accumulator.includes(name) == ValueUtil.TRUE_VALUE) {
							result = false;
							break; // Abort after second find
						} else {
							accumulator.add(name);
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
	public boolean EntityHasPrimaryKey(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Entity::EntityHasPrimaryKey";
		try {
			/**
			 *
			 * inv EntityHasPrimaryKey:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = self.attributes->exists(a | a.isPrimaryKey = true)
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					ErdMetamodelPackage.Literals.ENTITY___ENTITY_HAS_PRIMARY_KEY__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, ErdMetamodelTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			} else {
				final /*@NonInvalid*/ List<Attribute> attributes = this.getAttributes();
				final /*@NonInvalid*/ OrderedSetValue BOXED_attributes = idResolver
						.createOrderedSetOfAll(ErdMetamodelTables.ORD_CLSSid_Attribute, attributes);
				/*@Thrown*/ Object accumulator = ValueUtil.FALSE_VALUE;
				Iterator<Object> ITERATOR_a = BOXED_attributes.iterator();
				/*@NonInvalid*/ Boolean result;
				while (true) {
					if (!ITERATOR_a.hasNext()) {
						if (accumulator == ValueUtil.FALSE_VALUE) {
							result = ValueUtil.FALSE_VALUE;
						} else {
							throw (InvalidValueException) accumulator;
						}
						break;
					}
					/*@NonInvalid*/ Attribute a = (Attribute) ITERATOR_a.next();
					/**
					 * a.isPrimaryKey
					 */
					final /*@NonInvalid*/ boolean isPrimaryKey = a.isIsPrimaryKey();
					//
					if (isPrimaryKey) { // Normal successful body evaluation result
						result = ValueUtil.TRUE_VALUE;
						break; // Stop immediately
					} else if (!isPrimaryKey) { // Normal unsuccessful body evaluation result
						; // Carry on
					} else { // Impossible badly typed result
						accumulator = new InvalidValueException(PivotMessages.NonBooleanBody, "exists");
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
	public boolean UniqueAttributeNames(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Entity::UniqueAttributeNames";
		try {
			/**
			 *
			 * inv UniqueAttributeNames:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[1] = self.attributes->isUnique(a | a.name)
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					ErdMetamodelPackage.Literals.ENTITY___UNIQUE_ATTRIBUTE_NAMES__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, ErdMetamodelTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			} else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ List<Attribute> attributes = this.getAttributes();
					final /*@NonInvalid*/ OrderedSetValue BOXED_attributes = idResolver
							.createOrderedSetOfAll(ErdMetamodelTables.ORD_CLSSid_Attribute, attributes);
					/*@Thrown*/ Accumulator accumulator = ValueUtil
							.createSetAccumulatorValue(ErdMetamodelTables.ORD_CLSSid_Attribute);
					Iterator<Object> ITERATOR_a = BOXED_attributes.iterator();
					/*@Thrown*/ boolean result;
					while (true) {
						if (!ITERATOR_a.hasNext()) {
							result = true;
							break;
						}
						/*@NonInvalid*/ Attribute a = (Attribute) ITERATOR_a.next();
						/**
						 * a.name
						 */
						final /*@NonInvalid*/ String name = a.getName();
						//
						if (accumulator.includes(name) == ValueUtil.TRUE_VALUE) {
							result = false;
							break; // Abort after second find
						} else {
							accumulator.add(name);
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ErdMetamodelPackage.ENTITY__RELATIONSHIPS:
			return ((InternalEList<?>) getRelationships()).basicRemove(otherEnd, msgs);
		case ErdMetamodelPackage.ENTITY__ATTRIBUTES:
			return ((InternalEList<?>) getAttributes()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ErdMetamodelPackage.ENTITY__NAME:
			return getName();
		case ErdMetamodelPackage.ENTITY__RELATIONSHIPS:
			return getRelationships();
		case ErdMetamodelPackage.ENTITY__ATTRIBUTES:
			return getAttributes();
		case ErdMetamodelPackage.ENTITY__FOREIGN_KEYS:
			return getForeignKeys();
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
		case ErdMetamodelPackage.ENTITY__NAME:
			setName((String) newValue);
			return;
		case ErdMetamodelPackage.ENTITY__RELATIONSHIPS:
			getRelationships().clear();
			getRelationships().addAll((Collection<? extends Relationship>) newValue);
			return;
		case ErdMetamodelPackage.ENTITY__ATTRIBUTES:
			getAttributes().clear();
			getAttributes().addAll((Collection<? extends Attribute>) newValue);
			return;
		case ErdMetamodelPackage.ENTITY__FOREIGN_KEYS:
			getForeignKeys().clear();
			getForeignKeys().addAll((Collection<? extends Attribute>) newValue);
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
		case ErdMetamodelPackage.ENTITY__NAME:
			setName(NAME_EDEFAULT);
			return;
		case ErdMetamodelPackage.ENTITY__RELATIONSHIPS:
			getRelationships().clear();
			return;
		case ErdMetamodelPackage.ENTITY__ATTRIBUTES:
			getAttributes().clear();
			return;
		case ErdMetamodelPackage.ENTITY__FOREIGN_KEYS:
			getForeignKeys().clear();
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
		case ErdMetamodelPackage.ENTITY__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case ErdMetamodelPackage.ENTITY__RELATIONSHIPS:
			return relationships != null && !relationships.isEmpty();
		case ErdMetamodelPackage.ENTITY__ATTRIBUTES:
			return attributes != null && !attributes.isEmpty();
		case ErdMetamodelPackage.ENTITY__FOREIGN_KEYS:
			return foreignKeys != null && !foreignKeys.isEmpty();
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
		case ErdMetamodelPackage.ENTITY___UNIQUE_ENTITY_NAME__DIAGNOSTICCHAIN_MAP:
			return UniqueEntityName((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case ErdMetamodelPackage.ENTITY___ENTITY_HAS_PRIMARY_KEY__DIAGNOSTICCHAIN_MAP:
			return EntityHasPrimaryKey((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case ErdMetamodelPackage.ENTITY___UNIQUE_ATTRIBUTE_NAMES__DIAGNOSTICCHAIN_MAP:
			return UniqueAttributeNames((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
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
		result.append(')');
		return result.toString();
	}

} //EntityImpl
