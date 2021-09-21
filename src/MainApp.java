public class MainApp {
    public static void main(String[] args) { //psvm
        //Instanciar classe Aluno
        Aluno a1 = new Aluno();
        a1.nota01 = 5.0;
        a1.nota02 = 6.0;
        a1.nota03 = 7.0;
        a1.nota04 = 8.0;
        a1.nome = "Baltazar";
        a1.disciplina = "Java";
        //double media = (a1.nota01 + a1.nota02 + a1.nota03 + a1.nota04) / 4;
        //System.out.println(media);
        a1.mediaSemRetorno();
        System.out.println(a1.mediaComRetorno());

        Aluno a2 = new Aluno();
        a2.nota01 = 5.0;
        a2.nota02 = 6.0;
        a2.nota03 = 7.0;
        a2.nota04 = 8.0;
        a2.nome = "Beatriz";
        a2.disciplina = "Java";
        a2.mediaSemRetorno();
        System.out.println(a2.mediaComRetorno());

        Aluno a3 = new Aluno(4.0, 5, 5.5, 7.9, "Maria", "1234", "SI", "Linguagem Java");
        a3.mediaSemRetorno();
        System.out.println(a3.mediaComRetorno());
    }

}
