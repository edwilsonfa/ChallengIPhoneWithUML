import browser.Browser;
import phone.Phone;
import player.Player;

public class Device implements Browser, Phone, Player {


    @Override
    public void showPage() {
        System.out.println("Showing page...");
    }

    @Override
    public void addPage() {
        System.out.println("Adding page...");
    }

    @Override
    public void updatePage() {
        System.out.println("Updating page...");
    }

    @Override
    public void doCall() {
        System.out.println("Doing a call...");
    }

    @Override
    public void answerCall() {
        System.out.println("Answering a call...");
    }

    @Override
    public void startVoiceMail() {
        System.out.println("Starting a voice mail...");
    }

    @Override
    public void selectMusic() {
        System.out.println("Selecting a music...");
    }

    @Override
    public void playMusic() {
        System.out.println("Playing a music...");
    }

    @Override
    public void pauseMusic() {
        System.out.println("Pausing a music...");
    }
}
