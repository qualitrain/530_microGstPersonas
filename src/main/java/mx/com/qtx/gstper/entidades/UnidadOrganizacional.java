package mx.com.qtx.gstper.entidades;

import java.util.Set;

public class UnidadOrganizacional {
	private String cveArea;
	private String nombre;
	private String nomCorto;
	private String cveAreaPadre;
	private int numEmpleadoResponsable;
	
	private UnidadOrganizacional areaPadre;
	private Set<UnidadOrganizacional> areasHijas;
	private Empleado responsable;
	
	public UnidadOrganizacional(String cveArea, String nombre, String nomCorto, String cveAreaPadre,
			int numEmpleadoResponsable) {
		super();
		this.cveArea = cveArea;
		this.nombre = nombre;
		this.nomCorto = nomCorto;
		this.cveAreaPadre = cveAreaPadre;
		this.numEmpleadoResponsable = numEmpleadoResponsable;
	}

	public UnidadOrganizacional() {
		super();
	}

	public String getCveArea() {
		return cveArea;
	}

	public void setCveArea(String cveArea) {
		this.cveArea = cveArea;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNomCorto() {
		return nomCorto;
	}

	public void setNomCorto(String nomCorto) {
		this.nomCorto = nomCorto;
	}

	public String getCveAreaPadre() {
		return cveAreaPadre;
	}

	public void setCveAreaPadre(String cveAreaPadre) {
		this.cveAreaPadre = cveAreaPadre;
	}

	public int getNumEmpleadoResponsable() {
		return numEmpleadoResponsable;
	}

	public void setNumEmpleadoResponsable(int numEmpleadoResponsable) {
		this.numEmpleadoResponsable = numEmpleadoResponsable;
	}

	public UnidadOrganizacional getAreaPadre() {
		return areaPadre;
	}

	public void setAreaPadre(UnidadOrganizacional areaPadre) {
		this.areaPadre = areaPadre;
	}

	public Empleado getResponsable() {
		return responsable;
	}

	public void setResponsable(Empleado responsable) {
		this.responsable = responsable;
	}

	public Set<UnidadOrganizacional> getAreasHijas() {
		return areasHijas;
	}

	public void setAreasHijas(Set<UnidadOrganizacional> areasHijas) {
		this.areasHijas = areasHijas;
	}

	@Override
	public String toString() {
		return "UnidadOrganizacional [cveArea=" + cveArea + ", nombre=" + nombre + ", nomCorto=" + nomCorto
				+ ", cveAreaPadre=" + cveAreaPadre + ", numEmpleadoResponsable=" + numEmpleadoResponsable + "]";
	}

}
