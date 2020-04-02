package javaLoginSystem;

import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginSystem {

	protected static Component frmLoginSystem = null;
	private JFrame frame;
	private JTextField txtUserName;
	private JPasswordField txtPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginSystem window = new LoginSystem();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LoginSystem() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(200, 200, 550, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblLogin = new JLabel("Login");
		lblLogin.setBounds(219, 22, 66, 15);
		frame.getContentPane().add(lblLogin);
		
		JLabel lblEnterUserName = new JLabel("Enter User name");
		lblEnterUserName.setBounds(58, 75, 145, 35);
		frame.getContentPane().add(lblEnterUserName);
		
		JLabel lblEnterPassword = new JLabel("Enter Password");
		lblEnterPassword.setBounds(58, 135, 123, 26);
		frame.getContentPane().add(lblEnterPassword);
		
		txtUserName = new JTextField();
		txtUserName.setBounds(301, 64, 227, 35);
		frame.getContentPane().add(txtUserName);
		txtUserName.setColumns(10);
		
		txtPassword = new JPasswordField();
		txtPassword.setBounds(311, 111, 223, 44);
		frame.getContentPane().add(txtPassword);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnLogin.setBounds(67, 204, 114, 25);
		frame.getContentPane().add(btnLogin);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnReset.setBounds(219, 203, 114, 26);
		frame.getContentPane().add(btnReset);
		//I added to clear the text field and password field
		txtUserName.setText(null);
		txtPassword.setText(null);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			frmLoginSystem = new JFrame("Exit");
			if(JOptionPane.showConfirmDialog(frmLoginSystem, "confim  to exit ", "login",
					JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION) {
				System.exit(0);
			}
	
			}
		});
		btnExit.setBounds(381, 203, 123, 26);
		frame.getContentPane().add(btnExit);
	}
}
