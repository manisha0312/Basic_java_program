import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class IssueBook extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IssueBook frame = new IssueBook();
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
	public IssueBook() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 500, 850, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("Issue Book");
		
		JLabel lblStudentId = new JLabel("Student id");
		
		JLabel lblBookId = new JLabel("Book Id");
		
		JLabel lblBookName = new JLabel("Book Name");
		
		JLabel lblAyai = new JLabel("Availabel");
		
		JLabel lblIssueDate = new JLabel("Issue Date");
		
		JLabel lblStudentName = new JLabel("Student Name");
		
		textField = new JTextField();
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		
		JButton btnIssue = new JButton("Issue");
		
		JButton btnCancel = new JButton("Cancel");
		
		JButton btnStudentRegistraction = new JButton("Student Registration");
		btnStudentRegistraction.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new StudentRegistraction().setVisible(true);
				dispose();
			}
		});
		
		JButton btnHome = new JButton("Home");
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new MAINLAYER().setVisible(true);
				dispose();
			}
		});
		
		JButton btnBookDetails = new JButton("Book Details");
		btnBookDetails.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new BookDetails().setVisible(true);
				dispose();
			}
			
		});
		
		JButton btnReturnBook = new JButton("Return Book");
		btnReturnBook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new ReturnBook().setVisible(true);
				dispose();
			}
		});
		
		
		JButton btnIssueBookDetails = new JButton("Issued Book Details");
		btnIssueBookDetails.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new IssuedBookDetails().setVisible(true);
				dispose();
			}
		});
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(379)
							.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(154)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
									.addComponent(lblIssueDate)
									.addPreferredGap(ComponentPlacement.RELATED, 158, Short.MAX_VALUE)
									.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, 160, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
											.addGroup(gl_contentPane.createSequentialGroup()
												.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
													.addComponent(lblStudentId, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE)
													.addComponent(lblStudentName)
													.addComponent(lblBookId))
												.addGap(101))
											.addGroup(gl_contentPane.createSequentialGroup()
												.addComponent(lblBookName, GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
												.addPreferredGap(ComponentPlacement.RELATED)))
										.addGroup(gl_contentPane.createSequentialGroup()
											.addComponent(lblAyai)
											.addGap(157)))
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(textField_4, GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
										.addComponent(textField_3, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
										.addComponent(textField_1, GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
										.addComponent(textField, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
										.addComponent(textField_2, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE))))
							.addGap(26)))
					.addGap(271))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(193)
					.addComponent(btnIssue)
					.addGap(101)
					.addComponent(btnCancel, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(388, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(75)
					.addComponent(btnStudentRegistraction)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnHome, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnBookDetails, GroupLayout.PREFERRED_SIZE, 133, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnReturnBook)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnIssueBookDetails, GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(58)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
					.addGap(38)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblStudentId, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(54)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblStudentName)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(48)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblBookId)
						.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(54)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblBookName)
						.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(54)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblAyai)
						.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(42)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblIssueDate)
						.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(40)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnIssue)
						.addComponent(btnCancel))
					.addGap(26)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnStudentRegistraction)
						.addComponent(btnHome)
						.addComponent(btnBookDetails)
						.addComponent(btnReturnBook)
						.addComponent(btnIssueBookDetails))
					.addContainerGap(43, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
		setLocationRelativeTo(getParent());
	}
}
