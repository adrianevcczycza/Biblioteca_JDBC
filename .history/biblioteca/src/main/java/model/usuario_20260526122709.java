package model;

public class usuario {

    private Long id;

    private String nome;

    private String email;

    public usuario(Long id, String nome, String email) {
        this.id = id;
        this.nome = nome;
        this.email = email;
    }

    public usuario(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }



}
