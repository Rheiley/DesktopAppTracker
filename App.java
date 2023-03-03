import java.io.File;

public class App {
    // attributes
    private String filepath;
    private File file;
    private double elapsedMinutes;
    private int numberOfTimesOpened;
    private boolean isOpened;

    //constructors
    public App(String filepath){
        this.file = new File(filepath);
    }

    // getters & setters
    public String getFilepath() {
        return filepath;
    }
    public void setFilepath(String filepath) {
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
    public File getFile() {
        return file;
    }
    public File setFile(File file) {
        return this.file = file;
    }

    // methods


    





}
