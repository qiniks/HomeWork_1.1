import java.awt.*;

public class Phone {
    private Integer year;

    private EnumColor color;



    public Integer getYear() {
        return year;
    }

    public Phone(Integer year, EnumColor color) {
        this.year = year;
        this.color = color;
    }

    public void makePhoto(){
        System.out.println("Шк Шк");
    }

    public void makePhoto(String photo){
        System.out.println(photo);
    }

    public EnumColor getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "\nPhone:" +
                " \nyear - " + year +
                "\ncolor - " + this.color;
    }
}
