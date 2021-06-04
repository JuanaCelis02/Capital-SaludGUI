package views;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

import controllers.*;

import java.awt.GridLayout;


public class IoManager extends JFrame {

	private JScrollPane mainScrollPane;
	private JPanel mainPanel;
	private JPanelHead panelHead;
	private JPanelTwitter panelTweets;
	private JPanelOtrasNoticias panelOtrasNoticias;
	private JPanelEnlaces panelEnlacesDestacados;
	private JTextField txtS;
	private JPanel panelTittle;
	private JPanelServicios panelServicio;
	private JPanelEventos panelEventos;
	private JPanel panelInstitucional;
	private JPanel panelSlider;

	public IoManager(Controller control) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1330, 700);
		setLocationRelativeTo(null);
		setResizable(false);
		
		mainPanel = new JPanel();
		mainPanel.setBackground(Color.white);
		mainPanel.setPreferredSize(new Dimension(1065, 1700));

		initializePanelHead(control);
		initializePanelTittle(control);
		initializePanelButtons();
		initializePanelTwitter();
		initializePanelNoticias(control);
		initializePanelEnlaces(control);
		initializePanelServicios(control);
		initializePanelEventos();
		initializePanelInstitucional(control);
		initializePanelSlider();
		
		mainScrollPane = new JScrollPane();
		mainScrollPane.setBounds(0, 140, 1100, 510);
		mainScrollPane.setBorder(null);
		mainScrollPane.setViewportView(mainPanel);
	
		JPanel panelfooter = new JPanel();
		panelfooter.setBounds(0,1414,1302,280);
		panelfooter.setBackground(new Color(255,255,255));
		JLabel lbl = new JLabel();
		lbl.setBounds(0, 0, 1302, 280);
		lbl.setIcon(new ImageIcon(IoManager.class.getResource("/images/footer.png")));
		panelfooter.add(lbl);
		mainPanel.add(panelfooter);
		
		getContentPane().add(mainScrollPane);
	}

	public void initializePanelButtons() {
		JPanel panelMainButtons = new JPanel();
		panelMainButtons.setBounds(0, 198, 1302, 50);
		panelMainButtons.setBackground(new Color(0, 114, 163));
		mainPanel.add(panelMainButtons);
		panelMainButtons.setLayout(new GridLayout(1, 0, 0, 0));

		JButton btn1 = new JButton();
		btn1.setContentAreaFilled(false);
		btn1.setBorderPainted(false);
		btn1.setOpaque(false);
		panelMainButtons.add(btn1);

		JButton btn2 = new JButton();
		btn2.setIcon(new ImageIcon(IoManager.class.getResource("/images/inicio.png")));
		btn2.setContentAreaFilled(false);
		btn2.setBorderPainted(false);
		btn2.setOpaque(false);
		panelMainButtons.add(btn2);

		JButton btn3 = new JButton();
		btn3.setIcon(new ImageIcon(IoManager.class.getResource("/images/nosotros.png")));
		btn3.setContentAreaFilled(false);
		btn3.setBorderPainted(false);
		btn3.setOpaque(false);
		panelMainButtons.add(btn3);

		JButton btn4 = new JButton();
		btn4.setIcon(new ImageIcon(IoManager.class.getResource("/images/proteccion.png")));
		btn4.setContentAreaFilled(false);
		btn4.setBorderPainted(false);
		btn4.setOpaque(false);
		panelMainButtons.add(btn4);

		JButton btn5 = new JButton();
		btn5.setIcon(new ImageIcon(IoManager.class.getResource("/images/interes.png")));
		btn5.setContentAreaFilled(false);
		btn5.setBorderPainted(false);
		btn5.setOpaque(false);
		panelMainButtons.add(btn5);

		JButton btn6 = new JButton();
		btn6.setIcon(new ImageIcon(IoManager.class.getResource("/images/contactenos.png")));
		btn6.setContentAreaFilled(false);
		btn6.setBorderPainted(false);
		btn6.setOpaque(false);
		panelMainButtons.add(btn6);

		JButton btn7 = new JButton();
		btn7.setContentAreaFilled(false);
		btn7.setBorderPainted(false);
		btn7.setOpaque(false);
		panelMainButtons.add(btn7);
	}

	public void initializePanelTittle(Controller control) {
		panelTittle = new JPanel();
		panelTittle.setBounds(0, 49, 1302, 149);
		panelTittle.setToolTipText("");
		panelTittle.setBackground(new Color(255, 255, 255));
		mainPanel.add(panelTittle);
		panelTittle.setLayout(null);

		JLabel lblImgLogo = new JLabel("New label");
		lblImgLogo.setIcon(new ImageIcon(IoManager.class.getResource("/images/Logo-Capital.png")));
		lblImgLogo.setBounds(160, 0, 244, 149);
		panelTittle.add(lblImgLogo);

		JLabel lblImgCentroTitulo = new JLabel("");
		lblImgCentroTitulo.setIcon(new ImageIcon(IoManager.class.getResource("/images/centroTitulo.png")));
		lblImgCentroTitulo.setBounds(510, 0, 260, 149);
		panelTittle.add(lblImgCentroTitulo);

		txtS = new JTextField();
		txtS.setToolTipText("Search Site");
		txtS.setBounds(938, 45, 128, 20);
		panelTittle.add(txtS);
		txtS.setColumns(10);

		JButton btnNewButton = new JButton();
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setBorderPainted(false);
		btnNewButton.setIcon(new ImageIcon(IoManager.class.getResource("/images/lupa.png")));
		btnNewButton.setBounds(1069, 33, 42, 37);
		btnNewButton.setActionCommand("buscar");
		btnNewButton.addActionListener(control);
		panelTittle.add(btnNewButton);
	}
	
	public String getTextBuscar() {
		return txtS.getText();
	}

	public void initializePanelHead(Controller control) {
		panelHead = new JPanelHead(mainPanel, control);
		panelHead.setVisible(true);
	}

	public void initializePanelTwitter() {
		panelTweets = new JPanelTwitter(mainPanel);
		panelTweets.setVisible(true);
	}
	
	public void initializePanelNoticias(Controller control) {
		panelOtrasNoticias = new JPanelOtrasNoticias(mainPanel, control);
		panelOtrasNoticias.setVisible(true);
	}

	public void initializePanelEnlaces(Controller control) {
		panelEnlacesDestacados = new JPanelEnlaces(mainPanel, control);
		panelEnlacesDestacados.setVisible(true);
	}

	public void initializePanelServicios(Controller control) {
		panelServicio = new JPanelServicios(mainPanel, control);
		panelServicio.setVisible(true);
	}

	public void initializePanelEventos() {
		panelEventos = new JPanelEventos(mainPanel);
		panelEventos.setVisible(true);
	}

	public void initializePanelInstitucional(Controller control) {
		panelInstitucional = new JPanelInstitucional(mainPanel, control);
		panelInstitucional.setVisible(true);
	}
	
	public void initializePanelSlider() {
		panelSlider = new JPanelSlider(mainPanel);
		panelSlider.setVisible(true);
	}
}

