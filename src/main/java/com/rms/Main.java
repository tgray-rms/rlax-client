package com.rms;

import com.rms.api.job.RlaxJobClient;
import com.rms.api.job.model.ConfigValue;

public class Main {

    public static void main(String[] args) {
        RlaxJobClient rmsClient = new RlaxJobClient();

        ConfigValue value = rmsClient.getConfigurationValue("smtp-enabled");

        System.out.println(value.getKey() + "-" + value.getValue());
    }
}
