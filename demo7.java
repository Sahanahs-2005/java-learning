public class demo7 {
    public static void main(String[] args) {
       /*String name = "Sahana";
       System.out.println(name);
       System.out.println(name.hashCode());
       System.out.println(name.charAt(0));
       System.out.println(name.concat(" is a good girl"));*/
       StringBuffer sb = new StringBuffer("Sahana");
       System.out.println(sb);
       System.out.println(sb.capacity());
       System.out.println(sb.replace(4, 5, "r"));
    }
}