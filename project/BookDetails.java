import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.ResultSet;

import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.UIManager;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class BookDetails extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	JComboBox comboBox,comboBox_1;
	private JTable table;
	JScrollPane jspane;
	Connection con;
	Statement stmt;
	ResultSet rs;
	String query;
	 String BId,Bname,Bauthor,strm,cls,avl;	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BookDetails frame = new BookDetails();
					frame.setVisible(true);
					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public BookDetails() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 500, 850, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		ButtonGroup  b1 = new javax.swing.ButtonGroup();
		
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
				c1ActionPerformed(a);	 
			}
		});
		comboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Stream", "Science", "Commerce", "Arts" }));
	    comboBox.setEnabled(false);
		comboBox_1 = new JComboBox<>();
		comboBox_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c2ActionPerformed(arg0);
			}	});
		  comboBox_1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Class" }));
	        comboBox_1.setEnabled(false);
		
		JButton button_3 = new JButton("Add New Books");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		button_3.setForeground(Color.WHITE);
		button_3.setBackground(new Color(0, 102, 102));
	//	JScrollPane  jScrollPane2=new JScrollPane();
		
		JButton btnHome = new JButton("Home");
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new MAINLAYER().setVisible(true);
				dispose();
				
			}
		});
		btnHome.setForeground(Color.WHITE);
		btnHome.setBackground(new Color(0, 102, 102));
		
		JButton btnIssueBook = new JButton("Issue Book");
		btnIssueBook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new IssueBook().setVisible(true);
				dispose();
			}
		});
		btnIssueBook.setForeground(Color.WHITE);
		btnIssueBook.setBackground(new Color(0, 102, 102));
		JButton btnReturnBook = new JButton("Return Book");
		btnReturnBook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new ReturnBook().setVisible(true);
				dispose();
			}
			
		});
		btnReturnBook.setForeground(Color.WHITE);
		btnReturnBook.setBackground(new Color(0, 102, 102));
		JButton btnIssuedBookDetails = new JButton("Issued Book Details");
		btnIssuedBookDetails.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new IssuedBookDetails().setVisible(true);
				dispose();
			}
		});
		btnIssuedBookDetails.setForeground(Color.WHITE);
		btnIssuedBookDetails.setBackground(new Color(0, 102, 102));
		// this is for table
		table = new JTable();
		jspane=new JScrollPane();
		
		  table.setModel(new javax.swing.table.DefaultTableModel(
		            new Object [][] {// the value is comming from the down

		            },
		            new String [] {
		                "Book Id", "Book Name", "Author", "Sream", "Class", "Available"
		            }
		        ));
		        table.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
		        jspane.setViewportView(table);
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
						.addGroup(gl_contentPane.createSequentialGroup()
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
						.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addComponent(table, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 692, Short.MAX_VALUE)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(btnHome, GroupLayout.PREFERRED_SIZE, 131, GroupLayout.PREFERRED_SIZE)
									.addGap(30)
									.addComponent(btnIssueBook, GroupLayout.PREFERRED_SIZE, 162, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(btnReturnBook, GroupLayout.PREFERRED_SIZE, 162, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(btnIssuedBookDetails, GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)))
							.addGap(84))))
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
					.addGap(28)
					.addComponent(table, GroupLayout.PREFERRED_SIZE, 172, GroupLayout.PREFERRED_SIZE)
					.addGap(40)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnReturnBook)
						.addComponent(btnIssuedBookDetails)
						.addComponent(btnHome)
						.addComponent(btnIssueBook))
					.addContainerGap(60, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
		setLocationRelativeTo(getParent());
		setResizable(false);
	}
	//c2 combobox
	private void c2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c2ActionPerformed
        try
        {
           
        connect();// connect the database 
        query="select * from booksD where stream='"+comboBox.getSelectedItem()+"' and class='"+comboBox_1.getSelectedItem()+"';";
        rs=(ResultSet) stmt.executeQuery(query); 
        DefaultTableModel model=(DefaultTableModel)table.getModel();
        model.setRowCount(0);
        while(rs.next())
        {
            BId=rs.getString("BookID");// colunmn in the tables
            Bname=rs.getString("BookName");
            Bauthor=rs.getString("Author");
            strm=rs.getString("Stream");
            cls=rs.getString("Class");
            avl=rs.getString("Available");
            Object[] row = {BId,Bname,Bauthor,strm,cls,avl};
            model.addRow(row);
        }
        disconnect();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
	//c1 combo box
	  private void c1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c1ActionPerformed
	        comboBox_1.enable();
	        if(comboBox.getSelectedItem()=="Science")
	        {
	            comboBox_1.removeAllItems();
	            comboBox_1.addItem("Select Class");comboBox_1.addItem("FYBScCS");comboBox_1.addItem("SYBScCS");comboBox_1.addItem("TYBScCS");
	        }
	        if(comboBox.getSelectedItem()=="Arts")
	        {
	            comboBox_1.removeAllItems();
	            comboBox_1.addItem("Select Class");comboBox_1.addItem("FYBA");comboBox_1.addItem("SYBA");comboBox_1.addItem("TYBA");
	        }
	        if(comboBox.getSelectedItem()=="Commerce")
	        {
	            comboBox_1.removeAllItems();
	            comboBox_1.addItem("Select Class");comboBox_1.addItem("FYBCom");comboBox_1.addItem("SYBCom");comboBox_1.addItem("TYBCom");
	        }
	    }
	  // for text for matching from the tables;
	  private void txt1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt1KeyReleased
	        DefaultTableModel model=(DefaultTableModel)table.getModel();
	        model.setRowCount(0);
	        String txt=textField.getText();
	        if(txt.equals(""))
	            System.out.println("");
	        else
	        {
	            try
	            {
	                connect();
	                query="select * from books where BookName LIKE \"%"+textField.getText()+"%\";";
	                rs=(ResultSet) stmt.executeQuery(query); 
	                while(rs.next())
	                {
	                    BId=rs.getString("BookID");
	                    Bname=rs.getString("BookName");
	                    Bauthor=rs.getString("Author");
	                    strm=rs.getString("Stream");
	                    cls=rs.getString("Class");
	                    avl=rs.getString("Available");
	                    Object[] row = {BId,Bname,Bauthor,strm,cls,avl};
	                    model.addRow(row);
	                }
	                disconnect();
	            }
	            catch(Exception e)
	            {
	                System.out.println(e);
	            }
	        }   
	    }//GEN-LAST:event_txt1KeyReleased

	 
//data base connection
public void connect()
{
    try
    {  
        Class.forName("com.mysql.jdbc.Driver");  
        con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/LibraryManagement", "admin","password");
//        con=DriverManager.getConnection(  
//        "jdbc:mysql://localhost:3306/pankaj?useSSL=false&autoReconnect=true","","8543998287");  
        stmt=con.createStatement(); 
    }
    catch(Exception e)
    { 
        System.out.println(e);
        JOptionPane.showMessageDialog(this,"connection error");
    }
}
public void disconnect()
{
    try
    {
       con.close(); 
    }
    catch(Exception e)
    {}

}}
