public class UsaLibro{

  public static void main(String[] args) {

    Libro uno = new Libro();
    Libro dos = new Libro("hp","Francisco","Saraga","326dgoqeh");

    dos.setTitulo("matematicas");
    dos.setAutor("Juan");
    dos.setEditoral("Grill");
    dos.setIsbn("152532425sdhakd");

    String l2 = dos.getTitulo();
    String l3 = dos.getAutor();
    String l4 = dos.getEditorial();
    String l5 = dos.getIsbn();

    System.out.println(l2 + "," + l3 + "," + l4 + "," + l5);

  }
  
}
