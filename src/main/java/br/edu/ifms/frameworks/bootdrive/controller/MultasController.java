
package br.edu.ifms.frameworks.bootdrive.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.edu.ifms.frameworks.bootdrive.model.Multa;
import br.edu.ifms.frameworks.bootdrive.service.MultaService;
import br.edu.ifms.frameworks.bootdrive.service.InfracaoService;

@Controller
public class MultasController {

    @Autowired
    private MultaService multaService;

    @Autowired
    private InfracaoService infracaoService;

    @GetMapping("/multas")
    public ModelAndView listarMultas() {
        ModelAndView modelAndView = new ModelAndView("ListaMultas");

        modelAndView.addObject("multas", multaService.buscarTodos());
        modelAndView.addObject("infracoes", infracaoService.buscarTodos());
        modelAndView.addObject("multa", new Multa());

        return modelAndView;
    }

    @PostMapping("/multas")
    public String salvar(Multa multa,
                         @RequestParam String placa,
                         RedirectAttributes attributes) {

        try {
            multaService.salvar(multa, placa);
        } catch (IllegalArgumentException e) {
            attributes.addFlashAttribute("erro", e.getMessage());
        }

        return "redirect:/multas";
    }
}
