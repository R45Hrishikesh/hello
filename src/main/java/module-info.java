module com.example.helloworldproject {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.helloworldproject to javafx.fxml;
    exports com.example.helloworldproject;
}