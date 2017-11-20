package dsa;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Created by nodet on 20/11/17.
 */
@Path("/")
public class JugadoresRest {

    Jugadores jugadores;

    public JugadoresRest()
    {
        jugadores = Jugadores.getDbInstancia();
    }

    @GET
    @Path("/Jugador/{nombre}")
    @Produces(MediaType.APPLICATION_JSON)
    public Jugador buscarJugador(@PathParam("nombre") String nombre) {
        return jugadores.getMapaJugadores().get(nombre);
    }


    /*@POST
    @Path("/nuevoObjeto/{usuarioNombre}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response nuevoUsuario(Objeto objeto,@PathParam("usuarioNombre") String nombre) {
        dbUsuarios.getDbusuarios().get(nombre).añadirObjeto(objeto);
        // Atencion: siempre añade en la misma posicion por el scope de tracks
        return Response.status(201).entity("objeto: "+objeto.nombre+" añadido al usuario: "+nombre).build();
    }*/

}
