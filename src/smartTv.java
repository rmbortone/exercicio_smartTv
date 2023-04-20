
public class smartTv {

    boolean tvOn = false; 

    int channel = 1;
    final int channelMinor = 1;
    final int channelBiggest = 999;

    int volume = 11;
    final int volumeMinor = 0;
    final int volumeBiggest = 25;

    public void pressPowerOn() {
        tvOn = true;
    }
    public void pressPowerOff() {
         tvOn = false;
    }
    public void pressChannelUp (){
        channel ++;
    }
    public void pressChannelDown (){
        channel --;
   }
   public void changeChannel (int newChannel){
    channel = newChannel;
   }
    public void limitChannel (){
        if ( channel < channelMinor ){
             channel = 999;
        }
        else if (channel > channelBiggest){
             channel = 1;
        }
    }
    public void pressVomuleUp (){
        volume ++;
   }
   public void pressVolumeDown (){
        volume --;
  }
   public void limitVolume (){
       if ( volume < volumeMinor ){
            volume = 0;
       }
       else if (volume > volumeBiggest){
            volume = 25;
       }
   }
   public void pressMute (){
    volume = 0;
   }
}

    
