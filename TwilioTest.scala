// USAGE: 1 LINE API 
// twilioscala.SMS(Auth(accountSid, authToken), SMS(toNumber, fromNumber, smsText))

package twilioscala
import com.twilio.rest.api.v2010.account.Message
import com.twilio.Twilio
import com.twilio.`type`.PhoneNumber
case class Auth(account:String, token:String)
case class SMS(toNumber:String, fromNumber:String, text:String)
object SMS {
    def apply(auth:Auth, sms:SMS):String = {
        Twilio.init(auth.account, auth.token)
        val message = Message.creator(new PhoneNumber(sms.toNumber), 
                                      new PhoneNumber(sms.fromNumber), 
                                      sms.text)
        .create()
        message.getSid()
    }   
}
object TwilioTest extends App {
    val accountSid = "YOUR_ACCOUNT_SID"
    val authToken = "YOUR_AUTH_TOKEN"
    val toNumber = "ANY_PHONE_NUMBER"
    val fromNumber = "TWILIO_PHONE_NUMBER"
    val smsText = "WHATEVER"
    SMS(Auth(accountSid, authToken), SMS(toNumber, fromNumber, smsText))
}
