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

    @GET
    @Path("/Personaje/{nombre}")
    @Produces(MediaType.APPLICATION_JSON)
    public Personaje buscarPersonaje(@PathParam("nombre") String nombre) {
        return jugadores.getMapaPersonajes().get(nombre);
    }

    @GET
    @Path("/Objeto/{nombre}")
    @Produces(MediaType.APPLICATION_JSON)
    public Objeto buscarObjeto(@PathParam("nombre") String nombre) {
        return jugadores.getMapaObjetos().get(nombre);
    }


    @POST
    @Path("/nuevoJugador/{jugadorNombre}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response nuevoJugador(Jugador jugador, @PathParam("jugadorNombre") String nombre) {
        jugador.setNombre(nombre);
        jugadores.getMapaJugadores().put(nombre, jugador);
        return Response.status(201).entity("Añadido jugador con nombre:" +nombre).build();
    }

    @POST
    @Path("/eliminarJugador/{jugadorNombre}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response eliminarJugador(@PathParam("jugadorNombre") String nombre) {
        jugadores.getMapaJugadores().remove(nombre);
        return Response.status(201).entity("Eliminado jugador con nombre:" +nombre).build();
    }

    @POST
    @Path("/eliminarPersonaje/{personajeNombre}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response eliminarPersonaje(@PathParam("personajeNombre") String nombre) {
        jugadores.getMapaPersonajes().remove(nombre);
        return Response.status(201).entity("Eliminado personaje con nombre:" +nombre).build();
    }

    @POST
    @Path("/eliminarObjeto/{objetoNombre}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response eliminarObjeto(@PathParam("objetoNombre") String nombre) {
        jugadores.getMapaObjetos().remove(nombre);
        return Response.status(201).entity("Eliminado objeto con nombre:" +nombre).build();
    }

    @POST
    @Path("/nuevoPersonaje/{personajeNombre}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response nuevoPersonaje(Personaje personaje, @PathParam("personajeNombre") String nombre) {
        personaje.setNombre(nombre);
        jugadores.getMapaPersonajes().put(nombre, personaje);
        return Response.status(201).entity("Añadido personaje con nombre:" +nombre).build();
    }

    @POST
    @Path("/nuevoObjeto/{objetoNombre}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response nuevoObjeto(Objeto objeto, @PathParam("objetoNombre") String nombre) {
        objeto.setNombre(nombre);
        jugadores.getMapaObjetos().put(nombre, objeto);
        return Response.status(201).entity("Añadido objeto con nombre:" +nombre).build();
    }

    @POST
    @Path("/nuevoObjeto/{personajeNombre}/{objetoNombre}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response nuevoObjeto(@PathParam("personajeNombre") String nombrePersonaje, @PathParam("objetoNombre") String nombreObjeto) {

        //Añadir comprobaciones de errores y tal
        jugadores.getMapaPersonajes().get(nombrePersonaje).getObjetos().add(jugadores.getMapaObjetos().get(nombreObjeto));

        return Response.status(201).entity("Añadido objeto con nombre:" +nombreObjeto +"a personaje" +nombrePersonaje).build();
    }



    /*
   * Añadir personaje al jugador
   * Consultar objetos personaje/s
    */

}
