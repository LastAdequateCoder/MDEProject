/**
 */
package erdMetamodel;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link erdMetamodel.Constraint#getConstraintType <em>Constraint Type</em>}</li>
 * </ul>
 *
 * @see erdMetamodel.ErdMetamodelPackage#getConstraint()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ValidConstraintType'"
 * @generated
 */
public interface Constraint extends EObject {

	/**
	 * Returns the value of the '<em><b>Constraint Type</b></em>' attribute.
	 * The literals are from the enumeration {@link erdMetamodel.ConstraintType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraint Type</em>' attribute.
	 * @see erdMetamodel.ConstraintType
	 * @see #setConstraintType(ConstraintType)
	 * @see erdMetamodel.ErdMetamodelPackage#getConstraint_ConstraintType()
	 * @model
	 * @generated
	 */
	ConstraintType getConstraintType();

	/**
	 * Sets the value of the '{@link erdMetamodel.Constraint#getConstraintType <em>Constraint Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constraint Type</em>' attribute.
	 * @see erdMetamodel.ConstraintType
	 * @see #getConstraintType()
	 * @generated
	 */
	void setConstraintType(ConstraintType value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\tself.constraintType = ConstraintType::UNIQUE or self.constraintType = ConstraintType::CHECK'"
	 * @generated
	 */
	boolean ValidConstraintType(DiagnosticChain diagnostics, Map<Object, Object> context);
} // Constraint
