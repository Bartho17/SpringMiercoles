package com.example.modelo;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name="tbl_producto")
public class TblMedico {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int IDMEDICOT2;
	private String NOMBRET2;
	private String APELLIDOT2;
	private String EMAILT2;
	private String DNIT2;
	private String ESTADOCIVILT2;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(iso=ISO.DATE)
	private Date FECHANACIMT2;
	
	public TblMedico(int iDMEDICOT2, String nOMBRET2, String aPELLIDOT2, String eMAILT2, String dNIT2,
			String eSTADOCIVILT2, Date fECHANACIMT2) {
		IDMEDICOT2 = iDMEDICOT2;
		NOMBRET2 = nOMBRET2;
		APELLIDOT2 = aPELLIDOT2;
		EMAILT2 = eMAILT2;
		DNIT2 = dNIT2;
		ESTADOCIVILT2 = eSTADOCIVILT2;
		FECHANACIMT2 = fECHANACIMT2;
	}
	
	public TblMedico() {

	}
	
	public int getIDMEDICOT2() {
		return IDMEDICOT2;
	}
	public void setIDMEDICOT2(int iDMEDICOT2) {
		IDMEDICOT2 = iDMEDICOT2;
	}
	public String getNOMBRET2() {
		return NOMBRET2;
	}
	public void setNOMBRET2(String nOMBRET2) {
		NOMBRET2 = nOMBRET2;
	}
	public String getAPELLIDOT2() {
		return APELLIDOT2;
	}
	public void setAPELLIDOT2(String aPELLIDOT2) {
		APELLIDOT2 = aPELLIDOT2;
	}
	public String getEMAILT2() {
		return EMAILT2;
	}
	public void setEMAILT2(String eMAILT2) {
		EMAILT2 = eMAILT2;
	}
	public String getDNIT2() {
		return DNIT2;
	}
	public void setDNIT2(String dNIT2) {
		DNIT2 = dNIT2;
	}
	public String getESTADOCIVILT2() {
		return ESTADOCIVILT2;
	}
	public void setESTADOCIVILT2(String eSTADOCIVILT2) {
		ESTADOCIVILT2 = eSTADOCIVILT2;
	}
	public Date getFECHANACIMT2() {
		return FECHANACIMT2;
	}
	public void setFECHANACIMT2(Date fECHANACIMT2) {
		FECHANACIMT2 = fECHANACIMT2;
	}
	

}
