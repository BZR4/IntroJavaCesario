public class SanBox {
    public static void main(String[] args) {
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
    }
}
