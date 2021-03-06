/*
 * Created on 03-Jun-2004
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
package org.tigris.gefdemo.bert.model;

/**
 * 
 * @author Bob Tarling
 * @since 03-Jun-2004
 */
public interface Relationship {
    public abstract String getId();
    public abstract String getName();
    public abstract void setName(String name);
    public abstract Attribute getClient();
    public abstract Attribute getSupplier();
}