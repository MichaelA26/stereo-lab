public class CDPlayer extends Component implements ICDPlayer {


    public void playSong(String song)
    {
         this.name = song;
    }

    public String getSong(){
        return this.name;
    }


}
