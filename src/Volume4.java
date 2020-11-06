public class Volume4 {
    public static void main(String[] args){
        double radius = 10;
        double height = 7;

        double volume = Math.PI * Math.pow(radius, 2) * height;
        double square = 2 * Math.PI * radius * (radius + height);

        System.out.println("volume: " + volume);
        System.out.println("square: " + square);

    }
}
