
package gui2.view;

import javax.swing.*;
import java.awt.Color;
import java.awt.event.*;
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
		this.setBackground(Color.MAGENTA);
		this.add(firstButton2);
		this.add(firstTextField2);
	}
	
	private void setupLayout() //where the code from the design tab gos.
	{
		baseLayout2.putConstraint(SpringLayout.EAST, firstButton2, -148, SpringLayout.EAST, this);
		baseLayout2.putConstraint(SpringLayout.NORTH, firstButton2, 43, SpringLayout.SOUTH, firstTextField2);
		baseLayout2.putConstraint(SpringLayout.NORTH, firstTextField2, 41, SpringLayout.NORTH, this);
		baseLayout2.putConstraint(SpringLayout.EAST, firstTextField2, 0, SpringLayout.EAST, this);
		
	}
	
	private void changeRandomColor()
	{
		int red, green, blue;
		red = (int) (Math.random()*256);
		green = (int) (Math.random()*256);
		blue = (int) (Math.random()*256);
		
		this.setBackground(new Color(red, green, blue));
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
		
		this.addMouseListener(new MouseListener()
		{
			public void mouseClicked(MouseEvent click)
			{
				//changeRandomColor();
			}
			
			public void mouseEntered(MouseEvent entered)
			{
				//changeRandomColor();
			}
			
			public void mouseExited(MouseEvent exited)
			{
				//changeRandomColor();
			}
			
			public void mouseReleased(MouseEvent released)
			{
				//changeRandomColor();
			}
			
			public void mousePressed(MouseEvent pressed)
			{
				//changeRandomColor();
			}
		});
		
		this.addMouseMotionListener(new MouseMotionListener()
		{
			public void mouseMoved(MouseEvent moved)
			{
				if(moved.isAltDown())
				{
					changeRandomColor();
				}
				firstTextField2.setText("Mouse X: " + moved.getX() + " Mouse Y: " + moved.getY());
				if(Math.abs(moved.getX() - firstButton2.getX()) < 10 && 
						Math.abs(moved.getY() - firstButton2.getY()) < 10)
				{
					firstButton2.setLocation((int) (Math.random() * 300), (int) (Math.random() * 300));
				}
			}
			
			public void mouseDragged(MouseEvent draged)
			{
				//changeRandomColor();
			}
		});
	}
}
