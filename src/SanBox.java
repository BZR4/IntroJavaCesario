import java.util.Arrays;
import java.util.List;

public class SanBox {
    public static void main(String[] args) {

        Contato celoto = new Contato("Fernado","Celoto","99999-7777",
                "celoto@gmail.com","Alberto Feres");
        Contato dias = new Contato("Thiago","Dias","99999-7777",
                "celoto@gmail.com","Alberto Feres");
        Contato mendes = new Contato("Thiago","Mendes","99999-6666",
                "dias@gmail.com","Alberto Feres");
        Contato emerson = new Contato("Emerson","Gaino","99999-5555",
                "emerson@gmail.com","Alberto Feres");
        Contato paulo = new Contato("Paulo","Cavalli","99999-4444",
                "paulo@gmail.com","Alberto Feres");
        Contato carlao = new  Contato("Carlao","Fenandes","77777-8888","carlao@gmail.com","Designer");

        List<Contato> contatos = Arrays.asList(
                celoto, dias, mendes,emerson,paulo,carlao
        );

        contatos.forEach(c -> System.out.println(c.getNome()));
        
        /*
        float soma = Matematica.somar(200, 567);
        float diferenca = Matematica.subtrair(897, 323);
        float produto = Matematica.multiplicar(67, 23);
        float quociente = Matematica.dividir(890, 5);

        System.out.println(soma);
        System.out.println(diferenca);
        System.out.println(produto);
        System.out.println(quociente);


        Contato c1 = new Contato("Thiago Mendes",
                "99988-5566","tgm@gmail.com");

        Contato c2 = new Contato("Guilherme",
                "88877-1234","gui@gmail.com");
        c1.setNome("Thiago");
        c1.setSobrenome("Goncalves Mendes");
        System.out.println(c1);
        c2.setNome("Guilherme");
        c2.setSobrenome("Concolacao Dias");
        System.out.println(c2);
        c1.exibirDadosContato();

        System.out.println(c1.exibirNomeCompleto());
        System.out.println(c1.exibirNomeCompletoPrimeiroSobrenome());

         */
    }
}
