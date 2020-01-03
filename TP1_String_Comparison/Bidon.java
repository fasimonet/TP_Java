public class Bidon {
    public static void main(String[] argv) {
        // Quelques déclarations préalables
        String s1 = "loic";
        String s2 = "loic";
        String s3 = new String("loic");
        String s4 = new String("loic");
        String s5 = s3;
        String s6 = null;

        // Test de l'opérateur égal == 
        System.out.print("s1==s2? ");
        System.out.println(s1==s2); // true
        System.out.print("s1==s3? ");
        System.out.println(s1==s3); // false
        System.out.print("s3==s4? ");
        System.out.println(s3==s4); // false
        System.out.print("s5==s3? ");
        System.out.println(s5==s3); // true

        // Test de la méthode equals()
        System.out.print("s1.equals(s3)? ");
        System.out.println(s1.equals(s3)); // true
        System.out.print("s1.equals(s6)? ");
        System.out.println(s1.equals(s6)); // false
        //System.out.print("s6.equals(s1)? ");
        //System.out.println(s6.equals(s1)); 
        // Exception in thread "main" java.lang.NullPointerException at Bidon.main(Bidon.java:27)
        // En effet, impossible d'appeler une methode sur une variable qui vaut null

        /* Conclusion :
            - L'operateur == compare les adresses memoires sauf lorsque deux variables sont initialisees avec la meme valeur, a ce moment la il compare les valeurs.
            - Pour comparer les valeurs prises par deux Strings on utilise la methode equals(). Attention a ne pas utiliser equals() sur null.   
        */

    }
}