package br.com.rafaelchagasb;

import org.jboss.logging.Logger;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/register")
public class RegisterResource {

    @Inject
    Logger log;

    @Inject
    EmailService emailService;

    @Inject
    RegisterService registerService;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {

        registerService.register();

        emailService.send();

        return "Registered";
    }
}