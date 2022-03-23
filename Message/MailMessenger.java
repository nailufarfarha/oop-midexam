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
public class MailMessenger implements Messenger {
    
    boolean isSucces;
    boolean isConnectedToServer;
    
    void connect(){
        isConnectedToServer = true;
        System.out.println("Server Connected");
    }
    
    void disconnect(){
        isConnectedToServer = false;
        System.out.println("Server Disconnected");
    }

    @Override
    public void sendMessage(String receiver, String subject, String messege) {
        System.out.println("Receiver\t: "+receiver);
        System.out.println("Subject\t\t: "+subject);
        System.out.println("Messege\t\t: "+messege);
        System.out.println("Connection Status : "+isConnectedToServer);
        
        if (isConnectedToServer==true){
            if(receiver==""){
                isSucces=false;
                System.out.println("Status Messege\t: "+isSucces);
                System.out.println("Mail not send\n");
            }else{
                isSucces=true;
                System.out.println("Status Messege\t: "+isSucces);
                System.out.println("Mail send\n");
            }
        }else{
            System.out.println("Mail not sent, check your network \n");
        }
    }  
}
