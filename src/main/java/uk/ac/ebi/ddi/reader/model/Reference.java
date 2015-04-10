package uk.ac.ebi.ddi.reader.model;

/**
 * Reference information form px submission
 *
 * @author ypriverol
 */
public class Reference {

    private Integer pubmedId;
    private String referenceLine;

    public Integer getPubmedId() {
        return pubmedId;
    }

    public String getReferenceLine() {
        return referenceLine;
    }
}
