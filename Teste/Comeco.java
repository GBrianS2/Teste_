public class Comeco {

    public static void main(String[] args) {
       
        Ficha personagem_1 = new Ficha("Alucard", 1000, 'M', "Vampiro");
        Ficha personagem_2 = new Ficha("Pedro", 19, 'M', "Draconideo");
        Ficha personagem_3 = new Ficha("Demon", 2000, 'M', "Demonio");
        Ficha personagem_4 = new Ficha("Thais Carla", 26, 'F', "Blastoise");
        Ficha personagem_5 = new Ficha("Beatrix", 40, 'F', "Succubus");

        personagem_1.mostrarDados();
        personagem_2.mostrarDados();
        personagem_3.mostrarDados();
        personagem_4.mostrarDados();
        personagem_5.mostrarDados();
    }
}

















//(Aloca na memória um novo objeto) = (criar um objeto novo) e retorna uma referência desse objeto