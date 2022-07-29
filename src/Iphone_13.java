public class Iphone_13 extends Iphone{
    private String processor;

    public String getProcessor() {
        return processor;
    }

    public Iphone_13(Integer year, EnumColor color, Double displaySize, Camera camera, String processor) {
        super(year, color, displaySize, camera);
        this.processor = processor;
    }

    @Override
    public void makePhoto() {
        super.makePhoto();
        System.out.println("Бзк Бзк");
    }

    @Override
    public String toString() {
        return super.toString() + "\nprocessor - " + this.processor;
    }
}
