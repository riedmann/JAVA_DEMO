package at.ran.thee3cwi.camera;

public class Phone {
    private Camera camera;
    private SDCard sdCard;

    public Phone(Camera camera, SDCard sdCard) {
        this.camera = camera;
        this.sdCard = sdCard;
    }

    public void takePicture() {
        File file = camera.takePicture();

    }

    public Camera getCamera() {
        return camera;
    }

    public SDCard getSdCard() {
        return sdCard;
    }

}
