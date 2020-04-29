public class StringsCou{
    public static void main(String[]args){
        String str = "Java is a programming language that developers use to create applications on your computer. Chances are you've downloaded a program that required the Java runtime, and so..";
        String[] words = str.split("[[ ]*|[//.]]");
        for(int i=0;i<words.length;i++)
            System.out.print(words[i]+" ");
    }
}