package es.iespuertocruz.estanis.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 *
 * @author Estanislao Sánchez Martín
 */
@Path("/Hola")
public class HolaMundo {
    @GET
    @Path("/{message}")
    public Response getMsg(@PathParam("message") String msg) {
        String output = "Message requested : " + msg;
        //Simplemente devuelve el parametro pasado como mensaje
        return Response.status(200).entity(output).build();
    }
}
