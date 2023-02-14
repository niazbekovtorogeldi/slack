public class Main {
    public static void main(String[] args) {
        Mother mother = new Mother("Anna", 34, "black");
        Mother mother1 =new Mother("janna", 22, "blue");
       Mother mother2= new Daughter("Sasha", 12, "black", "black", "white", 159);
       Daughter daughter = new Daughter("Aisha",13,"black","black","white",158);
       Mother [] Daughter ={mother,mother1,mother2,daughter};
       for (Mother a:Daughter) {
           System.out.println(a.gettName());

        }
        }

    }

