/*
 * Smart GWT (GWT for SmartClient)
 * Copyright 2008 and beyond, Isomorphic Software, Inc.
 *
 * Smart GWT is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License version 3
 * is published by the Free Software Foundation.  Smart GWT is also
 * available under typical commercial license terms - see
 * http://smartclient.com/license
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 */

package com.smartgwt.sample.showcase.client.layout;

import com.smartgwt.client.widgets.Canvas;
import com.smartgwt.client.widgets.Label;
import com.smartgwt.client.widgets.layout.LayoutSpacer;
import com.smartgwt.client.widgets.layout.HLayout;
import com.smartgwt.client.types.Overflow;
import com.smartgwt.client.types.Alignment;
import com.smartgwt.sample.showcase.client.PanelFactory;
import com.smartgwt.sample.showcase.client.ShowcasePanel;

public class LayoutSnapToSample extends ShowcasePanel {
    private static final String DESCRIPTION =
        "<p>Snap-to positioning can be used to place components along a specific edge or corners "+
        "of a container, or centered in the container. The snapTo allows for components to be attached "+
        "to the edge of the container and snapOffsetLeft and snapOffsetTop allows for components to be "+
        "placed at a specific pixel or percentage offset relative to a snap position."+
        "<p>"+
        "Drag resize the containers below to see a variety of snap-to positioning behaviors.</p>";
        
    public static class Factory implements PanelFactory {
        private String id;
        public ShowcasePanel create() {
            LayoutSnapToSample panel = new LayoutSnapToSample();
            id = panel.getID();
            return panel;
        }
        public String getID() { return id; }
        public String getDescription() { return DESCRIPTION; }
    }

    public Canvas getViewPanel() {
		Canvas snapContainer = new Canvas();
		snapContainer.setHeight(300);
		snapContainer.setWidth(400);
		snapContainer.setMinHeight(280);
		snapContainer.setMinWidth(280);
		snapContainer.setShowEdges(true);
		snapContainer.setEdgeImage("edges/custom/sharpframe_10.png");
		snapContainer.setEdgeSize(10);
		snapContainer.setEdgeMarginSize(10);
		snapContainer.setOverflow(Overflow.HIDDEN);
		snapContainer.setCanDragResize(true);
		
		Label label1 = new Label();
		label1.setWidth(80);
		label1.setHeight(80);
		label1.setContents("Top Left");
		label1.setAlign(Alignment.CENTER);
		label1.setBackgroundColor("#FFAAAA");
		label1.setBorder("1px solid black");
		label1.setSnapTo("TL");
		
		Label label2 = new Label();
		label2.setWidth(80);
		label2.setHeight(80);
		label2.setContents("Top Right");
		label2.setAlign(Alignment.CENTER);
		label2.setBackgroundColor("#BEC9FE");
		label2.setBorder("1px solid black");
		label2.setSnapTo("TR");
		
		Label label3 = new Label();
		label3.setWidth(80);
		label3.setHeight(80);
		label3.setContents("Bottom Left");
		label3.setAlign(Alignment.CENTER);
		label3.setBackgroundColor("#D8D5D6");
		label3.setBorder("1px solid black");
		label3.setSnapTo("BL");
		
		Label label4 = new Label();
		label4.setWidth(80);
		label4.setHeight(80);
		label4.setContents("Bottom Right");
		label4.setAlign(Alignment.CENTER);
		label4.setBackgroundColor("#F8BFFB");
		label4.setBorder("1px solid black");
		label4.setSnapTo("BR");
		
		Label label5 = new Label();
		label5.setWidth(80);
		label5.setHeight(80);
		label5.setContents("Left");
		label5.setAlign(Alignment.CENTER);
		label5.setBackgroundColor("#CCFFCC");
		label5.setBorder("1px solid black");
		label5.setSnapTo("L");
		
		Label label6 = new Label();
		label6.setWidth(80);
		label6.setHeight(80);
		label6.setContents("Right");
		label6.setAlign(Alignment.CENTER);
		label6.setBackgroundColor("#AB5654");
		label6.setBorder("1px solid black");
		label6.setSnapTo("R");
		
		Label label7 = new Label();
		label7.setWidth(80);
		label7.setHeight(80);
		label7.setContents("Bottom");
		label7.setAlign(Alignment.CENTER);
		label7.setBackgroundColor("#DCEFEF");
		label7.setBorder("1px solid black");
		label7.setSnapTo("B");
		
		Label label8 = new Label();
		label8.setWidth(80);
		label8.setHeight(80);
		label8.setContents("Top");
		label8.setAlign(Alignment.CENTER);
		label8.setBackgroundColor("#FFCC99");
		label8.setBorder("1px solid black");
		label8.setSnapTo("T");
		
		Label label9 = new Label();
		label9.setWidth(80);
		label9.setHeight(80);
		label9.setContents("Center");
		label9.setAlign(Alignment.CENTER);
		label9.setBackgroundColor("#FFFF99");
		label9.setBorder("1px solid black");
		label9.setSnapTo("C");
		
		snapContainer.addChild(label1);
		snapContainer.addChild(label2);
		snapContainer.addChild(label3);
		snapContainer.addChild(label4);
		snapContainer.addChild(label5);
		snapContainer.addChild(label6);
		snapContainer.addChild(label7);
		snapContainer.addChild(label8);
		snapContainer.addChild(label9);
		
		Canvas offsetContainer = new Canvas();
		offsetContainer.setHeight(300);
		offsetContainer.setWidth(400);
		offsetContainer.setMinHeight(280);
		offsetContainer.setMinWidth(280);
		offsetContainer.setShowEdges(true);
		offsetContainer.setEdgeImage("edges/custom/sharpframe_10.png");
		offsetContainer.setEdgeSize(10);
		offsetContainer.setEdgeMarginSize(10);
		offsetContainer.setOverflow(Overflow.HIDDEN);
		offsetContainer.setShowHover(true);
		offsetContainer.setPrompt("Snap offsets specified");
		offsetContainer.setCanDragResize(true);
		
		Label label1a = new Label();
		label1a.setWidth(80);
		label1a.setHeight(80);
		label1a.setContents("Top Left");
		label1a.setAlign(Alignment.CENTER);
		label1a.setBackgroundColor("#FFAAAA");
		label1a.setBorder("1px solid black");
		label1a.setSnapTo("TL");
		label1a.setSnapOffsetTop(10);
		label1a.setSnapOffsetLeft(10);
		
		Label label2a = new Label();
		label2a.setWidth(80);
		label2a.setHeight(80);
		label2a.setContents("Top Right");
		label2a.setAlign(Alignment.CENTER);
		label2a.setBackgroundColor("#BEC9FE");
		label2a.setBorder("1px solid black");
		label2a.setSnapTo("TR");
		label2a.setSnapOffsetTop(10);
		label2a.setSnapOffsetLeft(-10);
		
		Label label3a = new Label();
		label3a.setWidth(80);
		label3a.setHeight(80);
		label3a.setContents("Bottom Left");
		label3a.setAlign(Alignment.CENTER);
		label3a.setBackgroundColor("#D8D5D6");
		label3a.setBorder("1px solid black");
		label3a.setSnapTo("BL");
		label3a.setSnapOffsetTop(-10);
		label3a.setSnapOffsetLeft(10);
		
		Label label4a = new Label();
		label4a.setWidth(80);
		label4a.setHeight(80);
		label4a.setContents("Left");
		label4a.setAlign(Alignment.CENTER);
		label4a.setBackgroundColor("#CCFFCC");
		label4a.setBorder("1px solid black");
		label4a.setSnapTo("L");
		label4a.setSnapOffsetLeft(10);
		
		Label label5a = new Label();
		label5a.setWidth(80);
		label5a.setHeight(80);
		label5a.setContents("Right");
		label5a.setAlign(Alignment.CENTER);
		label5a.setBackgroundColor("#AB5654");
		label5a.setBorder("1px solid black");
		label5a.setSnapTo("R");
		label5a.setSnapOffsetLeft(-10);
		
		Label label6a = new Label();
		label6a.setWidth(80);
		label6a.setHeight(80);
		label6a.setContents("Bottom");
		label6a.setAlign(Alignment.CENTER);
		label6a.setBackgroundColor("#DCEFEF");
		label6a.setBorder("1px solid black");
		label6a.setSnapTo("B");
		label6a.setSnapOffsetTop(-10);
		
		Label label7a = new Label();
		label7a.setWidth(80);
		label7a.setHeight(80);
		label7a.setContents("Top");
		label7a.setShowHover(true);
		label7a.setPrompt("SnapOffsetTop using percentage");
		label7a.setAlign(Alignment.CENTER);
		label7a.setBackgroundColor("#FFCC99");
		label7a.setBorder("1px solid black");
		label7a.setSnapTo("T");
		label7a.setSnapOffsetTop(10);
		
		Label label8a = new Label();
		label8a.setWidth(80);
		label8a.setHeight(80);
		label8a.setContents("Bottom Right");
		label8a.setAlign(Alignment.CENTER);
		label8a.setBackgroundColor("#F8BFFB");
		label8a.setBorder("1px solid black");
		label8a.setSnapTo("BR");
		label8a.setSnapOffsetTop(-10);
		label8a.setSnapOffsetLeft(-10);
		
		offsetContainer.addChild(label1a);
		offsetContainer.addChild(label2a);
		offsetContainer.addChild(label3a);
		offsetContainer.addChild(label4a);
		offsetContainer.addChild(label5a);
		offsetContainer.addChild(label6a);
		offsetContainer.addChild(label7a);
		offsetContainer.addChild(label8a);
		
		LayoutSpacer spacer = new LayoutSpacer();
		spacer.setWidth(100);
		
		HLayout controlLayout = new HLayout();
		controlLayout.setMembersMargin(20);
		controlLayout.setHeight(800);
		controlLayout.setWidth(1000);
		controlLayout.addMember(snapContainer);
		controlLayout.addMember(spacer);
		controlLayout.addMember(offsetContainer);
		
		return controlLayout;
    }

    public String getIntro() { return DESCRIPTION; }
    protected boolean isTopIntro() { return true; }
}