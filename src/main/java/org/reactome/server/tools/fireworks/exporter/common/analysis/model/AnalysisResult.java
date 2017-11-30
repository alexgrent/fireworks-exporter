package org.reactome.server.tools.fireworks.exporter.common.analysis.model;

import java.util.List;

/**
 * @author Antonio Fabregat <fabregat@ebi.ac.uk>
 */
public interface AnalysisResult {

    AnalysisSummary getSummary();

    Integer getPathwaysFound();

    Integer getIdentifiersNotFound();

    List<PathwaySummary> getPathways();

    List<ResourceSummary> getResourceSummary();

    ExpressionSummary getExpression();

    List<String> getWarnings();
}
