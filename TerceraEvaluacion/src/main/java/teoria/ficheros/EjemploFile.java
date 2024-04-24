package teoria.ficheros;

import java.io.File;
import java.io.IOException;

public class EjemploFile {
    public static void main(String[] args) {
        // Este método nos dice que carácter separador hay en las rutas
        System.out.println(File.separator);

        //Creamos un objeto de tipo file pasándole la ruta en la que se encuentra ese fichero
        // Truco para averiguar la ruta relativa: empezamos con la ruta absoluta y vamos quitando hasta que exist() devuelve true, será donde empieza el proyecto.
        String ruta = "TerceraEvaluacion\\src\\main\\java\\teoria\\ficheros\\";
        File fichero = new File(ruta + "fichero.txt");

        // Queremos comprobar que ese fichero existe
        System.out.println("El fichero existe: " + fichero.exists());

        //Ahora vamos a probar con el fichero java
        File otroFichero = new File(ruta + "EjemploFile.java");

        System.out.println("El fichero existe: " + otroFichero.exists());

        System.out.println("Con la clase File podemos acceder a las propiedades del fichero");
        //Para sacar la ruta absoluta
        System.out.println("Ruta absoluta: " + fichero.getAbsolutePath());

        //¿Se puede leer?
        System.out.println("Se puede leer(r): " + fichero.canRead());

        //¿Se puede escribir?
        System.out.println("Se puede escribir(w): " + fichero.canWrite());

        //¿Se puede ejecutar?
        System.out.println("Se puede ejecutar(x): " + fichero.canExecute());

        //Última modificación
        System.out.println("Fecha de última modificación: " + fichero.lastModified());


        System.out.println("\n\nCon la clase File podemos gestionar ficheros");

        File ficheroNuevo = new File(ruta + "ficheroNuevo.txt");
        // para crear el fichero tengo que utilizar el método createNewFile -> devuelve un boolean, que es interesante comprobar
        try{
            // lo meto en el try porque a lo mejor no se crea el fichero y se produce un error
            boolean creado = ficheroNuevo.createNewFile();
            if (creado) {
                System.out.println("Fichero creado correctamente");
            } else {
                if (ficheroNuevo.exists()){
                    System.out.println("El fichero ya existe");
                }
            }
        } catch (IOException excepcionES){
            System.out.println("No se ha podido crear el fichero" + excepcionES.getMessage());
        }

        System.out.println("\n\nTambién podemos eliminar ficheros");
        boolean borrado = ficheroNuevo.delete();
        if (borrado){
            System.out.println("Fichero eliminado correctamente");
        } else{
            System.out.println("El fichero no se ha podido eliminar");
        }


        // CREAR UN DIRECTORIO (CARPETA)
        // 1) Primero, creámos la ruta a partir de la cual queremos crear ese directorio
        // estoy ya lo tenemos más arriba en la variable String ruta

        try{
            File directorio = new File(ruta + "carpeta");
            boolean creada = directorio.mkdir();
            if (creada){
                System.out.println("Carpeta creada.");
            } else {
                System.out.println("No se ha podido crear el directorio, probablemente ya exista");
            }
        } catch (Exception e){
            System.out.println("Ha ocurrido una excepción" + e.getMessage());
        }

        //RENOMBRAR: EN LINUX mv sirve para renombrar o cambiar al fichero de sitio. Porque en realidad para el sistema operativo el nombre de cada fichero es su ruta completa.
        // Aqui es igual pero con el método renameTo
        //Ejemplo: vamos a renombrar fichero.txt
        try {
            // 1) Creo un objeto File con el nuevo nombre
            File nuevoNombre = new File(ruta + "fichero.md");
            // 2) Creo un objeto file con el fichero en su sitio o con su nombre actual
            File nombreActual = new File(ruta + "fichero.txt");
            // 3) Renombramos el fichero asi
            boolean renombrado = nombreActual.renameTo(nuevoNombre);
            if (renombrado){
                System.out.println("Nombre cambiado");
            } else {
                System.out.println("No se ha podido renombrar");
            }
        } catch (Exception e){
            System.out.println("Ha ocurrido un excepción " + e.getMessage());
        }

        // Vamos a meter ese fichero en la carpeta
        try{
            // 1) Objeto con la nueva ruta
            File nuevoSitio = new File(ruta + "carpeta\\fichero.md");
            // 2) creo un objeto file con el fichero en su sitio o con su nombre actual
            File objetoFicheroActual = new File(ruta + "fichero.md");
            boolean movido = objetoFicheroActual.renameTo(nuevoSitio);
            if (movido){
                System.out.println("Fichero reubicado");
            } else {
                System.out.println("No se ha podido mover");
            }
        } catch (Exception e){
            System.out.println("Ha ocurrido una excepción " + e.getMessage());
        }

    }
}
