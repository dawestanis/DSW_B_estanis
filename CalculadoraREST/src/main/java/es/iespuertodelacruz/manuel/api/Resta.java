package es.iespuertodelacruz.manuel.api;

import es.iespuertodelacruz.manuel.controlador.Calculadora;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 *
 * @author Manuel Alejandro
 */
@Path("/resta")
public class Resta {

	@GET
	@Path("/{numero1}/{numero2}")
	public Response getResta(@PathParam("numero1") String numero1, @PathParam("numero2") String numero2) {
		String resultado = "";
		try {
			double doubleNumero1 = Double.parseDouble(numero1);
			double doubleNumero2 = Double.parseDouble(numero2);
			Calculadora calculadora = new Calculadora(doubleNumero1, doubleNumero2, "resta");
			resultado = calculadora.getResultado() + "";
			return Response.status(200).entity(resultado).build();
		} catch (NumberFormatException e) {
			return Response.status(400).build();
		}

	}

}
