/*
 @Author : RAJAMOHANSINGH
 @blog : rajamohansingh4you.blogspot.com

 */


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import java.awt.Color;
import java.awt.GraphicsEnvironment;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JRadioButton;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.border.LineBorder;

public class AppIconMaker
{
	JButton choose , choose1, choose2,choose3,choose4,path,start,start2;
	JTextField pathField,pathField1,pathField2,pathField3,pathField4,destinationField;
	JLabel chooseLabel, chooseLabel1,chooseLabel2,chooseLabel3,chooseLabel4 , chooseDevice,statusLabel, destinationLabel;
	JRadioButton selectFormat;
	JRadioButton radApple = new JRadioButton("iOS App Icon", true);
    JRadioButton radMango = new JRadioButton("Universal Ios Dvice Screens");
    JRadioButton radPeer = new JRadioButton("About Me");
	JFileChooser  fileDialog = new JFileChooser();

	public AppIconMaker()
	{

    final comframe frame=new comframe("App Icon & Screenshot Maker",FileReader.path("images/icon.png"),600,400,true,true,true,true);

		JPanel mainPanel = new JPanel();
		mainPanel.setBackground(Color.WHITE);
		mainPanel.setBounds(1,20,600,380);
		mainPanel.setLayout(null);
		frame.add(mainPanel);

		choose1 = new JButton("Choose A Image File");
		choose1.setBounds(360,20,215,30);
		choose1.setVisible(false);
		mainPanel.add(choose1);

		choose2 = new JButton("Choose A Image File");
		choose2.setBounds(360,60,215,30);
		choose2.setVisible(false);
		mainPanel.add(choose2);

		choose3 = new JButton("Choose A Image File");
		choose3.setBounds(360,100,215,30);
		choose3.setVisible(false);
		mainPanel.add(choose3);

		choose4 = new JButton("Choose A Image File");
		choose4.setBounds(360,140,215,30);
		choose4.setVisible(false);
		mainPanel.add(choose4);

		choose = new JButton("Choose A Image File");
		choose.setBounds(360,180,215,30);
		mainPanel.add(choose);

		path = new JButton("Save As");
		path.setBounds(360,300,100,30);
		mainPanel.add(path);

		start = new JButton("Sart");
		start.setBounds(475,300,100,30);
		mainPanel.add(start);

		start2 = new JButton("Sart");
		start2.setBounds(475,300,100,30);
		start2.setVisible(false);
		mainPanel.add(start2);

		//Labels

		chooseLabel4 = new JLabel("Choose Image:");
		chooseLabel4.setVisible(false);
		chooseLabel4.setBounds(20,22,100,20);
		mainPanel.add(chooseLabel4);

		chooseLabel1 = new JLabel("Choose Image:");
		chooseLabel1.setVisible(false);
		chooseLabel1.setBounds(20,62,100,20);
		mainPanel.add(chooseLabel1);

		chooseLabel2 = new JLabel("Choose Image:");
		chooseLabel2.setBounds(20,102,100,20);
		chooseLabel2.setVisible(false);
		mainPanel.add(chooseLabel2);


		chooseLabel3 = new JLabel("Choose Image:");
		chooseLabel3.setBounds(20,142,100,20);
		chooseLabel3.setVisible(false);
		mainPanel.add(chooseLabel3);

		chooseLabel = new JLabel("Choose Image:");
		chooseLabel.setBounds(20,182,100,20);
		mainPanel.add(chooseLabel);

		statusLabel = new JLabel("Recomended 1536X1536 pixels Image.");
		statusLabel.setBounds(155,225,410,20);
		mainPanel.add(statusLabel);

		chooseDevice = new JLabel("Settings:");
		chooseDevice.setBounds(20,250,100,20);
		mainPanel.add(chooseDevice);

		destinationLabel = new JLabel("Destination Folder:");
		destinationLabel.setBounds(20,302,150,20);
		mainPanel.add(destinationLabel);
		//<end>Label<end>
		//TextBoxes
		pathField1 = new JTextField();
		pathField1.setBounds(140,20,210,31);
		pathField1.setVisible(false);
		mainPanel.add(pathField1);

		pathField2 = new JTextField();
		pathField2.setBounds(140,60,210,31);
		pathField2.setVisible(false);
		mainPanel.add(pathField2);

		pathField3 = new JTextField();
		pathField3.setBounds(140,100,210,31);
		pathField3.setVisible(false);
		mainPanel.add(pathField3);

		pathField4 = new JTextField();
		pathField4.setBounds(140,140,210,31);
		pathField4.setVisible(false);
		mainPanel.add(pathField4);

		pathField = new JTextField();
		pathField.setBounds(140,180,210,31);
		mainPanel.add(pathField);

		destinationField = new JTextField();
		destinationField.setBounds(140,300,210,31);
		mainPanel.add(destinationField);

    //  headerLabel.setText("Control in action: RadioButton");
		radApple.setBounds(130,250,120,30);
		radApple.setBackground(Color.WHITE);
		radMango.setBounds(260,250,220,30);
		radMango.setBackground(Color.WHITE);
		radPeer.setBounds(480,250,100,30);
		radPeer.setBackground(Color.WHITE);

	  ButtonGroup group = new ButtonGroup();
      group.add(radApple);
      group.add(radMango);
      group.add(radPeer);


      mainPanel.add(radApple);
      mainPanel.add(radMango);
      mainPanel.add(radPeer);

      radApple.setMnemonic(KeyEvent.VK_C);
      radMango.setMnemonic(KeyEvent.VK_M);
      radPeer.setMnemonic(KeyEvent.VK_P);

      radApple.addItemListener(new ItemListener() {
         public void itemStateChanged(ItemEvent e) {
           statusLabel.setText("Recomended 1536X1536"
           + (e.getStateChange()==1?"pixels Image.":"unchecked"));
		   		   start2.setEnabled(true);
		   start.setEnabled(true);
		   start2.setVisible(false);
		   start.setVisible(true);
		   choose.setVisible(true);
		   choose1.setVisible(false);
		   choose2.setVisible(false);
		   choose3.setVisible(false);
		   choose4.setVisible(false);
		   chooseLabel.setVisible(true);
		   chooseLabel1.setVisible(false);
		   chooseLabel2.setVisible(false);
		   chooseLabel3.setVisible(false);
		   chooseLabel4.setVisible(false);
		   pathField.setVisible(true);
		   pathField1.setVisible(false);
		   pathField2.setVisible(false);
		   pathField3.setVisible(false);
		   pathField4.setVisible(false);
         }
      });

      radMango.addItemListener(new ItemListener() {
         public void itemStateChanged(ItemEvent e) {
           statusLabel.setText("Recomended 2048x2732"
           + (e.getStateChange()==1?" pixels Image.":"unchecked"));
		   		   start2.setEnabled(true);
		   start.setEnabled(true);
		   start2.setVisible(true);
		   start.setVisible(false);
		   choose.setVisible(true);
		   choose1.setVisible(true);
		   choose2.setVisible(true);
		   choose3.setVisible(true);
		   choose4.setVisible(true);
		   chooseLabel.setVisible(true);
		   chooseLabel1.setVisible(true);
		   chooseLabel2.setVisible(true);
		   chooseLabel3.setVisible(true);
		   chooseLabel4.setVisible(true);
		   pathField.setVisible(true);
		   pathField1.setVisible(true);
		   pathField2.setVisible(true);
		   pathField3.setVisible(true);
		   pathField4.setVisible(true);
         }
      });

      radPeer.addItemListener(new ItemListener() {
         public void itemStateChanged(ItemEvent e) {
           statusLabel.setText("Email : rajamohansssingh"
           + (e.getStateChange()==1?"@gmail.com":"unchecked"));
		   start2.setEnabled(false);
		   start.setEnabled(false);
		   choose.setVisible(false);
		   choose1.setVisible(false);
		   choose2.setVisible(false);
		   choose3.setVisible(false);
		   choose4.setVisible(false);
		   chooseLabel.setVisible(false);
		   chooseLabel1.setVisible(false);
		   chooseLabel2.setVisible(false);
		   chooseLabel3.setVisible(false);
		   chooseLabel4.setVisible(false);
		   pathField.setVisible(false);
		   pathField1.setVisible(false);
		   pathField2.setVisible(false);
		   pathField3.setVisible(false);
		   pathField4.setVisible(false);

         }
      });

	 choose.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
			fileDialog.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
            int returnVal = fileDialog.showOpenDialog(frame);
            if (returnVal == JFileChooser.APPROVE_OPTION) {
               java.io.File file = fileDialog.getSelectedFile();
               pathField.setText(""+ fileDialog.getCurrentDirectory()+"/"+ file.getName());
            }
            else{
              // nothing here
            }
         }
      });

	  	 choose1.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
			fileDialog.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
            int returnVal = fileDialog.showOpenDialog(frame);
            if (returnVal == JFileChooser.APPROVE_OPTION) {
               java.io.File file = fileDialog.getSelectedFile();
               pathField1.setText(""+ fileDialog.getCurrentDirectory()+"/"+ file.getName());
            }
            else{
              // nothing here
            }
         }
      });

	  	 choose2.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
			fileDialog.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
            int returnVal = fileDialog.showOpenDialog(frame);
            if (returnVal == JFileChooser.APPROVE_OPTION) {
               java.io.File file = fileDialog.getSelectedFile();
               pathField2.setText(""+ fileDialog.getCurrentDirectory()+"/"+ file.getName());
               //pathField.setText("File Selected :"+ file.getName() + fileDialog.getCurrentDirectory());
            }
            else{
              // statusLabel.setText("Open command cancelled by user." );
            }
         }
      });

	  	 choose3.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
			fileDialog.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
            int returnVal = fileDialog.showOpenDialog(frame);
            if (returnVal == JFileChooser.APPROVE_OPTION) {
               java.io.File file = fileDialog.getSelectedFile();
               pathField3.setText(""+ fileDialog.getCurrentDirectory()+"/"+ file.getName());
               //pathField.setText("File Selected :"+ file.getName() + fileDialog.getCurrentDirectory());
            }
            else{
              // statusLabel.setText("Open command cancelled by user." );
            }
         }
      });

	  choose4.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
			fileDialog.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
            int returnVal = fileDialog.showOpenDialog(frame);
            if (returnVal == JFileChooser.APPROVE_OPTION) {
               java.io.File file = fileDialog.getSelectedFile();
               pathField4.setText(""+ fileDialog.getCurrentDirectory()+"/"+ file.getName());
               //pathField.setText("File Selected :"+ file.getName() + fileDialog.getCurrentDirectory());
            }
            else{
              // statusLabel.setText("Open command cancelled by user." );
            }
         }
      });




	   path.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
			fileDialog.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
            int returnVal = fileDialog.showSaveDialog(frame);
            if (returnVal == JFileChooser.APPROVE_OPTION) {
               java.io.File file = fileDialog.getSelectedFile();
               destinationField.setText(""+ fileDialog.getCurrentDirectory()+"/"+ file.getName());
            }
            else{
              // nothing here
            }
         }
      });

	  //START BUTTON

	  	 start.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {

			pathField.selectAll();
			String inputPath = pathField.getText();
			destinationField.selectAll();
			String destinationPath = destinationField.getText();

			final appIconParser parse = new appIconParser(inputPath,destinationPath);

         }
      });

	 //START BUTTON2

	  	 start2.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {

			pathField.selectAll();
			pathField1.selectAll();
			pathField2.selectAll();
			pathField3.selectAll();
			pathField4.selectAll();
			String inputPath = pathField.getText();
			String inputPath1 = pathField1.getText();
			String inputPath2 = pathField2.getText();
			String inputPath3 = pathField3.getText();
			String inputPath4 = pathField4.getText();
			destinationField.selectAll();
			String destinationPath = destinationField.getText();

			final screenShotParser parse2 = new screenShotParser(inputPath,inputPath1,inputPath2,inputPath3,inputPath4,destinationPath);

         }
      });





	}
		public static void main(String args[])
	{
		SwingUtilities.invokeLater(new Runnable()
		{
			public void run()
			{
				new AppIconMaker();
			}
		});
	}
}
