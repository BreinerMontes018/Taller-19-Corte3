package Taller19Poo.Ejercicio1;

public class AutenticacionLocal implements ServicioAutenticacion {
    @Override
    public boolean autenticar(String usuario, String contrasena) {
        return "usuarioLocal".equals(usuario) && "1234".equals(contrasena);
    }
}
