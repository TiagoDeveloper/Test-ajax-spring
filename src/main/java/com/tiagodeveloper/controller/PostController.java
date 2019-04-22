package com.tiagodeveloper.controller;

import javax.ws.rs.core.MediaType;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tiagodeveloper.enumarator.SetorEnum;
import com.tiagodeveloper.model.Pessoa;
import com.tiagodeveloper.model.Profissao;

@CrossOrigin(origins = "http://localhost:8081")
@Controller
@RequestMapping("/post")
public class PostController {

	@RequestMapping("/pessoa/{id}")
	public @ResponseBody Pessoa getPessoa(@PathVariable("id") Long id){
		
		return new Pessoa(1l,"Tiago",30,new Profissao(1l, "Programador", SetorEnum.TI));
	}
	@RequestMapping(value="/pessoa",method=RequestMethod.POST, consumes=MediaType.APPLICATION_JSON)
	public @ResponseBody Pessoa getPessoa(@RequestBody Pessoa pessoa){
		
		return pessoa;
	}
	@RequestMapping(value="/pessoaForm",method=RequestMethod.POST)
	public @ResponseBody Pessoa getPessoaForm(Pessoa pessoa){
		
		return pessoa;
	}
	
}
