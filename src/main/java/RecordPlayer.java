public class RecordPlayer extends Component implements IRecordPlayer {

    public void playSong(String song){
        this.name = song;
    }

    public String getSong(String song){
        return this.name;
    }
}
