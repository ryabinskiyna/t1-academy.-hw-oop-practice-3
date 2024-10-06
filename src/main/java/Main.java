import java.util.List;

public class Main {
    public static void main(String[] args) {
        PolyLine polyline = new PolyLine(new Point(1, 5), new Point(2, 8), new Point(5, 3), new Point(8, 9));

        double polylineLength = polyline.getLength();
        System.out.println("Длина ломаной: " + polylineLength);

        List<Line> lines = polyline.getLines();
        for (Line line : lines) {
            System.out.println(line);
        }

        double linesTotalLength = 0;
        for (Line line : lines) {
            linesTotalLength += line.getLength();
        }
        System.out.println("Длина массива линий: " + linesTotalLength);

        System.out.println("Длины совпадают: " + (polylineLength == linesTotalLength));

        polyline.getLines().get(0).getEnd().setX(12);

        System.out.println("Измененная ломаная: " + polyline);
        for (Line line : lines) {
            System.out.println(line);
        }

        double newPolylineLength = polyline.getLength();
        System.out.println("Длина измененной ломаной: " + newPolylineLength);
    }
}
