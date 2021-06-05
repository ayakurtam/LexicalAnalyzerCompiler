package LexicalAnalyzerCompiler;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class LexicalAnalyzer {

    public static void main(String[] args) {
        //URL Input_url = ClassLoader.getSystemResource("input.txt");
        //System.out.println(Input_url);
        //FileManager.Location = "input.txt";
        //printTableNames();
        //FileManager.runProgram();
        new StartFrame().setVisible(true);
    }

    public static String centerString (int width, String s) {
    return String.format("%-" + width  + "s", String.format("%" + (s.length() + (width - s.length()) / 2) + "s", s));
    }
    
//    public static void printTableNames(){
//        System.out.println(
//        centerString(15,"Line NO") 
//               + "  \t\t" +  centerString(20, "Lexeme") 
//               + "  \t\t" + centerString(27, "Token") 
//               + "  \t" +  centerString(40,"LexemeNO in Line") 
//               + "  \t" +  centerString(19, "Matchability"));
//    }
}
