public class Main {
    public static void main(String[] args) {
        Camera cameraA = new Camera("Default camera");
        Iphone objectA = new Iphone(2010, EnumColor.WHITE, 4.6, cameraA);

        Camera cameraB = new Camera("Mega camera");
        Iphone_13 objectB = new Iphone_13(2022, EnumColor.PURPLE, 6.1, cameraB, "A15");

        Camera cameraC = new Camera("Ultra camera");
        Iphone objectC = new Iphone(2022, EnumColor.YELLOW, 6.1, cameraC);

        System.out.println(objectA.toString());
        System.out.println(objectB.toString());
        objectB.makePhoto();
        System.out.println(objectC.toString());
        objectC.makePhoto("Вжух Вжух");
    }
}