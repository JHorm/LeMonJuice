import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_nameless_paymentcreate_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/payment/create.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',4,['gsp_sm_xmlClosingForEmptyTag':("/"),'name':("layout"),'content':("main")],-1)
printHtmlPart(1)
createTagBody(2, {->
createClosureForHtmlPart(2, 3)
invokeTag('captureTitle','sitemesh',5,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',5,[:],2)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',9,[:],1)
printHtmlPart(4)
createTagBody(1, {->
printHtmlPart(5)
createTagBody(2, {->
printHtmlPart(6)
invokeTag('textField','g',18,['name':("productName"),'required':("true"),'value':(payment?.productName)],-1)
printHtmlPart(7)
createTagBody(3, {->
printHtmlPart(8)
invokeTag('fieldError','g',20,['bean':(payment),'field':("productName")],-1)
printHtmlPart(9)
})
invokeTag('hasErrors','g',21,['bean':(shop),'field':("productName")],3)
printHtmlPart(10)
invokeTag('textField','g',26,['name':("price"),'value':(payment?.price)],-1)
printHtmlPart(11)
createTagBody(3, {->
printHtmlPart(12)
invokeTag('fieldError','g',28,['bean':(payment),'field':("price")],-1)
printHtmlPart(13)
})
invokeTag('hasErrors','g',29,['bean':(shop),'field':("price")],3)
printHtmlPart(14)
invokeTag('textArea','g',34,['name':("description"),'value':(payment?.description)],-1)
printHtmlPart(11)
createTagBody(3, {->
printHtmlPart(12)
invokeTag('fieldError','g',36,['bean':(payment),'field':("description")],-1)
printHtmlPart(13)
})
invokeTag('hasErrors','g',37,['bean':(shop),'field':("description")],3)
printHtmlPart(15)
if(true && (flash.message)) {
printHtmlPart(16)
expressionOut.print(flash.message)
printHtmlPart(17)
}
printHtmlPart(18)
invokeTag('submitButton','g',45,['class':("btn btn-success"),'name':("payment-create-button"),'value':("Create a payment")],-1)
printHtmlPart(19)
})
invokeTag('form','g',48,['class':("text-center"),'action':("create"),'name':("payment-create-form"),'enctype':("multipart/form-data")],2)
printHtmlPart(20)
createClosureForHtmlPart(21, 2)
invokeTag('javascript','g',54,[:],2)
printHtmlPart(22)
})
invokeTag('captureBody','sitemesh',55,[:],1)
printHtmlPart(23)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1424533760600L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
