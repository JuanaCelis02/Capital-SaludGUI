package views;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controllers.*;

import javax.swing.JButton;

public class JPanelEnlaces extends JPanel {

	private JPanel panelEnlacesDestacados;

	public JPanelEnlaces(JPanel mainPanel, Controller control) {
		panelEnlacesDestacados = new JPanel();
		panelEnlacesDestacados.setBounds(811, 490, 340, 462);
		panelEnlacesDestacados.setBackground(new Color(255,255,255));
		panelEnlacesDestacados.setLayout(null);
		
		JLabel lblNewLabel = new JLabel();
		lblNewLabel.setBounds(0, 0, 333, 57);
		lblNewLabel.setIcon(new ImageIcon(JPanelEnlaces.class.getResource("/images/enlaces/head.png")));
		panelEnlacesDestacados.add(lblNewLabel);
		
		mainPanel.add(panelEnlacesDestacados);
		
		JButton btn1 = new JButton("\u00BFComo afiliarse en capital salud?");
		btn1.setForeground(Color.WHITE);
		btn1.setBounds(10, 65, 323, 32);
		btn1.setBackground(new Color(0,136,204));
		btn1.setActionCommand("afiliarse");
		btn1.addActionListener(control);
		panelEnlacesDestacados.add(btn1);
		
		JButton btn2 = new JButton("Transparencia y acceso a la informacion");
		btn2.setForeground(Color.WHITE);
		btn2.setBackground(new Color(0, 136, 204));
		btn2.setBounds(10, 108, 323, 32);
		btn2.setActionCommand("transparencia");
		btn2.addActionListener(control);
		panelEnlacesDestacados.add(btn2);
		
		JButton btn3 = new JButton("Tramites en linea");
		btn3.setForeground(Color.WHITE);
		btn3.setBackground(new Color(0, 136, 204));
		btn3.setActionCommand("tramites");
		btn3.addActionListener(control);
		btn3.setBounds(10, 151, 323, 32);
		
		panelEnlacesDestacados.add(btn3);
		
		JButton btnRedPrestadoraDe = new JButton("Red prestadora de servicios");
		btnRedPrestadoraDe.setForeground(Color.WHITE);
		btnRedPrestadoraDe.setBackground(new Color(0, 136, 204));
		btnRedPrestadoraDe.setBounds(10, 194, 323, 32);
		btnRedPrestadoraDe.setActionCommand("red");
		btnRedPrestadoraDe.addActionListener(control);
		panelEnlacesDestacados.add(btnRedPrestadoraDe);
		
		JButton btnRendicionDeCuentas = new JButton("Rendicion de cuentas");
		btnRendicionDeCuentas.setForeground(Color.WHITE);
		btnRendicionDeCuentas.setBackground(new Color(0, 136, 204));
		btnRendicionDeCuentas.setBounds(10, 237, 323, 32);
		btnRendicionDeCuentas.setActionCommand("rendicion");
		btnRendicionDeCuentas.addActionListener(control);
		panelEnlacesDestacados.add(btnRendicionDeCuentas);
		
		JButton btnMinisitioParaNios = new JButton("Minisitio para ni\u00F1os");
		btnMinisitioParaNios.setForeground(Color.WHITE);
		btnMinisitioParaNios.setBackground(new Color(0, 136, 204));
		btnMinisitioParaNios.setBounds(10, 280, 323, 32);
		btnMinisitioParaNios.setActionCommand("minisitio");
		btnMinisitioParaNios.addActionListener(control);
		panelEnlacesDestacados.add(btnMinisitioParaNios);
		
		JButton btnChatDeAsignacion = new JButton("Chat de asignacion de citas");
		btnChatDeAsignacion.setForeground(Color.WHITE);
		btnChatDeAsignacion.setBackground(new Color(0, 136, 204));
		btnChatDeAsignacion.setBounds(10, 323, 323, 32);
		btnChatDeAsignacion.setActionCommand("chat");
		btnChatDeAsignacion.addActionListener(control);
		panelEnlacesDestacados.add(btnChatDeAsignacion);
		
		JButton btnSaluddataObservatorioBogota = new JButton("SaludData observatorio Bogota");
		btnSaluddataObservatorioBogota.setForeground(Color.WHITE);
		btnSaluddataObservatorioBogota.setBackground(new Color(0, 136, 204));
		btnSaluddataObservatorioBogota.setBounds(10, 366, 323, 32);
		btnSaluddataObservatorioBogota.setActionCommand("salud");
		btnSaluddataObservatorioBogota.addActionListener(control);
		panelEnlacesDestacados.add(btnSaluddataObservatorioBogota);
	}

}
