package org.example;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class FunkoLandAPIApplication extends Application<FunkoLandAPIConfiguration> {

    public static void main(final String[] args) throws Exception {
        new FunkoLandAPIApplication().run(args);
    }

    @Override
    public String getName() {
        return "FunkoLandAPI";
    }

    @Override
    public void initialize(final Bootstrap<FunkoLandAPIConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final FunkoLandAPIConfiguration configuration,
                    final Environment environment) {
        // TODO: implement application
    }

}
