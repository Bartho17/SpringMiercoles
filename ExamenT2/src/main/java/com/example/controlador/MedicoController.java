package com.example.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.modelo.TblMedico;
import com.example.servicio.IMedicoServicio;

@Controller
@RequestMapping("/vistas")
public class MedicoController {
	@Autowired
	private IMedicoServicio medicServi;
	
	@GetMapping("ListadoMedico")
	public String ListadoMedico(Model modelo) {
		List<TblMedico>listado=medicServi.ListadoMedico();
		modelo.addAttribute("listado",listado);
		return "/vistas/ListadoMedico";
	}
	
	@GetMapping("/RegistrarMedico")
	public String RegistrarMedico(Model modelo) {
		TblMedico medic=new TblMedico();
		modelo.addAttribute("regMedico",medic);
		return "/vistas/RegistrarMedico";
	}
	
	@GetMapping("/GuardarMedico")
	public String GuardarMedico(@ModelAttribute TblMedico medic, Model modelo) {
		medicServi.RegistrarMedico(medic);
		System.out.println("Datos registrados");
		return "redict:/vistas/ListadoMedico";
	}
	

}
