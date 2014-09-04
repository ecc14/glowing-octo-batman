/*
 * Author: Patrick Bartlett
 * Date: 9/3/14
 * Purpose: ???
 */

import java.io.*; // For the BufferedReader

public class Test
{
    public static void main(String args[])
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  // Instantiating BufferedReader for stuff

        // Ask the user for their name
        System.out.print("What is your name?: ");

        // Get the input
        try
        {
            String strResponse = br.readLine();
        }
        catch(IOException ioe)
        {
            System.exit(1);
        }
        // Fuck you, your name is George
        System.out.println("Hello, George.");
    } // End method main
} // End class Test
