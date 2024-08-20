package mx.com.qtx.gstper.servicios;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import mx.com.qtx.gstper.core.IGestorOrganizacion;
import mx.com.qtx.gstper.entidades.UnidadOrganizacional;

@Service
public class GestorOrganizacion implements IGestorOrganizacion{
	
	private static Map<String,UnidadOrganizacional> areas = obtenerAreas();
	
	public List<UnidadOrganizacional> getAreas(){		
		return new ArrayList<UnidadOrganizacional>(areas.values());		
	}

	private static Map<String, UnidadOrganizacional> obtenerAreas() {
		Map<String,UnidadOrganizacional> uniOrg = new HashMap<>();
		
		uniOrg.put("DG", new UnidadOrganizacional("DG","Dirección General","Dir.Gral.", null, 2000));
		uniOrg.put("DVTAS", new UnidadOrganizacional("DVTAS","Dirección General De Ventas","Dir.Vtas.", "DG", 2120));
		uniOrg.put("DTI", new UnidadOrganizacional("DTI","Dirección de Tecnologías de la Informacion","Dir.Sistemas", "DG", 2100));
		uniOrg.put("DPLN", new UnidadOrganizacional("DPLN","Dirección de Planeación","Dir.Pln.", "DG", 2102));
		uniOrg.put("DOPER", new UnidadOrganizacional("DOPER","Dirección de Operaciones","Dir.Op.", "DG", 1667));
		return uniOrg;
	}
}
