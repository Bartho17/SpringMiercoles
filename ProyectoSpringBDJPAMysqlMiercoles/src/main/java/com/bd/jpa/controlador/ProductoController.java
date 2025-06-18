package com.bd.jpa.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bd.jpa.modelo.TblProducto;
import com.bd.jpa.servicio.IProductoServicio;

@Controller

@RequestMapping("/vistas")
public class ProductoController {
	//Inyeccion de dependencia...
	@Autowired
	private IProductoServicio iproductoservicio;
	@GetMapping("ListadoProductos")
	public String ListadoProducto(Model modelo) {
		
		//Recuperamos los datos de la BD...
		List<TblProducto> listado=iproductoservicio.ListadoProductos();
		//Enviamos hacia la vista
		modelo.addAttribute("listado",listado);
		//retoramos
		return "/vistas/ListadoProductos";
				
	}//fin del metodo listado productos
	
	@GetMapping("RegistrarProductos")
	public String RegistrarProductos(Model modelo) {
		TblProducto tblpro=new TblProducto();
		modelo.addAttribute("regproducto",tblpro);	
		return "/vistas/RegistrarProductos";
	}
	
	@PostMapping("/GuardarProducto")
	public String GuardarProducto(@ModelAttribute TblProducto tblPro, Model modelo) {
		iproductoservicio.RegistrarProducto(tblPro);
		System.out.println("Datos registrados");
		return "redirect:/vistas/ListadoProductos";
	}
	
}//fin de la clase
