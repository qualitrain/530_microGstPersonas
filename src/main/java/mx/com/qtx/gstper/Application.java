package mx.com.qtx.gstper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;
import org.springframework.web.client.RestTemplate;

import mx.com.qtx.gstper.core.IConsumidorMsgEvtosNuevos;
import mx.com.qtx.gstper.core.IGestorEmpleados;
import mx.com.qtx.gstper.messageBroker.rabbitmq.ConsumidorEventoNuevo;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
	
	@Bean
	IConsumidorMsgEvtosNuevos getConsumidorMensajes(Environment env, IGestorEmpleados gestorEmpleados) {
		IConsumidorMsgEvtosNuevos consumMessageBroker = new ConsumidorEventoNuevo(
				env.getProperty("qtx.gstnper.messageBroker.host", "localhost"),
				env.getProperty("qtx.gstnper.messageBroker.nomColaEvtos", "colaEventosDefault"),
				env.getProperty("qtx.gstnper.messageBroker.exchangeEvtos", "exchangeDefault"),
				gestorEmpleados
				);
		consumMessageBroker.suscribirseAexchangeConfig();
		consumMessageBroker.consumirMensajes();
		return consumMessageBroker;
		
	}
}
