public class remoteControl {

    public static void main(String[] args){

        smartTv smartTv = new smartTv();

        System.out.println("Estatus inicial da TV:");

        System.out.println(smartTv.tvOn ? "Tv on" : "Tv off");

        System.out.println("Channel:" + " " + smartTv.channel);

        System.out.println("Volume:" + " " + smartTv.volume);

        System.out.println( "Apertar botão de liga/desliga:");

        smartTv.pressPowerOn();

        System.out.println(smartTv.tvOn ? "Tv on" : "Tv off");

        System.out.println( "Apertar botão de canal +:");

        smartTv.pressChannelUp();
        smartTv.limitChannel();

        System.out.println("Channel:" + " " + smartTv.channel);

        System.out.println ("Escolher canal 999!");

        smartTv.changeChannel (999);
        smartTv.limitChannel();

        System.out.println("Channel:" + " " + smartTv.channel);

        System.out.println( "Apertar botão de canal +:");

        smartTv.pressChannelUp();
        smartTv.limitChannel();

        System.out.println("Channel:" + " " + smartTv.channel);

        System.out.println( "Apertar botão de canal -:");

        smartTv.pressChannelDown();
        smartTv.limitChannel();

        System.out.println("Channel:" + " " + smartTv.channel);

        System.out.println( "Apertar botão de canal -:");

        smartTv.pressChannelDown();
        smartTv.limitChannel();

        System.out.println("Channel:" + " " + smartTv.channel);

        System.out.println ("Apertar botão de voluma +:");

        smartTv.pressVomuleUp();
        smartTv.limitVolume();

        System.out.println("Volume:" + " " + smartTv.volume);

        System.out.println ("Apertar botão de voluma 13 vezes:");

        smartTv.pressVomuleUp();
        smartTv.pressVomuleUp();
        smartTv.pressVomuleUp();
        smartTv.pressVomuleUp();
        smartTv.pressVomuleUp();
        smartTv.pressVomuleUp();
        smartTv.pressVomuleUp();
        smartTv.pressVomuleUp();
        smartTv.pressVomuleUp();
        smartTv.pressVomuleUp();
        smartTv.pressVomuleUp();
        smartTv.pressVomuleUp();
        smartTv.pressVomuleUp();
        smartTv.limitVolume();

        System.out.println("Volume:" + " " + smartTv.volume);

        System.out.println ("Apertar botão de voluma +:");

        smartTv.pressVomuleUp();
        smartTv.limitVolume();

        System.out.println("Volume:" + " " + smartTv.volume);

        System.out.println ("Abaixar volume 25 vezes:");

        smartTv.pressVolumeDown();
        smartTv.pressVolumeDown();
        smartTv.pressVolumeDown();
        smartTv.pressVolumeDown();
        smartTv.pressVolumeDown();
        smartTv.pressVolumeDown();
        smartTv.pressVolumeDown();
        smartTv.pressVolumeDown();
        smartTv.pressVolumeDown();
        smartTv.pressVolumeDown();
        smartTv.pressVolumeDown();
        smartTv.pressVolumeDown();
        smartTv.pressVolumeDown();
        smartTv.pressVolumeDown();
        smartTv.pressVolumeDown();
        smartTv.pressVolumeDown();
        smartTv.pressVolumeDown();
        smartTv.pressVolumeDown();
        smartTv.pressVolumeDown();
        smartTv.pressVolumeDown();
        smartTv.pressVolumeDown();
        smartTv.pressVolumeDown();
        smartTv.pressVolumeDown();
        smartTv.pressVolumeDown();
        smartTv.pressVolumeDown();
        smartTv.limitVolume();

        System.out.println("Volume:" + " " + smartTv.volume);

        System.out.println ("Apertar botão de voluma -:");

        smartTv.pressChannelDown();
        smartTv.limitVolume();

        System.out.println("Volume:" + " " + smartTv.volume);

        System.out.println( "Apertar botão de liga/desliga:");

        smartTv.pressPowerOff();

        System.out.println(smartTv.tvOn ? "Tv on" : "Tv off");


    }

    
}
