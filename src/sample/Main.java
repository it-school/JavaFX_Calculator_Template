package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Calendar;

public class Main extends Application {
    public static Calculator calculator;

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 600, 425));
        primaryStage.show();
    }

    public static void main(String[] args) {
        calculator = new Calculator();
/*        calculator.number1 = 5;
        calculator.number2 = 0;
        calculator.operation = Operation.divide;
        calculator.calculate();
        System.out.println(calculator.result);*/
        launch(args);
    }
}
