/*
 @Author : RAJAMOHANSINGH
 @blog : rajamohansingh4you.blogspot.com
 
 */
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import javax.swing.BorderFactory;

import java.awt.GraphicsEnvironment;
import java.awt.Point;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.FlowLayout;

public class status_bar extends JPanel
{
	Color lightgray=new Color(230,230,230,255);
	JLabel status=new JLabel();
	String defaul_status="Ios Icon Maker";
	public status_bar()
	{
		this.setBorder(BorderFactory.createLineBorder(Color.GRAY));
		this.setBounds(0,370,600,40);
		this.setBackground(lightgray);
		this.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		status.setForeground(Color.BLACK);
		status.setText(defaul_status);
		this.add(status);
		
	}
}
	