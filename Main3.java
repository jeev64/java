import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.lang.Math; 
import java.text.DecimalFormat;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Main3 {

    public static double getSyllables(String text) {

        Pattern p = Pattern.compile("[aeiouy]+[^$e(,.:;!?)]");
        //Pattern p = Pattern.compile("(\\w*[aeiouy]){3}\\w*[^e( ,.;:!?)]");
        //Pattern p = Pattern.compile();
        Matcher m = p.matcher(text);
        int syllables = 0;
        while (m.find()){
        syllables++; 
        }        
        return syllables;
    }

    public static double getPolySyllables(String text) {

        Pattern p = Pattern.compile("([aeiouy]+[^$e(,.:;!?)]){3,}");
        //Pattern p = Pattern.compile("(\\w*[aeiouy]){3}\\w*[^$e( ,.;:!?)]");
        //Pattern p = Pattern.compile();
        Matcher m = p.matcher(text);
        int polysyllables = 0;
        while (m.find()){
        polysyllables++; 
        }      
        return polysyllables;
    }

    static void syllableCount(String text) {

        Pattern p = Pattern.compile("[aeiouy]+[^$e(,.:;!?)]");
        //Pattern p = Pattern.compile("(\\w*[aeiouy])+\\w*[^e( ,.;:!?)]");
        //Pattern p = Pattern.compile();
        Matcher m = p.matcher(text);
        int syllables = 0;
        while (m.find()){
        syllables++; 
        }        
        System.out.println("Syllables: " + syllables);
    }

    static void polySyllableCount(String text) {

        Pattern p = Pattern.compile("([aeiouy]+[^$e(,.:;!?)]){3,}");
        //Pattern p = Pattern.compile("(\\w*[aeiouy]){4,}\\w*[^$e( ,.;:!?)]");
        //Pattern p = Pattern.compile();
        Matcher m = p.matcher(text);
        int polysyllables = 0;
        while (m.find()){
        polysyllables++; 
        }        
        System.out.println("Polysyllables: " + polysyllables);
    }  

    static public int words(String text){
        int count = 0;
        int words = text.split(" |\n|\t").length;
        for(int i = 0; i < words; i++) {       
            count++;    
    }                  
    return count; 
    }

    static public int sentences(String text) {
        int count1 = 0;
        int sentences = text.split("\\.|\\?|!").length;
        for(int i = 0; i < sentences; i++) {       
            count1++; 
        }            
    return count1;           
    }

    static public int charcters(String text) {
        int count2 = 0;
        int characters = text.replaceAll(" |\n|\t","").split("").length;
        for(int i = 0; i < characters; i++) {       
            count2++;    
        }                        
    return count2;           
    }
        
        static public void userInput(String text) {

            System.out.print("Enter the score you want to calculate (ARI, FK, SMOG, CL, all): "); 
            Scanner scanner = new Scanner(System.in);
            String input1 = scanner.nextLine();
            scanner.close();
            //return input1;
            //System.out.println(input1);
            //scanner.close();
            if (input1.equals("ARI")){

                int count = 0;
                int count1 = 0;
                int count2 = 0;

                int words = text.split(" |\n|\t").length;
                int sentences = text.split("\\.|\\?|!").length;
                int characters = text.replaceAll(" |\n|\t","").split("").length;
        
                for(int i = 0; i < words; i++) {       
                        count++;    
                }               
                //System.out.println("Words: " + count); 
                for(int i = 0; i < sentences; i++) {       
                    count1++; 
                }               
                //System.out.println("Sentences: " + count1);
                for(int i = 0; i < characters; i++) {       
                    count2++;    
                }               
                //System.out.println("Characters: " + count2);*/
    
                double score = 4.71 * ((double)count2/(double)count) + 0.5 * ((double)count/(double)count1) - 21.43; 
                DecimalFormat df = new DecimalFormat("0.00");
                //System.out.println("The score is: " + df.format(score));
                if(Math.round(score) == 1) {
                    System.out.println("Automated Readability Index: " + df.format(score) + " (about 6 year olds)");
                } else if (Math.round(score) == 2 ) {
                    System.out.println("Automated Readability Index: " + df.format(score) + " (about 7 year olds)");
                } else if (Math.round(score) == 3 ) {
                    System.out.println("Automated Readability Index: " + df.format(score) + " (about 9 year olds)");
                } else if (Math.round(score) == 4 ) {
                    System.out.println("Automated Readability Index: " + df.format(score) + " (about 10 year olds)");
                } else if (Math.round(score) == 5 ) {
                    System.out.println("Automated Readability Index: " + df.format(score) + " (about 11 year olds)");
                } else if (Math.round(score) == 6 ) {
                    System.out.println("Automated Readability Index: " + df.format(score) + " (about 12 year olds)");
                } else if (Math.round(score) == 7 ) {
                    System.out.println("Automated Readability Index: " + df.format(score) + " (about 13 year olds)");
                } else if (Math.round(score) == 8 ) {
                    System.out.println("Automated Readability Index: " + df.format(score) + " (about 14 year olds)");
                } else if (Math.round(score) == 9 ) {
                    System.out.println("Automated Readability Index:" + df.format(score) + " (about 15 year olds)");
                } else if (Math.round(score) == 10 ) {
                    System.out.println("Automated Readability Index: " + df.format(score) + " (about 16 year olds)");
                } else if (Math.round(score) == 11 ) {
                    System.out.println("Automated Readability Index: " + df.format(score) + " (about 17 year olds)");
                } else if (Math.round(score) == 12) {
                    System.out.println("Automated Readability Index: " + df.format(score) + " (about 18 year olds)");
                } else if (Math.round(score) == 13 ) {
                    System.out.println("Automated Readability Index: " + df.format(score) + " (about 24 year olds)");
                } else if (Math.round(score) == 14 ) {
                    System.out.println("Automated Readability Index: " + df.format(score) + " (about 24+ year olds)");
                }
    
            } else if (input1.equals("FK")) {
                int count = 0;
                int count1 = 0;
                int count2 = 0;

                int words = text.split(" |\n|\t").length;
                int sentences = text.split("\\.|\\?|!").length;
                int characters = text.replaceAll(" |\n|\t","").split("").length;
        
                for(int i = 0; i < words; i++) {       
                        count++;    
                }               
                //System.out.println("Words: " + count); 
                for(int i = 0; i < sentences; i++) {       
                    count1++; 
                }               
                //System.out.println("Sentences: " + count1);
                for(int i = 0; i < characters; i++) {       
                    count2++;    
                }               
                //System.out.println("Characters: " + count2);*/

                double myDouble = getSyllables(text);
                   
                double score = 0.39 * ((double)count/(double)count1) + 11.8 * ((double)myDouble/(double)count) - 15.59; 
                DecimalFormat df = new DecimalFormat("0.00");

                if(Math.round(score) == 1) {
                    System.out.println("Flesch–Kincaid readability tests: " + df.format(score) + " (about 6 year olds)");
                } else if (Math.round(score) == 2 ) {
                    System.out.println("Flesch–Kincaid readability tests: " + df.format(score) + " (about 7 year olds)");
                } else if (Math.round(score) == 3 ) {
                    System.out.println("Flesch–Kincaid readability tests: " + df.format(score) + " (about 9 year olds)");
                } else if (Math.round(score) == 4 ) {
                    System.out.println("Flesch–Kincaid readability tests: " + df.format(score) + " (about 10 year olds)");
                } else if (Math.round(score) == 5 ) {
                    System.out.println("Flesch–Kincaid readability tests: " + df.format(score) + " (about 11 year olds)");
                } else if (Math.round(score) == 6 ) {
                    System.out.println("Flesch–Kincaid readability tests: " + df.format(score) + " (about 12 year olds)");
                } else if (Math.round(score) == 7 ) {
                    System.out.println("Flesch–Kincaid readability tests: " + df.format(score) + " (about 13 year olds)");
                } else if (Math.round(score) == 8 ) {
                    System.out.println("Flesch–Kincaid readability tests: " + df.format(score) + " (about 14 year olds)");
                } else if (Math.round(score) == 9 ) {
                    System.out.println("Flesch–Kincaid readability tests:" + df.format(score) + " (about 15 year olds)");
                } else if (Math.round(score) == 10 ) {
                    System.out.println("Flesch–Kincaid readability tests: " + df.format(score) + " (about 16 year olds)");
                } else if (Math.round(score) == 11 ) {
                    System.out.println("Flesch–Kincaid readability tests: " + df.format(score) + " (about 17 year olds)");
                } else if (Math.round(score) == 12) {
                    System.out.println("Flesch–Kincaid readability tests: " + df.format(score) + " (about 18 year olds)");
                } else if (Math.round(score) == 13 ) {
                    System.out.println("Flesch–Kincaid readability tests: " + df.format(score) + " (about 24 year olds)");
                } else if (Math.round(score) == 14 ) {
                    System.out.println("Flesch–Kincaid readability tests: " + df.format(score) + " (about 24+ year olds)");
                }

            } else if (input1.equals("SMOG")) {
                int count = 0;
                int count1 = 0;
                int count2 = 0;

                int words = text.split(" |\n|\t").length;
                int sentences = text.split("\\.|\\?|!").length;
                int characters = text.replaceAll(" |\n|\t","").split("").length;
        
                for(int i = 0; i < words; i++) {       
                        count++;    
                }               
                //System.out.println("Words: " + count); 
                for(int i = 0; i < sentences; i++) {       
                    count1++; 
                }               
                //System.out.println("Sentences: " + count1);
                for(int i = 0; i < characters; i++) {       
                    count2++;    
                }               
                //System.out.println("Characters: " + count2);*/

                double myDouble = getPolySyllables(text);
                   
                double score = 1.043 * Math.sqrt((double)myDouble * 30 / (double)count1) + 3.1291 ; 
                DecimalFormat df = new DecimalFormat("0.00");

                if(Math.round(score) == 1) {
                    System.out.println("Simple Measure of Gobbledygook: " + df.format(score) + " (about 6 year olds)");
                } else if (Math.round(score) == 2 ) {
                    System.out.println("Simple Measure of Gobbledygook: " + df.format(score) + " (about 7 year olds)");
                } else if (Math.round(score) == 3 ) {
                    System.out.println("Simple Measure of Gobbledygook: " + df.format(score) + " (about 9 year olds)");
                } else if (Math.round(score) == 4 ) {
                    System.out.println("Simple Measure of Gobbledygook: " + df.format(score) + " (about 10 year olds)");
                } else if (Math.round(score) == 5 ) {
                    System.out.println("Simple Measure of Gobbledygook: " + df.format(score) + " (about 11 year olds)");
                } else if (Math.round(score) == 6 ) {
                    System.out.println("Simple Measure of Gobbledygook: " + df.format(score) + " (about 12 year olds)");
                } else if (Math.round(score) == 7 ) {
                    System.out.println("Simple Measure of Gobbledygook: " + df.format(score) + " (about 13 year olds)");
                } else if (Math.round(score) == 8 ) {
                    System.out.println("Simple Measure of Gobbledygook: " + df.format(score) + " (about 14 year olds)");
                } else if (Math.round(score) == 9 ) {
                    System.out.println("Simple Measure of Gobbledygook:" + df.format(score) + " (about 15 year olds)");
                } else if (Math.round(score) == 10 ) {
                    System.out.println("Simple Measure of Gobbledygook: " + df.format(score) + " (about 16 year olds)");
                } else if (Math.round(score) == 11 ) {
                    System.out.println("Simple Measure of Gobbledygook: " + df.format(score) + " (about 17 year olds)");
                } else if (Math.round(score) == 12) {
                    System.out.println("Simple Measure of Gobbledygook: " + df.format(score) + " (about 18 year olds)");
                } else if (Math.round(score) == 13 ) {
                    System.out.println("Simple Measure of Gobbledygook: " + df.format(score) + " (about 24 year olds)");
                } else if (Math.round(score) == 14 ) {
                    System.out.println("Simple Measure of Gobbledygook: " + df.format(score) + " (about 24+ year olds)");
                }

            } else if (input1.equals("CL")) {
                int count = 0;
                int count1 = 0;
                int count2 = 0;

                int words = text.split(" |\n|\t").length;
                int sentences = text.split("\\.|\\?|!").length;
                int characters = text.replaceAll(" |\n|\t","").split("").length;
        
                for(int i = 0; i < words; i++) {       
                        count++;    
                }               
                //System.out.println("Words: " + count); 
                for(int i = 0; i < sentences; i++) {       
                    count1++; 
                }               
                //System.out.println("Sentences: " + count1);
                for(int i = 0; i < characters; i++) {       
                    count2++;    
                }               
                //System.out.println("Characters: " + count2);*/

                double L = ((double)count2 / (double)count) * 100;
                double S = ((double)count1 / (double)count) * 100;
                double score = (0.0588 * L) - (0.296 * S) - 15.8;
                DecimalFormat df = new DecimalFormat("0.00");

                if(Math.round(score) == 1) {
                    System.out.println("Coleman–Liau index: " + df.format(score) + " (about 6 year olds)");
                } else if (Math.round(score) == 2 ) {
                    System.out.println("Coleman–Liau index: " + df.format(score) + " (about 7 year olds)");
                } else if (Math.round(score) == 3 ) {
                    System.out.println("Coleman–Liau index: " + df.format(score) + " (about 9 year olds)");
                } else if (Math.round(score) == 4 ) {
                    System.out.println("Coleman–Liau index: " + df.format(score) + " (about 10 year olds)");
                } else if (Math.round(score) == 5 ) {
                    System.out.println("Coleman–Liau index: " + df.format(score) + " (about 11 year olds)");
                } else if (Math.round(score) == 6 ) {
                    System.out.println("Coleman–Liau index: " + df.format(score) + " (about 12 year olds)");
                } else if (Math.round(score) == 7 ) {
                    System.out.println("Coleman–Liau index: " + df.format(score) + " (about 13 year olds)");
                } else if (Math.round(score) == 8 ) {
                    System.out.println("Coleman–Liau index: " + df.format(score) + " (about 14 year olds)");
                } else if (Math.round(score) == 9 ) {
                    System.out.println("Coleman–Liau index:" + df.format(score) + " (about 15 year olds)");
                } else if (Math.round(score) == 10 ) {
                    System.out.println("Coleman–Liau index: " + df.format(score) + " (about 16 year olds)");
                } else if (Math.round(score) == 11 ) {
                    System.out.println("Coleman–Liau index: " + df.format(score) + " (about 17 year olds)");
                } else if (Math.round(score) == 12) {
                    System.out.println("Coleman–Liau index: " + df.format(score) + " (about 18 year olds)");
                } else if (Math.round(score) == 13 ) {
                    System.out.println("Coleman–Liau index: " + df.format(score) + " (about 24 year olds)");
                } else if (Math.round(score) == 14 ) {
                    System.out.println("Coleman–Liau index: " + df.format(score) + " (about 24+ year olds)");
                }
            } else if (input1.equals("all")) { 

                int count = 0;
                int count1 = 0;
                int count2 = 0;

                int words = text.split(" |\n|\t").length;
                int sentences = text.split("\\.|\\?|!").length;
                int characters = text.replaceAll(" |\n|\t","").split("").length;
        
                for(int i = 0; i < words; i++) {       
                        count++;    
                }               
                //System.out.println("Words: " + count); 
                for(int i = 0; i < sentences; i++) {       
                    count1++; 
                }               
                //System.out.println("Sentences: " + count1);
                for(int i = 0; i < characters; i++) {       
                    count2++;    
                }               

               //boolean all = true;
               while (input1.equals("all") == true) {

                double myDouble2 = getSyllables(text);
                   
                double score2 = 0.39 * ((double)count/(double)count1) + 11.8 * ((double)myDouble2/(double)count) - 15.59; 
                DecimalFormat df2 = new DecimalFormat("0.00"); //FK

                double myDouble3 = getPolySyllables(text);
                   
                double score3 = 1.043 * Math.sqrt((double)myDouble3 * 30 / (double)count1) + 3.1291 ; 
                DecimalFormat df3 = new DecimalFormat("0.00"); //SMOG

                double score1 = 4.71 * ((double)count2/(double)count) + 0.5 * ((double)count/(double)count1) - 21.43; 
                DecimalFormat df1 = new DecimalFormat("0.00"); //ARI

                double L = ((double)count2 / (double)count) * 100;
                double S = ((double)count1 / (double)count) * 100;
                double score4 = (0.0588 * L) - (0.296 * S) - 15.8;
                DecimalFormat df4 = new DecimalFormat("0.00"); //CL

                //System.out.println(df1.format(score1));
                if(Math.round(score1) == 1) {
                    System.out.println("Automated Readability Index: " + df1.format(score1) + " (about 6 year olds)");
                } else if (Math.round(score1) == 2 ) {
                    System.out.println("Automated Readability Index: " + df1.format(score1) + " (about 7 year olds)");
                } else if (Math.round(score1) == 3 ) {
                    System.out.println("Automated Readability Index: " + df1.format(score1) + " (about 9 year olds)");
                } else if (Math.round(score1) == 4 ) {
                    System.out.println("Automated Readability Index: " + df1.format(score1) + " (about 10 year olds)");
                } else if (Math.round(score1) == 5 ) {
                    System.out.println("Automated Readability Index: " + df1.format(score1) + " (about 11 year olds)");
                } else if (Math.round(score1) == 6 ) {
                    System.out.println("Automated Readability Index: " + df1.format(score1) + " (about 12 year olds)");
                } else if (Math.round(score1) == 7 ) {
                    System.out.println("Automated Readability Index: " + df1.format(score1) + " (about 13 year olds)");
                } else if (Math.round(score1) == 8 ) {
                    System.out.println("Automated Readability Index: " + df1.format(score1) + " (about 14 year olds)");
                } else if (Math.round(score1) == 9 ) {
                    System.out.println("Automated Readability Index:" + df1.format(score1) + " (about 15 year olds)");
                } else if (Math.round(score1) == 10 ) {
                    System.out.println("Automated Readability Index: " + df1.format(score1) + " (about 16 year olds)");
                } else if (Math.round(score1) == 11 ) {
                    System.out.println("Automated Readability Index: " + df1.format(score1) + " (about 17 year olds)");
                } else if (Math.round(score1) == 12) {
                    System.out.println("Automated Readability Index: " + df1.format(score1) + " (about 18 year olds)");
                } else if (Math.round(score1) == 13 ) {
                    System.out.println("Automated Readability Index: " + df1.format(score1) + " (about 24 year olds)");
                } else if (Math.round(score1) == 14 ) {
                    System.out.println("Automated Readability Index: " + df1.format(score1) + " (about 24+ year olds)");
                }
                //System.out.println(df2.format(score2));
                if(Math.round(score2) == 1) {
                    System.out.println("Flesch–Kincaid readability tests: " + df2.format(score2) + " (about 6 year olds)");
                } else if (Math.round(score2) == 2 ) {
                    System.out.println("Flesch–Kincaid readability tests: " + df2.format(score2) + " (about 7 year olds)");
                } else if (Math.round(score2) == 3 ) {
                    System.out.println("Flesch–Kincaid readability tests: " + df2.format(score2) + " (about 9 year olds)");
                } else if (Math.round(score2) == 4 ) {
                    System.out.println("Flesch–Kincaid readability tests: " + df2.format(score2) + " (about 10 year olds)");
                } else if (Math.round(score2) == 5 ) {
                    System.out.println("Flesch–Kincaid readability tests: " + df2.format(score2) + " (about 11 year olds)");
                } else if (Math.round(score2) == 6 ) {
                    System.out.println("Flesch–Kincaid readability tests: " + df2.format(score2) + " (about 12 year olds)");
                } else if (Math.round(score2) == 7 ) {
                    System.out.println("Flesch–Kincaid readability tests: " + df2.format(score2) + " (about 13 year olds)");
                } else if (Math.round(score2) == 8 ) {
                    System.out.println("Flesch–Kincaid readability tests: " + df2.format(score2) + " (about 14 year olds)");
                } else if (Math.round(score2) == 9 ) {
                    System.out.println("Flesch–Kincaid readability tests:" + df2.format(score2) + " (about 15 year olds)");
                } else if (Math.round(score2) == 10 ) {
                    System.out.println("Flesch–Kincaid readability tests: " + df2.format(score2) + " (about 16 year olds)");
                } else if (Math.round(score2) == 11 ) {
                    System.out.println("Flesch–Kincaid readability tests: " + df2.format(score2) + " (about 17 year olds)");
                } else if (Math.round(score2) == 12) {
                    System.out.println("Flesch–Kincaid readability tests: " + df2.format(score2) + " (about 18 year olds)");
                } else if (Math.round(score2) == 13 ) {
                    System.out.println("Flesch–Kincaid readability tests: " + df2.format(score2) + " (about 24 year olds)");
                } else if (Math.round(score2) == 14 ) {
                    System.out.println("Flesch–Kincaid readability tests: " + df2.format(score2) + " (about 24+ year olds)");
                }
                //System.out.println(df3.format(score3));
                if(Math.round(score3) == 1) {
                    System.out.println("Simple Measure of Gobbledygook: " + df3.format(score3) + " (about 6 year olds)");
                } else if (Math.round(score3) == 2 ) {
                    System.out.println("Simple Measure of Gobbledygook: " + df3.format(score3) + " (about 7 year olds)");
                } else if (Math.round(score3) == 3 ) {
                    System.out.println("Simple Measure of Gobbledygook: " + df3.format(score3) + " (about 9 year olds)");
                } else if (Math.round(score3) == 4 ) {
                    System.out.println("Simple Measure of Gobbledygook: " + df3.format(score3) + " (about 10 year olds)");
                } else if (Math.round(score3) == 5 ) {
                    System.out.println("Simple Measure of Gobbledygook: " + df3.format(score3) + " (about 11 year olds)");
                } else if (Math.round(score3) == 6 ) {
                    System.out.println("Simple Measure of Gobbledygook: " + df3.format(score3) + " (about 12 year olds)");
                } else if (Math.round(score3) == 7 ) {
                    System.out.println("Simple Measure of Gobbledygook: " + df3.format(score3) + " (about 13 year olds)");
                } else if (Math.round(score3) == 8 ) {
                    System.out.println("Simple Measure of Gobbledygook: " + df3.format(score3) + " (about 14 year olds)");
                } else if (Math.round(score3) == 9 ) {
                    System.out.println("Simple Measure of Gobbledygook:" + df3.format(score3) + " (about 15 year olds)");
                } else if (Math.round(score3) == 10 ) {
                    System.out.println("Simple Measure of Gobbledygook: " + df3.format(score3) + " (about 16 year olds)");
                } else if (Math.round(score3) == 11 ) {
                    System.out.println("Simple Measure of Gobbledygook: " + df3.format(score3) + " (about 17 year olds)");
                } else if (Math.round(score3) == 12) {
                    System.out.println("Simple Measure of Gobbledygook: " + df3.format(score3) + " (about 18 year olds)");
                } else if (Math.round(score3) == 13 ) {
                    System.out.println("Simple Measure of Gobbledygook: " + df3.format(score3) + " (about 24 year olds)");
                } else if (Math.round(score3) == 14 ) {
                    System.out.println("Simple Measure of Gobbledygook: " + df3.format(score3) + " (about 24+ year olds)");
                }
                //System.out.println(df4.format(score4));
                if(Math.round(score4) == 1) {
                    System.out.println("Coleman–Liau index: " + df4.format(score4) + " (about 6 year olds)");
                } else if (Math.round(score4) == 2 ) {
                    System.out.println("Coleman–Liau index: " + df4.format(score4) + " (about 7 year olds)");
                } else if (Math.round(score4) == 3 ) {
                    System.out.println("Coleman–Liau index: " + df4.format(score4) + " (about 9 year olds)");
                } else if (Math.round(score4) == 4 ) {
                    System.out.println("Coleman–Liau index: " + df4.format(score4) + " (about 10 year olds)");
                } else if (Math.round(score4) == 5 ) {
                    System.out.println("Coleman–Liau index: " + df4.format(score4) + " (about 11 year olds)");
                } else if (Math.round(score4) == 6 ) {
                    System.out.println("Coleman–Liau index: " + df4.format(score4) + " (about 12 year olds)");
                } else if (Math.round(score4) == 7 ) {
                    System.out.println("Coleman–Liau index: " + df4.format(score4) + " (about 13 year olds)");
                } else if (Math.round(score4) == 8 ) {
                    System.out.println("Coleman–Liau index: " + df4.format(score4) + " (about 14 year olds)");
                } else if (Math.round(score4) == 9 ) {
                    System.out.println("Coleman–Liau index:" + df4.format(score4) + " (about 15 year olds)");
                } else if (Math.round(score4) == 10 ) {
                    System.out.println("Coleman–Liau index: " + df4.format(score4) + " (about 16 year olds)");
                } else if (Math.round(score4) == 11 ) {
                    System.out.println("Coleman–Liau index: " + df4.format(score4) + " (about 17 year olds)");
                } else if (Math.round(score4) == 12) {
                    System.out.println("Coleman–Liau index: " + df4.format(score4) + " (about 18 year olds)");
                } else if (Math.round(score4) == 13 ) {
                    System.out.println("Coleman–Liau index: " + df4.format(score4) + " (about 24 year olds)");
                } else if (Math.round(score4) == 14 ) {
                    System.out.println("Coleman–Liau index: " + df4.format(score4) + " (about 24+ year olds)");
                }

                //System.out.println(df4.format(average));
                double average = (score1 + score2 + score3 + score4) / 4;
                if(Math.round(average) == 1) {
                    System.out.println("This text should be understood in average by " + df4.format(((double)6/(double)1)*average) + " year olds.");
                } else if(Math.round(average) == 2) {
                    System.out.println("This text should be understood in average by " + df4.format(((double)7/(double)2)*average) + " year olds.");
                } else if(Math.round(average) == 3) {
                    System.out.println("This text should be understood in average by " + df4.format(((double)9/(double)3)*average) + " year olds.");
                } else if(Math.round(average) == 4) {
                    System.out.println("This text should be understood in average by " + df4.format(((double)10/(double)4)*average) + " year olds.");
                } else if(Math.round(average) == 5) {
                    System.out.println("This text should be understood in average by " + df4.format(((double)11/(double)5)*average) + " year olds.");
                } else if(Math.round(average) == 6) {
                    System.out.println("This text should be understood in average by " + df4.format(((double)12/(double)6)*average) + " year olds.");
                } else if(Math.round(average) == 7) {
                    System.out.println("This text should be understood in average by " + df4.format(((double)13/(double)7)*average) + " year olds.");
                } else if(Math.round(average) == 8) {
                    System.out.println("This text should be understood in average by " + df4.format(((double)14/(double)8)*average) + " year olds.");
                } else if(Math.round(average) == 9) {
                    System.out.println("This text should be understood in average by " + df4.format(((double)15/(double)9)*average) + " year olds.");
                } else if(Math.round(average) == 10) {
                    System.out.println("This text should be understood in average by " + df4.format(((double)16/(double)10)*average) + " year olds.");
                } else if(Math.round(average) == 11) {
                    System.out.println("This text should be understood in average by " + df4.format(((double)17/(double)11)*average) + " year olds.");
                } else if(Math.round(average) == 12) {
                    System.out.println("This text should be understood in average by " + df4.format(((double)18/(double)12)*average) + " year olds.");
                } else if(Math.round(average) == 13) {
                    System.out.println("This text should be understood in average by " + df4.format(((double)24/(double)13)*average) + " year olds.");
                } else if(Math.round(average) == 14) {
                    System.out.println("This text should be understood in average by " + df4.format(((double)25/(double)14)*average) + " year olds.");
                }  

                return;

               }
          
            }
                
                           
        }
 

    public static void main(String[] args) {
         //accept file name or directory name through command line args 
         //String fname =args[0]; 
  
         //pass the filename or directory name to File object 
         File f = new File("C:/Users/jeeva/OneDrive/Desktop/in3.txt"); 
         //File f = new File("C:/Users/jeeva/OneDrive/Desktop/in2.txt");  

         try (Scanner scanner = new Scanner(f)) {
             while (scanner.hasNextLine()) {
    
        String text = scanner.nextLine();
        //int words = text.split(" |\n|\t").length;
        //int sentences = text.split("\\.|\\?|!").length;
        //int characters = text.replaceAll(" |\n|\t","").split("").length;

        System.out.println("Words: " + words(text));
        System.out.println("Sentences: " + sentences(text));
        System.out.println("Characters: " + charcters(text));

        syllableCount(text);
        
        polySyllableCount(text);

        userInput(text);

             }

            }

    catch (FileNotFoundException e) {
    System.out.println("No file found: " + f);
}

    }

}




