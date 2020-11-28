/*
Upon learning that DNA is not a random string, freshmen of the Bioinformatics Institute
from the informatics group suggested using a compression algorithm that compresses repeated characters in a string.

Encoding is performed as follows:
The string "aaaabbсaa" is converted into "a4b2с1a2", 
that is, the groups of the same characters of the input string are replaced by the symbol and the number of its repetitions in this string.

Write a program, which reads the string, encodes it by this algorithm and outputs the encoded sequence. 
The encoding must be case sensitive.

*/

import java.util.Scanner;

class CodeGen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String gen = scanner.nextLine() + ' ';
        String codeGen = "";
        char tmp = gen.charAt(0);
        int number = 0;
        for (int i = 0; i < gen.length(); i++) {
            if (tmp == gen.charAt(i)){
                number++;
                
            } else {
                codeGen += tmp + Integer.toString(number); 
                tmp = gen.charAt(i);
                number = 1;
            }
        }
        System.out.println(codeGen);
    }
}