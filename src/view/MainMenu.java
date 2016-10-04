package view;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextPane;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JTextArea;

public class MainMenu {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainMenu window = new MainMenu();
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
	public MainMenu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 583, 375);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 449, 314);
		frame.getContentPane().add(scrollPane);
		
		final JTextPane textPane = new JTextPane();
		scrollPane.setViewportView(textPane);
		
		JButton btnRun = new JButton("Run");
		btnRun.setBounds(469, 11, 89, 23);
		frame.getContentPane().add(btnRun);
		btnRun.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				char arr[] = textPane.getText().toString().toCharArray() ;
				int endLines = 0;
				int tabs = 0 ;
				for (int i = 0 ; i < arr.length; i++){
					if (arr[i]!='\n')
					System.out.println(arr[i]);
					else endLines++;
					
					if (arr[i]=='\t') tabs++;
						
				}
				
				System.out.println(endLines+"  "+tabs);
			}
		});
		
	}
}
