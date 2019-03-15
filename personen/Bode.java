package personen;

import data.Dienst;

public class Bode extends Persoon implements BodeInterface {
    private int kantoor;

    @Override
    public void setKantoor(int kantoor) {
        this.kantoor = kantoor;
    }
    
    @Override
    public String StelVriendelijkeVraag() {
        return Dienst.getAntwoord();
    }
}
