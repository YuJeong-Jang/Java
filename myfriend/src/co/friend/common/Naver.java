package co.friend.common;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class Naver {

    static final String FROM = "aridoasis@naver.com";
    static final String FROMNAME = "네이버";
    static final String TO = "aridoasis@naver.com";
    static final String SMTP_USERNAME = "aridoasis@naver.com";
    static final String SMTP_PASSWORD = "lovely1016";
    
    static final String HOST = "smtp.naver.com";
    static final int PORT = 465;
    
    static final String SUBJECT = "안녕?";
    
    static final String BODY = String.join(
        System.getProperty("line.separator"),
        "<h1>슈밤!!</h1>",
        "<p>성공했냐고!!!</p>."
    );
    public static void main(String[] args) throws Exception {
        Properties props = System.getProperties();
        props.put("mail.transport.protocol", "smtp");
        props.put("mail.smtp.port", PORT); 
        props.put("mail.smtp.ssl.enable", "true");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.ssl.trust", HOST);
        Session session = Session.getDefaultInstance(props);
        MimeMessage msg = new MimeMessage(session);
        msg.setFrom(new InternetAddress(FROM, FROMNAME));
        msg.setRecipient(Message.RecipientType.TO, new InternetAddress(TO));
        msg.setSubject(SUBJECT);
        msg.setContent(BODY, "text/html;charset=euc-kr");
        
        Transport transport = session.getTransport();
        try {
            System.out.println("Sending...");
            
            transport.connect(HOST, SMTP_USERNAME, SMTP_PASSWORD);
            transport.sendMessage(msg, msg.getAllRecipients());
            System.out.println("Email sent!");
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            transport.close();
        }
    }
}
