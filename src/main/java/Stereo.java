public class Stereo extends Component implements IConnect, IRadio, ICDPlayer, IRecordPlayer{

    public String tuneStation(String station){
        return this.name = station;
    }

    public void playSong(String song) {
        this.name = song;
    }
}
