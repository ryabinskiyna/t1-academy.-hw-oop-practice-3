class Line {
    private final Point start;
    private final Point end;

    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    public Line(int x1, int y1, int x2, int y2) {
        this.start = new Point(x1, y1);
        this.end = new Point(x2, y2);
    }

    @Override
    public String toString() {
        return "Линия от " + start.toString() + " до " + end.toString();
    }

    public double getLength() {
        int dx = end.getX() - start.getX();
        int dy = end.getY() - start.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }

    public Point getStart() {
        return start;
    }

    public Point getEnd() {
        return end;
    }
}