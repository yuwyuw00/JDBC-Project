import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

public class frame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.


	/**
	 * Create the frame.
	 */
	public frame() {
		setTitle("Attendance Lister");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(235, 30, 1000, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(36, 78, 125));
		panel.setBounds(12, 7, 960, 100);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel CCLogo = new JLabel("");
		CCLogo.setLocation(0, 0);
		CCLogo.setIcon(new ImageIcon(frame.class.getResource("/assests/columbanlogo50x50.png")));
		CCLogo.setHorizontalAlignment(SwingConstants.CENTER);

		CCLogo.setSize(100, 100);
		panel.add(CCLogo);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(6, 114, 172));
		panel_1.setBounds(12, 118, 185, 510);
		contentPane.add(panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(159, 175, 206));
		panel_2.setBounds(212, 118, 760, 510);
		contentPane.add(panel_2);
	}
}
