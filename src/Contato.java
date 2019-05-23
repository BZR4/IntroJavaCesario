public class Contato {
    private String nome;
    private String sobrenome;
    private String telefone;
    private String email;
    private String endereco;
    private String telefoneResidencial;
    private String Empresa;

    public Contato(String nome, String telefone, String email) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefoneResidencial() {
        return telefoneResidencial;
    }

    public void setTelefoneResidencial(String telefoneResidencial) {
        this.telefoneResidencial = telefoneResidencial;
    }

    public String getEmpresa() {
        return Empresa;
    }

    public void setEmpresa(String empresa) {
        Empresa = empresa;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String exibirNomeCompleto(){
        return String.format("%s %s",nome, sobrenome);
    }
    public String exibirNomeCompletoCaixaAlta(){
        return exibirNomeCompleto().toUpperCase();
    }

    public String exibirNomeCompletoPrimeiroSobrenome(){
        return String.format("%s, %s",sobrenome,nome);
    }

    public void exibirDadosContato(){
        System.out.println("Nome: "+nome);
        System.out.println("Email: "+email);
        System.out.println("Telefone: "+telefone);
        System.out.println("Endereço: "+(endereco == null ? "Não informado" : endereco));
        System.out.println("Telefone Residencial: "+(telefoneResidencial == null ? "Não informado" : telefoneResidencial));
        System.out.println("Empresa: "+(getEmpresa() ==  null ? "Não informado" : getEmpresa()));
    }

    @Override
    public String toString() {
        return "Contato{" +
                "nome='" + nome + '\'' +
                ", telefone='" + telefone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
