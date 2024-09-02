package una.ac.animales;

/**
 * Extiende de servivo y representa un insecto.
 */
public abstract class Insecto extends SerVivo {
    String nombre;
    int alas;
    int patas;
    String comida;
    Boolean carronia;

    /**
     * Constructor para inicializar un objeto Insecto.
     *
     * @param nombre El nombre del insecto.
     * @param alas El número de alas del insecto.
     * @param patas El número de patas del insecto.
     * @param comida El tipo de comida que el insecto consume.
     */
    public Insecto(String nombre, int alas, int patas, String comida) {
        this.nombre = nombre;
        this.carronia = false; // El insecto no empieza como carroña.
        this.alas = alas;
        this.patas = patas;
        this.comida = comida;
    }

    /**
     * Devuelve el nombre del insecto.
     *
     * @return El nombre del insecto.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Devuelve el número de alas que tiene el insecto.
     *
     * @return El número de alas.
     */
    public int getAlas() {
        return alas;
    }

    /**
     * Devuelve el número de patas que tiene el insecto.
     *
     * @return El número de patas.
     */
    public int getPatas() {
        return patas;
    }

    /**
     * Implementa la alimentación de SerVivo, si no es carroña puede comer.
     */
    @Override
    public void alimentarse() {
        if (!carronia) {
            System.out.println(nombre + " esta comiendo " + comida);
        } else {
            System.out.println("No puede comer porque es carronia.");
        }
    }

    /**
     * Simula la pérdida de una ala del insecto
     * y se verifica si se ha convertido en carronia.
     */
    public void perderAla() {
        if (alas >= 2) {
            alas--;
            System.out.println(nombre + " ha perdido un ala. Alas restantes: " + alas);
            verificarCarronia();
        }
    }

    /**
     * Simulaa la pérdida de una pata del insecto.
     * y se verifica si se ha convertido en carronia.
     */
    public void perderPata() {
        if (patas >= 2) {
            patas--;
            System.out.println(nombre + " ha perdido una pata. Patas restantes: " + patas);
            verificarCarronia();
        }
    }

    /**
     * Verifica si el insecto se ha convertido en carronia.
     * Si tiene menos de 2 alas y menos de 2 patas, se marca como carronia.
     */
    private void verificarCarronia() {
        if (alas < 2 && patas < 2) {
            carronia = true;
            System.out.println(nombre + " se ha convertido en carronia.");
        }
    }
}