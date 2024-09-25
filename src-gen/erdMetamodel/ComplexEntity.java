/**
 */
package erdMetamodel;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Complex Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link erdMetamodel.ComplexEntity#getAggregatedEntities <em>Aggregated Entities</em>}</li>
 * </ul>
 *
 * @see erdMetamodel.ErdMetamodelPackage#getComplexEntity()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='AggregatedEntitiesExist'"
 * @generated
 */
public interface ComplexEntity extends EObject {
	/**
	 * Returns the value of the '<em><b>Aggregated Entities</b></em>' reference list.
	 * The list contents are of type {@link erdMetamodel.Entity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aggregated Entities</em>' reference list.
	 * @see erdMetamodel.ErdMetamodelPackage#getComplexEntity_AggregatedEntities()
	 * @model
	 * @generated
	 */
	EList<Entity> getAggregatedEntities();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n            not self.aggregatedEntities-&gt;isEmpty()'"
	 * @generated
	 */
	boolean AggregatedEntitiesExist(DiagnosticChain diagnostics, Map<Object, Object> context);

} // ComplexEntity
