package mx.com.qtx.gstper.entidades;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.json.bind.annotation.JsonbDateFormat;

public class EventoAgendado {
	private int id;
	private int numEmpleado;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm z")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm z" )
	@JsonbDateFormat("yyyy-MM-dd HH:mm z")
	private Date inicioProg;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm z")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm z" )
	@JsonbDateFormat("yyyy-MM-dd HH:mm z")
	private Date finProg;
	private int tipo;
	private int estado;
	
	public EventoAgendado(int id, int numEmpleado, Date inicioProg, Date finProg, int tipo, int estado) {
		super();
		this.id = id;
		this.numEmpleado = numEmpleado;
		this.inicioProg = inicioProg;
		this.finProg = finProg;
		this.tipo = tipo;
		this.estado = estado;
	}
	
	public EventoAgendado() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getNumEmpleado() {
		return numEmpleado;
	}
	public void setNumEmpleado(int numEmpleado) {
		this.numEmpleado = numEmpleado;
	}
	public Date getInicioProg() {
		return inicioProg;
	}
	public void setInicioProg(Date inicioProg) {
		this.inicioProg = inicioProg;
	}
	public Date getFinProg() {
		return finProg;
	}
	public void setFinProg(Date finProg) {
		this.finProg = finProg;
	}
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}
	@Override
	public String toString() {
		return "EventoAgendado [id=" + id + ", numEmpleado=" + numEmpleado + ", inicioProg=" + inicioProg + ", finProg="
				+ finProg + ", tipo=" + tipo + ", estado=" + estado + "]";
	}
}
