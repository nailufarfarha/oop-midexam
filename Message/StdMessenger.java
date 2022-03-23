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
public class StdMessenger implements Messenger{
    
    boolean isSucces;
    
    @Override
    public void sendMessage(String receiver, String subject, String messege) {
        System.out.println("Receiver\t: "+receiver);
        System.out.println("Subject\t\t: "+subject);
        System.out.println("Messege\t\t: "+messege);
        
        if (receiver==""){
            isSucces = false;
            System.out.println("Status Messege\t: "+messege);
            System.out.println("Not yet send\n");
        }else{
            isSucces = true;
            System.out.println("Status Messege\t: "+messege);
            System.out.println("Sent\n");
        }
    }
}
