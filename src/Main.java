import java.time.LocalDate;

public class Main {
    public static void main(String[] args){
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescrição("descrição curso java");
        curso1.setCargaHoraria(8);
        System.out.println(curso1);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescrição("descrição curso js");
        curso2.setCargaHoraria(4);
        System.out.println(curso2);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescrição("desrição mentoria java");
        mentoria.setData(LocalDate.now());
        System.out.println(mentoria);
    }
}