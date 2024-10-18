/**
 */
package erdMetamodel;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link erdMetamodel.CompositeAttribute#getSubAttributes <em>Sub Attributes</em>}</li>
 * </ul>
 *
 * @see erdMetamodel.ErdMetamodelPackage#getCompositeAttribute()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='SubAttributesExist'"
 * @generated
 */
public interface CompositeAttribute extends Attribute {
	/**
	 * Returns the value of the '<em><b>Sub Attributes</b></em>' reference list.
	 * The list contents are of type {@link erdMetamodel.Attribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Attributes</em>' reference list.
	 * @see erdMetamodel.ErdMetamodelPackage#getCompositeAttribute_SubAttributes()
	 * @model
	 * @generated
	 */
	EList<Attribute> getSubAttributes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n            not self.subAttributes-&gt;isEmpty()'"
	 * @generated
	 */
	boolean SubAttributesExist(DiagnosticChain diagnostics, Map<Object, Object> context);

} // CompositeAttribute
