public class FranceneRemoveWhiteSpace {
  public static void main(String[] args){
    String str = "In Java everything goes in a class";
   System.out.println("Before removing whitespace" + str);
   str = str.replaceAll("\\s", "");
   System.out.println("After removing" + str);
     System.out.println(str);
}
}
