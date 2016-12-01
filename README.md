# twilioscala
Use this 1-line of Scala to send an SMS, via Twilio
~~~~
SMS(Auth(accountSid, authToken), SMS(toNumber, fromNumber, smsText))
~~~~
# download dependency jar
Download the jar-with-dependency.jar: http://search.maven.org/#search%7Cga%7C1%7Cg%3A%22com.twilio.sdk%22%20AND%20a%3A%22twilio%22
# compile
scalac -cp twilio-7.3.0-jar-with-dependencies.jar TwilioTest.scala
# run
scala -cp twilio-7.3.0-jar-with-dependencies.jar:. twilioscala.TwilioTest
