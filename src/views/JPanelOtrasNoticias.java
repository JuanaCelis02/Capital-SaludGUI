package views;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controllers.*;

import javax.swing.JButton;


public class JPanelOtrasNoticias extends JPanel {

	private JPanel panel;

	public JPanelOtrasNoticias(JPanel mainPanel, Controller control) {
		panel = new JPanel();
		panel.setBounds(482, 490, 333, 462);
		panel.setBackground(new Color(255,255,255));
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel();
		lblNewLabel.setIcon(new ImageIcon(JPanelOtrasNoticias.class.getResource("/images/noticias/tittle.png")));
		lblNewLabel.setBounds(0, 0, 333, 57);
		panel.add(lblNewLabel);
		
		
		mainPanel.add(panel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(JPanelOtrasNoticias.class.getResource("/images/noticias/noticias.png")));
		lblNewLabel_1.setBounds(10, 53, 313, 346);
		panel.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Ver mas noticias");
		btnNewButton.setBounds(10, 407, 299, 44);
		btnNewButton.setActionCommand("noticias");
		btnNewButton.addActionListener(control);
		panel.add(btnNewButton);
	}
}
