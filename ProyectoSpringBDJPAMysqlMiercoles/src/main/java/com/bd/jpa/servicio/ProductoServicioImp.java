package com.bd.jpa.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bd.jpa.modelo.TblProducto;
import com.bd.jpa.repositorio.IProductoRepositorio;

@Service
public class ProductoServicioImp implements IProductoServicio {
//Aplicamos la inyeccon e dependencia
	@Autowired
	private IProductoRepositorio iproductorepositorio;
	@Override
	public void RegistrarProducto(TblProducto tblprod) {
		
		// Invocamos el metodo registrar
		iproductorepositorio.save(tblprod);		
		
	} // fin del metodo Registrar

	@Override
	public void EliminarProducto(TblProducto tblprod) {
		
		// Invocamos el metodo eliminar
		iproductorepositorio.deleteById(tblprod.getIdproducto());
		
	} //Fin del metodo Eliminar

	@Override
	public List<TblProducto> ListadoProductos() {
		
		// Invocamos el metodo listado
		
		return (List<TblProducto>) iproductorepositorio.findAll();
	} //Fin del metodo Listar

	@Override
	public TblProducto BuscarPorId(Integer id) {
		
		// Invocamos el metodo buscar...
		
		return iproductorepositorio.findById(id).orElse(null);
	} //Fin del metodo Buscar

	
	
}// fin de la clase
