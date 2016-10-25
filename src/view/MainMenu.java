package view;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextPane;

import exe.Lex;

import javax.swing.JScrollPane;
import javax.swing.JButton;

public class MainMenu {

	private JFrame frame;
	private JButton btnTokenList ;

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
		frame.setBounds(100, 100, 657, 375);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 449, 314);
		frame.getContentPane().add(scrollPane);
		
		final JTextPane textPane = new JTextPane();
		scrollPane.setViewportView(textPane);
		
		JButton btnRun = new JButton("Run");
		btnRun.setBounds(471, 84, 89, 23);
		frame.getContentPane().add(btnRun);
		
		btnTokenList = new JButton("Ver lista de tokens");
		btnTokenList.setBounds(471, 119, 172, 25);
		frame.getContentPane().add(btnTokenList);
		btnTokenList.setEnabled(false);
		
		btnRun.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Lex lex = new Lex(textPane.getText().toString());
				lex.tokenGenerator();
				lex.printTokens();
				btnTokenList.setEnabled(true);
			}
		});
		
		btnTokenList.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				TokenList tokenList = new TokenList();
				tokenList.setVisible(true);
			}
		});
		
		
	}
}
