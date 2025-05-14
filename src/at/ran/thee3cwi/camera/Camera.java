package at.ran.thee3cwi.camera;

public class Camera {
    private String brand;
    private String model;
    private int resolution;

    public Camera(String brand, String model, int resolution) {
        this.brand = brand;
        this.model = model;
        this.resolution = resolution;
    }

    public File takePicture() {
        // here we go to the camera and take a picture
        return new File(1, 100);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getResolution() {
        return resolution;
    }

}
