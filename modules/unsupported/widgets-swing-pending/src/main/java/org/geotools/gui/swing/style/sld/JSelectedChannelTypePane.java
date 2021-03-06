/*
 *    GeoTools - The Open Source Java GIS Toolkit
 *    http://geotools.org
 * 
 *    (C) 2002-2008, Open Source Geospatial Foundation (OSGeo)
 *
 *    This library is free software; you can redistribute it and/or
 *    modify it under the terms of the GNU Lesser General Public
 *    License as published by the Free Software Foundation;
 *    version 2.1 of the License.
 *
 *    This library is distributed in the hope that it will be useful,
 *    but WITHOUT ANY WARRANTY; without even the implied warranty of
 *    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 *    Lesser General Public License for more details.
 */
package org.geotools.gui.swing.style.sld;

import java.awt.Component;
import org.geotools.gui.swing.style.StyleElementEditor;
import org.geotools.map.MapLayer;
import org.geotools.styling.SelectedChannelType;
import org.geotools.styling.SelectedChannelTypeImpl;

/**
 * SelectedChannel type panel
 * 
 * @author  Johann Sorel
 *
 * @source $URL$
 */
public class JSelectedChannelTypePane extends javax.swing.JPanel implements StyleElementEditor<SelectedChannelType>{

    private MapLayer layer = null;
    private SelectedChannelType channel = null;

    /** 
     * Creates new form JFillPanel 
     */
    public JSelectedChannelTypePane() {
        initComponents();
    }

    public void setLayer(MapLayer layer) {
        this.layer = layer;
        guiContrast.setLayer(layer);
    }

    public MapLayer getLayer(){
        return layer;
    }
    
    public void setEdited(SelectedChannelType channel) {
        this.channel = channel;
        if (channel != null) {
            guiName.setText(channel.getChannelName());
            guiContrast.setEdited(channel.getContrastEnhancement());
        }
    }

    public SelectedChannelType getEdited() {

        if (channel == null) {
            channel = new SelectedChannelTypeImpl();
        }

        apply();
        return channel;
    }

    public void apply() {
        if (channel != null) {
            channel.setChannelName(guiName.getText());
            channel.setContrastEnhancement(guiContrast.getEdited());
        }
    }

    public Component getComponent(){
        return this;
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        guiContrast = new org.geotools.gui.swing.style.sld.JContrastEnhancement();
        jXTitledSeparator1 = new org.jdesktop.swingx.JXTitledSeparator();
        jLabel1 = new javax.swing.JLabel();
        guiName = new javax.swing.JTextField();

        setOpaque(false);

        guiContrast.setOpaque(false);

        jXTitledSeparator1.setAlpha(0.5F);
        jXTitledSeparator1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("org/geotools/gui/swing/style/sld/Bundle"); // NOI18N
        jXTitledSeparator1.setTitle(bundle.getString("contrast")); // NOI18N

        jLabel1.setText(bundle.getString("name")); // NOI18N

        guiName.setOpaque(false);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(jLabel1)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(guiName, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 142, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .add(jXTitledSeparator1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
            .add(layout.createSequentialGroup()
                .add(guiContrast, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel1)
                    .add(guiName, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jXTitledSeparator1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(guiContrast, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.geotools.gui.swing.style.sld.JContrastEnhancement guiContrast;
    private javax.swing.JTextField guiName;
    private javax.swing.JLabel jLabel1;
    private org.jdesktop.swingx.JXTitledSeparator jXTitledSeparator1;
    // End of variables declaration//GEN-END:variables
}
