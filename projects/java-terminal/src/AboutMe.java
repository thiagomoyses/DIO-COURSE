public class AboutMe {
    public static void main(String[] args) {
        String nome = args[0];
        String sobreNome = args[1];
        int idade = Integer.valueOf(args[2]);
        double altura = Double.valueOf(args[3]);

        System.err.println("Me chamo " + nome + " " + sobreNome);
        System.err.println("Tenho " + idade + " anos");
        System.err.println("E tenho " + altura + "m de altura");
    }
}
