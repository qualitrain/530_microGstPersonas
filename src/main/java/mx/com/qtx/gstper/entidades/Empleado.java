package mx.com.qtx.gstper.entidades;

public class Empleado {
	private int numEmpleado;
	private String nombre;
	private String apPaterno;
	private String apMaterno;
	private String celular1;
	private String celular2;
	private String correoElectronico;
	private String correoElectronicoNube;
	private String adscritoA;
	private String puesto;
	private String telOficina;
	private String telCasa;
	private String telConmutador;
	private String ext;

	public Empleado(int numEmpleado, String nombre, String apPaterno, String apMaterno, String celular1,
			String correoElectronico, String adscritoA, String puesto) {
		super();
		this.numEmpleado = numEmpleado;
		this.nombre = nombre;
		this.apPaterno = apPaterno;
		this.apMaterno = apMaterno;
		this.celular1 = celular1;
		this.correoElectronico = correoElectronico;
		this.adscritoA = adscritoA;
		this.puesto = puesto;
	}

	public Empleado() {
		super();
	}

	public int getNumEmpleado() {
		return numEmpleado;
	}

	public void setNumEmpleado(int numEmpleado) {
		this.numEmpleado = numEmpleado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApPaterno() {
		return apPaterno;
	}

	public void setApPaterno(String apPaterno) {
		this.apPaterno = apPaterno;
	}

	public String getApMaterno() {
		return apMaterno;
	}

	public void setApMaterno(String apMaterno) {
		this.apMaterno = apMaterno;
	}

	public String getCelular1() {
		return celular1;
	}

	public void setCelular1(String celular1) {
		this.celular1 = celular1;
	}

	public String getCelular2() {
		return celular2;
	}

	public void setCelular2(String celular2) {
		this.celular2 = celular2;
	}

	public String getCorreoElectronico() {
		return correoElectronico;
	}

	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}

	public String getCorreoElectronicoNube() {
		return correoElectronicoNube;
	}

	public void setCorreoElectronicoNube(String correoElectronicoNube) {
		this.correoElectronicoNube = correoElectronicoNube;
	}

	public String getAdscritoA() {
		return adscritoA;
	}

	public void setAdscritoA(String adscritoA) {
		this.adscritoA = adscritoA;
	}

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	public String getTelOficina() {
		return telOficina;
	}

	public void setTelOficina(String telOficina) {
		this.telOficina = telOficina;
	}

	public String getTelCasa() {
		return telCasa;
	}

	public void setTelCasa(String telCasa) {
		this.telCasa = telCasa;
	}

	public String getTelConmutador() {
		return telConmutador;
	}

	public void setTelConmutador(String telConmutador) {
		this.telConmutador = telConmutador;
	}

	public String getExt() {
		return ext;
	}

	public void setExt(String ext) {
		this.ext = ext;
	}

	@Override
	public String toString() {
		return "Empleado [numEmpleado=" + numEmpleado + ", nombre=" + nombre + ", apPaterno=" + apPaterno
				+ ", apMaterno=" + apMaterno + ", celular1=" + celular1 + ", celular2=" + celular2
				+ ", correoElectronico=" + correoElectronico + ", correoElectronicoNube=" + correoElectronicoNube
				+ ", adscritoA=" + adscritoA + ", puesto=" + puesto + ", telOficina=" + telOficina + ", telCasa="
				+ telCasa + ", telConmutador=" + telConmutador + ", ext=" + ext + "]";
	}

}
