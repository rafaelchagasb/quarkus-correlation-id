package br.com.rafaelchagasb;

import org.jboss.logging.Logger;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

@RequestScoped
public class RegisterService {
    @Inject
    Logger log;

    public void register() {
        log.info("Data saved in the database");
    }
}
