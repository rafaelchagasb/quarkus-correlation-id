package br.com.rafaelchagasb;

import org.jboss.logging.Logger;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

@RequestScoped
public class EmailService {

    @Inject
    Logger log;

    public void send() {
            log.info("Email sent");
    }

}
