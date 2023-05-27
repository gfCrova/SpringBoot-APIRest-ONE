package med.voll.api.controller;

import jakarta.validation.Valid;
import med.voll.api.domain.usuarios.DatosAutenticacionUsuario;
import med.voll.api.domain.usuarios.Usuario;
import med.voll.api.infra.security.DatosJWTtoken;
import med.voll.api.infra.security.TokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/login")
public class AutenticacionController {

    @Autowired
    private AuthenticationManager manager;

    @Autowired
    private TokenService tokenService;

    @PostMapping
    public ResponseEntity  realizarLogin(@RequestBody @Valid DatosAutenticacionUsuario datos) {
        var authenticationToken = new UsernamePasswordAuthenticationToken(datos.login(), datos.clave());
        var authentication = manager.authenticate(authenticationToken);

        var tokenJWT = tokenService.generarToken((Usuario) authentication.getPrincipal());

        return ResponseEntity.ok(new DatosJWTtoken(tokenJWT));
    }

}
