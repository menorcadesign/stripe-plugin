package es.menorcadesign.grails.plugins.stripe

import grails.plugins.*

class StripePluginGrailsPlugin extends Plugin {

    def grailsVersion = "3.2.10 > *"
    def pluginExcludes = [
            "grails-app/views/error.gsp"
    ]
    def title = "Stripe Plugin"
    def author = "MenorcaDesign [eduardoespinosa: 'Eduardo Espinosa', pablocloud: 'Pablo Verdugo Huerta']"
    def authorEmail = ""
    def description = 'Stripe payment plugin for grails'
    def profiles = ['web']
    def documentation = "https://github.com/menorcadesign/stripe-plugin"

    Closure doWithSpring() {
        { ->

        }
    }

    void doWithDynamicMethods() {

    }

    void doWithApplicationContext() {

    }

    void onChange(Map<String, Object> event) {

    }

    void onConfigChange(Map<String, Object> event) {

    }

    void onShutdown(Map<String, Object> event) {

    }

}
