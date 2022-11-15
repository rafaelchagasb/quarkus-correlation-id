package br.com.rafaelchagasb;

import io.vertx.core.http.HttpServerRequest;
import org.jboss.logging.MDC;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;
import javax.ws.rs.core.Context;
import javax.ws.rs.ext.Provider;
import java.io.IOException;
import java.util.UUID;

@Provider
public class TracingFilter implements ContainerRequestFilter, ContainerResponseFilter {
    public static final String MDC_KEY = "correlationId";

    @Context
    HttpServerRequest httpRequest;

    @Override
    public void filter(ContainerRequestContext requestContext) throws IOException {
        MDC.put(MDC_KEY, UUID.randomUUID().toString());
    }

    @Override
    public void filter(ContainerRequestContext requestContext, ContainerResponseContext responseContext) throws IOException {
        MDC.remove(MDC_KEY);
    }
}
