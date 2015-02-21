package nameless

class PaymentController {

    def index() {
		def payment = Payment.get(params.id)
		def methods = Method.list()
		return [payment: payment, methods: methods]
	}
	
	def create() {
		def methods = Method.list()
		if (request.method == "POST") {
			def payment = new Payment()
			payment.productName = params.productName
			payment.description = params.description
			payment.image = "/nameless/sheep.jpg"
			payment.price = params.price
			payment.save(flush: true, failOnError: true)
			
			for (int i = 1; i < 7; i++) {
				if (params["method"+i.toString()] == "0") {
					payment.addToMethods(Method.get(i))
				}
			}
			
			redirect(controller: "payment", action: "index", params: [id: payment.id])
			return
		}
		else return [methods: methods]
	}
	
	def success() {
	}
}
