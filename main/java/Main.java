public class Main {
  public static void main(String[] args) {
    Jogador j1 = new Jogador("Jorginho","10",10);
    Jogador j2 = new Jogador("Mateus","22",25);
    Time t1 = new Time("ABC","RN");

    t1.inserir(j1);
    t1.inserir(j2);

    System.out.println(t1.toString());
    t1.listar();
    System.out.println("Artilheiro: " + "\n" + t1.artilheiro());
    
  }
}