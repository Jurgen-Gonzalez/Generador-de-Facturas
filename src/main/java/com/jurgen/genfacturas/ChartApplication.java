package com.jurgen.genfacturas;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ConfigurableApplicationContext;

import javafx.application.Platform;
import javafx.stage.Stage;

public class ChartApplication extends javafx.application.Application{
    private ConfigurableApplicationContext applicationContext;

    @Override
    public void start(Stage stage) throws Exception {
        applicationContext.publishEvent(new StageReadyEvent(stage));
    }
    
    @Override
    public void init(){
        applicationContext = new SpringApplicationBuilder(GenfacturasApplication.class).run();
    }

    @Override
    public void stop() throws Exception {
        applicationContext.stop();
        Platform.exit();
    }

    static class StageReadyEvent extends ApplicationEvent{

    public StageReadyEvent(Stage stage) {
        super(stage);
    }

    public Stage getStage(){
        return ((Stage) getSource());
    }

}
}
