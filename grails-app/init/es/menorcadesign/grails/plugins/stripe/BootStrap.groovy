package es.menorcadesign.grails.plugins.stripe

import com.stripe.Stripe
import grails.core.GrailsApplication
import grails.util.Environment

class BootStrap {

    GrailsApplication grailsApplication

    def init = { servletContext ->
        if (Environment.isDevelopmentMode()) {
            Stripe.apiKey = grailsApplication.config.get('stripe.dev.keys.private')
        } else {
            Stripe.apiKey = grailsApplication.config.get('stripe.pro.keys.private')
        }
    }

    def destroy = {

    }

}
