public class Daughter extends Mother {
     private String  hair;
     private String color;
     private int heigh;

    public Daughter(String  name, int age, String  eyecolor, String hair, String color, int heigh) {
        super(name, age, eyecolor);
        this.hair = hair;
        this.color = color;
        this.heigh = heigh;
    }

    public void setHair(String hair) {
        this.hair = hair;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getHeigh() {
        return heigh;
    }

    public void setHeigh(int heigh) {
        this.heigh = heigh;
    }

    @Override
    public String gettName() {
        return getName()+"this is daughter:";
    }

    public String getHair(){
         return getHair();
     }

    @Override
    public String toString() {
        return "Daughter{" +
                "hair='" + hair + '\'' +
                ", color='" + color + '\'' +
                ", heigh=" + heigh +
                '}';
    }
}
