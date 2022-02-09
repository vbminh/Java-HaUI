package application.GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JComboBox;
import javax.swing.JTree;
import javax.swing.JToolBar;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Component;

import javax.swing.Icon;
import javax.swing.ImageIcon;

public class demo extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTable table_1;
	private JTable table_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					demo frame = new demo();
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
	public demo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1120, 650);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(10, 11, 414, 49);
		contentPane.add(toolBar);
		
		JButton btnNewButton = new JButton("Thêm");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		toolBar.add(btnNewButton);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 71, 1084, 316);
		contentPane.add(tabbedPane);
		
		table = new JTable();
		tabbedPane.addTab("Ban Lãnh Đạo", null, table, null);
		
		table_1 = new JTable();
		tabbedPane.addTab("Giảng viên", null, table_1, null);
		
		table_2 = new JTable();
		tabbedPane.addTab("New tab", null, table_2, null);
		
		JTabbedPane tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_1.setBackground(Color.WHITE);
		tabbedPane_1.setBounds(10, 395, 1084, 205);
		contentPane.add(tabbedPane_1);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		Icon icon =(ImageIcon) new ImageIcon(demo.class.getResource("/images/user.jpg"));
		panel.add((Component) icon,100,100);
		JLabel lblNewLabel = new JLabel("New label");
		panel.add(lblNewLabel);
		

		tabbedPane_1.addTab("",panel);
	}
}
