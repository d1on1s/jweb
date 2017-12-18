package online.denseleznev.jweb;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    private final String urlPrefix = "http://";
    private String url;
    private WebEngine webEngine;
    @FXML
    TextField addrBar;
    @FXML
    WebView webView;

    public void initialize(URL url, ResourceBundle resourceBundle) {
        webEngine = webView.getEngine();
        webEngine.load(urlPrefix + "www.google.com"); // home page
    }

    public void load(ActionEvent actionEvent) {
        url = addrBar.getText().toString();
        webEngine.load(urlPrefix + url);
    }


}
