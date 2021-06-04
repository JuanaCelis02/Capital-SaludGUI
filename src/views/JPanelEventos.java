package views;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.toedter.calendar.JCalendar;

public class JPanelEventos extends JPanel {

	private JPanel panelEventos;

	public JPanelEventos(JPanel mainPanel) {
		panelEventos = new JPanel();
		panelEventos.setBounds(482, 952, 333, 462);
		panelEventos.setBackground(new Color(255,255,255));
		mainPanel.add(panelEventos);
		panelEventos.setLayout(null);
		
		JLabel lblNewLabel = new JLabel();
		lblNewLabel.setIcon(new ImageIcon(JPanelEventos.class.getResource("/images/eventos/head.png")));
		lblNewLabel.setBounds(0, 0, 333, 57);
		panelEventos.add(lblNewLabel);
		
		JCalendar calendar = new JCalendar();
		calendar.setBounds(10,60,313,143);
		panelEventos.add(calendar);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(JPanelEventos.class.getResource("/images/eventos/img.png")));
		lblNewLabel_1.setBounds(0, 214, 333, 208);
		panelEventos.add(lblNewLabel_1);
	}

}
