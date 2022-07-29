public class Iphone extends Phone{
    private Double displaySize;

    private Camera camera;

    public Iphone(Integer year, EnumColor color, Double displaySize, Camera camera) {
        super(year, color);
        this.displaySize = displaySize;
        this.camera = camera;
    }

    public Camera getCamera() {
        return camera;
    }

    public Double getDisplaySize() {
        return displaySize;
    }

    @Override
    public String toString() {
        return super.toString() + "\ndisplay size - " + displaySize + "\ncamera - " + camera.getCamera();
    }
}
