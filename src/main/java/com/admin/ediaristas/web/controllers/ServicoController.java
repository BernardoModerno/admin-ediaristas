package com.admin.ediaristas.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.admin.ediaristas.core.enums.Icone;
import com.admin.ediaristas.core.models.Servico;

@Controller
@RequestMapping("/admin/servicos")
public class ServicoController {

    @GetMapping("/cadastrar")
    public ModelAndView cadastrar() {
        var modelAndView = new ModelAndView("admin/servico/form");

        modelAndView.addObject("servico", new Servico());

        return modelAndView;
    }

    @ModelAttribute("icones")
    public Icone[] getIcones() {
        return Icone.values();
    }

}
 
