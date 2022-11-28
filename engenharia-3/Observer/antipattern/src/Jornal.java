package antipattern;

public class Jornal 
{ 

  
	private String titulo;
	private String data_publicacao;

	public  Newlestter(String titulo, String data_publicacao) {
		super();
		this.titulo = titulo;
		this.data_publicacao = data_publicacao;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getData_publicacao() {
		return data_publicacao;
	}

	public void setData_publicacao(String data_publicacao) {
		this.data_publicacao = data_publicacao;
	}

	public void setInfo(String titulo,  String data_publicacao) {
		this.titulo = titulo;
		this.data_publicacao = data_publicacao;

		Noticia.mandarNoticia(titulo, data_publicacao);

	}

    @Override
	public String toString() {
		return "\nT�tulo: " + titulo + "\nData de publica��o: " + data_publicacao;

	}

}


