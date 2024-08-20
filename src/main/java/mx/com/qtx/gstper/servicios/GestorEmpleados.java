package mx.com.qtx.gstper.servicios;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import mx.com.qtx.gstper.core.IGestorEmpleados;
import mx.com.qtx.gstper.entidades.Empleado;
import mx.com.qtx.gstper.entidades.EventoAgendado;
import mx.com.qtx.util.FechaUtil;

@Service
public class GestorEmpleados implements IGestorEmpleados {
	private static Map<Integer,Empleado> mapEmpleados = obtenerEmpleados();
	private static Map<Integer,EventoAgendado> mapEventosAgendados = obtenerEventosDummy();

	private static Map<Integer, Empleado> obtenerEmpleados() {
		Map<Integer,Empleado> empleados = new HashMap<>();
		
		Empleado emp = new Empleado(2000,"Jorge","Villasana","Rodríguez","77-23-43-11-11","jvillasana@laempresa.com.mx","DG","Director General");
		empleados.put(emp.getNumEmpleado(), emp);
		
		emp = new Empleado(2120,"Marina","Roldán","Aguirre","77-11-55-11-36","mroldan@laempresa.com.mx","DVTAS","Director");
		empleados.put(emp.getNumEmpleado(), emp);
		
		emp = new Empleado(2100,"Violeta","Jara","Romo","77-13-45-19-22","vjara@laempresa.com.mx","DTI","Director");
		empleados.put(emp.getNumEmpleado(), emp);
		
		emp = new Empleado(2102,"Roberto","Corona","Díaz","55-99-71-44-13","rcorona@laempresa.com.mx","DPLN","Director");
		empleados.put(emp.getNumEmpleado(), emp);
		
		emp = new Empleado(1667,"Juan Carlos","Herrera","Luna","22-34-71-77-19","jcherrera@laempresa.com.mx","DOPER","Director");
		empleados.put(emp.getNumEmpleado(), emp);
		
		emp = new Empleado(501,"José Miguel","Torres","Aragón","55-11-34-11-22","jmtorres@laempresa.com","DOPER","Coordinado de Area");
		empleados.put(emp.getNumEmpleado(), emp);
		
		emp = new Empleado(3421,"Mariana","Valdés","Forlán","77-12-33-91-45","mvaldes@laempresa.com","DOPER","Analista Sr");
		empleados.put(emp.getNumEmpleado(), emp);
		
		emp = new Empleado(552,"Juan Manuel","Tinoco","Morales","33-19-99-01-03","jmtinoco@laempresa.com","DOPER","Consultor");
		empleados.put(emp.getNumEmpleado(), emp);
		
		return empleados;
	}
	
	private static Map<Integer, EventoAgendado> obtenerEventosDummy() {
		Map<Integer, EventoAgendado> eventos = new HashMap<>();
		
		EventoAgendado evtI = new EventoAgendado(1,2000, FechaUtil.getFecha(2020, 11, 17, 11, 15),FechaUtil.getFecha(2020, 11, 17, 12, 15),5,1);
		eventos.put(evtI.getId(), evtI);
		
		evtI = new EventoAgendado(2,2000, FechaUtil.getFecha(2020, 12, 18, 0, 0),FechaUtil.getFecha(2021, 1, 2, 0, 0),2,1);
		eventos.put(evtI.getId(), evtI);
		
		return eventos;
	}

	public List<Empleado> getEmpleados(){
		return new ArrayList<>( mapEmpleados.values() );
	}
	public List<EventoAgendado> getEventosEmpleado(int numEmpleado){
		return mapEventosAgendados
				                .values()
		                        .stream()
		                        .filter(evt->(evt.getNumEmpleado() == numEmpleado) )
		                        .sorted( (o1,o2)-> (o1.getInicioProg().getTime() < o2.getInicioProg().getTime() ) ? -1 : 1 )
		                        .collect(Collectors.toList());
	}
	public Empleado getEmpleado(int numEmpleado) {
		return mapEmpleados.get(numEmpleado);
	}
	public void agregarEventoAgendado(EventoAgendado evtI) {
		int id = (int) (Math.random() * 10000);
		evtI.setId(id);
		mapEventosAgendados.put(evtI.getId(), evtI);
	}
}
