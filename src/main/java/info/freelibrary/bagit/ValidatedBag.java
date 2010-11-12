package info.freelibrary.bagit;

import java.io.File;
import java.io.IOException;

public class ValidatedBag {
	
	private Bag myBag;
	
	ValidatedBag(Bag aBag) {
		aBag.validate();
		myBag = aBag;
	}
	
	public File toTarBZip2() throws IOException {
		return BagPackager.toTarBZip2(myBag);
	}
	
	public File save() throws IOException {
		return myBag.save();
	}
	
	public File toTar() throws IOException {
		return BagPackager.toTar(myBag);
	}
	
	public File toTarGz() throws IOException {
		return BagPackager.toTarGz(myBag);
	}
	
	public File toZip() throws IOException {
		return BagPackager.toZip(myBag);
	}
	
	protected void cleanUp() {
		myBag.cleanUp();
	}
}
