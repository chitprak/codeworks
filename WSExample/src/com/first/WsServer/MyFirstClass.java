/**
 * 
 */
package com.first.WsServer;

import javax.jws.WebService;

/**
 * @author Chitra Prakash
 *
 */
@WebService
public class MyFirstClass {

     
 private static final String SALUTATION = "Hello";
     
 public String getGreeting( String name ) {
  return SALUTATION + " " + name;
 }
}