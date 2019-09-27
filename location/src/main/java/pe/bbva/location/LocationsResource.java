package pe.bbva.location;

import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import pe.bbva.location.beans.Location;

/**
 * A JAX-RS interface.  An implementation of this interface must be provided.
 */
@Path("/locations")
public interface LocationsResource {
  @GET
  @Produces("application/json")
  List<Location> generatedMethod1();

  @Path("/{id}/")
  @GET
  @Produces("application/json")
  Location generatedMethod2(@PathParam("id") int id);
}
