/**
 *
 * $Id$
 */
package bpmn.validation;

import bpmn.Lane;
import bpmn.Pool;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link bpmn.Swimlane}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface SwimlaneValidator {
	boolean validate();

	boolean validateLane(EList<Lane> value);

	boolean validatePool(EList<Pool> value);

	boolean validateNameSwimlane(String value);

	boolean validatePoolincludeswimlane(EList<Pool> value);

	boolean validateLaneincludeswimlane(EList<Lane> value);
}
