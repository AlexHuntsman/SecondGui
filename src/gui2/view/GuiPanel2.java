package gui2.view;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import gui2.controller.GuiController2;
/**
 * 
 * @author ahun0442
 * @version 0.1 11/09/15
 */

public class GuiPanel2 extends JPanel
{
	private GuiController2 baseController2;
	private JButton firstButton2;
	private JTextField firstTextField2;
	private SpringLayout baseLayout2;
	
	
	public GuiPanel2 (GuiController2 baseController)
	{
		this.baseController2 = baseController;
		
		baseLayout2 = new SpringLayout();
		firstButton2 = new JButton("Pointless Button");
		firstTextField2 = new JTextField("words can be typed here");
		
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout2);
		this.add(firstButton2);
		this.add(firstTextField2);
	}
	
	private void setupLayout() //where the code fromthe design tab gos.
	{
		baseLayout2.putConstraint(SpringLayout.EAST, firstButton2, -148, SpringLayout.EAST, this);
		baseLayout2.putConstraint(SpringLayout.NORTH, firstButton2, 43, SpringLayout.SOUTH, firstTextField2);
		baseLayout2.putConstraint(SpringLayout.NORTH, firstTextField2, 41, SpringLayout.NORTH, this);
		baseLayout2.putConstraint(SpringLayout.EAST, firstTextField2, 0, SpringLayout.EAST, this);
		
	}
	
	private void setupListeners()
	{
		firstButton2.addActionListener(new ActionListener()
		{
			public void actionPerformed (ActionEvent click)
			{
				firstTextField2.setText("Very Wow! much Doge");
			}
		});		
		
	}
	
}
