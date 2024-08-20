package mx.com.qtx.gstper.core;

import java.util.List;

import mx.com.qtx.gstper.entidades.Empleado;
import mx.com.qtx.gstper.entidades.EventoAgendado;

public interface IGestorEmpleados {
	List<Empleado> getEmpleados();
	Empleado getEmpleado(int numEmpleado);
	List<EventoAgendado> getEventosEmpleado(int numEmpleado);
	void agregarEventoAgendado(EventoAgendado evtI);
}
