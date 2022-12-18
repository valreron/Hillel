package lesson6.phone;

public class Iphone extends Phone implements Filming, Listening {
    @Override
    void receiveSms(String text) {
        System.out.println("Received sms on Iphone " + text);
    }

    @Override
    public void makePhoto() {
        initCamera();
        takeShot();
        closeCamera();
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

    private void initCamera() {
        System.out.println("Camera initialized");
    }

    private void takeShot() {
        System.out.println("click");
    }

    private void closeCamera() {
        System.out.println("Camera closed");
    }

}
