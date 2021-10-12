/*
 *  UCF COP3330 Fall 2021 Assignment 46 Solution
 *  Copyright 2021 Ihosvany Marquez
 */

package Exercise46;

import java.util.Scanner;
import java.io.File;
import java.io.*;
import java.util.*;

public class Solution46
{
    public static void main( String[] args ) throws IOException
    {
        Scanner scan = new Scanner(new File("src/main/java/Exercise46/exercise46_input.txt"));
        Map<String,Integer> tree_map =new TreeMap<String,Integer>();

        while(scan.hasNext())
        {
            String input = scan.next();

            if(tree_map.containsKey(input ))
                tree_map.put(input ,tree_map.get(input ) + 1);
            else
                tree_map.put(input ,1);
        }

        for(String word:tree_map.keySet())
        {
            System.out.printf("%-12s", word +":");
            for(int increment = tree_map.get(word); increment > 0 ; increment--)
                System.out.print("*");
                System.out.print("\n");
        }

    }
}
