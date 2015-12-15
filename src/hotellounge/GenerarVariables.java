/*
 * HotelLounge
 * José David Mora Loría
 * Oscar Mauricio Gil
 * Melvin Arce Rodriguez
 * Dec 14, 2015
 */
package hotellounge;

import hotellounge.modelo.Actividad;
import hotellounge.modelo.Habitacion;

/**
 * Clase para generar las variables al inicio de la aplicación.
 * @author jmora
 */
public class GenerarVariables {

    public GenerarVariables() {
        //Genera habitaciones 
        Principal.addHabitacion(new Habitacion(1, 1, 1, "Individual", 10000, "Habitación para una única persona. Contiene baño, televisor y cocina."));
        Principal.addHabitacion(new Habitacion(2, 1, 2, "Simple", 12000, "Habitación para dos personas. Contiene una cama matrimonial, baño, televisor y cocina."));
        Principal.addHabitacion(new Habitacion(3, 3, 5, "Doble", 25000, "Habitación para máximo 5 personas. Contiene dos camas matrimoniales, baño, televisor y cocina."));
        Principal.addHabitacion(new Habitacion(4, 2, 4, "Suite", 40000, "Habitación para 4 personas como máximo. Contiene dos camas matrimoniales en cuartos separados, dos baños, un jacuzzi, cocina y comedor pequeño."));
        Principal.addHabitacion(new Habitacion(5, 5, 10, "Grande", 60000, "Habitación para máximo 10 personas. Contiene 4 camarotes, una cama matrimonial y dos baños."));
        
        //Genera actividades
        Principal.addActividad(new Actividad(1, "Piscina", "Piscina pública para clientes del hotel.", "8am", "6pm", 0));
        Principal.addActividad(new Actividad(2, "Restaurante", "Restaurante familiar estilo buffet.", "8am", "8pm", 5000));
        Principal.addActividad(new Actividad(3, "Bar", "Bar para mayores de edad.", "7pm", "1am", 3000));
        Principal.addActividad(new Actividad(4, "Tour", "Tour a caballo por el sendero de la montaña.", "6am", "4pm", 8000));
        Principal.addActividad(new Actividad(5, "Canopy", "Canopy por nuestros bosques.", "8am", "6pm", 12000));
    }
    
}
