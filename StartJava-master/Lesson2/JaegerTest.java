
import java.util.Scanner;

public class JaegerTest {

    public static void main(String[] args) {
        Jaeger jaegerOne = new Jaeger();
        jaegerOne.setModelName("Tacit Ronin");
        Jaeger jaegerTwo = new Jaeger();
        jaegerTwo.setModelName("Crimson Typhoon");

        Scanner input = new Scanner(System.in);
        System.out.print("Write name of Jaeger: ");
        String modelName = input.nextLine();

        switch (modelName) {
            case "Tacit Ronin":
                System.out.println(jaegerOne.getModelName());
                
                jaegerOne.setMark("Mark-1");
                System.out.println("Mark:" + jaegerOne.getMark());
                
                jaegerOne.setStatus("Destroyed");
                String statusOne = jaegerOne.getStatus();
                System.out.println("Status:" + statusOne);
                
                jaegerOne.setOrigin("Japan");
                System.out.println("Origin:" + jaegerOne.getOrigin());
                
                jaegerOne.setHeight(74.37);
                System.out.println("Height(m):" + jaegerOne.getHeight());
                
                jaegerOne.setWeight(7.450);
                System.out.println("Weight(kg):" + jaegerOne.getWeight());
                break;
            case "Crimson Typhoon":                
                System.out.println(jaegerTwo.getModelName());

                jaegerTwo.setMark("Mark-1");
                System.out.println("Mark:" + jaegerTwo.getMark());

                jaegerOne.setStatus("Destroyed");
                String statusTwo = jaegerTwo.getStatus();
                System.out.println("Status:" + statusTwo);
                break;
            default:
                System.out.println("Error!!");
        }
    }

}
