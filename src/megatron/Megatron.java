/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package megatron;

import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;

/**
 *
 * @author Olivellaf
 */
public class Megatron {
    
    public static void main(String[] args) {
        ArrayList<Socket> ionCanons = new ArrayList<>();
        String HOST_HOUSE = "192.168.1.13";
        String HOST_COLLEGE = "172.16.253.72";
        int PORT = 4444;
        int LOOPS = 1000;
        
        for (int i = 0; i < LOOPS; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        ionCanons.add(new Socket(HOST_COLLEGE, PORT));
                        while(true) {
                        }
                    } catch (IOException ex) {
                        System.err.println("Error al cargar. ionCanons.add-> fail" + ex.getMessage());
                    }
                }
            }).start();
        }
    }
}
