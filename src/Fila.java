public class Fila {

    private  static Fila Instance;


    private Fila()
    {

    }

    public static Fila getInstance(){

        if (Instance == null)
            Instance = new Fila();
        return Instance;
    }
}
