public class ExemploForArray {
    public static void main(String[] args) {
        String alunos[] = { "Thiago", "Matheus", "Jandira" };

        for (int x=0; x < alunos.length; x++){
            if(x == 2){
                break;
            }
            System.err.println((x + 1) + ") Aluno: " + alunos[x]);
        }
    }
}
