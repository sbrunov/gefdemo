package org.tigris.gefdemo.classdiagram.model;

import org.tigris.gef.base.Layer;
import org.tigris.gef.graph.presentation.NetEdge;
import org.tigris.gef.presentation.FigEdge;
import org.tigris.gefdemo.classdiagram.ui.AssociationEndFig;

/** A NetEdge subclass to represent a dependency between tagets.
 */

class UmlAssociationEndImpl extends NetEdge implements UmlAssociationEnd {
    
    private String name;
    
    /** Construct a new Depends. */
    public UmlAssociationEndImpl() {
    }

    public String getId() {
        return toString();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public FigEdge makePresentation(Layer lay) {
        return new AssociationEndFig();
    }

} /* end class EdgeEther */