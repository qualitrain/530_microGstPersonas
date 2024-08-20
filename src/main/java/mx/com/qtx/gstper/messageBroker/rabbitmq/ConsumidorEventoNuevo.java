package mx.com.qtx.gstper.messageBroker.rabbitmq;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.json.bind.Jsonb;
import jakarta.json.bind.JsonbBuilder;
import mx.com.qtx.gstper.core.IConsumidorMsgEvtosNuevos;
import mx.com.qtx.gstper.core.IGestorEmpleados;
import mx.com.qtx.gstper.entidades.EventoAgendado;
import mx.com.qtx.gstper.messageBroker.EventoPropuestoDTO;
import mx.com.qtx.gstper.messageBroker.ParticipanteEventoDTO;
import mx.com.qtx.util.FechaUtil;

public class ConsumidorEventoNuevo extends ConsumidorMensajes implements IConsumidorMsgEvtosNuevos{
	private static Logger bitacora = LoggerFactory.getLogger(ConsumidorEventoNuevo.class); 
	private IGestorEmpleados gestorEmpleados;

	public ConsumidorEventoNuevo(String host, String nomCola, String nomExchange, IGestorEmpleados gestorEmpleados) {
		super(host, nomCola, nomExchange);
		this.gestorEmpleados = gestorEmpleados;
		
		bitacora.info("ConsumidorEventoNuevo(" + host + ", " + nomCola + ", " + nomExchange + ") instanciado");
	}

	@Override
	public void procesarMensajeJson(String mensaje) {
		Jsonb jsonb = JsonbBuilder.create();
		EventoPropuestoDTO evento = jsonb.fromJson(mensaje, EventoPropuestoDTO.class);
		Date fechaFin = FechaUtil.agregarMinutosAFecha(evento.getFechaProg(),evento.getDuracionProgMin());
		for(ParticipanteEventoDTO participanteI : evento.getParticipantes()) {
			EventoAgendado evtI = new EventoAgendado();
			evtI.setNumEmpleado(participanteI.getNumEmpleado());
			evtI.setEstado(0);
			evtI.setInicioProg(evento.getFechaProg());
			evtI.setFinProg(fechaFin);
			evtI.setTipo(5);
			this.gestorEmpleados.agregarEventoAgendado(evtI);
		}
	}
	
	public void consumirMensajes() {
		super.consumirMensajes();
		bitacora.info("Recuperación de mensajes en segundo plano activa. Id(Consumer tag)=" + this.idConsumidor);		
	}

}
