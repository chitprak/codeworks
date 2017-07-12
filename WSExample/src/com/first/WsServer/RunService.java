/**
 * 
 */
package com.first.WsServer;

import javax.xml.ws.Endpoint;

/**
 * @author Chitra Prakash
 *
 */


 
public class RunService {
 
 /**
 * @param args
 */
     
 public static void main(String[] args) {
         
  System.out.println("SayHello Web Service started.");
  Endpoint.publish("http://localhost:8181/WSExample", new MyFirstClass());
 
 }
}
