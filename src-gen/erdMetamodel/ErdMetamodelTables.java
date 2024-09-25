/*******************************************************************************
 *************************************************************************
 * This code is 100% auto-generated
 * from:
 *   /erdMetamodel.ecore
 * using:
 *   /erdMetamodel.genmodel
 *   org.eclipse.ocl.examples.codegen.oclinecore.OCLinEcoreTables
 *
 * Do not edit it.
 *******************************************************************************/
package erdMetamodel;

// import erdMetamodel.ErdMetamodelPackage;
// import erdMetamodel.ErdMetamodelTables;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.ocl.pivot.ids.ClassId;
import org.eclipse.ocl.pivot.ids.CollectionTypeId;
import org.eclipse.ocl.pivot.ids.EnumerationId;
import org.eclipse.ocl.pivot.ids.EnumerationLiteralId;
import org.eclipse.ocl.pivot.ids.IdManager;
import org.eclipse.ocl.pivot.ids.NsURIPackageId;
import org.eclipse.ocl.pivot.ids.RootPackageId;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorEnumeration;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorEnumerationLiteral;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorPackage;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorType;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreLibraryOppositeProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorFragment;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorOperation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorPropertyWithImplementation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorStandardLibrary;
import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;
import org.eclipse.ocl.pivot.utilities.AbstractTables;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;

/**
 * ErdMetamodelTables provides the dispatch tables for the erdMetamodel for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
public class ErdMetamodelTables extends AbstractTables
{
	static {
		Init.initStart();
	}

	/**
	 *	The package descriptor for the package.
	 */
	public static final EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(ErdMetamodelPackage.eINSTANCE);

	/**
	 *	The library of all packages and types.
	 */
	public static final ExecutorStandardLibrary LIBRARY = OCLstdlibTables.LIBRARY;

	/**
	 *	Constants used by auto-generated code.
	 */
	public static final /*@NonInvalid*/ RootPackageId PACKid_$metamodel$ = IdManager.getRootPackageId("$metamodel$");
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_www_example_org_s_erdMetamodel = IdManager.getNsURIPackageId("http://www.example.org/erdMetamodel", null, ErdMetamodelPackage.eINSTANCE);
	public static final /*@NonInvalid*/ ClassId CLSSid_Attribute = ErdMetamodelTables.PACKid_http_c_s_s_www_example_org_s_erdMetamodel.getClassId("Attribute", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Class = ErdMetamodelTables.PACKid_$metamodel$.getClassId("Class", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_ComplexEntity = ErdMetamodelTables.PACKid_http_c_s_s_www_example_org_s_erdMetamodel.getClassId("ComplexEntity", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_CompositeAttribute = ErdMetamodelTables.PACKid_http_c_s_s_www_example_org_s_erdMetamodel.getClassId("CompositeAttribute", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Entity = ErdMetamodelTables.PACKid_http_c_s_s_www_example_org_s_erdMetamodel.getClassId("Entity", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Relationship = ErdMetamodelTables.PACKid_http_c_s_s_www_example_org_s_erdMetamodel.getClassId("Relationship", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_WeakEntity = ErdMetamodelTables.PACKid_http_c_s_s_www_example_org_s_erdMetamodel.getClassId("WeakEntity", 0);
	public static final /*@NonInvalid*/ EnumerationId ENUMid_DataTypes = ErdMetamodelTables.PACKid_http_c_s_s_www_example_org_s_erdMetamodel.getEnumerationId("DataTypes");
	public static final /*@NonInvalid*/ EnumerationId ENUMid_RelationshipType = ErdMetamodelTables.PACKid_http_c_s_s_www_example_org_s_erdMetamodel.getEnumerationId("RelationshipType");
	public static final /*@NonInvalid*/ IntegerValue INT_0 = ValueUtil.integerValueOf("0");
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_ComplexEntity = TypeId.BAG.getSpecializedId(ErdMetamodelTables.CLSSid_ComplexEntity);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_CompositeAttribute = TypeId.BAG.getSpecializedId(ErdMetamodelTables.CLSSid_CompositeAttribute);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Entity = TypeId.BAG.getSpecializedId(ErdMetamodelTables.CLSSid_Entity);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Relationship = TypeId.BAG.getSpecializedId(ErdMetamodelTables.CLSSid_Relationship);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_WeakEntity = TypeId.BAG.getSpecializedId(ErdMetamodelTables.CLSSid_WeakEntity);
	public static final /*@NonInvalid*/ EnumerationLiteralId ELITid_DATE = ErdMetamodelTables.ENUMid_DataTypes.getEnumerationLiteralId("DATE");
	public static final /*@NonInvalid*/ EnumerationLiteralId ELITid_INT = ErdMetamodelTables.ENUMid_DataTypes.getEnumerationLiteralId("INT");
	public static final /*@NonInvalid*/ EnumerationLiteralId ELITid_VARCHAR = ErdMetamodelTables.ENUMid_DataTypes.getEnumerationLiteralId("VARCHAR");
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Attribute = TypeId.ORDERED_SET.getSpecializedId(ErdMetamodelTables.CLSSid_Attribute);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Entity = TypeId.ORDERED_SET.getSpecializedId(ErdMetamodelTables.CLSSid_Entity);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Relationship = TypeId.ORDERED_SET.getSpecializedId(ErdMetamodelTables.CLSSid_Relationship);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_Entity = TypeId.SET.getSpecializedId(ErdMetamodelTables.CLSSid_Entity);

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {
		static {
			Init.initStart();
			ErdMetamodelTables.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ErdMetamodelTables::TypeParameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The type descriptors for each type.
	 */
	public static class Types {
		static {
			Init.initStart();
			TypeParameters.init();
		}

		public static final EcoreExecutorType _Attribute = new EcoreExecutorType(ErdMetamodelPackage.Literals.ATTRIBUTE, PACKAGE, 0);
		public static final EcoreExecutorType _ComplexEntity = new EcoreExecutorType(ErdMetamodelPackage.Literals.COMPLEX_ENTITY, PACKAGE, 0);
		public static final EcoreExecutorType _CompositeAttribute = new EcoreExecutorType(ErdMetamodelPackage.Literals.COMPOSITE_ATTRIBUTE, PACKAGE, 0);
		public static final EcoreExecutorType _Constraint = new EcoreExecutorType(ErdMetamodelPackage.Literals.CONSTRAINT, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _DataTypes = new EcoreExecutorEnumeration(ErdMetamodelPackage.Literals.DATA_TYPES, PACKAGE, 0);
		public static final EcoreExecutorType _Entity = new EcoreExecutorType(ErdMetamodelPackage.Literals.ENTITY, PACKAGE, 0);
		public static final EcoreExecutorType _Relationship = new EcoreExecutorType(ErdMetamodelPackage.Literals.RELATIONSHIP, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _RelationshipType = new EcoreExecutorEnumeration(ErdMetamodelPackage.Literals.RELATIONSHIP_TYPE, PACKAGE, 0);
		public static final EcoreExecutorType _WeakEntity = new EcoreExecutorType(ErdMetamodelPackage.Literals.WEAK_ENTITY, PACKAGE, 0);

		private static final EcoreExecutorType /*@NonNull*/ [] types = {
			_Attribute,
			_ComplexEntity,
			_CompositeAttribute,
			_Constraint,
			_DataTypes,
			_Entity,
			_Relationship,
			_RelationshipType,
			_WeakEntity
		};

		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(LIBRARY, types);
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ErdMetamodelTables::Types and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragment descriptors for the local elements of each type and its supertypes.
	 */
	public static class Fragments {
		static {
			Init.initStart();
			Types.init();
		}

		private static final ExecutorFragment _Attribute__Attribute = new ExecutorFragment(Types._Attribute, ErdMetamodelTables.Types._Attribute);
		private static final ExecutorFragment _Attribute__OclAny = new ExecutorFragment(Types._Attribute, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Attribute__OclElement = new ExecutorFragment(Types._Attribute, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _ComplexEntity__ComplexEntity = new ExecutorFragment(Types._ComplexEntity, ErdMetamodelTables.Types._ComplexEntity);
		private static final ExecutorFragment _ComplexEntity__OclAny = new ExecutorFragment(Types._ComplexEntity, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _ComplexEntity__OclElement = new ExecutorFragment(Types._ComplexEntity, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _CompositeAttribute__CompositeAttribute = new ExecutorFragment(Types._CompositeAttribute, ErdMetamodelTables.Types._CompositeAttribute);
		private static final ExecutorFragment _CompositeAttribute__OclAny = new ExecutorFragment(Types._CompositeAttribute, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _CompositeAttribute__OclElement = new ExecutorFragment(Types._CompositeAttribute, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Constraint__Constraint = new ExecutorFragment(Types._Constraint, ErdMetamodelTables.Types._Constraint);
		private static final ExecutorFragment _Constraint__OclAny = new ExecutorFragment(Types._Constraint, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Constraint__OclElement = new ExecutorFragment(Types._Constraint, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _DataTypes__DataTypes = new ExecutorFragment(Types._DataTypes, ErdMetamodelTables.Types._DataTypes);
		private static final ExecutorFragment _DataTypes__OclAny = new ExecutorFragment(Types._DataTypes, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _DataTypes__OclElement = new ExecutorFragment(Types._DataTypes, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _DataTypes__OclEnumeration = new ExecutorFragment(Types._DataTypes, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _DataTypes__OclType = new ExecutorFragment(Types._DataTypes, OCLstdlibTables.Types._OclType);

		private static final ExecutorFragment _Entity__Entity = new ExecutorFragment(Types._Entity, ErdMetamodelTables.Types._Entity);
		private static final ExecutorFragment _Entity__OclAny = new ExecutorFragment(Types._Entity, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Entity__OclElement = new ExecutorFragment(Types._Entity, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Relationship__OclAny = new ExecutorFragment(Types._Relationship, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Relationship__OclElement = new ExecutorFragment(Types._Relationship, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Relationship__Relationship = new ExecutorFragment(Types._Relationship, ErdMetamodelTables.Types._Relationship);

		private static final ExecutorFragment _RelationshipType__OclAny = new ExecutorFragment(Types._RelationshipType, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _RelationshipType__OclElement = new ExecutorFragment(Types._RelationshipType, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _RelationshipType__OclEnumeration = new ExecutorFragment(Types._RelationshipType, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _RelationshipType__OclType = new ExecutorFragment(Types._RelationshipType, OCLstdlibTables.Types._OclType);
		private static final ExecutorFragment _RelationshipType__RelationshipType = new ExecutorFragment(Types._RelationshipType, ErdMetamodelTables.Types._RelationshipType);

		private static final ExecutorFragment _WeakEntity__Entity = new ExecutorFragment(Types._WeakEntity, ErdMetamodelTables.Types._Entity);
		private static final ExecutorFragment _WeakEntity__OclAny = new ExecutorFragment(Types._WeakEntity, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _WeakEntity__OclElement = new ExecutorFragment(Types._WeakEntity, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _WeakEntity__WeakEntity = new ExecutorFragment(Types._WeakEntity, ErdMetamodelTables.Types._WeakEntity);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ErdMetamodelTables::Fragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The parameter lists shared by operations.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Parameters {
		static {
			Init.initStart();
			Fragments.init();
		}


		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ErdMetamodelTables::Parameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The operation descriptors for each operation of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Operations {
		static {
			Init.initStart();
			Parameters.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ErdMetamodelTables::Operations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The property descriptors for each property of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Properties {
		static {
			Init.initStart();
			Operations.init();
		}

		public static final ExecutorProperty _Attribute__dataType = new EcoreExecutorProperty(ErdMetamodelPackage.Literals.ATTRIBUTE__DATA_TYPE, Types._Attribute, 0);
		public static final ExecutorProperty _Attribute__isComposite = new EcoreExecutorProperty(ErdMetamodelPackage.Literals.ATTRIBUTE__IS_COMPOSITE, Types._Attribute, 1);
		public static final ExecutorProperty _Attribute__isDerived = new EcoreExecutorProperty(ErdMetamodelPackage.Literals.ATTRIBUTE__IS_DERIVED, Types._Attribute, 2);
		public static final ExecutorProperty _Attribute__isPrimaryKey = new EcoreExecutorProperty(ErdMetamodelPackage.Literals.ATTRIBUTE__IS_PRIMARY_KEY, Types._Attribute, 3);
		public static final ExecutorProperty _Attribute__name = new EcoreExecutorProperty(ErdMetamodelPackage.Literals.ATTRIBUTE__NAME, Types._Attribute, 4);
		public static final ExecutorProperty _Attribute__CompositeAttribute__subAttributes = new ExecutorPropertyWithImplementation("CompositeAttribute", Types._Attribute, 5, new EcoreLibraryOppositeProperty(ErdMetamodelPackage.Literals.COMPOSITE_ATTRIBUTE__SUB_ATTRIBUTES));
		public static final ExecutorProperty _Attribute__Entity__attributes = new ExecutorPropertyWithImplementation("Entity", Types._Attribute, 6, new EcoreLibraryOppositeProperty(ErdMetamodelPackage.Literals.ENTITY__ATTRIBUTES));
		public static final ExecutorProperty _Attribute__Entity__foreignKeys = new ExecutorPropertyWithImplementation("Entity", Types._Attribute, 7, new EcoreLibraryOppositeProperty(ErdMetamodelPackage.Literals.ENTITY__FOREIGN_KEYS));

		public static final ExecutorProperty _ComplexEntity__aggregatedEntities = new EcoreExecutorProperty(ErdMetamodelPackage.Literals.COMPLEX_ENTITY__AGGREGATED_ENTITIES, Types._ComplexEntity, 0);

		public static final ExecutorProperty _CompositeAttribute__subAttributes = new EcoreExecutorProperty(ErdMetamodelPackage.Literals.COMPOSITE_ATTRIBUTE__SUB_ATTRIBUTES, Types._CompositeAttribute, 0);

		public static final ExecutorProperty _Entity__attributes = new EcoreExecutorProperty(ErdMetamodelPackage.Literals.ENTITY__ATTRIBUTES, Types._Entity, 0);
		public static final ExecutorProperty _Entity__foreignKeys = new EcoreExecutorProperty(ErdMetamodelPackage.Literals.ENTITY__FOREIGN_KEYS, Types._Entity, 1);
		public static final ExecutorProperty _Entity__name = new EcoreExecutorProperty(ErdMetamodelPackage.Literals.ENTITY__NAME, Types._Entity, 2);
		public static final ExecutorProperty _Entity__relationships = new EcoreExecutorProperty(ErdMetamodelPackage.Literals.ENTITY__RELATIONSHIPS, Types._Entity, 3);
		public static final ExecutorProperty _Entity__ComplexEntity__aggregatedEntities = new ExecutorPropertyWithImplementation("ComplexEntity", Types._Entity, 4, new EcoreLibraryOppositeProperty(ErdMetamodelPackage.Literals.COMPLEX_ENTITY__AGGREGATED_ENTITIES));
		public static final ExecutorProperty _Entity__Relationship__source = new ExecutorPropertyWithImplementation("Relationship", Types._Entity, 5, new EcoreLibraryOppositeProperty(ErdMetamodelPackage.Literals.RELATIONSHIP__SOURCE));
		public static final ExecutorProperty _Entity__Relationship__target = new ExecutorPropertyWithImplementation("Relationship", Types._Entity, 6, new EcoreLibraryOppositeProperty(ErdMetamodelPackage.Literals.RELATIONSHIP__TARGET));

		public static final ExecutorProperty _Relationship__name = new EcoreExecutorProperty(ErdMetamodelPackage.Literals.RELATIONSHIP__NAME, Types._Relationship, 0);
		public static final ExecutorProperty _Relationship__source = new EcoreExecutorProperty(ErdMetamodelPackage.Literals.RELATIONSHIP__SOURCE, Types._Relationship, 1);
		public static final ExecutorProperty _Relationship__target = new EcoreExecutorProperty(ErdMetamodelPackage.Literals.RELATIONSHIP__TARGET, Types._Relationship, 2);
		public static final ExecutorProperty _Relationship__type = new EcoreExecutorProperty(ErdMetamodelPackage.Literals.RELATIONSHIP__TYPE, Types._Relationship, 3);
		public static final ExecutorProperty _Relationship__Entity__relationships = new ExecutorPropertyWithImplementation("Entity", Types._Relationship, 4, new EcoreLibraryOppositeProperty(ErdMetamodelPackage.Literals.ENTITY__RELATIONSHIPS));
		public static final ExecutorProperty _Relationship__WeakEntity__identifyingRelationship = new ExecutorPropertyWithImplementation("WeakEntity", Types._Relationship, 5, new EcoreLibraryOppositeProperty(ErdMetamodelPackage.Literals.WEAK_ENTITY__IDENTIFYING_RELATIONSHIP));

		public static final ExecutorProperty _WeakEntity__identifyingRelationship = new EcoreExecutorProperty(ErdMetamodelPackage.Literals.WEAK_ENTITY__IDENTIFYING_RELATIONSHIP, Types._WeakEntity, 0);
		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ErdMetamodelTables::Properties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragments for all base types in depth order: OclAny first, OclSelf last.
	 */
	public static class TypeFragments {
		static {
			Init.initStart();
			Properties.init();
		}

		private static final ExecutorFragment /*@NonNull*/ [] _Attribute =
			{
				Fragments._Attribute__OclAny /* 0 */,
				Fragments._Attribute__OclElement /* 1 */,
				Fragments._Attribute__Attribute /* 2 */
			};
		private static final int /*@NonNull*/ [] __Attribute = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _ComplexEntity =
			{
				Fragments._ComplexEntity__OclAny /* 0 */,
				Fragments._ComplexEntity__OclElement /* 1 */,
				Fragments._ComplexEntity__ComplexEntity /* 2 */
			};
		private static final int /*@NonNull*/ [] __ComplexEntity = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _CompositeAttribute =
			{
				Fragments._CompositeAttribute__OclAny /* 0 */,
				Fragments._CompositeAttribute__OclElement /* 1 */,
				Fragments._CompositeAttribute__CompositeAttribute /* 2 */
			};
		private static final int /*@NonNull*/ [] __CompositeAttribute = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Constraint =
			{
				Fragments._Constraint__OclAny /* 0 */,
				Fragments._Constraint__OclElement /* 1 */,
				Fragments._Constraint__Constraint /* 2 */
			};
		private static final int /*@NonNull*/ [] __Constraint = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _DataTypes =
			{
				Fragments._DataTypes__OclAny /* 0 */,
				Fragments._DataTypes__OclElement /* 1 */,
				Fragments._DataTypes__OclType /* 2 */,
				Fragments._DataTypes__OclEnumeration /* 3 */,
				Fragments._DataTypes__DataTypes /* 4 */
			};
		private static final int /*@NonNull*/ [] __DataTypes = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Entity =
			{
				Fragments._Entity__OclAny /* 0 */,
				Fragments._Entity__OclElement /* 1 */,
				Fragments._Entity__Entity /* 2 */
			};
		private static final int /*@NonNull*/ [] __Entity = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Relationship =
			{
				Fragments._Relationship__OclAny /* 0 */,
				Fragments._Relationship__OclElement /* 1 */,
				Fragments._Relationship__Relationship /* 2 */
			};
		private static final int /*@NonNull*/ [] __Relationship = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _RelationshipType =
			{
				Fragments._RelationshipType__OclAny /* 0 */,
				Fragments._RelationshipType__OclElement /* 1 */,
				Fragments._RelationshipType__OclType /* 2 */,
				Fragments._RelationshipType__OclEnumeration /* 3 */,
				Fragments._RelationshipType__RelationshipType /* 4 */
			};
		private static final int /*@NonNull*/ [] __RelationshipType = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _WeakEntity =
			{
				Fragments._WeakEntity__OclAny /* 0 */,
				Fragments._WeakEntity__OclElement /* 1 */,
				Fragments._WeakEntity__Entity /* 2 */,
				Fragments._WeakEntity__WeakEntity /* 3 */
			};
		private static final int /*@NonNull*/ [] __WeakEntity = { 1,1,1,1 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._Attribute.initFragments(_Attribute, __Attribute);
			Types._ComplexEntity.initFragments(_ComplexEntity, __ComplexEntity);
			Types._CompositeAttribute.initFragments(_CompositeAttribute, __CompositeAttribute);
			Types._Constraint.initFragments(_Constraint, __Constraint);
			Types._DataTypes.initFragments(_DataTypes, __DataTypes);
			Types._Entity.initFragments(_Entity, __Entity);
			Types._Relationship.initFragments(_Relationship, __Relationship);
			Types._RelationshipType.initFragments(_RelationshipType, __RelationshipType);
			Types._WeakEntity.initFragments(_WeakEntity, __WeakEntity);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ErdMetamodelTables::TypeFragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local operations or local operation overrides for each fragment of each type.
	 */
	public static class FragmentOperations {
		static {
			Init.initStart();
			TypeFragments.init();
		}

		private static final ExecutorOperation /*@NonNull*/ [] _Attribute__Attribute = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Attribute__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Attribute__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _ComplexEntity__ComplexEntity = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ComplexEntity__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ComplexEntity__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _CompositeAttribute__CompositeAttribute = {};
		private static final ExecutorOperation /*@NonNull*/ [] _CompositeAttribute__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _CompositeAttribute__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Constraint__Constraint = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Constraint__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Constraint__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _DataTypes__DataTypes = {};
		private static final ExecutorOperation /*@NonNull*/ [] _DataTypes__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _DataTypes__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _DataTypes__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _DataTypes__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Entity__Entity = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Entity__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Entity__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Relationship__Relationship = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Relationship__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Relationship__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _RelationshipType__RelationshipType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _RelationshipType__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _RelationshipType__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _RelationshipType__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _RelationshipType__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _WeakEntity__WeakEntity = {};
		private static final ExecutorOperation /*@NonNull*/ [] _WeakEntity__Entity = {};
		private static final ExecutorOperation /*@NonNull*/ [] _WeakEntity__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _WeakEntity__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		/*
		 *	Install the operation descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Attribute__Attribute.initOperations(_Attribute__Attribute);
			Fragments._Attribute__OclAny.initOperations(_Attribute__OclAny);
			Fragments._Attribute__OclElement.initOperations(_Attribute__OclElement);

			Fragments._ComplexEntity__ComplexEntity.initOperations(_ComplexEntity__ComplexEntity);
			Fragments._ComplexEntity__OclAny.initOperations(_ComplexEntity__OclAny);
			Fragments._ComplexEntity__OclElement.initOperations(_ComplexEntity__OclElement);

			Fragments._CompositeAttribute__CompositeAttribute.initOperations(_CompositeAttribute__CompositeAttribute);
			Fragments._CompositeAttribute__OclAny.initOperations(_CompositeAttribute__OclAny);
			Fragments._CompositeAttribute__OclElement.initOperations(_CompositeAttribute__OclElement);

			Fragments._Constraint__Constraint.initOperations(_Constraint__Constraint);
			Fragments._Constraint__OclAny.initOperations(_Constraint__OclAny);
			Fragments._Constraint__OclElement.initOperations(_Constraint__OclElement);

			Fragments._DataTypes__DataTypes.initOperations(_DataTypes__DataTypes);
			Fragments._DataTypes__OclAny.initOperations(_DataTypes__OclAny);
			Fragments._DataTypes__OclElement.initOperations(_DataTypes__OclElement);
			Fragments._DataTypes__OclEnumeration.initOperations(_DataTypes__OclEnumeration);
			Fragments._DataTypes__OclType.initOperations(_DataTypes__OclType);

			Fragments._Entity__Entity.initOperations(_Entity__Entity);
			Fragments._Entity__OclAny.initOperations(_Entity__OclAny);
			Fragments._Entity__OclElement.initOperations(_Entity__OclElement);

			Fragments._Relationship__OclAny.initOperations(_Relationship__OclAny);
			Fragments._Relationship__OclElement.initOperations(_Relationship__OclElement);
			Fragments._Relationship__Relationship.initOperations(_Relationship__Relationship);

			Fragments._RelationshipType__OclAny.initOperations(_RelationshipType__OclAny);
			Fragments._RelationshipType__OclElement.initOperations(_RelationshipType__OclElement);
			Fragments._RelationshipType__OclEnumeration.initOperations(_RelationshipType__OclEnumeration);
			Fragments._RelationshipType__OclType.initOperations(_RelationshipType__OclType);
			Fragments._RelationshipType__RelationshipType.initOperations(_RelationshipType__RelationshipType);

			Fragments._WeakEntity__Entity.initOperations(_WeakEntity__Entity);
			Fragments._WeakEntity__OclAny.initOperations(_WeakEntity__OclAny);
			Fragments._WeakEntity__OclElement.initOperations(_WeakEntity__OclElement);
			Fragments._WeakEntity__WeakEntity.initOperations(_WeakEntity__WeakEntity);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ErdMetamodelTables::FragmentOperations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local properties for the local fragment of each type.
	 */
	public static class FragmentProperties {
		static {
			Init.initStart();
			FragmentOperations.init();
		}

		private static final ExecutorProperty /*@NonNull*/ [] _Attribute = {
			ErdMetamodelTables.Properties._Attribute__dataType,
			ErdMetamodelTables.Properties._Attribute__isComposite,
			ErdMetamodelTables.Properties._Attribute__isDerived,
			ErdMetamodelTables.Properties._Attribute__isPrimaryKey,
			ErdMetamodelTables.Properties._Attribute__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _ComplexEntity = {
			ErdMetamodelTables.Properties._ComplexEntity__aggregatedEntities,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _CompositeAttribute = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			ErdMetamodelTables.Properties._CompositeAttribute__subAttributes
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Constraint = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _DataTypes = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Entity = {
			ErdMetamodelTables.Properties._Entity__attributes,
			ErdMetamodelTables.Properties._Entity__foreignKeys,
			ErdMetamodelTables.Properties._Entity__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			ErdMetamodelTables.Properties._Entity__relationships
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Relationship = {
			ErdMetamodelTables.Properties._Relationship__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			ErdMetamodelTables.Properties._Relationship__source,
			ErdMetamodelTables.Properties._Relationship__target,
			ErdMetamodelTables.Properties._Relationship__type
		};

		private static final ExecutorProperty /*@NonNull*/ [] _RelationshipType = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _WeakEntity = {
			ErdMetamodelTables.Properties._Entity__attributes,
			ErdMetamodelTables.Properties._Entity__foreignKeys,
			ErdMetamodelTables.Properties._WeakEntity__identifyingRelationship,
			ErdMetamodelTables.Properties._Entity__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			ErdMetamodelTables.Properties._Entity__relationships
		};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Attribute__Attribute.initProperties(_Attribute);
			Fragments._ComplexEntity__ComplexEntity.initProperties(_ComplexEntity);
			Fragments._CompositeAttribute__CompositeAttribute.initProperties(_CompositeAttribute);
			Fragments._Constraint__Constraint.initProperties(_Constraint);
			Fragments._DataTypes__DataTypes.initProperties(_DataTypes);
			Fragments._Entity__Entity.initProperties(_Entity);
			Fragments._Relationship__Relationship.initProperties(_Relationship);
			Fragments._RelationshipType__RelationshipType.initProperties(_RelationshipType);
			Fragments._WeakEntity__WeakEntity.initProperties(_WeakEntity);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ErdMetamodelTables::FragmentProperties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of enumeration literals for each enumeration.
	 */
	public static class EnumerationLiterals {
		static {
			Init.initStart();
			FragmentProperties.init();
		}

		public static final EcoreExecutorEnumerationLiteral _DataTypes__INT = new EcoreExecutorEnumerationLiteral(ErdMetamodelPackage.Literals.DATA_TYPES.getEEnumLiteral("INT"), Types._DataTypes, 0);
		public static final EcoreExecutorEnumerationLiteral _DataTypes__VARCHAR = new EcoreExecutorEnumerationLiteral(ErdMetamodelPackage.Literals.DATA_TYPES.getEEnumLiteral("VARCHAR"), Types._DataTypes, 1);
		public static final EcoreExecutorEnumerationLiteral _DataTypes__DATE = new EcoreExecutorEnumerationLiteral(ErdMetamodelPackage.Literals.DATA_TYPES.getEEnumLiteral("DATE"), Types._DataTypes, 2);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _DataTypes = {
			_DataTypes__INT,
			_DataTypes__VARCHAR,
			_DataTypes__DATE
		};

		public static final EcoreExecutorEnumerationLiteral _RelationshipType__OneToOne = new EcoreExecutorEnumerationLiteral(ErdMetamodelPackage.Literals.RELATIONSHIP_TYPE.getEEnumLiteral("OneToOne"), Types._RelationshipType, 0);
		public static final EcoreExecutorEnumerationLiteral _RelationshipType__OneToMane = new EcoreExecutorEnumerationLiteral(ErdMetamodelPackage.Literals.RELATIONSHIP_TYPE.getEEnumLiteral("OneToMane"), Types._RelationshipType, 1);
		public static final EcoreExecutorEnumerationLiteral _RelationshipType__ManyToMane = new EcoreExecutorEnumerationLiteral(ErdMetamodelPackage.Literals.RELATIONSHIP_TYPE.getEEnumLiteral("ManyToMane"), Types._RelationshipType, 2);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _RelationshipType = {
			_RelationshipType__OneToOne,
			_RelationshipType__OneToMane,
			_RelationshipType__ManyToMane
		};

		/**
		 *	Install the enumeration literals in the enumerations.
		 */
		static {
			Types._DataTypes.initLiterals(_DataTypes);
			Types._RelationshipType.initLiterals(_RelationshipType);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ErdMetamodelTables::EnumerationLiterals and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 * The multiple packages above avoid problems with the Java 65536 byte limit but introduce a difficulty in ensuring that
	 * static construction occurs in the disciplined order of the packages when construction may start in any of the packages.
	 * The problem is resolved by ensuring that the static construction of each package first initializes its immediate predecessor.
	 * On completion of predecessor initialization, the residual packages are initialized by starting an initialization in the last package.
	 * This class maintains a count so that the various predecessors can distinguish whether they are the starting point and so
	 * ensure that residual construction occurs just once after all predecessors.
	 */
	private static class Init {
		/**
		 * Counter of nested static constructions. On return to zero residual construction starts. -ve once residual construction started.
		 */
		private static int initCount = 0;

		/**
		 * Invoked at the start of a static construction to defer residual construction until primary constructions complete.
		 */
		private static void initStart() {
			if (initCount >= 0) {
				initCount++;
			}
		}

		/**
		 * Invoked at the end of a static construction to activate residual construction once primary constructions complete.
		 */
		private static void initEnd() {
			if (initCount > 0) {
				if (--initCount == 0) {
					initCount = -1;
					EnumerationLiterals.init();
				}
			}
		}
	}

	static {
		Init.initEnd();
	}

	/*
	 * Force initialization of outer fields. Inner fields are lazily initialized.
	 */
	public static void init() {
		new ErdMetamodelTables();
	}

	private ErdMetamodelTables() {
		super(ErdMetamodelPackage.eNS_URI);
	}

	/*
	 * The EClasses whose instances should be cached to support allInstances().
	 */
	private static final EClass allInstancesEClasses /*@NonNull*/ [] = {
		ErdMetamodelPackage.Literals.ENTITY
	};

	@Override
	public EClass /*@NonNull*/ [] basicGetAllInstancesClasses() {
		return allInstancesEClasses;
	}
}
