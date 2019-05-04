/**
*
* A program that implements Animal Art
*
*
* @author Robert McMillion
* @author snd
*
*/


public class AnimalArt{
    
    /** Main method that takes no arguements 
    *
    * @param args no arguments
    */
    public static void main(String[] args){
    
        drawTopHalf();
        drawBottomHalf();
        System.out.print("This is my AnimalArt.\n");
    
    }
    
    /** Method prints top half of project */
    public static void drawTopHalf(){
        
        System.out.println("            .-._   _ _ _ _ _ _ _ _");
        System.out.println(" .-''-.__.-'00  '-' ' ' ' ' ' ' ' '-.");
        System.out.println("'.___ '    .   .--_'-' '-' '-' _'-' '._");
        System.out.println(" V: V 'vv-'   '_   '.       .'  _..' '.'.");
    }
    
    
    /** Method that prints bottom half of a project */
    public static void drawBottomHalf(){
    
        System.out.println("   '=.____.=_.--'   :_.__.__:_   '.   : :");
        System.out.println("           (((____.-'        '-.  /   : :");
        //There is an escape sequence here as well
        System.out.println("snd                         (((-'\\ .' /");
        System.out.println("                          _____..'  .'");
        System.out.println("                         '-._____.-'");
    
    }


}