package pl.wsb.students.api.consts;

import pl.wsb.students.api.model.ActorRatings;
import pl.wsb.students.api.model.MovieCommentRequest;
import pl.wsb.students.api.model.MovieRatingRequest;
import pl.wsb.students.api.model.MovieRequest;
import pl.wsb.students.security.annotation.Authenticate;

import javax.persistence.Persistence;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path(ApiEndpoints.MOVIE)
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class MovieResource {


    @GET
    public Response getMovie(
            @QueryParam(ApiEndpoints.PARAM_LIMIT) Integer limit,
            @QueryParam(ApiEndpoints.PARAM_OFFSET) Integer offset,
            @QueryParam(ApiEndpoints.PARAM_SEARCH) String search
    ) {
        return Response.status(Response.Status.OK).entity("mock call ok...").build();
    }

    @Authenticate
    @POST
    public Response postMovie(MovieRequest body) {
        Persistence.createEntityManagerFactory("manager").createEntityManager();
        return Response.status(Response.Status.OK).entity("mock call ok...").build();
    }

    @Authenticate
    @POST
    @Path(ApiEndpoints.MOVIE_RATE)
    public Response postMovieRate(MovieRatingRequest body) {
        return Response.status(Response.Status.OK).entity("dodano ocene filmu").build();
    }

    @Authenticate
    @POST
    @Path(ApiEndpoints.MOVIE_COMMENT)
    public Response postMovieComment(MovieCommentRequest body) {
        return Response.status(Response.Status.OK).entity("dodano komentarz.").build();
    }

    @Authenticate
    @POST
    @Path(ApiEndpoints.MOVIE_ACTOR_RATE)
    public Response postActorRatings(ActorRatings body) {
        return Response.status(Response.Status.OK).entity("dodano ocenę aktora.").build();
    }

    @Authenticate
    @PUT
    @Path(ApiEndpoints.MOVIE_ID_ACCEPT)
    public Response putMovieIdAccept(Integer Id) {
        return Response.status(Response.Status.OK).entity("mock call ok...").build();
    }

    @Authenticate
    @PUT
    @Path(ApiEndpoints.MOVIE_ID_REJECT)
    public Response putMovieIdReject(Integer Id) {
        return Response.status(Response.Status.OK).entity("mock call ok...").build();
    }
}
