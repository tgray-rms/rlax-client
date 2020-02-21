package com.rms.api;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class LoadClient {

  Client client = ClientBuilder.newClient();

  public void put(String auth, String body) {
    Response response =
        client
            .target("http://localhost:6002/v1/treaties/1/?datasource=tyler_test")
            .request(MediaType.APPLICATION_JSON)
            .header("Authorization", auth)
            .put(Entity.json(body));

    System.out.println(response.getStatus());
  }
}
