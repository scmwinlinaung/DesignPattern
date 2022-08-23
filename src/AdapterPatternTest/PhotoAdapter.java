package AdapterPatternTest;

public class PhotoAdapter implements PhotoViewer{

	   AdvancedPhotoViewer advancedPhotoViewer;

	   public PhotoAdapter(String photoType){
	   
	      if(photoType.equalsIgnoreCase("jpg") ){
	    	  advancedPhotoViewer = new JPGViewer();			
	         
	      }else if (photoType.equalsIgnoreCase("png")){
	    	  advancedPhotoViewer = new PNGViewer();
	      }	
	   }


	@Override
	public void open(String photoType, String filename) {
		 if(photoType.equalsIgnoreCase("jpg")){
	         advancedPhotoViewer.openJPG(filename);
	      }
	      else if(photoType.equalsIgnoreCase("png")){
	         advancedPhotoViewer.openPNG(filename);
	      }
		
	}
	
}
