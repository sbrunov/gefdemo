/*
 * Created on 03-Jun-2004
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
package org.tigris.gefdemo.uml.model;

import java.util.List;

/**
 * 
 * @author Bob Tarling
 * @since 03-Jun-2004
 */
public interface UmlAssociation extends UmlGeneralizableElement {
    public abstract List getAssociationEnds();
}