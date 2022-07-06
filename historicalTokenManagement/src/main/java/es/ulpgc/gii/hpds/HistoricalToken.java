package es.ulpgc.gii.hpds;

public class HistoricalToken
{
    private int state;

    public HistoricalToken() {
        this.state = 0;
    }

    public void changeState(){
        if (this.state == 0 /* undiscovered */){
            this.state = 1;
        } else if (this.state == 1 /* discovered */) {
            this.state = 2;
        } else if (this.state == 2 /* unstudied */){
            this.state = 3;
        } else {
            throw new RuntimeException("Lost state, Stolen state, or unknow state...");
        }
    }

    public void setLostState(){
        this.state = 4;
    }

    public void setStolenState(){
        this.state = 5;
    }

    public boolean isUnDiscovered(){
        return this.state == 0;
    }

    public boolean isDiscovered(){
        return this.state == 1;
    }

    public boolean isUnstudied(){
        return this.state == 2;
    }

    public boolean isCatalogued(){
        return this.state == 3;
    }

    public boolean isLost(){
        return this.state == 4;
    }

    public boolean isStolen(){
        return this.state == 5;
    }

}
