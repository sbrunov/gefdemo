package org.tigris.gefdemo.uml.ui;

import org.tigris.gef.base.Layer;
import org.tigris.gef.presentation.FigEdgePoly;

import org.tigris.gefdemo.uml.ModelFacade;
import org.tigris.gefdemo.uml.model.UmlModelElement;

/**
 * @author Bob Tarling
 */
public class ModelElementEdgeFig extends FigEdgePoly {
    
    public ModelElementEdgeFig(Object edge, Layer lay) {
        setBetweenNearestPoints(true);
        setLayer(lay);
        setOwner(edge);
    }

    public String getName() {
        return ((UmlModelElement)getOwner()).getName();
    }
    
    public void dispose() {
        Object owner = getOwner();
        super.dispose();
        ModelFacade.getInstance().removeModelElement(owner);
    }
}