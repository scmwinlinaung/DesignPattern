package AdapterPatternTest;

public class Main {
	  public static void main(String[] args) {
	      ImageViewer imageViewer = new ImageViewer();

	      imageViewer.open("jpg", "myPhoto1.jpg");
	      imageViewer.open("png", "myPhoto2.png");
	      imageViewer.open("gif", "myPhoto3.gif");
	   }
}
