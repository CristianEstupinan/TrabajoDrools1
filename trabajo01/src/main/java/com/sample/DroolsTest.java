package com.sample;

import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import criterios.CriteriosAplicables;
import criterios.CriteriosAplicables.Capacidad;
import criterios.PropuestaActividad;
import model.Actividad;
import model.Aficiones;
import model.Aficiones.Interes;
import model.Cliente;
import model.InfoAbstractaCliente;
import model.InfoPersonal;
import model.InfoAbstractaCliente.Riesgo;
import model.InfoPersonal.EstadoCivil;
import model.InfoPersonal.Estudios;

public class DroolsTest {

    public static final void main(String[] args) {
        try {
            // load up the knowledge base
	        KieServices ks = KieServices.Factory.get();
    	    KieContainer kContainer = ks.getKieClasspathContainer();
        	KieSession kSession = kContainer.newKieSession("ksession-process");

        	
        	Cliente cl = new Cliente (
        			new InfoPersonal(
        					35,
        					new HashSet<String>(Arrays.asList("Ingles", "Español")),
        					EstadoCivil.Soltero,
        					1,
        					Estudios.GradoMedio,
        					false,
        					1000),
        			new Aficiones(Arrays.asList(
        					Interes.Cultural,
        					Interes.Paisajistico,
        					Interes.Social,
        					Interes.Comercial,
        					Interes.Formacion)),
        			new InfoAbstractaCliente()
        			);
        	kSession.insert(cl);
        	
        	Actividad parachute = new Actividad(
        			new HashSet<String>(Arrays.asList("Ingles","Español", "Frances","Portugues")),
        			new HashSet<Interes>(Arrays.asList(Interes.Paisajistico, Interes.Social, Interes.Deportivo)),
        			500,
        			true,
        			Riesgo.Alto,
        			"Paracaidas");
        	
        	Actividad visita = new Actividad(
        			new HashSet<String>(Arrays.asList("Español")),
        			new HashSet<Interes>(Arrays.asList(Interes.Paisajistico, Interes.Cultural, Interes.Comercial)),
        			100,
        			false,
        			Riesgo.Bajo, 
        			"Visita cultural a teror");
        	
        	Actividad erasmus = new Actividad(
        			new HashSet<String>(Arrays.asList("Aleman")),
        			new HashSet<Interes>(Arrays.asList(Interes.Paisajistico, Interes.Cultural, Interes.Comercial, Interes.Formacion, Interes.Social)),
        			1000,
        			true,
        			Riesgo.Medio, 
        			"erasmus a Berlín");
        	
        	// Diversos ejemplos de funcionamiento
        	kSession.insert(visita);
        	PropuestaActividad decision = new PropuestaActividad(visita, cl, new Date());
        	//kSession.insert(parachute);
        	//PropuestaActividad decision= new PropuestaActividad(parachute, cl, new Date());
        	//kSession.insert(erasmus);
        	//PropuestaActividad decision= new PropuestaActividad(erasmus, cl, new Date());
        	kSession.insert(decision);
        	
        	kSession.insert(new CriteriosAplicables(Capacidad.Deportiva));
        	kSession.insert(new CriteriosAplicables(Capacidad.Idioma));
        	kSession.insert(new CriteriosAplicables(Capacidad.Intereses));
        	kSession.insert(new CriteriosAplicables(Capacidad.Pago));
        	
            kSession.startProcess("com.sample.bpmn.hello");
            //kSession.fireAllRules();
            
            if(decision.isDecision()) {
            	System.out.println("Se ha decidido recomendar la actividad " + decision.getActividad().getNombre());
            }else {
            	System.out.println("Se ha decidido NO recomendar la actividad " + decision.getActividad().getNombre());
            }
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }

    public static class Message {

        public static final int HELLO = 0;
        public static final int GOODBYE = 1;

        private String message;

        private int status;

        public String getMessage() {
            return this.message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public int getStatus() {
            return this.status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

    }

}
