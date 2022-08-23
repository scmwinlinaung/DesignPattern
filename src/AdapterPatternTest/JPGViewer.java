package AdapterPatternTest;


public class JPGViewer implements AdvancedPhotoViewer{

	@Override
	public void openJPG(String filename) {
		System.out.println("Open the jpg file name = " + filename);
		
	}

	@Override
	public void openPNG(String filename) {
		// do nothing
		
	}
	
	
}
