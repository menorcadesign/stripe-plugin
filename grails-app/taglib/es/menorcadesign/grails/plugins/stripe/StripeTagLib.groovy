package es.menorcadesign.grails.plugins.stripe

import com.stripe.model.Account

class StripeTagLib {

    static defaultEncodeAs = [taglib: 'none']
    static namespace = "stripe"

    /**
     * Creates a Stripe payment form.
     *
     * &lt;g:singlePayment action="action" publicKey="publicKey" amount="amount" name="name" description="description" image="image" locale="locale" zipcode="zipcode" currency="currency" /&gt;<br/>
     *
     * @attr action REQUIRED
     * @attr publicKey REQUIRED
     * @attr amount REQUIRED
     * @attr name
     * @attr description
     * @attr image
     * @attr locale
     * @attr zipcode
     * @attr currency
     *
     */
    def singlePayment = { attrs, body ->
        if (attrs.get('publicKey') == null || attrs.get('action') == null || attrs.get('amount') == null) {
            out << 'Error'
        } else {
            def data = [:]
            data.action = attrs.get('action') as String
            data.publicKey = attrs.get('publicKey') as String
            data.amount = attrs.get('amount') as String
            data.name = (attrs.get('name') != null) ? attrs.get('name') as String : Account.retrieve().businessName
            data.description = (attrs.get('description') != null) ? attrs.get('description') as String : Account.retrieve().businessName
            data.image = (attrs.get('image') != null) ? attrs.get('image') as String : Account.retrieve().businessLogo
            data.locale = (attrs.get('locale') != null) ? attrs.get('locale') as String : 'en'
            data.zipcode = (attrs.get('zipcode') != null) ? attrs.get('zipcode') as String : false as String
            data.currency = (attrs.get('currency') != null) ? attrs.get('currency') as String : 'eur'
            render template: 'stripe-single-payment', model: [data: data]
        }
    }

}
