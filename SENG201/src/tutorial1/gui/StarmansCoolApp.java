package tutorial1.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class StarmansCoolApp {

	private JFrame frmStarmansCoolApp;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StarmansCoolApp window = new StarmansCoolApp();
					window.frmStarmansCoolApp.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public StarmansCoolApp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmStarmansCoolApp = new JFrame();
		frmStarmansCoolApp.setTitle("Starmans Cool App");
		frmStarmansCoolApp.setBounds(100, 100, 620, 440);
		frmStarmansCoolApp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmStarmansCoolApp.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(StarmansCoolApp.class.getResource("/Images/Starman.jpg")));
		lblNewLabel.setBounds(10, 219, 210, 175);
		frmStarmansCoolApp.getContentPane().add(lblNewLabel);
		
		JLabel lblWelcome = new JLabel("Starman welcomes you! Enter some text below to get Starman talking.");
		lblWelcome.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblWelcome.setBounds(43, 48, 532, 21);
		frmStarmansCoolApp.getContentPane().add(lblWelcome);
		
		JLabel lblSays = new JLabel("Starman says:");
		lblSays.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblSays.setBounds(243, 242, 112, 21);
		frmStarmansCoolApp.getContentPane().add(lblSays);
		
		JLabel lblOutput = new JLabel("Nothing yet!");
		lblOutput.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblOutput.setBounds(243, 346, 112, 21);
		frmStarmansCoolApp.getContentPane().add(lblOutput);
		
		textField = new JTextField();
		textField.setBounds(43, 80, 532, 105);
		frmStarmansCoolApp.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Speak Starman!");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblOutput.setText(textField.getText());

			}
		});
		btnNewButton.setBounds(255, 196, 112, 23);
		frmStarmansCoolApp.getContentPane().add(btnNewButton);
	}
}
