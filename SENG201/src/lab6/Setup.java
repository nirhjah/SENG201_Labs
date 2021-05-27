package lab6;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JSlider;
import javax.swing.JScrollBar;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Setup {

	private JFrame window;
	private JTextField textName;
	private RocketManager manager;
	
	
	public Setup(RocketManager incomingManager) {
		manager = incomingManager;
		initialize();
		window.setVisible(true);
	}
	
	
	public void closeWindow() {
		window.dispose();
	}
	
	public void finishedWindow() {
		manager.closeSetupScreen(this);
	}
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Setup window = new Setup();
					window.window.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Setup() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		window = new JFrame();
		window.setBounds(100, 100, 625, 495);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.getContentPane().setLayout(null);
		
		JLabel lblWelcome = new JLabel("Welcome to Rocket Manager!");
		lblWelcome.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblWelcome.setBounds(10, 11, 208, 14);
		window.getContentPane().add(lblWelcome);
		
		JLabel lblName = new JLabel("What is your name?");
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblName.setBounds(10, 46, 186, 14);
		window.getContentPane().add(lblName);
		
		JLabel lblRockets = new JLabel("How many rockets do you want?");
		lblRockets.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblRockets.setBounds(10, 85, 239, 14);
		window.getContentPane().add(lblRockets);
		
		textName = new JTextField();
		textName.setToolTipText("Enter your name");
		textName.setBounds(323, 40, 239, 20);
		window.getContentPane().add(textName);
		textName.setColumns(10);
		
		JSlider slider = new JSlider();
		slider.setMaximum(6);
		slider.setMinimum(1);
		slider.setBounds(323, 85, 239, 14);
		window.getContentPane().add(slider);
		
		JButton btnRocket1 = new JButton("Rocket 1");
		btnRocket1.setBounds(10, 165, 89, 63);
		window.getContentPane().add(btnRocket1);
		
		JButton btnRocket2 = new JButton("Rocket 2");
		btnRocket2.setBounds(107, 165, 89, 63);
		window.getContentPane().add(btnRocket2);
		
		JButton btnRocket3 = new JButton("Rocket 3");
		btnRocket3.setBounds(206, 165, 89, 63);
		window.getContentPane().add(btnRocket3);
		
		JButton btnRocket4 = new JButton("Rocket 4");
		btnRocket4.setBounds(10, 239, 89, 63);
		window.getContentPane().add(btnRocket4);
		
		JButton btnRocket5 = new JButton("Rocket 5");
		btnRocket5.setBounds(107, 239, 89, 63);
		window.getContentPane().add(btnRocket5);
		
		JButton btnRocket6 = new JButton("Rocket 6");
		btnRocket6.setBounds(206, 239, 89, 63);
		window.getContentPane().add(btnRocket6);
		
		JLabel lblSelectYourRockets = new JLabel("Select your rockets!");
		lblSelectYourRockets.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblSelectYourRockets.setBounds(10, 140, 239, 14);
		window.getContentPane().add(lblSelectYourRockets);
		
		JLabel lblSelectedRockets = new JLabel("Selected Rockets:");
		lblSelectedRockets.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblSelectedRockets.setBounds(10, 328, 239, 14);
		window.getContentPane().add(lblSelectedRockets);
		
		JButton btnSelectedRocket1 = new JButton("Rocket5");
		btnSelectedRocket1.setBounds(10, 365, 89, 63);
		window.getContentPane().add(btnSelectedRocket1);
		
		JButton btnSelectedRocket2 = new JButton("Rocket 3");
		btnSelectedRocket2.setBounds(107, 365, 89, 63);
		window.getContentPane().add(btnSelectedRocket2);
		
		JButton btnSelectedRocket3 = new JButton("");
		btnSelectedRocket3.setBounds(206, 365, 89, 63);
		window.getContentPane().add(btnSelectedRocket3);
		
		JLabel lblRocketStats = new JLabel("Rocket Stats");
		lblRocketStats.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblRocketStats.setBounds(419, 167, 94, 14);
		window.getContentPane().add(lblRocketStats);
		
		JLabel lblNameRocket = new JLabel("Name:");
		lblNameRocket.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNameRocket.setBounds(323, 205, 65, 14);
		window.getContentPane().add(lblNameRocket);
		
		JLabel lblFuel = new JLabel("Fuel:");
		lblFuel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblFuel.setBounds(323, 245, 40, 14);
		window.getContentPane().add(lblFuel);
		
		JLabel lblCleanliness = new JLabel("Cleanliness:");
		lblCleanliness.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblCleanliness.setBounds(323, 288, 89, 14);
		window.getContentPane().add(lblCleanliness);
		
		JButton btnAccept = new JButton("Accept");
		btnAccept.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				finishedWindow();
			}
		});
		btnAccept.setBounds(473, 405, 89, 23);
		window.getContentPane().add(btnAccept);
	}
}
