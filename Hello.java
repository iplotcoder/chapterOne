
/**
//Hello.java
//
//Print a Hello, world message.
Class name different from file name. Delete one l (el) from the name of the class (so the first non-comment line is public class Helo), save the program, and recompile it. Is there an error message, if so what was the error message?
Answer: No error message because changes as well.
Misspelling inside string. Correct the mistake above, then delete one l from the Hello in the message to be printed (inside the quotation marks). Save the program and recompile it. There is no error message—why not? Now run the program. What has changed?
Answer: There is no error message because anything inside the parenthesis will get printed. It says helo world instead of hello world
No ending quotation mark in a string literal. Correct the spelling in the string, then delete the ending quotation mark enclosing the string Hello, World!. Save the program and recompile it. What error message(s) do you get?
Answer: semi colon expected
No beginning quotation mark in a string literal. Put the ending quotation mark back, then take out the beginning one. Save and recompile. How many errors this time? Lots, even though there is really only one error. When you get lots of errors always concentrate on finding the first one listed!! Often fixing that one will fix the rest. After we study variables the error messages that came up this time will make more sense.
Answer: 
No semicolon after a statement. Fix the last error (put the quotation mark back). Now remove the semicolon at the end of the line that prints the message. Save the program and recompile it. What error message(s) do you get?
Answer: 

 */
public class Hello
{
    //------------------------
    //main method -- prints the greeting
    //------------------------
    public static void main (String[] args)
    {
        System.out.println("Hello, World!");
    }
}
