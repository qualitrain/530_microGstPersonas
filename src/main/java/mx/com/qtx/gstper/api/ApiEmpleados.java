package mx.com.qtx.gstper.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import mx.com.qtx.gstper.core.IGestorEmpleados;
import mx.com.qtx.gstper.entidades.Empleado;
import mx.com.qtx.gstper.entidades.EventoAgendado;

import java.util.List;

@RestController
public class ApiEmpleados {
	@Autowired
	private IGestorEmpleados gestorEmpleados;
	
	@GetMapping(path = "/empleados", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Empleado> getEmpleados(){
		return gestorEmpleados.getEmpleados();
	}
	
	@GetMapping(path="/empleados/{numEmpleado}/eventos", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<EventoAgendado> getEventosAgendadosEmpleado(@PathVariable int numEmpleado){
		return this.gestorEmpleados.getEventosEmpleado(numEmpleado);
	}
	
	@GetMapping(path="/empleados/{numEmpleado}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Empleado getEmpleado(@PathVariable int numEmpleado) {
		return this.gestorEmpleados.getEmpleado(numEmpleado);
	}

}
