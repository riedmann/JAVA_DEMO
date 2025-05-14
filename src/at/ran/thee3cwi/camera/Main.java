package at.ran.thee3cwi.camera;

public class Main {
    public static void main(String[] args) {
        Camera camera = new Camera("Canon", "EOS 5D", 24);
        SDCard sdCard = new SDCard(1000);
        Phone phone = new Phone(camera, sdCard);

        phone.takePicture();
        System.out.println("Free space: " + sdCard.getFreeSpace());
    }
}
