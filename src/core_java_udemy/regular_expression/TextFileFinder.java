package core_java_udemy.regular_expression;

import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextFileFinder {
    public static void main(String[] args) {
        File directory = new File("/Users/dines/Documents/cse_resources/coding/src/core_java_udemy/regular_expression/textFiles");
        String[] fileNames = directory.list();
        Pattern pattern = Pattern.compile("[a-zA-Z0-9]+[.]txt");
        int count = 0;
        for(String fileName:fileNames){
            Matcher matcher = pattern.matcher(fileName);
            if(matcher.matches()){
                count++;
                System.out.println(fileNames);
            }
        }
        System.out.println("Number of text files: "+count);

    }
}
