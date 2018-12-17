package BackEnd;

public class Points implements Proceeder{
    private int startPoint;
    private int endPoint;

    public Points(){
        this.startPoint = 0;
        this.endPoint = 0;
    }

    public Points(int start, int end){
        this.startPoint = start;
        this.endPoint = end;
    }

    public Points getPoints() {
        return new Points (this.startPoint, this.endPoint);
    }

    public int getStartPoint() {
        return startPoint;
    }

    public int getEndPoint() {
        return endPoint;
    }
}
