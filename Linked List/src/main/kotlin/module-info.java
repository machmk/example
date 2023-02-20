module example.linkedlist {
    requires javafx.controls;
    requires javafx.fxml;
    requires kotlin.stdlib;


    opens example.linkedlist to javafx.fxml;
    exports example.linkedlist;
}