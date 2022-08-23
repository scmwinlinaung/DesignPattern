package AdapterPatternTest;

public class PNGViewer implements AdvancedPhotoViewer{

	@Override
	public void openJPG(String filename) {
		// do nothing
	}

	@Override
	public void openPNG(String filename) {
		System.out.println("Open the png file name = " + filename);
		
	}
	

}
