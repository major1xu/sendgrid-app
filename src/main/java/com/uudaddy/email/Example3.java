package com.uudaddy.email;

import com.sendgrid.*;
import java.io.IOException;

public class Example3 {
  public static void main(String[] args) throws IOException {
    SendGrid sg = new SendGrid(System.getenv("SENDGRID_API_KEY"));
    try {
      Request request = new Request();
      request.setMethod(Method.GET);
      request.setEndpoint("api_keys");
      Response response = sg.api(request);
      System.out.println(response.getStatusCode());
      System.out.println(response.getBody());
      System.out.println(response.getHeaders());
    } catch (IOException ex) {
      throw ex;
    }
  }
}