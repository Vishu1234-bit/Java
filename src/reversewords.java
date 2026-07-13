// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        // StringBuilder s1  = new StringBuilder("Vishali");
        // System.out.println(s1.reverse());
        String s1 = "Vishali";
        for(int i=s1.length()-1;i>=0;i--){
            System.out.print(s1.charAt(i));
        }
    }
}
