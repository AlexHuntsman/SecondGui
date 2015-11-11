package gui2.view;

import javax.swing.JFrame;

import gui2.controller.GuiController2;

/**
 * 
 * @author ahun0442
 * @version 0.2 11/09/15 updated the setupFrame to load the contentPane with a GuiPanel
 */

public class GuiFrame2 extends JFrame
{
	private GuiController2 baseController2;
	private GuiPanel2 basePanel2;
	
	public GuiFrame2(GuiController2 baseController)
	{
		this.baseController2 = baseController;
		basePanel2 = new GuiPanel2(baseController);
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(basePanel2); 	// Must be the first line of setupFrame! - Installs the panel in the frame.
		this.setSize(400,400);				//find a good size for the app.
		this.setTitle("my second gui app");
		this.setResizable(false); 			//Advisable but required.
		this.setVisible(true); 				// Must be the Last line of setupFrame!
	}
	
	public GuiController2 getBaseController()
	{
		return baseController2;
	}

}
