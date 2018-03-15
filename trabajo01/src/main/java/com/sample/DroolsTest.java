package com.sample;

import java.util.Arrays;
import java.util.HashSet;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import criterios.CriteriosAplicables;
import criterios.CriteriosAplicables.Capacidad;
import criterios.DecisionRealizarActividad;
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
        					Estudios.GradoSuperior,
        					false,
        					1000),
        			new Aficiones(Arrays.asList(
        					Interes.Cultural,
        					Interes.Paisajistico,
        					Interes.Social,
        					Interes.Comercial)),
        			new InfoAbstractaCliente()
        			);
        	kSession.insert(cl);
        	
        	Actividad parachute = new Actividad(
        			new HashSet<String>(Arrays.asList("Ingles","Español", "Frances","Portugues")),
        			new HashSet<Interes>(Arrays.asList(Interes.Paisajistico, Interes.Social, Interes.Deportivo)),
        			500,
        			true,
        			Riesgo.Alto);
        	
        	Actividad visita = new Actividad(
        			new HashSet<String>(Arrays.asList("Español")),
        			new HashSet<Interes>(Arrays.asList(Interes.Paisajistico, Interes.Cultural, Interes.Comercial)),
        			100,
        			false,
        			Riesgo.Bajo);
        	
        	//kSession.insert(parachute);
        	kSession.insert(visita);
        	
        	kSession.insert(new CriteriosAplicables(Capacidad.Deportiva));
        	kSession.insert(new CriteriosAplicables(Capacidad.Idioma));
        	kSession.insert(new CriteriosAplicables(Capacidad.Intereses));
        	kSession.insert(new CriteriosAplicables(Capacidad.Pago));
        	
        	DecisionRealizarActividad decision = new DecisionRealizarActividad();
        	kSession.insert(decision);
            kSession.startProcess("com.sample.bpmn.hello");
            //kSession.fireAllRules();
            
            if(decision.isEstado()) {
            	System.out.println("Se ha decidido recomendar la actividad");
            }else {
            	System.out.println("Se ha decidido NO recomendar la actividad");
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
