package com.example.servicio;

import java.util.List;

import com.example.modelo.TblMedico;
import com.example.repositorio.IMedicoRepositorio;

public class MedicoServicioIMP  implements IMedicoServicio{

	private IMedicoRepositorio medicRepo;
	
	@Override
	public void RegistrarMedico(TblMedico medic) {
		medicRepo.save(medic);
	}

	@Override
	public void EliminarMedico(TblMedico medic) {
		medicRepo.deleteById(medic.getIDMEDICOT2());
	}

	@Override
	public List<TblMedico> ListadoMedico() {
		return (List<TblMedico>)medicRepo.findAll();
	}

	@Override
	public TblMedico BuscarPorID(Integer id) {
		return medicRepo.findById(id).orElse(null);
	}

}
