// Juan Melendres A00369017
public class Libro{

  // Atributos
  private String titulo; //t
  private String autor; //a
  private String editorial;//e
  private String isbn; //i

  //constructor por default
  public Libro(){

    titulo = "IOS Soluciones";
    autor = "Arturo";
    editorial= "Grill";
    isbn = "1633gdjd";

  }

  //constructor con parametros
  public Libro(String t, String a, String e, String i){

    titulo = t;
    autor = a;
    editorial= e;
    isbn = i;

  }

  //getters y setters de titulo
  public String getTitulo(){

    return titulo;

  }

  public void setTitulo(String t){

      titulo = t;

  }

  //getters y setters de autor
  public String getAutor(){

    return autor;

  }

  public void setAutor(String a){

      autor = a;

  }

  //getters y setters de editorial
  public String getEditorial(){

    return editorial;

  }

  public void setEditoral(String e){

      editorial = e;

  }

  //getters y setters de isbn
  public String getIsbn(){

    return isbn;

  }

  public void setIsbn(String i){

      isbn = i;

  }

}
