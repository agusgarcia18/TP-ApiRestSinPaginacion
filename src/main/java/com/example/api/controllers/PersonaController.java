package com.example.api.controllers;


import org.springframework.web.bind.annotation.*;
import com.example.api.services.PersonaServiceImpl;
import com.example.api.entities.Persona;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/personas")
public class PersonaController extends BaseControllerImpl<Persona, PersonaServiceImpl> {

}
