package com.mycompany.mavenproject1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage stage) {

        // 1 - CADASTRO DE BOMBEIRO

        VBox cadastro = new VBox(10);

        Label tituloCadastro = new Label("Cadastro de Bombeiro");

        Label lblNome = new Label("Nome:");
        TextField txtNome = new TextField();

        Label lblCPF = new Label("CPF:");
        TextField txtCPF = new TextField();

        Label lblData = new Label("Data de Nascimento:");
        TextField txtData = new TextField();

        Label lblGenero = new Label("Sexo:");
        TextField txtGenero = new TextField();

        Button btnCadastrar = new Button("Cadastrar");
        Button btnCancelarCadastro = new Button("Cancelar");

        Label mensagemCadastro = new Label();

        cadastro.getChildren().addAll(
                tituloCadastro,
                lblNome,
                txtNome,
                lblCPF,
                txtCPF,
                lblData,
                txtData,
                lblGenero,
                txtGenero,
                btnCadastrar,
                btnCancelarCadastro,
                mensagemCadastro
        );

        Scene sceneCadastro = new Scene(cadastro, 500, 450);


        // Botão Cadastrar

        btnCadastrar.setOnAction(e -> {
            mensagemCadastro.setText("Bombeiro cadastrado com sucesso!");
        });


        // Botão Cancelar

        btnCancelarCadastro.setOnAction(e -> {

            txtNome.clear();
            txtCPF.clear();
            txtData.clear();
            txtGenero.clear();

            mensagemCadastro.setText("Cadastro cancelado.");
        });

        // 2 - OPERAÇÃO BOMBEIRO
    
        VBox operacao = new VBox(10);

        Label tituloOperacao = new Label("Operação Bombeiro");

        Label lblLocal = new Label("Local da Ocorrência:");
        TextField txtLocal = new TextField();

        Label lblTipo = new Label("Tipo da Operação:");
        TextField txtTipo = new TextField();

        Label lblViatura = new Label("Viatura:");
        TextField txtViatura = new TextField();

        Label lblBombeiro = new Label("Bombeiro Responsável:");
        TextField txtBombeiro = new TextField();

        Label lblDescricao = new Label("Descrição:");
        TextField txtDescricao = new TextField();

        Button btnRegistrar = new Button("Registrar Operação");
        Button btnCancelarOperacao = new Button("Cancelar");

        Label mensagemOperacao = new Label();
