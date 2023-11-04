package com.jurgen.genfacturas;

import org.springframework.context.ApplicationListener;

import com.jurgen.genfacturas.ChartApplication.StageReadyEvent;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class StageInitializer implements ApplicationListener<StageReadyEvent>{

    @Override
    public void onApplicationEvent(StageReadyEvent event) {
        Stage stage = event.getStage();
        stage.setTitle("Generador de Facturas");



        StackPane layout = new StackPane();

        Button button = new Button("Click me");

        layout.getChildren().add(button);

        Scene scene = new Scene(layout, 600, 500);


        stage.setScene(scene);
        stage.show();
    }
    
}
