public class Jogador{
  private String nome;
  private String camisa;
  private int gols;

  public Jogador(String nome, String camisa, int gols){
    this.nome = nome;
    this.camisa = camisa;
    this.gols = gols;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getCamisa() {
    return camisa;
  }

  public void setCamisa(String camisa) {
    this.camisa = camisa;
  }

  public int getGols() {
    return gols;
  }

  public void setGols(int gols) {
    this.gols = gols;
  }

@Override
  public String toString(){
    return "Nome: " + nome + "\n" + 
           "• Camisa: " + camisa + "\n" +
           "• Gols: " + gols;
  } 
}