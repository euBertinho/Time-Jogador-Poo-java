import java.util.ArrayList;

public class Time{
  private String nome;
  private String estado;
  private ArrayList<Jogador> jogadores = new ArrayList<>();

  public Time(String nome, String estado){
    this.nome = nome;
    this.estado = estado;
  }
  
  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getEstado() {
    return estado;
  }

  public void setEstado(String estado) {
    this.estado = estado;
  }

  public ArrayList<Jogador> getJogadores() {
    return jogadores;
  }

  public void setJogadores(ArrayList<Jogador> jogadores) {
    this.jogadores = jogadores;
  }

  public void inserir(Jogador jogador){
    this.jogadores.add(jogador);
  }

  public void listar(){
    if (jogadores.isEmpty()){
      System.out.println("Lista vazia!");
    }else{
      System.out.println("Jogadores: ");
      for (Jogador jogador : jogadores){
        System.out.println("- " + jogador);
        System.out.println();
      }
    }
  }

  public Jogador artilheiro(){
    Jogador artilheiro = jogadores.get(0);
    
    for(int i = 1; i < jogadores.size(); i++){
      Jogador jogadorAtual = jogadores.get(i);
      if (jogadorAtual.getGols() > artilheiro.getGols()){
        artilheiro = jogadorAtual;
      }
    }
    return artilheiro;
  }

  @Override
  public String toString(){
    return "Time: " + nome + "\n" +
           "Estado: " + estado + "\n";
  }
  
}