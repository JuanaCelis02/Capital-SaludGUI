package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URISyntaxException;


import views.IoManager;

public class Controller implements ActionListener {
	private IoManager io;

	public Controller() {
		io = new IoManager(this);
		io.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();
		switch (command) {
		case "facebook":
			this.goToURL("https://www.facebook.com/Capital-Salud-Epss-493695744426632/");
			break;
		case "instagram":
			this.goToURL("https://www.instagram.com/capitalsaludeps/");
			break;
		case "twitter":
			this.goToURL("https://twitter.com/capitalsalud");
			break;
		case "buscar":
			buscar();
			break;
		case "noticias":
			this.goToURL("https://www.capitalsalud.gov.co/noticias-capital-salud/");
			break;
		case "afiliarse":
			this.goToURL("https://www.capitalsalud.gov.co/como-afiliarme/");
			break;
		case "transparencia":
			this.goToURL("https://www.capitalsalud.gov.co/ley-de-transparencia-y-acceso-a-la-informacion-publica/");
			break;
		case "tramites":
			this.goToURL("https://www.capitalsalud.gov.co/afiliados/");
			break;
		case "red":
			this.goToURL("https://www.capitalsalud.gov.co/red-prestadora-de-servicios/");
			break;
		case "rendicion":
			this.goToURL("https://www.capitalsalud.gov.co/rendicion-de-cuentas-2021/");
			break;
		case "minisitio":
			this.goToURL("https://www.capitalsalud.gov.co/minisitios/");
			break;
		case "chat":
			this.goToURL("https://webchat.millenium.com.co/subred/userinfo.jsp?chatID=1617490682266&workgroup=chatbotsubred2@workgroup.chatsubred.millenium.com.co");
			break;
		case "salud":
			this.goToURL("https://saludata.saludcapital.gov.co/osb/");
			break;
		case "videoyt":
			this.goToURL("https://www.youtube.com/watch?v=juGUb6KOP_k");
			break;
		default:
			selectOpcionesInst(command);
			break;
		}
	}
	
	private void selectOpcionesInst(String command) {
		switch (command) {
		case "derechos":
			this.goToURL("https://www.capitalsalud.gov.co/derechos-y-deberes/");
			break;
		case "movilidad":
			this.goToURL("https://www.capitalsalud.gov.co/movilidad/");
			break;
		case "portabilidad":
			this.goToURL("https://www.capitalsalud.gov.co/portabilidad/");
			break;
		case "videos":
			this.goToURL("https://www.capitalsalud.gov.co/videos-institucionales/");
			break;
		case "indicadores":
			this.goToURL("https://www.capitalsalud.gov.co/metas-objetivos-e-indicadores/");
			break;
		case "proceso":
			this.goToURL("https://www.capitalsalud.gov.co/proceso-de-contratacion/");
			break;
		case "ciudadana":
			this.goToURL("https://www.capitalsalud.gov.co/participacion-ciudadana/");
			break;
		case "serval":
			this.goToURL("https://www.capitalsalud.gov.co/como-afiliarme/");
			break;
		}
	}
	
	private void buscar() {
		String x = io.getTextBuscar();
		this.goToURL("https://www.capitalsalud.gov.co/?s="+x);
	}

	 public void goToURL(String URL){
	           if (java.awt.Desktop.isDesktopSupported()) {
	            java.awt.Desktop desktop = java.awt.Desktop.getDesktop();
	 
	            if (desktop.isSupported(java.awt.Desktop.Action.BROWSE)) {
	                try {
	                    java.net.URI uri = new java.net.URI(URL);
	                    desktop.browse(uri);
	                } catch (URISyntaxException | IOException ex) {
	                }
	            }
	        }
	    }
}
