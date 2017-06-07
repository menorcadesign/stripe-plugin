<form action="${data.action}" method="post">
    <script
            src="https://checkout.stripe.com/checkout.js" class="stripe-button"
            data-key="${data.publicKey}"
            data-amount="${data.amount}"
            data-name="${data.name}"
            data-description="${data.description}"
            data-image="${data.image}"
            data-locale="${data.locale}"
            data-zip-code="${data.zipcode}"
            data-currency="${data.currency}">
    </script>
</form>