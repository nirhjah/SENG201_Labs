package lab6;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainScreen {

	private JFrame window;
	private RocketManager manager;
	
	public MainScreen(RocketManager incomingManager) {
		manager = incomingManager;
		initialize();
		window.setVisible(true);
	}
	
	public void closeWindow() {
		window.dispose();
	}
	
	public void finishedWindow() {
		manager.closeMainScreen(this);
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainScreen window = new MainScreen();
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
	public MainScreen() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		window = new JFrame();
		window.setTitle("Rocket Manager Main Screen");
		window.setBounds(100, 100, 625, 496);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.getContentPane().setLayout(null);
		
		JLabel lblHello = new JLabel("Hello Starman!");
		lblHello.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblHello.setBounds(10, 11, 239, 14);
		window.getContentPane().add(lblHello);
		
		JButton btnChosen1 = new JButton("Rocket 5");
		btnChosen1.setBounds(23, 70, 166, 145);
		window.getContentPane().add(btnChosen1);
		
		JButton btnChosen2 = new JButton("Rocket 2");
		btnChosen2.setBounds(226, 70, 166, 145);
		window.getContentPane().add(btnChosen2);
		
		JButton btnChosen3 = new JButton("");
		btnChosen3.setBounds(420, 70, 166, 145);
		window.getContentPane().add(btnChosen3);
		
		JLabel lblRocketName1 = new JLabel("Name: Falcon 9");
		lblRocketName1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblRocketName1.setBounds(23, 248, 166, 14);
		window.getContentPane().add(lblRocketName1);
		
		JLabel lblFuel1 = new JLabel("Fuel: Empty");
		lblFuel1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblFuel1.setBounds(23, 288, 128, 14);
		window.getContentPane().add(lblFuel1);
		
		JLabel lblCleanliness1 = new JLabel("Cleanliness: clean");
		lblCleanliness1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblCleanliness1.setBounds(23, 331, 146, 14);
		window.getContentPane().add(lblCleanliness1);
		
		JLabel lblRocketName2 = new JLabel("Name: Space Shuttle");
		lblRocketName2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblRocketName2.setBounds(226, 248, 166, 14);
		window.getContentPane().add(lblRocketName2);
		
		JLabel lblFuel2 = new JLabel("Fuel: Low");
		lblFuel2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblFuel2.setBounds(226, 288, 98, 14);
		window.getContentPane().add(lblFuel2);
		
		JLabel lblCleanliness2 = new JLabel("Cleanliness:");
		lblCleanliness2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblCleanliness2.setBounds(226, 331, 140, 14);
		window.getContentPane().add(lblCleanliness2);
		
		JLabel lblRocketName3 = new JLabel("Name:");
		lblRocketName3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblRocketName3.setBounds(420, 248, 65, 14);
		window.getContentPane().add(lblRocketName3);
		
		JLabel lblFuel3 = new JLabel("Fuel:");
		lblFuel3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblFuel3.setBounds(420, 288, 40, 14);
		window.getContentPane().add(lblFuel3);
		
		JLabel lblCleanliness3 = new JLabel("Cleanliness:");
		lblCleanliness3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblCleanliness3.setBounds(420, 331, 89, 14);
		window.getContentPane().add(lblCleanliness3);
		
		JButton btnClean = new JButton("Clean Rocket");
		btnClean.setBounds(23, 383, 128, 47);
		window.getContentPane().add(btnClean);
		
		JButton btnRefuel = new JButton("Refuel Rocket");
		btnRefuel.setBounds(226, 383, 128, 47);
		window.getContentPane().add(btnRefuel);
		
		JButton btnQuit = new JButton("Quit");
		btnQuit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				finishedWindow();
			}
		});
		btnQuit.setBounds(420, 383, 128, 47);
		window.getContentPane().add(btnQuit);
	}

}
