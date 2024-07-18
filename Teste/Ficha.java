class Ficha {
    String nome;
    int idade;
    char sexo;
    String raca; //Variável que armazena a raça.

    public Ficha(String nome, int idade, char sexo, String raca) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.raca = raca;
    }

    public void andar() {
        System.out.println("O personagem andou");
    } 
    
    public void falar() {
        System.out.println("O personagem " + this.nome + " tem " + this.idade + " anos" + " e fez sexo com um " + this.sexo );
    }

    public void mostrarDados() {
        System.out.println("------------------");
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Sexo: " + this.sexo);
        System.out.println("Raça: " + this.raca);
    }
}



/*
    //String = Tipo de dado = Texto
    
*/