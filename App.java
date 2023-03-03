import java.io.File;

public class App {
    private File filepath;
    private double elapsedMinutes;
    private int numberOfTimesOpened;
    private boolean isOpened;
    public File getFilepath() {
        return filepath;
    }
    public void setFilepath(File filepath) {
        this.filepath = filepath;
    }
    public double getElapsedMinutes() {
        return elapsedMinutes;
    }
    public void setElapsedMinutes(double elapsedMinutes) {
        this.elapsedMinutes = elapsedMinutes;
    }
    public int getNumberOfTimesOpened() {
        return numberOfTimesOpened;
    }
    public void setNumberOfTimesOpened(int numberOfTimesOpened) {
        this.numberOfTimesOpened = numberOfTimesOpened;
    }
    public boolean isOpened() {
        return isOpened;
    }
    public void setOpened(boolean isOpened) {
        this.isOpened = isOpened;
    }





}
