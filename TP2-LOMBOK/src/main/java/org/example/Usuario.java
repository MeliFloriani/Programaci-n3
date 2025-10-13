package org.example;

import lombok.Data;
import lombok.Builder;

@Data
@Builder
public class Usuario {
    private int id;
    private String nombre;
    private String email;
}

