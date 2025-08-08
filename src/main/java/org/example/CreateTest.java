package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CreateTest {

    public static List<Integer> oddEven(int n){
        List<Integer> lista = new ArrayList<>();
        for  (int i = 0; i < n; i++) {
           if (i % 2 != 0) {
               lista.add(i);
           }
        }
        return lista;
    };

   public static boolean checkJavaKeywords(String string) {
           List<String> keywords = List.of(
               "java", "abstract", "continue", "for", "new", "switch", "assert", "default", "goto", "package",
               "synchronized", "boolean", "do", "if", "private", "this", "break", "double", "implements",
               "protected", "throw", "byte", "else", "import", "public", "throws", "case", "enum", "instanceof",
               "return", "transient", "catch", "extends", "int", "short", "try", "char", "final", "interface",
               "static", "void", "class", "finally", "long", "strictfp", "volatile", "const", "float", "native",
               "super", "while"
           );

           String[] words = string.toLowerCase().split(" ");
           for (String word : words) {
               if (keywords.contains(word)) {
                   return true;
               }
           }
           return false;
       }
    public static boolean buscarPalabraEnArray(String[] array, String palabra) {
        for (String elemento : array) {
            if (elemento.equals(palabra)) {
                return true;
            }
        }
        return false;
    }
}
