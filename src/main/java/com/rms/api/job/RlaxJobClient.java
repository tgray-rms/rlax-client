package com.rms.api.job;

import com.rms.api.job.model.ConfigValue;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;

public class RlaxJobClient {

    Client client = ClientBuilder.newClient();

    /**
     * Some insightful javadoc about the method (copy from swagger?)
     * @param configKey The parameter
     * @return ConfigValue
     */
    public ConfigValue getConfigurationValue(String configKey) {
        return client
            .target("https://api.npe.rms.com/mi/api/v1/configuration")
            .path(configKey)
            .request(MediaType.APPLICATION_JSON)
            .get(ConfigValue.class);
    }

}
