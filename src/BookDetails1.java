import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BookDetails1 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	JComboBox comboBox,comboBox_1;
//	JTable table_1;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BookDetails frame = new BookDetails();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public BookDetails1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 500, 850, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		ButtonGroup  b1 = new javax.swing.ButtonGroup();// to select only one option
		JButton btnNewButton = new JButton("Home");
		 btnNewButton.setBackground(new java.awt.Color(0, 102, 102));
         btnNewButton.setForeground(new java.awt.Color(255, 255, 255));
		
		JButton button = new JButton("Issue Book");
		button.setBackground(new java.awt.Color(0, 102, 102));
         button.setForeground(new java.awt.Color(255, 255, 255));

		JButton button_1 = new JButton("Return Book");
		button_1.setBackground(new java.awt.Color(0, 102, 102));
        button_1.setForeground(new java.awt.Color(255, 255, 255));
		
		JButton button_2 = new JButton("Issued Book Details");
		button_2.setBackground(new java.awt.Color(0, 102, 102));
        button_2.setForeground(new java.awt.Color(255, 255, 255));
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Book Name");
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				comboBox.setEnabled(false);// when we click the radio button the both will not show on the screen
				  comboBox_1.setEnabled(false);
			}
			
			
		});
		b1.add(rdbtnNewRadioButton);
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Your Stream");
		rdbtnNewRadioButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				comboBox.setEnabled(true);// when we click the radio button the both will show on the screen
				  comboBox_1.setEnabled(true);

			}
		});
		b1.add(rdbtnNewRadioButton_1);
		
		textField = new JTextField();
		textField.setColumns(10);
		// for first combo box
		comboBox = new JComboBox<>();
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent a) {
								 
			}
		});
		comboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Stream", "Science", "Commerce", "Arts" }));
	    comboBox.setEnabled(false);
		comboBox_1 = new JComboBox<>();
		comboBox_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		  comboBox_1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Class" }));
	        comboBox_1.setEnabled(false);
		
		JButton button_3 = new JButton("Add New Books");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		button_3.setForeground(Color.WHITE);
		button_3.setBackground(new Color(0, 102, 102));
		// for table
		table = new JTable();
		JScrollPane  jScrollPane2=new JScrollPane();
		table.setModel(new javax.swing.table.DefaultTableModel(
	            new Object [][] {

	            },
	            new String [] {
	                "Book Id", "Book Name", "Author", "Sream", "Class", "Available"
	            }
	        ));
	        table.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
	        jScrollPane2.setViewportView(table);
	        if (table.getColumnModel().getColumnCount() > 0) {
	            table.getColumnModel().getColumn(0).setPreferredWidth(40);
	            table.getColumnModel().getColumn(1).setPreferredWidth(210);
	            table.getColumnModel().getColumn(2).setPreferredWidth(150);
	            table.getColumnModel().getColumn(3).setPreferredWidth(40);
	            table.getColumnModel().getColumn(4).setPreferredWidth(40);
	            table.getColumnModel().getColumn(5).setPreferredWidth(40);
	        }
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(64)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(rdbtnNewRadioButton_1)
						.addComponent(rdbtnNewRadioButton, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, 202, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBox, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 202, GroupLayout.PREFERRED_SIZE))
					.addGap(40)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, 202, GroupLayout.PREFERRED_SIZE)
						.addComponent(button_3, GroupLayout.PREFERRED_SIZE, 194, GroupLayout.PREFERRED_SIZE))
					.addGap(182))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(50)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(table, GroupLayout.PREFERRED_SIZE, 1, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
							.addGap(67)
							.addComponent(button)))
					.addGap(57)
					.addComponent(button_1)
					.addPreferredGap(ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
					.addComponent(button_2)
					.addGap(98))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(62)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(rdbtnNewRadioButton, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addComponent(button_3))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(rdbtnNewRadioButton_1)
						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(68)
					.addComponent(table, GroupLayout.PREFERRED_SIZE, 1, GroupLayout.PREFERRED_SIZE)
					.addGap(203)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton)
						.addComponent(button)
						.addComponent(button_2)
						.addComponent(button_1))
					.addContainerGap(28, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
		setLocationRelativeTo(getParent());
		setResizable(false);
//		JButton jButton1=new JButton();
//		  jButton1.setBackground(new java.awt.Color(0, 102, 102));
//	        jButton1.setForeground(new java.awt.Color(255, 255, 255));
//	        jButton1.setText("Add a  New Book ");
	}
}
