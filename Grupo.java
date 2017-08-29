public class Grupo
{
    private String nomMateria;
    private Estudiante[] estudiantes;
    
    public Grupo(int totalEstudiantes, String nomMateria)
    {
        estudiantes = new Estudiante[totalEstudiantes];
        this.nomMateria = nomMateria;
    }
    
    
    //Terminar este metodo
    public void inscribir(Estudiante unEstudiante)
    {
        for(int i=0; i < estudiantes.length ; i++)
        {
            estudiantes[i] = unEstudiante;
        }

    }
    
    //agregar metodo para eliminar estudiante medio la clave 
    public void darBaja(int claveEstudiante)
    {
        //busca el numero de clave
        Estudiante eClave;
        for(int i=0; i < estudiantes.length; i++){
            if(claveEstudiante == estudiantes[i].getClave())
            {
                estudiantes[i] = null;
            }
            else{
                System.out.println("La clave no se encuentra");
            }
        }
        // y poner null en el espacio encontrado osea la clave
    }
    
    public int buscarEstudiante(int claveEstudiante)
    { 
        
    }
    
    
    
}
