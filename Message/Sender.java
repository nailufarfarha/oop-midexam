/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Message;

/**
 *
 * @author A S U S
 */
public class Sender {
    public static void main(String[] args) {
        StdMessenger msg = new StdMessenger();
        msg.sendMessage("", "", "");
        msg.sendMessage("Nay", "Birthday Party", "Hi! Please come to my party.");
        
        MailMessenger mail = new MailMessenger();
        mail.connect();
        mail.sendMessage("Farha", "Webinar", "Join Us Tomorrow!");
        mail.disconnect();
        mail.sendMessage("Afifah", "Task", "You have a new task on your google classroom.");
    }
}
