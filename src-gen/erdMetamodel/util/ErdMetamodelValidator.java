/**
 */
package erdMetamodel.util;

import erdMetamodel.*;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see erdMetamodel.ErdMetamodelPackage
 * @generated
 */
public class ErdMetamodelValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final ErdMetamodelValidator INSTANCE = new ErdMetamodelValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "erdMetamodel";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Unique Entity Name' of 'Entity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ENTITY__UNIQUE_ENTITY_NAME = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Entity Has Primary Key' of 'Entity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ENTITY__ENTITY_HAS_PRIMARY_KEY = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Unique Attribute Names' of 'Entity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ENTITY__UNIQUE_ATTRIBUTE_NAMES = 3;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Identifying Relationship Exists' of 'Weak Entity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int WEAK_ENTITY__IDENTIFYING_RELATIONSHIP_EXISTS = 4;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Aggregated Entities Exist' of 'Complex Entity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COMPLEX_ENTITY__AGGREGATED_ENTITIES_EXIST = 5;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Valid Data Type' of 'Attribute'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ATTRIBUTE__VALID_DATA_TYPE = 6;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Sub Attributes Exist' of 'Composite Attribute'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COMPOSITE_ATTRIBUTE__SUB_ATTRIBUTES_EXIST = 7;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Valid Source And Target' of 'Relationship'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RELATIONSHIP__VALID_SOURCE_AND_TARGET = 8;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Relationship Name Not Empty' of 'Relationship'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RELATIONSHIP__RELATIONSHIP_NAME_NOT_EMPTY = 9;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 9;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErdMetamodelValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
		return ErdMetamodelPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		switch (classifierID) {
		case ErdMetamodelPackage.ENTITY:
			return validateEntity((Entity) value, diagnostics, context);
		case ErdMetamodelPackage.WEAK_ENTITY:
			return validateWeakEntity((WeakEntity) value, diagnostics, context);
		case ErdMetamodelPackage.COMPLEX_ENTITY:
			return validateComplexEntity((ComplexEntity) value, diagnostics, context);
		case ErdMetamodelPackage.ATTRIBUTE:
			return validateAttribute((Attribute) value, diagnostics, context);
		case ErdMetamodelPackage.COMPOSITE_ATTRIBUTE:
			return validateCompositeAttribute((CompositeAttribute) value, diagnostics, context);
		case ErdMetamodelPackage.RELATIONSHIP:
			return validateRelationship((Relationship) value, diagnostics, context);
		case ErdMetamodelPackage.CONSTRAINT:
			return validateConstraint((Constraint) value, diagnostics, context);
		case ErdMetamodelPackage.DATA_TYPES:
			return validateDataTypes((DataTypes) value, diagnostics, context);
		case ErdMetamodelPackage.RELATIONSHIP_TYPE:
			return validateRelationshipType((RelationshipType) value, diagnostics, context);
		default:
			return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntity(Entity entity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(entity, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(entity, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(entity, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(entity, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(entity, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(entity, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(entity, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(entity, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(entity, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateEntity_UniqueAttributeNames(entity, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateEntity_UniqueEntityName(entity, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateEntity_EntityHasPrimaryKey(entity, diagnostics, context);
		return result;
	}

	/**
	 * Validates the UniqueAttributeNames constraint of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntity_UniqueAttributeNames(Entity entity, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return entity.UniqueAttributeNames(diagnostics, context);
	}

	/**
	 * Validates the UniqueEntityName constraint of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntity_UniqueEntityName(Entity entity, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return entity.UniqueEntityName(diagnostics, context);
	}

	/**
	 * Validates the EntityHasPrimaryKey constraint of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntity_EntityHasPrimaryKey(Entity entity, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return entity.EntityHasPrimaryKey(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWeakEntity(WeakEntity weakEntity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(weakEntity, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(weakEntity, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(weakEntity, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(weakEntity, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(weakEntity, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(weakEntity, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(weakEntity, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(weakEntity, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(weakEntity, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateEntity_UniqueAttributeNames(weakEntity, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateEntity_UniqueEntityName(weakEntity, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateEntity_EntityHasPrimaryKey(weakEntity, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateWeakEntity_IdentifyingRelationshipExists(weakEntity, diagnostics, context);
		return result;
	}

	/**
	 * Validates the IdentifyingRelationshipExists constraint of '<em>Weak Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWeakEntity_IdentifyingRelationshipExists(WeakEntity weakEntity, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return weakEntity.IdentifyingRelationshipExists(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComplexEntity(ComplexEntity complexEntity, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(complexEntity, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(complexEntity, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(complexEntity, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(complexEntity, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(complexEntity, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(complexEntity, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(complexEntity, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(complexEntity, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(complexEntity, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateComplexEntity_AggregatedEntitiesExist(complexEntity, diagnostics, context);
		return result;
	}

	/**
	 * Validates the AggregatedEntitiesExist constraint of '<em>Complex Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComplexEntity_AggregatedEntitiesExist(ComplexEntity complexEntity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return complexEntity.AggregatedEntitiesExist(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttribute(Attribute attribute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(attribute, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(attribute, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(attribute, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(attribute, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(attribute, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(attribute, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(attribute, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(attribute, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(attribute, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateAttribute_ValidDataType(attribute, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ValidDataType constraint of '<em>Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttribute_ValidDataType(Attribute attribute, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return attribute.ValidDataType(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompositeAttribute(CompositeAttribute compositeAttribute, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(compositeAttribute, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(compositeAttribute, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(compositeAttribute, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(compositeAttribute, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(compositeAttribute, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(compositeAttribute, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(compositeAttribute, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(compositeAttribute, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(compositeAttribute, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateCompositeAttribute_SubAttributesExist(compositeAttribute, diagnostics, context);
		return result;
	}

	/**
	 * Validates the SubAttributesExist constraint of '<em>Composite Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompositeAttribute_SubAttributesExist(CompositeAttribute compositeAttribute,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return compositeAttribute.SubAttributesExist(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelationship(Relationship relationship, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(relationship, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(relationship, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(relationship, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(relationship, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(relationship, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(relationship, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(relationship, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(relationship, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(relationship, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateRelationship_RelationshipNameNotEmpty(relationship, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateRelationship_ValidSourceAndTarget(relationship, diagnostics, context);
		return result;
	}

	/**
	 * Validates the RelationshipNameNotEmpty constraint of '<em>Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelationship_RelationshipNameNotEmpty(Relationship relationship, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return relationship.RelationshipNameNotEmpty(diagnostics, context);
	}

	/**
	 * Validates the ValidSourceAndTarget constraint of '<em>Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelationship_ValidSourceAndTarget(Relationship relationship, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return relationship.ValidSourceAndTarget(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConstraint(Constraint constraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(constraint, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataTypes(DataTypes dataTypes, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelationshipType(RelationshipType relationshipType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //ErdMetamodelValidator
