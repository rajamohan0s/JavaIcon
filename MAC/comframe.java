/*
 @Author : RAJAMOHANSINGH
 @blog : rajamohansingh4you.blogspot.com
 
 */

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.GraphicsEnvironment;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BorderFactory;
import javax.swing.border.LineBorder;

import javax.swing.*;
import java.awt.*;

public class comframe extends JFrame
{
	String title;
	int width,height;
	boolean visible,resizable,declose,undeco;
	Color lightgray=new Color(230,230,230,255);
	Color lightgray2=new Color(54,78,72,255);
	status_bar panel3=new status_bar();
	
	public comframe(String t,String dir,int w,int h,boolean u,boolean r,boolean d,boolean v)
	{
		title=t;
		this.resizable=r;
		this.declose=d;
		this.visible=v;
		this.undeco=u;
		add(panel3);
		if(t!=null)
		{
			setTitle(t);
		}
		Point center=GraphicsEnvironment.getLocalGraphicsEnvironment().getCenterPoint();
		this.width=(center.x-w/2);
		this.height=(center.y-h/2);
		int x=w;
		int y=h;
		this.setBounds(width,height,x,y);
		ImageIcon icon = new ImageIcon(dir);
		this.setIconImage(icon.getImage());
		
		if(u!=false)
		{
			this.setUndecorated(true);
			this.setLayout(null);
			this.getRootPane().setBorder(BorderFactory.createLineBorder(Color.BLACK,1));
			
			JPanel panel=new JPanel();
			panel.setBackground(lightgray);
			panel.setBounds(0,0,w,25);
			panel.setLayout(null);
			this.add(panel);
			
			Image scaleImage=icon.getImage().getScaledInstance(24,24,Image.SCALE_DEFAULT);
			final JLabel title=new JLabel(t,SwingConstants.LEFT);
			//title.setFont(new Font("Latha",Font.BOLD/Font.BOLD,18));
			title.setBounds(0,0,500,25);
			title.setIcon(new ImageIcon(scaleImage));
			panel.add(title);
			
			final JLabel minimize =new JLabel("-",SwingConstants.CENTER);
			minimize.setOpaque(true);
			minimize.setBackground(lightgray);
			minimize.setForeground(Color.BLACK);
			minimize.setFont(new Font("Arial",Font.BOLD/Font.BOLD,18));
			minimize.setBounds(546,0,26,25);
			panel.add(minimize);
			
			final JLabel exit =new JLabel("X",SwingConstants.CENTER);
			exit.setOpaque(true);
			exit.setBackground(lightgray);
			exit.setForeground(Color.BLACK);
			exit.setFont(new Font("Arial",Font.BOLD/Font.BOLD,16));
			exit.setBounds(572,0,26,25);
			panel.add(exit);
			
			
		
			ComponentMover cm=new ComponentMover(this,panel);
			
			minimize.addMouseListener(new MouseAdapter()
			{
				public void mouseEntered(MouseEvent me)
				{
					minimize.setBackground(lightgray2);
					minimize.setForeground(Color.WHITE);
					panel3.status.setText("Click to Minimize the Window.");
				}
				public void mouseExited(MouseEvent me)
				{
					minimize.setBackground(lightgray);
					minimize.setForeground(Color.BLACK);
					panel3.status.setText(panel3.defaul_status);
				}
				public void mousePressed(MouseEvent me)
				{
					//setVisible(false);
					try
					{
						Thread.sleep(150);
						setExtendedState(JFrame.ICONIFIED);
					}
					catch(Throwable t){}
				}
			});	
			
			exit.addMouseListener(new MouseAdapter()
			{
				public void mouseEntered(MouseEvent me)
				{
					exit.setBackground(lightgray2);
					exit.setForeground(Color.WHITE);
					panel3.status.setText("Click to exite the Window.");
				}
				public void mouseExited(MouseEvent me)
				{
					exit.setBackground(lightgray);
					exit.setForeground(Color.BLACK);
					panel3.status.setText(panel3.defaul_status);
				}
				public void mousePressed(MouseEvent me)
				{
					//this.dispose();
					try
					{
						Thread.sleep(150);
						System.exit(0);
					}
					catch(Throwable t){}
				}
			});
			
			
		}
		
		if(r!=true)
		{
			this.setResizable(false);
		}
		if(d!=false)
		{
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
		if(v!=false)
		{
			this.setVisible(true);
		}
	}
}
	