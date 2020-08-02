/*
 * @Luciano Greppi, 2020
 * 
 * Proyecto realizado a partir del curso de MitoCode disponible en: https://youtu.be/hinfBLVsqF4
 * Se planifica agregar nuevas funcionalidades y una interfaz gráfica para hacer un software más atractivo y práctico.
 * 
 */


package com.greppiluciano.springDBFutbol;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.greppiluciano.beans.Equipo;
import com.greppiluciano.beans.Jugador;
import com.greppiluciano.beans.Marca;
import com.greppiluciano.service.ServiceJugador;
import com.greppiluciano.service.ServiceMarca;


public class App 
{
    public static void main( String[] args )
    {

        
        ApplicationContext appContext = new ClassPathXmlApplicationContext("com/greppiluciano/xml/beans.xml");
        
        ServiceJugador sj = (ServiceJugador) appContext.getBean("serviceJugadorImpl");
        //Equipo eq1 = (Equipo) appContext.getBean("equipo1");
        Jugador jug1 = (Jugador) appContext.getBean("jugador1");
        
        try {
        	sj.registrar(jug1);
        } catch (Exception ex) {
        	System.out.println(ex.getMessage());
        }
        
        //Marca mar3 = (Marca) appContext.getBean("marca3");
        /*
        try {
        	//sm.registrar(mar3);
        } catch (Exception ex) {
        	System.out.println(ex.getMessage());
        }
        */   
        
        
    }
}
