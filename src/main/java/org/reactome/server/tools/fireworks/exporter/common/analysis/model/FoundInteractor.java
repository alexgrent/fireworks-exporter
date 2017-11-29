package org.reactome.server.tools.fireworks.exporter.common.analysis.model;

import java.util.Set;

/**
 * @author Antonio Fabregat <fabregat@ebi.ac.uk>
 */
public interface FoundInteractor extends IdentifierSummary {

    Set<String> getMapsTo();

    IdentifierMap getInteractsWith();

}
