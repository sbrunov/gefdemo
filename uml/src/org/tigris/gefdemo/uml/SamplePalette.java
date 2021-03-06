package org.tigris.gefdemo.uml;

import org.tigris.gef.base.CmdSetMode;
import org.tigris.gef.base.ModeCreatePolyEdge;
import org.tigris.gef.ui.PaletteFig;
import org.tigris.gefdemo.uml.model.UmlAssociationClass;
import org.tigris.gefdemo.uml.model.UmlAssociationEnd;
import org.tigris.gefdemo.uml.model.UmlClass;
import org.tigris.gefdemo.uml.model.UmlDependency;
import org.tigris.gefdemo.uml.model.UmlInterface;

import org.tigris.gefdemo.uml.model.UmlActor;

/** A class to define a custom palette for use in some demos.
 *
 * @see org.tigris.gefdemo.basic.BasicApplication
 */

public class SamplePalette extends PaletteFig {

    private static final long serialVersionUID = 8319853722043556420L;

    /** Construct a new palette of example nodes for the Example application */
    public SamplePalette() {
        super();
    }

    /** Define a button to make for the Example application */
    public void defineButtons() {
        super.defineButtons();

        add(new CmdCreateNode(UmlClass.class, "Class"));
        add(new CmdCreateNode(UmlInterface.class, "Interface"));
        add(new CmdCreateNode(UmlActor.class, "Actor"));
       add(new CmdSetMode(ModeCreateAssociationEnd.class, "edgeClass", UmlAssociationEnd.class, "Association"));
        add(new CmdSetMode(ModeCreatePolyEdge.class, "edgeClass", UmlDependency.class, "Dependency"));
        add(new CmdSetMode(ModeCreatePolyEdge.class, "edgeClass", UmlAssociationClass.class, "AssociationClass"));
    }
} /* end class SamplePalette */
