package com.example.demo;


import com.example.demo.grammer.GrammerLexer;
import com.example.demo.grammer.GrammerParser;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.embed.swing.SwingNode;

import javafx.stage.DirectoryChooser;
import javafx.stage.Stage;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
 import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.gui.TreeViewer;
//import javax.swin
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.ResourceBundle;
import javafx.stage.FileChooser;
public class Controller  implements Initializable {

    //StringBuffer temp;
    @FXML
    ComboBox<String> sb;
    @FXML
    TextArea input;
    @FXML
    Label output;
    @FXML
    Pane treepane;
    @FXML
    Button sim;
    @FXML
    Button can;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        sb.setItems(FXCollections.observableArrayList("Lexical analysis", "Syntax analysis", "Code optimization"));

    }

    @FXML
    void onSImulateButtonClick(ActionEvent event) throws IOException {

        if (sb.getValue().equals("Lexical analysis")) {
            output.setText(Lex.Scanner(input.getText()));
//            CharStream in = CharStreams.fromString(input.getText());
//            GrammerLexer lexer = new GrammerLexer(in);
//            CommonTokenStream tokens = new CommonTokenStream(lexer);
//            GrammerParser parser = new GrammerParser(tokens);
//            ParseTree tree = parser.prog();
//            output.setText(tree.toStringTree(parser));
        }
        if (sb.getValue().equals("Syntax analysis")) {
            CharStream in = CharStreams.fromString(input.getText());
            GrammerLexer lexer = new GrammerLexer(in);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            GrammerParser parser = new GrammerParser(tokens);
            ParseTree tree = parser.prog();
            System.out.println(tree.toStringTree(parser));
            TreeViewer viewer = new TreeViewer(Arrays.asList(
                    parser.getRuleNames()), tree);
            SwingNode swingNode = new SwingNode();
            swingNode.setContent(viewer);

            treepane.getChildren().add(swingNode);
            output.setText("");

        }
        if (sb.getValue().equals("Code optimization")) {
            output.setText(codeOpt.Scanner(input.getText()));
            treepane.getChildren().clear();
        }


        //if (sb.getValue() == null) {
        // Alert alert = new Alert(Alert.AlertType.WARNING);
        // alert.setTitle("Error");
        // alert.setHeaderText("Choose a Phase from the drop box");
        //alert.setContentText("This is content text.");
        // alert.showAndWait();
        // }
    }

    @FXML
    void onCancelButtonClick(ActionEvent event) {
        output.setText("");
        treepane.getChildren().clear();

    }

    @FXML
    void OnHintClick(ActionEvent event) {

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Hint");
        alert.setHeaderText("When writing a source code: ");
        alert.setContentText("Make sure to have a space between you're code and the semicolon.");
        alert.showAndWait();

    }


    public void SaveFile(ActionEvent actionEvent) {
        FileChooser fileChooser = new FileChooser();
        fileChooser.getExtensionFilters().addAll(new FileChooser.ExtensionFilter("TXT files (*.txt)", "*.txt"));

        File file = fileChooser.showSaveDialog(new Stage());

        if (file != null) {

            System.out.println(file.getAbsolutePath()
                    + "  selected");

            Path fileName = Path.of(
                    file.getAbsolutePath());
            try {

//                Files.writeString(fileName, input.getText());
                PrintWriter out = new PrintWriter(fileName+"");
                out.print(input.getText());
                out.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }

    }

    public void OpenFile(ActionEvent actionEvent) {
        FileChooser fileChooser = new FileChooser();

        File file = fileChooser.showOpenDialog(new Stage());

        if (file != null) {

            System.out.println(file.getAbsolutePath()
                    + "  selected");

            Path fileName = Path.of(
                    file.getAbsolutePath());


            // Reading the content of the file
            String file_content = null;
            try {
                file_content = Files.readString(fileName);
                input.setText(file_content);

            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }

    }

    public void ShowAboutUs(ActionEvent actionEvent) {
        Alert a = new Alert(Alert.AlertType.NONE,"About Us",ButtonType.OK);

        a.setContentText("This simulator aims to simulating some of compiler phases to making it easier for the " +
                "instructors to teach the compiler phases and to help students may find it challenging to" +
                "understand how compiler phases work. This simulation system has three phases of compiler:" +
                "Lexical Analysis, Syntax Analysis and Optimization. You have possibility of entering your " +
                "string and running each phase separately. We hope the project will be helpful for all " +
                "instructors and students of the computer sciences and we hope that we gave a simple " +
                "instrument for understanding the most important component of the programming process.\n" +
                "\n" +
                "\n" +
                "This application is developed by:\n" +
                "- Rahaf Mohammed Alshahrani\n" +
                "- Shahd Mofareh Alwadaani\n" +
                "- Shatha Awad Alharthi\n" +
                "- Layan Abdullah Albakran");
        a.setTitle("About Us");
        // show the dialog
        a.show();
    }

    public void ShowGrammar(ActionEvent actionEvent) {
        Alert a = new Alert(Alert.AlertType.NONE,"Grammar",ButtonType.OK);

        a.setContentText("Character -> [a-z | A-Z]*\n" +
                "Identifer -> [a-z | A-Z]*\n" +
                "Digit -> [0-9]+*\n" +
                "Comment -> [/*]\n" +
                "Operation -> [+ | - | * | / | =]\n" +
                "Logical operation -> [|| | && | == | <= | >= | > | <]\n" +
                "Symbols -> [! | & | ^ | % | $ | # | @ | ? | ~ | * | ) | { | *} | ; | ' ]\n" +
                "Keyword -> [if | else | elseif | for | while | do | return | public | privete | protect | package" +
                "| new| int | double | float | static | char | boolean | long | void | this | try | catch | true | print ]");
        a.setTitle("Grammar");
        // show the dialog
        a.show();

    }
}
