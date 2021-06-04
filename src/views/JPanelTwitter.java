package views;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class JPanelTwitter extends JPanel {

	private JPanel panelTweets;

	public JPanelTwitter(JPanel mainPanel) {
		panelTweets = new JPanel();
		panelTweets.setBounds(149, 490, 333, 462);
		panelTweets.setBackground(new Color(255,255,255));
		mainPanel.add(panelTweets);
		panelTweets.setLayout(null);

		JLabel lblNewLabel = new JLabel();
		lblNewLabel.setIcon(new ImageIcon(IoManager.class.getResource("/images/twits/header.png")));
		lblNewLabel.setBounds(0, 0, 333, 57);
		panelTweets.add(lblNewLabel);
		
		JPanel paneltuits = new JPanel();
		paneltuits.setBounds(0, 59, 333, 296);
		paneltuits.setBackground(new Color(255,255,255));
		paneltuits.setPreferredSize(new Dimension(313, 1100));
		
		JScrollPane scrollTwitter = new JScrollPane();
		scrollTwitter.setBounds(0, 59, 333, 296);
		scrollTwitter.setBorder(null);
		scrollTwitter.setViewportView(paneltuits);
		paneltuits.setLayout(null);
		
		JLabel lblimgt1 = new JLabel();
		lblimgt1.setIcon(new ImageIcon(IoManager.class.getResource("/images/twits/twit1.png")));
		lblimgt1.setBounds(10, 0, 292, 269);
		paneltuits.add(lblimgt1);
		
		JLabel lblimgt2 = new JLabel();
		lblimgt2.setIcon(new ImageIcon(IoManager.class.getResource("/images/twits/twit2.png")));
		lblimgt2.setBounds(10, 292, 292, 269);
		paneltuits.add(lblimgt2);
		
		JLabel lblimgt3 = new JLabel();
		lblimgt3.setIcon(new ImageIcon(IoManager.class.getResource("/images/twits/twit3.png")));
		lblimgt3.setBounds(10, 584, 292, 269);
		paneltuits.add(lblimgt3);
		
		JLabel lblimgt4 = new JLabel();
		lblimgt4.setIcon(new ImageIcon(IoManager.class.getResource("/images/twits/twit4.png")));
		lblimgt4.setBounds(10, 853, 292, 269);
		paneltuits.add(lblimgt4);
	
		panelTweets.add(scrollTwitter);
		
		JLabel lblNewLabel_1 = new JLabel();
		lblNewLabel_1.setIcon(new ImageIcon(JPanelTwitter.class.getResource("/images/twits/abajotwits.png")));
		lblNewLabel_1.setBounds(10, 366, 313, 77);
		panelTweets.add(lblNewLabel_1);
	}
}
