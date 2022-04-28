package view;

import controllers.BaseController;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

import controllers.LoginWindowController;
import controllers.TelaCadastroClienteController;
import controllers.TelaCadastroClienteController;
import controllers.TelaInicialController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;

public class ViewFactory{
    
    
    public ViewFactory(){
        
    }
        public void TelaLogin(){
            BaseController controller = new LoginWindowController(this, "LoginWindow.fxml");
            initializeStage(controller);
        
        }
        public void TelaInicial(){
            BaseController controller = new TelaInicialController(this, "TelaInicial.fxml");
            initializeStage(controller);
                    }
        
        public void initializeStage(BaseController baseController){
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(baseController.getFxmlName()));
            fxmlLoader.setController(baseController);
            Parent parent;
            try{
                parent = fxmlLoader.load();
            }
            catch(IOException e){
                e.printStackTrace();
                return;
            }
            Scene scene = new Scene(parent);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.show();
        }
        public void closeStage(Stage stageToClose){
            stageToClose.close();
        }
}
