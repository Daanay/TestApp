module com.example.demo {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;
    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires rich.text.area;
    requires java.logging;
    requires org.kordamp.ikonli.lineawesome;
    requires org.kordamp.ikonli.core;
    requires languagetool.core;
    requires language.uk;


    opens com.example.demo2 to javafx.fxml;
    exports com.example.demo2;
}