module com.qlqts.javafxdemo2 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.qlqts.javafxdemo2 to javafx.fxml;
    exports com.qlqts.javafxdemo2;
}
