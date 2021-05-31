package lab6;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JSlider;
import javax.swing.JScrollBar;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;

public class Setup {

	private JFrame window;
	private JTextField textName;
	private RocketManager manager;
	private MainScreen mainscreen;
	public Rocket rocket;
	private ArrayList<Rocket> rockets = new ArrayList<>();
	ArrayList<Rocket> chosenRockets = new ArrayList<>();
	

	public ArrayList<Rocket> generateRockets(){
		rockets.add(new Rocket("Falcon 9", "Full", "Clean"));
		rockets.add(new Rocket("Orbiter", "Full", "Clean"));
		rockets.add(new Rocket("Transformer", "Full", "Clean"));
		rockets.add(new Rocket("Generator Z", "Full", "Clean"));
		rockets.add(new Rocket("Cranium", "Full", "Clean"));
		rockets.add(new Rocket("Eclipser", "Full", "Clean"));
		return rockets;


	}
	
	public Setup(RocketManager incomingManager) {
		this.manager = incomingManager;
		initialize();
		window.setVisible(true);
	}
	
	
	public void closeWindow() {
		window.dispose();
	}
	
	public void finishedWindow() {
		manager.closeSetup(this);
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
		
		JLabel lblSelectYourRockets = new JLabel("Select your rockets!");
		lblSelectYourRockets.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblSelectYourRockets.setBounds(10, 140, 239, 14);
		window.getContentPane().add(lblSelectYourRockets);
		
		JLabel lblSelectedRockets = new JLabel("Selected Rockets:");
		lblSelectedRockets.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblSelectedRockets.setBounds(10, 328, 125, 20);
		window.getContentPane().add(lblSelectedRockets);
		
		JLabel lblRocketStats = new JLabel("Rocket Stats");
		lblRocketStats.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblRocketStats.setBounds(419, 167, 94, 14);
		window.getContentPane().add(lblRocketStats);
		
		JLabel lblNameRocket = new JLabel("Name:");
		lblNameRocket.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNameRocket.setBounds(323, 205, 239, 14);
		window.getContentPane().add(lblNameRocket);
		
		JLabel lblFuel = new JLabel("Fuel:");
		lblFuel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblFuel.setBounds(323, 245, 239, 14);
		window.getContentPane().add(lblFuel);
		
		JLabel lblCleanliness = new JLabel("Cleanliness:");
		lblCleanliness.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblCleanliness.setBounds(323, 288, 239, 14);
		window.getContentPane().add(lblCleanliness);
		
		DefaultListModel<Rocket> rocketListModel = new DefaultListModel<>();
		rocketListModel.addAll(generateRockets());
				
		JList<Rocket> rocketList = new JList<>(rocketListModel);
		rocketList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		rocketList.setBounds(16, 169, 233, 148);
		window.getContentPane().add(rocketList);
		rocketList.getSelectedValue();

		

		
		
		
		
		JButton btnAccept = new JButton("Accept");
		btnAccept.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				while(true) {
				
				
					if(chosenRockets.size() < 3) {
						JOptionPane.showMessageDialog(window, "You need to select at least three rockets", "Some Title Here", JOptionPane.ERROR_MESSAGE);
						break;

					}
				
					else {
						manager.setName(textName.getText());
						manager.setRocketList(chosenRockets);
						for(Rocket rocket : chosenRockets) {
							System.out.println(rocket.getRocketName());
						}
	


				manager.launchMainScreen();
				closeWindow();
				break; }
				
			}}
		});
		btnAccept.setBounds(473, 405, 89, 23);
		window.getContentPane().add(btnAccept);
		
		JButton btnSelect = new JButton("Select");
		btnSelect.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				while(true) {
					
					
			
					if(chosenRockets.size() >= 6) {
						JOptionPane.showMessageDialog(window, "You have chosen the max of 6 rockets, please press Accept to continue.");
						break;

						
					}
					
					
					
					else {
						chosenRockets.add(rocketList.getSelectedValue());
						break;
						
					}
				}
				
				
			
				
				
				
				
				
			}
		});
		btnSelect.setBounds(138, 326, 111, 23);
		window.getContentPane().add(btnSelect);
		
		JButton btnViewDetails = new JButton("View Details");
		btnViewDetails.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				
				lblNameRocket.setText("Name: " + rocketList.getSelectedValue().getRocketName());
				lblFuel.setText("Fuel: " + rocketList.getSelectedValue().getFuel());
				lblCleanliness.setText("Cleanliness: " + rocketList.getSelectedValue().getCleanliness());
				
				
			}
		});
		
		btnViewDetails.setBounds(323, 326, 111, 23);
		window.getContentPane().add(btnViewDetails);
		


	}
    }
	
	
	 
	

