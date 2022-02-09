package Viewer;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import java.awt.Point;
import java.awt.Dimension;
import java.awt.Component;
import java.awt.Rectangle;
import java.awt.ComponentOrientation;
import javax.swing.DebugGraphics;
import javax.swing.SwingConstants;


@SuppressWarnings("serial")
public class Login extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		prepareGUI();
	}
	
	public void prepareGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(450, 100, 500, 500);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLabel logo = new JLabel("");
		logo.setHorizontalAlignment(SwingConstants.CENTER);
		ImageIcon logoIcon = new ImageIcon(new ImageIcon(Login.class.getResource("/images/logo.jpg")).getImage().getScaledInstance(120, 90, Image.SCALE_SMOOTH));
		logo.setIcon(logoIcon);
		logo.setAlignmentX(Component.CENTER_ALIGNMENT);
		logo.setBackground(Color.WHITE);
		
		contentPane.add(logo, BorderLayout.NORTH);
	}
}
