package views;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class JPanelSlider extends JPanel {

	private JPanel panelSlider;
	private JLabel lbl;

	public JPanelSlider(JPanel mainPanel) {
		panelSlider = new JPanel();
		panelSlider.setBounds(149, 248, 970, 240);
		panelSlider.setLayout(null);
		panelSlider.setBackground(new Color(255,255,255));
		mainPanel.add(panelSlider);

		lbl = new JLabel();
		lbl.setIcon(new ImageIcon(JPanelSlider.class.getResource("/images/slider/s1.png")));
		lbl.setBounds(59, 11, 852, 184);

		panelSlider.add(lbl);

		JButton btnNewButton = new JButton();
		btnNewButton.setIcon(new ImageIcon(JPanelSlider.class.getResource("/images/slider/circle.png")));
		btnNewButton.setBounds(308, 206, 50, 23);
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setBorderPainted(false);
		btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1actionPerformed(evt);
            }
        });
		panelSlider.add(btnNewButton);

		JButton btn1 = new JButton();
		btn1.setIcon(new ImageIcon(JPanelSlider.class.getResource("/images/slider/circle.png")));
		btn1.setBounds(400, 206, 50, 23);
		btn1.setContentAreaFilled(false);
		btn1.setBorderPainted(false);
		btn1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				lbl.setIcon(new ImageIcon(JPanelSlider.class.getResource("/images/slider/s2.png")));
			}
		});
		panelSlider.add(btn1);

		JButton btn2 = new JButton();
		btn2.setIcon(new ImageIcon(JPanelSlider.class.getResource("/images/slider/circle.png")));
		btn2.setBounds(490, 206, 50, 23);
		btn2.setContentAreaFilled(false);
		btn2.setBorderPainted(false);
		btn2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				lbl.setIcon(new ImageIcon(JPanelSlider.class.getResource("/images/slider/s3.png")));
			}
		});
		panelSlider.add(btn2);

		JButton btn3 = new JButton();
		btn3.setIcon(new ImageIcon(JPanelSlider.class.getResource("/images/slider/circle.png")));
		btn3.setBounds(575, 206, 50, 23);
		btn3.setContentAreaFilled(false);
		btn3.setBorderPainted(false);
		btn3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				lbl.setIcon(new ImageIcon(JPanelSlider.class.getResource("/images/slider/s4.png")));
			}
		});
		panelSlider.add(btn3);
	}
	
	private void btn1actionPerformed(ActionEvent evt) {
		lbl.setIcon(new ImageIcon(JPanelSlider.class.getResource("/images/slider/s1.png")));
	}
	

}
