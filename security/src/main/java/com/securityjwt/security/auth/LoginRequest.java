package com.securityjwt.security.auth;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data //Crear getters y setters
@Builder //Construir los objetos de manera limpia
@AllArgsConstructor //Nos evita tener que estar creando nosotros todos los constructores
@NoArgsConstructor
public class LoginRequest {
    String username;
    String password; 
}
