package Clients;


public class Fidelity_Card {
    private int card_id ;
    private String owner;
    private double disc, points;

    public Fidelity_Card(int card_id, int points, String owner) {
        this.card_id = card_id;
        this.points = points;
        this.owner = owner;

        if(points >= 100)//daca pe cardul de fidelitate punctele sunt >= 100, clientul beneficiaza de o reducere de 10% la tot cosul de cump, apoi se reseteaza;
        {
            disc = 10;
            System.out.println("Congrats! You can use now your 10% discount!");
            setPoints(0);
        }
    }

    public int getCode() {
        return card_id;
    }

    public void setCode(int code) {
            this.card_id = card_id;
    }

    public double getPoints() {
        return points;
    }

    public void setPoints(double points) {
        this.points = points;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public double getDisc() {
        return disc;
    }

    public void setDisc(double disc) {
        this.disc = disc;
    }
}
