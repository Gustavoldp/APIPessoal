package controllers;

import Dao.Cadastro_empresaDAO;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import modelo.Cadastro_empresa;
import view.ViewFactory;

public class TelaCadastroEmpresaController extends BaseController{
    
    public TelaCadastroEmpresaController(ViewFactory viewFactory, String fxmlName){
        super(viewFactory, fxmlName);
    }    


    @FXML
    private TextField NomeEmpresa;

    @FXML
    private TextField Projeto;

    @FXML
    private TextField Responsavel;

        @FXML
            void CE(ActionEvent event) {
                        String nome_empresa, responsavel, nome_projeto;

                        nome_empresa = NomeEmpresa.getText();
                        nome_projeto = Projeto.getText();
                        responsavel = Responsavel.getText();
                        

                        Cadastro_empresa objcadastro_empresa = new Cadastro_empresa();
                        objcadastro_empresa.setNome_empresa(nome_empresa);
                        objcadastro_empresa.setResponsavel(responsavel);
                        objcadastro_empresa.setNome_projeto(nome_projeto);


                        Cadastro_empresaDAO objcadastro_empresadao = new Cadastro_empresaDAO();
                        objcadastro_empresadao.cadastrar_empresa(objcadastro_empresa);

                }
            
    }


