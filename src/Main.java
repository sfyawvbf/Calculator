import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Image icon = new Image("https://cdn-icons-png.flaticon.com/128/3626/3626508.png");
        Group group = new Group();
        Scene scene = new Scene(group, 400, 500);

        TextField textField = new TextField();
        textField.setLayoutX(50);
        textField.setLayoutY(25);
        textField.setPrefWidth(300);
        textField.setPromptText("Введіть приклад");
        textField.setStyle("-fx-prompt-text-fill: gray;");

        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //                                           BUTTONS                                                          //
        Button button1 = new Button("1");
        button1.setLayoutX(25);
        button1.setLayoutY(100);
        button1.setPrefWidth(50);
        button1.setPrefHeight(50);

        Button button2 = new Button("2");
        button2.setLayoutX(75);
        button2.setLayoutY(100);
        button2.setPrefWidth(50);
        button2.setPrefHeight(50);

        Button button3 = new Button("3");
        button3.setLayoutX(125);
        button3.setLayoutY(100);
        button3.setPrefWidth(50);
        button3.setPrefHeight(50);

        Button button4 = new Button("4");
        button4.setLayoutX(25);
        button4.setLayoutY(150);
        button4.setPrefWidth(50);
        button4.setPrefHeight(50);

        Button button5 = new Button("5");
        button5.setLayoutX(75);
        button5.setLayoutY(150);
        button5.setPrefWidth(50);
        button5.setPrefHeight(50);

        Button button6 = new Button("6");
        button6.setLayoutX(125);
        button6.setLayoutY(150);
        button6.setPrefWidth(50);
        button6.setPrefHeight(50);

        Button button7 = new Button("7");
        button7.setLayoutX(25);
        button7.setLayoutY(200);
        button7.setPrefWidth(50);
        button7.setPrefHeight(50);

        Button button8 = new Button("8");
        button8.setLayoutX(75);
        button8.setLayoutY(200);
        button8.setPrefWidth(50);
        button8.setPrefHeight(50);

        Button button9 = new Button("9");
        button9.setLayoutX(125);
        button9.setLayoutY(200);
        button9.setPrefWidth(50);
        button9.setPrefHeight(50);

        Button button0 = new Button("0");
        button0.setLayoutX(75);
        button0.setLayoutY(250);
        button0.setPrefWidth(50);
        button0.setPrefHeight(50);

        Button buttonClear = new Button("×");
        buttonClear.setLayoutX(351);
        buttonClear.setLayoutY(25);
        buttonClear.setPrefWidth(25);
        buttonClear.setPrefHeight(25);

        Button buttonBackspace = new Button("←");
        buttonBackspace.setLayoutX(125);
        buttonBackspace.setLayoutY(250);
        buttonBackspace.setPrefWidth(50);
        buttonBackspace.setPrefHeight(50);

        Button buttonPlus = new Button("+");
        buttonPlus.setLayoutX(200);
        buttonPlus.setLayoutY(100);
        buttonPlus.setPrefWidth(50);
        buttonPlus.setPrefHeight(50);

        Button buttonMinus = new Button("-");
        buttonMinus.setLayoutX(250);
        buttonMinus.setLayoutY(100);
        buttonMinus.setPrefWidth(50);
        buttonMinus.setPrefHeight(50);

        Button buttonMultiply = new Button("*");
        buttonMultiply.setLayoutX(200);
        buttonMultiply.setLayoutY(150);
        buttonMultiply.setPrefWidth(50);
        buttonMultiply.setPrefHeight(50);

        Button buttonDivide = new Button("/");
        buttonDivide.setLayoutX(250);
        buttonDivide.setLayoutY(150);
        buttonDivide.setPrefWidth(50);
        buttonDivide.setPrefHeight(50);

        Button buttonEquals = new Button("=");
        buttonEquals.setLayoutX(250);
        buttonEquals.setLayoutY(400);
        buttonEquals.setPrefWidth(50);
        buttonEquals.setPrefHeight(50);
        Button buttonDot = new Button(".");
        buttonDot.setLayoutX(25);
        buttonDot.setLayoutY(250);
        buttonDot.setPrefWidth(50);
        buttonDot.setPrefHeight(50);

        button1.setOnAction(event -> {
            textField.appendText("1");
        });

        button2.setOnAction(event -> {
            textField.appendText("2");
        });

        button3.setOnAction(event -> {
            textField.appendText("3");
        });

        button4.setOnAction(event -> {
            textField.appendText("4");
        });

        button5.setOnAction(event -> {
            textField.appendText("5");
        });

        button6.setOnAction(event -> {
            textField.appendText("6");
        });

        button7.setOnAction(event -> {
            textField.appendText("7");
        });

        button8.setOnAction(event -> {
            textField.appendText("8");
        });

        button9.setOnAction(event -> {
            textField.appendText("9");
        });

        button0.setOnAction(event -> {
            textField.appendText("0");
        });

        buttonPlus.setOnAction(event -> {
            textField.appendText("+");
        });

        buttonMinus.setOnAction(event -> {
            textField.appendText("-");
        });

        buttonMultiply.setOnAction(event -> {
            textField.appendText("*");
        });

        buttonDivide.setOnAction(event -> {
            textField.appendText("/");
        });

        buttonDot.setOnAction(event -> {
            textField.appendText(".");
        });

        buttonBackspace.setOnAction(event -> {
            String text = textField.getText();
            if (!text.isEmpty()) {
                text = text.substring(0, text.length() - 1);
                textField.setText(text);
            }
        });

        buttonClear.setOnAction(event -> {
            textField.setText("");
        });

        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        textField.textProperty().addListener((observable, oldValue, newValue) -> {
            if (!newValue.matches("[\\d+\\-*/.]*")) {
                textField.setText(newValue.replaceAll("[^\\d+\\-*/.]", ""));
            }

            if (newValue.matches(".*[+*/.-]{2,}.*")) {
                textField.setText(oldValue);
            }
        });

        group.getChildren().add(textField);
        group.getChildren().add(button1);
        group.getChildren().add(button2);
        group.getChildren().add(button3);
        group.getChildren().add(button4);
        group.getChildren().add(button5);
        group.getChildren().add(button6);
        group.getChildren().add(button7);
        group.getChildren().add(button8);
        group.getChildren().add(button9);
        group.getChildren().add(button0);
        group.getChildren().add(buttonClear);
        group.getChildren().add(buttonBackspace);
        group.getChildren().add(buttonPlus);
        group.getChildren().add(buttonMinus);
        group.getChildren().add(buttonMultiply);
        group.getChildren().add(buttonDivide);
        group.getChildren().add(buttonEquals);
        group.getChildren().add(buttonDot);

        primaryStage.setTitle("Calculator");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.getIcons().add(icon);
        primaryStage.show();
    }
}