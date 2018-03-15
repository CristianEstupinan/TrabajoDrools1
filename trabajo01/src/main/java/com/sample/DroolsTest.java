package com.sample;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import model.Aficiones;
import model.Cliente;
import model.InfoAbstractaCliente;
import model.InfoAbstractaCliente.RangoEdad;
import model.InfoPersonal;
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
        					null,
        					EstadoCivil.Soltero,
        					0,
        					Estudios.Basico,
        					false,
        					50),
        			new Aficiones(),
        			new InfoAbstractaCliente()
        			);
        	kSession.insert(cl);
        	
            kSession.startProcess("com.sample.bpmn.hello");
            //kSession.fireAllRules();
            
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
