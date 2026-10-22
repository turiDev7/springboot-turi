package com.turidev.spring.app1.springboot_turi.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestController
public class EjemploRestController {

    @GetMapping("/detalles_info2")
    
    public Map <String, Object> detalles_info2(){
        Map<String, Object> respuesta = new HashMap();
        respuesta.put("Titulo", "Servidor en linea");
        respuesta.put("Servidor","TuriSpringBoot");
        respuesta.put("Ip","192.168.1.1");
        return respuesta;

    }


}
