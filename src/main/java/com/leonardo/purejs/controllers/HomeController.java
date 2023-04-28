package com.leonardo.purejs.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import com.google.gson.Gson;
import com.leonardo.purejs.entity.Pessoa;
import com.leonardo.purejs.services.PessoaService;

@RestController
@RequestMapping("/")
public class HomeController {

  @Autowired
  private PessoaService service;
  Gson gson;

  @GetMapping
  public ModelAndView home() {
    ModelAndView mv = new ModelAndView();
    mv.setViewName("home/index");
    return mv;
  }

  @GetMapping("/home")
  public List<Pessoa> getAllPessoa() {
    List<Pessoa> result = service.getAllPessoa();
    return result;
  }

  @PostMapping("/home")
  public Pessoa createOnePessa(@RequestBody Pessoa pessoa) {
    Pessoa result = service.createOnePessoa(pessoa);
    return result;
  }

  @DeleteMapping("/home/{id}")
  public String deleteOnePessoa(@PathVariable Integer id) {
    String result = service.deleteOnePessoa(id);
    return result;
  }
}
