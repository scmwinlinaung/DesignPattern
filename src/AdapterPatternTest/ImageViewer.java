package AdapterPatternTest;

public class ImageViewer implements PhotoViewer{
	PhotoAdapter photoAdapter;

	@Override
	public void open(String photoType, String filename) {

	      //photoAdapter is providing support to play other file formats
	     if(photoType.equalsIgnoreCase("jpg") || photoType.equalsIgnoreCase("png")){
	         photoAdapter = new PhotoAdapter(photoType);
	         photoAdapter.open(photoType, filename);
	      }
	      
	      else{
	         System.out.println("Invalid image. " + photoType + " format not supported");
	      }
		
	}

}
