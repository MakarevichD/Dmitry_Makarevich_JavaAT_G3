package main.java.projects.boxing;

public class VesselBox<T extends Vessel> {

    public T[] cardboardBox = (T[]) new Object[9];
    public T[] plasticBox = (T[]) new Object[25];
    public T[] palletBox = (T[]) new Object[36];

    public T[] getCardboardBox() {
        return cardboardBox;
    }

    public void setCardboardBox(T[] cardboardBox) {
        this.cardboardBox = cardboardBox;
    }

    public T[] getPlasticBox() {
        return plasticBox;
    }

    public void setPlasticBox(T[] plasticBox) {
        this.plasticBox = plasticBox;
    }

    public T[] getPalletBox() {
        return palletBox;
    }

    public void setPalletBox(T[] palletBox) {
        this.palletBox = palletBox;
    }
}
