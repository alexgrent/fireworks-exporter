package org.reactome.server.tools.fireworks.exporter.common.analysis.model;

import java.util.List;

/**
 * @author Antonio Fabregat <fabregat@ebi.ac.uk>
 */
public interface IdentifierSummary {

    List<Double> getExp();

    String getId();
}
