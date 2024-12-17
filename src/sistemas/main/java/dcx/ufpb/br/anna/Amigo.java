package dcx.ufpb.br.anna;

import java.util.Objects;

public class Amigo {

private String nome;
private String email;
private String emailAmigoSorteado;

    public Amigo(String nome, String email, String emailAmigoSecreto) {
        this.nome = nome;
        this.email = email;
        this.emailAmigoSorteado = emailAmigoSecreto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmailAmigoSorteado() {
        return emailAmigoSorteado;
    }

    public void setAmigoSorteado(String emailAmigoSorteado) {
        this.emailAmigoSorteado = emailAmigoSorteado;
    }

    @Override
    public String toString() {
        return "Amigo{" +
                "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", emailAmigoSorteado='" + emailAmigoSorteado + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Amigo amigo = (Amigo) o;
        return Objects.equals(nome, amigo.nome) && Objects.equals(email, amigo.email) && Objects.equals(emailAmigoSorteado, amigo.emailAmigoSorteado);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, email, emailAmigoSorteado);
    }
}
