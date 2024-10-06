import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class PolyLine {
    private final List<Point> points = new ArrayList<>();

    public PolyLine() {
    }

    public PolyLine(Point... initialPoints) {
        Collections.addAll(points, initialPoints);
    }

    public void addPoint(Point point) {
        points.add(point);
    }

    public double getLength() {
        double totalLength = 0;
        List<Line> lines = getLines();
        for (Line line : lines) {
            totalLength += line.getLength();
        }
        return totalLength;
    }

    public List<Line> getLines() {
        List<Line> lines = new ArrayList<>();
        for (int i = 0; i < points.size() - 1; i++) {
            lines.add(new Line(points.get(i), points.get(i + 1)));
        }
        return lines;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Линия [");
        for (int i = 0; i < points.size(); i++) {
            sb.append(points.get(i));
            if (i < points.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}