package una.ac.animales;

public abstract class Insecto extends SerVivo {
    String nombre;
    int alas;
    int patas;
    String comida;
    Boolean carronia;

    Insecto(String nombre, int alas, int patas, String comida) {
        this.nombre = nombre;
        this.carronia = false;
        this.alas = alas;
        this.patas = patas;
        this.comida = comida;
    }

    public String getNombre() {
        return nombre;
    }

    public int getAlas() {
        return alas;
    }

    public int getPatas() {
        return patas;
    }

    public void alimentarse() {
        if (!carronia) {
            System.out.println(nombre + " esta comiendo " + comida);
        } else {
            System.out.println("No puede comer porque es carronia.");
        }
    }

    public void perderAla() {
        if (alas > 0) {
            alas--;
            System.out.println(nombre + " ha perdido un ala. Alas restantes: " + alas);
            verificarCarronia();
        }
    }

    public void perderPata() {
        if (patas > 0) {
            patas--;
            System.out.println(nombre + " ha perdido una pata. Patas restantes: " + patas);
            verificarCarronia();
        }
    }
    private void verificarCarronia() {
        if (alas < 2 && patas < 2) {
            carronia = true;
            System.out.println(nombre + " se ha convertido en carronia.");
        }
    }
}