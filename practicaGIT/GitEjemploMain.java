package pkgGitHub;

/**
 *
 * @author mfb
 */
public class GitEjemploMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Clase principal del programa
        System.out.println("Estoy en la clase Main");
        GitAux git = new GitAux();
        
        // Llamamos a los metodos del la clase auxiliar
        git.metodoAlumno1();
        git.metodoAlumno2();
        git.metodoAlumno3();
        git.metodoComunitario();
                     
    }
    
}
