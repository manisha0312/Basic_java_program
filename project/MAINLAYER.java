import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MAINLAYER extends JFrame {

	 JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MAINLAYER frame = new MAINLAYER();
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
	public MAINLAYER() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 500, 850, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		setLocationRelativeTo(getParent());
		JButton btnNewButton = new JButton("Book Details");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new BookDetails().setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBackground(Color.cyan);
	
		
		JButton button = new JButton("Issue Book");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new IssueBook().setVisible(true);
				dispose();
			}
		});
		button.setBackground(Color.cyan);
		JButton button_1 = new JButton("Return Book");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new ReturnBook().setVisible(true);
				dispose();
			}
		});
		button_1.setBackground(Color.cyan);
		
		JLabel lblNewLabel = new JLabel("LIBRARY");
		lblNewLabel.setFont(new Font("Tahoma", Font.ITALIC, 20));// for font
		lblNewLabel.setSize(1000,1000);
		lblNewLabel.setBackground(Color.cyan);
		
		JButton btnAddNewbooks = new JButton("Add NewBooks");
		btnAddNewbooks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new AddNewBooks().setVisible(true);
				dispose();
			}
		});
		btnAddNewbooks.setBackground(Color.CYAN);
		
		JButton btnIssuedBookdetails = new JButton("Student Registraction");
		btnIssuedBookdetails.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new StudentRegistraction().setVisible(true);
				dispose();
			}
		});
		btnIssuedBookdetails.setBackground(Color.CYAN);
		JButton btnIssuedBookdetails_1 = new JButton("Issued BookDetails");
		btnIssuedBookdetails_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new IssuedBookDetails().setVisible(true);
				dispose();
			}
		});
		btnIssuedBookdetails_1.setBackground(Color.CYAN);
		// for image
	
		
	
		
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(133)
					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 160, GroupLayout.PREFERRED_SIZE)
					.addGap(55)
					.addComponent(button, GroupLayout.PREFERRED_SIZE, 160, GroupLayout.PREFERRED_SIZE)
					.addGap(36)
					.addComponent(button_1, GroupLayout.PREFERRED_SIZE, 160, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(136, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(400, Short.MAX_VALUE)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)
					.addGap(351))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(180)
					.addComponent(btnAddNewbooks, GroupLayout.PREFERRED_SIZE, 196, GroupLayout.PREFERRED_SIZE)
					.addGap(117)
					.addComponent(btnIssuedBookdetails)
					.addContainerGap(162, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(353, Short.MAX_VALUE)
					.addComponent(btnIssuedBookdetails_1, GroupLayout.PREFERRED_SIZE, 203, GroupLayout.PREFERRED_SIZE)
					.addGap(284))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()

					.addGap(100)
					//.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 152, GroupLayout.PREFERRED_SIZE)
					//.addContainerGap(577, Short.MAX_VALUE))
		));
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
					.addGroup(gl_contentPane.createSequentialGroup()
						.addGap(61)
						.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
						.addGap(81)
						//.addComponent(label))
				//	.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
						.addGap(158)
						//.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 235, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
							.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
							.addComponent(button, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
							.addComponent(button_1, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
						.addGap(42)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
							.addComponent(btnIssuedBookdetails, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
							.addComponent(btnAddNewbooks, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
						.addGap(41)
						.addComponent(btnIssuedBookdetails_1, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
						.addGap(52)))
		);
		contentPane.setLayout(gl_contentPane);
	}
	}


