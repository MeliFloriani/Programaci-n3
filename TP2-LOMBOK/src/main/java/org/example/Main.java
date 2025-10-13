package org.example;
public class Main {
    public static void main(String[] args) {

        Usuario usuario1 = Usuario.builder()
                .id(1)
                .nombre("Meli Floriani")
                .email("meli@example.com")
                .build();

        Usuario usuario2 = Usuario.builder()
                .id(2)
                .nombre("Juan Pérez")
                .email("juanperez@example.com")
                .build();


        System.out.println(usuario1);
        System.out.println(usuario2);
    }
}
