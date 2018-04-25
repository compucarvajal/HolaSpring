package com.pj.springapp.controller;

import com.pj.springapp.model.Persona;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Daniel Pardo Ligorred
 * @ http://www.programacionj2ee.com
 */
@Controller
public class MainController {

    /**
     * Muestra la pagina de inicio.
     *
     * @param model Objeto de Spring para la carga de atributos.
     * @param request Objeto que contiene todas las propiedades de la llamada.
     * @return String Nombre de la vista.
     */
    @RequestMapping({"/", "/index"})
    public String showHomePage(Model model, HttpServletRequest request) {

        model.addAttribute("author", "Daniel Pardo Ligorred");
        model.addAttribute("website", "http://www.programacionj2ee.com");
        model.addAttribute("prueba", "prueba hijos de puta");

        List<Persona> milista = new ArrayList<>();
        Persona persona1 = new Persona("pedro", "perez");
        Persona persona2 = new Persona("maria", "gonzalez");
        milista.add(persona1);
        milista.add(persona2);

        model.addAttribute("listaPersonas", milista);

        return "home";
    }
}
