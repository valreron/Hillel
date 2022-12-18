package lesson6.phone;

public class Android extends Phone implements Listening, Filming {

    @Override
    void receiveSms(String text) {
        System.out.println("Received sms on Android " + text);
    }

    @Override
    public void makePhoto() {

    }

    @Override
    public void makeVideo() {

    }

    @Override
    public void listenToPodcast() {

    }

    @Override
    public void listenToTrack(String track) {
        System.out.println("listen to " + track);
    }
}
