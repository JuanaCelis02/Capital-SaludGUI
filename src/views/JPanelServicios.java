package views;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controllers.*;

import javax.swing.JButton;

public class JPanelServicios extends JPanel {

	private JPanel panelServicio;

	public JPanelServicios(JPanel mainPanel, Controller control) {
		panelServicio = new JPanel();
		panelServicio.setBounds(149, 952, 333, 462);
		panelServicio.setBackground(new Color(255,255,255));
		mainPanel.add(panelServicio);
		panelServicio.setLayout(null);
		
		JLabel lblNewLabel = new JLabel();
		lblNewLabel.setIcon(new ImageIcon(JPanelServicios.class.getResource("/images/SERVICIOS/head.png")));
		lblNewLabel.setBounds(0, 0, 333, 57);
		panelServicio.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(JPanelServicios.class.getResource("/images/SERVICIOS/todo.png")));
		lblNewLabel_1.setBounds(10, 60, 313, 391);
		panelServicio.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setBounds(10, 284, 280, 167);
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setBorderPainted(false);
		btnNewButton.setActionCommand("videoyt");
		btnNewButton.addActionListener(control);
		panelServicio.add(btnNewButton);
	}
}
