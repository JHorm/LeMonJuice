import nameless.Method
import nameless.Payment

class BootStrap {

    def init = { servletContext ->
		
		def google = new Method(name: "Google Wallet", image: "logo-google.jpg", link: "#")
		google.save(flush: true, failOnError: true)
		
		def bitCoin = new Method(name: "BitCoin", image: "logo-bitcoin.jpg", link: "#")
		bitCoin.save(flush: true, failOnError: true)
		
		def swed = new Method(name: "Swedbank", image: "logo-swed.jpg", link: "#")
		swed.save(flush: true, failOnError: true)

		def paypal = new Method(name: "Paypal", image: "logo-paypal.jpg", link: "#")
		paypal.save(flush: true, failOnError: true)
		
//		def fortumo = new Method(name: "Fortumo", image: "logo-fortumo.jpg", link: "#")
//		fortumo.save(flush: true, failOnError: true)
		
		def sheepPayment = new Payment(productName: "My strong yeanling", image: "sheep.jpg",
			price: "5000€", description: "Here lies my description. It's short, but it's really descriptive. I like to describe and descript stuff.")
		sheepPayment.save(flush: true, failOnError: true)
		
		sheepPayment.addToMethods(google)
		sheepPayment.addToMethods(bitCoin)
		sheepPayment.addToMethods(swed)
		sheepPayment.addToMethods(paypal)		
    }
    def destroy = {
    }
}
