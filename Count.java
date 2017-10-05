
/**
 * 1.      Use // style comments to add a comment header at the top of the file that includes the name of the program, your name, and a brief description of what the program does, neatly formatted. Include a delimiter line (e.g., all stars) at the beginning and end of the header. 
    Answer: Count.java, Isaac, counts from 1-5 in 3 languages.
2.      Add a comment before each println that indicates what language the next line is in. Experiment with leaving a blank line before each of these comment lines (in the program itself, not the output). Is the program easier to read with or without these blank lines?
    Answer: Yes
3.      Remove one of the slashes from one of your comment lines and recompile the program, so one of the comments starts with a single /. What error do you get? Put the slash back in.
    Answer: ; expected
4.      Try putting a comment within a comment, so that a // appears after the initial // on a comment line. Does this cause problems?
    Answer: No problems
 */

public class Count
{
    public static void main (String[] args)
    {
    //English//English
    System.out.println ("one two three four five");
    //French
    System.out.println ("un deux trois quatre cinq");
    //Spanish
    System.out.println ("uno dos tres cuatro cinco");
 
    }

}
