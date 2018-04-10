/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente;

/**
 *
 * @author entrar
 */
public class ClienteRestfulFromJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        cliente cliente = new cliente();
        System.out.println(cliente.getJson(String.class));
    }
    
}
