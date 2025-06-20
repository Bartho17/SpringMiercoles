package com.example.servicio;

import java.util.List;

import com.example.modelo.TblMedico;

public interface IMedicoServicio {
	void RegistrarMedico(TblMedico medic);
	void EliminarMedico(TblMedico medic);
	List<TblMedico>ListadoMedico();
	TblMedico BuscarPorID(Integer id);
}
