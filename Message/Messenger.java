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
public interface Messenger {
    public abstract void sendMessage(String receiver, String subject, String messege);
}
