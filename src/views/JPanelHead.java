package views;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

import controllers.*;

public class JPanelHead extends JPanel {

	private JPanel panelHead;

	public JPanelHead(JPanel mainPanel, Controller control) {
		mainPanel.setLayout(null);
		panelHead = new JPanel();
		panelHead.setBounds(0, 0, 1302, 50);
		panelHead.setLayout(null);
		panelHead.setBackground(new Color(239, 239, 239));
		mainPanel.add(panelHead);

		JButton btnFace = new JButton();
		btnFace.setIcon(new ImageIcon(IoManager.class.getResource("/images/logo-facebook.png")));
		btnFace.setBounds(151, 0, 59, 39);
		btnFace.setContentAreaFilled(false);
		btnFace.setBorderPainted(false);
		btnFace.setActionCommand("facebook");
		btnFace.addActionListener(control);
		panelHead.add(btnFace);

		JButton btnInsta = new JButton();
		btnInsta.setBounds(220, 0, 59, 39);
		btnInsta.setIcon(new ImageIcon(IoManager.class.getResource("/images/logo-instagram.png")));
		btnInsta.setContentAreaFilled(false);
		btnInsta.setBorderPainted(false);
		btnInsta.setActionCommand("instagram");
		btnInsta.addActionListener(control);
		panelHead.add(btnInsta);

		JButton btnTwitter = new JButton();
		btnTwitter.setBounds(289, 0, 59, 39);
		btnTwitter.setIcon(new ImageIcon(IoManager.class.getResource("/images/logo-twitter.png")));
		btnTwitter.setContentAreaFilled(false);
		btnTwitter.setBorderPainted(false);
		btnTwitter.setActionCommand("twitter");
		btnTwitter.addActionListener(control);
		panelHead.add(btnTwitter);

		JButton btnIngresar = new JButton();
		btnIngresar.setBounds(1013, 0, 128, 50);
		btnIngresar.setIcon(new ImageIcon(IoManager.class.getResource("/images/Ingresar_funcionarios.png")));
		btnIngresar.setContentAreaFilled(false);
		btnIngresar.setBorderPainted(false);
		panelHead.add(btnIngresar);
	}

}
