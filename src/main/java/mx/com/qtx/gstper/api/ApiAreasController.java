package mx.com.qtx.gstper.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.com.qtx.gstper.core.IGestorOrganizacion;
import mx.com.qtx.gstper.entidades.UnidadOrganizacional;

@RestController
public class ApiAreasController {
	@Autowired
	private IGestorOrganizacion gestorOrganizacion;

	@GetMapping(path = "/areas", produces = MediaType.APPLICATION_JSON_VALUE)
	List<UnidadOrganizacional> getAreas(){
		return this.gestorOrganizacion.getAreas();
	}
}
