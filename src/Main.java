import dr.dio.desafio.dominio.*;

import javax.xml.crypto.Data;
import java.time.LocalDate;
import java.util.concurrent.ConcurrentHashMap;

public class Main {

    public static void main(String[] args) {
        Curso curso1 = new Curso("Curso Java", "Curso de Java", 8);
        Curso curso2 = new Curso("Curso Ecma", "Curso de Ecma(JavaScript)", 4);

        Mentoria mentoria = new Mentoria("Mentoria de Java", "Mentoria sobre o curso de Java");

        BootCamp bootCamp = new BootCamp();
        bootCamp.setNome("BootCamp Java Developer");
        bootCamp.setDescricao("BootCamp Java Developer");
        bootCamp.getConteudos().add(curso1);
        bootCamp.getConteudos().add(curso2);
        bootCamp.getConteudos().add(mentoria);

        Dev dev1 = new Dev("Camila");
        dev1.inscreverBootCamp(bootCamp);
        System.out.println("Conteúdos Inscritos por " + dev1.getNome() +": " + dev1.getConteudosInscritos());
        dev1.progredir();
        dev1.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos por " + dev1.getNome() +": " + dev1.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos por " + dev1.getNome() +": " + dev1.getConteudosConcluidos());
        System.out.println("XP: " + dev1.calcularTotalXp());

        System.out.println("----------------------------------------------");

        Dev dev2 = new Dev("João");
        dev2.inscreverBootCamp(bootCamp);
        System.out.println("Conteúdos Inscritos por " + dev2.getNome() + ": " + dev2.getConteudosInscritos());
        dev2.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos por " + dev2.getNome() + ": " + dev2.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos por " + dev2.getNome() +": " + dev2.getConteudosConcluidos());
        System.out.println("XP: " + dev2.calcularTotalXp());


    }
}
