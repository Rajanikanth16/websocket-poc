package com.rubiconred.websocket;

import javax.ws.rs.POST;
import javax.ws.rs.Path;

import org.springframework.stereotype.Component;

@Component
@Path("/echo")
public class TestResource {
  
  @POST
  public String echo(String input){
    System.out.println("I am here - " + input);
    return input;
  }

}
