public class Start {
    public static void main(String[] args) {

        String[] array1 = new String[]{"i wamt", "to learn", "how to code"};
        String[] array2 = new String[3];

        array2[0] = array1[0].trim();
        array2[1] = array1[1].trim();
        array2[2] = array1[2].trim();

        int statement1 = array2[0].compareTo("I want");
        int statement2 = array2[2].compareToIgnoreCase("To learn");

        System.out.println(!(statement1 > statement2));
    }
}
