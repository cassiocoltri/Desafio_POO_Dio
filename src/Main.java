import dr.dio.desafio.dominio.Curso;
import dr.dio.desafio.dominio.Mentoria;

import javax.xml.crypto.Data;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Curso curso1 = new Curso("Curso de Java", "Como programar em Java", 10);
        Curso curso2 = new Curso("Curso de Ecma", "Como programar em JavaScript", 5);


        System.out.println(curso1);
        System.out.println(curso2);

        Mentoria mentoria1 = new Mentoria("Mentoria de Java", "Como decrarar as variáveis", LocalDate.now());

        System.out.println(mentoria1);

    }
}
