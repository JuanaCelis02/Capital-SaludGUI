package views;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controllers.*;

import javax.swing.JButton;

public class JPanelInstitucional extends JPanel {

	private JPanel panelInstitucional;

	public JPanelInstitucional(JPanel mainPanel, Controller control) {
		panelInstitucional = new JPanel();
		panelInstitucional.setBounds(811, 952, 333, 462);
		panelInstitucional.setBackground(new Color(255,255,255));
		mainPanel.add(panelInstitucional);
		panelInstitucional.setLayout(null);
		
		JLabel lblNewLabel = new JLabel();
		lblNewLabel.setBounds(0, 0, 333, 57);
		lblNewLabel.setIcon(new ImageIcon(JPanelInstitucional.class.getResource("/images/headinstitucional.png")));
		panelInstitucional.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Derechos y deberes");
		btnNewButton.setBounds(10, 57, 313, 33);
		btnNewButton.setActionCommand("derechos");
		btnNewButton.addActionListener(control);
		panelInstitucional.add(btnNewButton);
		
		JButton btnMovilidad = new JButton("Movilidad");
		btnMovilidad.setBounds(10, 101, 313, 33);
		btnMovilidad.setActionCommand("movilidad");
		btnMovilidad.addActionListener(control);
		panelInstitucional.add(btnMovilidad);
		
		JButton btnPortabilidad = new JButton("Portabilidad");
		btnPortabilidad.setBounds(10, 145, 313, 33);
		btnPortabilidad.setActionCommand("portabilidad");
		btnPortabilidad.addActionListener(control);
		panelInstitucional.add(btnPortabilidad);
		
		JButton btnVideosInstitucionales = new JButton("Videos Institucionales");
		btnVideosInstitucionales.setBounds(10, 189, 313, 33);
		btnVideosInstitucionales.setActionCommand("videos");
		btnVideosInstitucionales.addActionListener(control);
		panelInstitucional.add(btnVideosInstitucionales);
		
		JButton btnIndicadoresDeServicios = new JButton("Indicadores de Servicios");
		btnIndicadoresDeServicios.setBounds(10, 234, 313, 33);
		btnIndicadoresDeServicios.setActionCommand("indicadores");
		btnIndicadoresDeServicios.addActionListener(control);
		panelInstitucional.add(btnIndicadoresDeServicios);
		
		JButton btnProcesoDeContratacion = new JButton("Proceso de contratacion");
		btnProcesoDeContratacion.setBounds(10, 278, 313, 33);
		btnProcesoDeContratacion.setActionCommand("proceso");
		btnProcesoDeContratacion.addActionListener(control);
		panelInstitucional.add(btnProcesoDeContratacion);
		
		JButton btnParticipacionCiudadana = new JButton("Participacion ciudadana");
		btnParticipacionCiudadana.setBounds(10, 322, 313, 33);
		btnParticipacionCiudadana.setActionCommand("ciudadana");
		btnParticipacionCiudadana.addActionListener(control);
		panelInstitucional.add(btnParticipacionCiudadana);
		
		JButton btnServicioAlCiudadano = new JButton("Servicio al ciudadano");
		btnServicioAlCiudadano.setBounds(10, 368, 313, 33);
		btnServicioAlCiudadano.setActionCommand("serval");
		btnServicioAlCiudadano.addActionListener(control);
		panelInstitucional.add(btnServicioAlCiudadano);
	}

}
