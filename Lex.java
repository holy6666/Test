package com.example.demo;

import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public  class  Lex {
    @FXML
    TextArea input;
    @FXML
    VBox vBox;
    @FXML
    Scene scene;

    static String identiferRegularExperssion = "[a-zA-Z][0-9]*";
    static String identifier = "[a-zA-Z]*";
    static String digit = "[0-9]+";

    static String character = "[a-zA-Z]";
static  String ws = "[ \t\n\r ]+";
    static String comment = "[/][*][_a-zA-Z]+";
    static String Output = "\'[a-zA-Z]+\'";
    static String stringExpression =  "[a-zA-Z]*";
    static String token;
    static Scanner inputCode;
    static List keywords = new ArrayList();
    static List symbols = new ArrayList();
    static List Operation = new ArrayList();
    static List logialOP = new ArrayList();
    //static List stringExpression= new ArrayList();


    public static String Scanner(String input) {

        keywords.add("if");
        keywords.add("else");
        keywords.add("else if");
        keywords.add("class");
        keywords.add("for");
        keywords.add("while");
        keywords.add("do");
        keywords.add("return");
        keywords.add("public");
        keywords.add("private");
        keywords.add("protect");
        keywords.add("package");
        keywords.add("new");
        keywords.add("static");
        keywords.add("void");
        keywords.add("this");
        keywords.add("try");
        keywords.add("catch");
        keywords.add("out");
        keywords.add("System");
        keywords.add("println");
        keywords.add("print");
        keywords.add("false");
        keywords.add("true");
        keywords.add("main");
        keywords.add("String");
        keywords.add("args");
        keywords.add("arg");
        keywords.add("void");
//TYPE OF DATA
        keywords.add("double");
        keywords.add("float");
        keywords.add("char");
        keywords.add("boolean");
        keywords.add("int");
//Symbols
        symbols.add("!");
        symbols.add("&");
        symbols.add("^");
        symbols.add("%");
        symbols.add("$");
       // symbols.add("#");
        symbols.add("@");
        symbols.add("?");
        symbols.add("~");
        symbols.add("("); //begin the condition
        symbols.add(")"); //end the condition
        symbols.add("{"); //begin the loop
        symbols.add("}"); //end for loop
        symbols.add(";");
        symbols.add("]");
        symbols.add("[");
        symbols.add(","); //end for loop
       // stringExpression.add(" '\"' (~[\\r\\n\"] | '\"\"')* '\"'  ");
        symbols.add("'"); //use to print
        symbols.add(".");
        symbols.add("\"");


        //Operations
        Operation.add("+");
        Operation.add("-");
        Operation.add("*");
        Operation.add("/");
        Operation.add("=");

        logialOP.add("||");
        logialOP.add("|");
        logialOP.add("&&");
        logialOP.add("==");
        logialOP.add("<=");
        logialOP.add(">=");
        logialOP.add(">");
        logialOP.add("<");
        logialOP.add("!=");
        logialOP.add("+=");
        logialOP.add("-=");
        logialOP.add("/=");
        logialOP.add("*=");
       // stringExpression.add(" '\"' (~[\\r\\n\"] | '\"\"')* '\"'  ");
        String tokenCategory =null;
//        int line = 1;
//        String someString;
String output="";

// token.startsWith("\"")&
// "\"[a-zA-Z]*\""
// Scanner scanner = new Scanner(System.in);
// String[] splited = input.split("\\s+");
//TextArea jfxTextarea = new TextArea();
//jfxTextarea.setText(scanner.next());
        String[] splited = input.split("\\s+") ;//| input.split();
        for (int i=0;i< splited.length;i++){
            token = splited[i];
            if(token.startsWith("\"")|token.contains(ws)|token.contains(stringExpression)|token.endsWith("\""))
                //if (Pattern.matches(stringExpression, token))
                tokenCategory = "STRING";

            else if (token.startsWith("\'") & token.endsWith("\'"))
                tokenCategory= "character";
           else if (keywords.contains(token)) {
                tokenCategory = "Keyword";
            } else if (symbols.contains(token)) {
                tokenCategory = "Symbol";
            } else if (Operation.contains(token)) {
                tokenCategory = "Operation";
            } else if (logialOP.contains(token)) {
                tokenCategory = "Logical Operation";
            }


         else if (Pattern.matches(identiferRegularExperssion, token) | Pattern.matches(identifier, token)) {
                tokenCategory = "identifier";
            } else if (Pattern.matches(comment, token)) {
                tokenCategory = "Comment"; }
                else if (Pattern.matches(digit, token)) {
                tokenCategory = "Digit";
            } else if (Pattern.matches(character, token)) {
                tokenCategory = "character";
            } else if (Pattern.matches(Output, token)) {
                tokenCategory = "Output to the user";
            } // else {
            //  tokenCategory = "there an error in token !!! in line :" + line;
            //    }
            if (token.endsWith(";")) {

            }
            output+="<" + token + "," + tokenCategory + "> \n";

        }//End of the while


        return output;
    }//End Scanner()
}

