package Structural;

interface Image {
    void displayImage();
	}

// Real object
class RealImage implements Image {
    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk();
    }

    private void loadFromDisk() {
        System.out.println("Loading " + fileName);
    }

    @Override
    public void displayImage() {
        System.out.println("Displaying " + fileName);
    }
}

// Proxy object
class ProxyImage implements Image {
    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void displayImage() {
        if (realImage == null) {
            realImage = new RealImage(fileName);
        }
        realImage.displayImage();
    }
}
public class Proxy {

	public static void main(String[] args) {
		Image image1 = new ProxyImage("image1.jpg");
        Image image2 = new ProxyImage("image2.jpg");

        // Image will be loaded from disk and displayed
        image1.displayImage();

        // Image will not be loaded from disk again, but displayed directly
        image1.displayImage();

        // Image will be loaded from disk and displayed
        image2.displayImage();// TODO Auto-generated method stub

	}

}
//The Proxy design pattern is a structural pattern that provides an object that acts as a substitute for a real object, allowing us to control access to the real object.

//Here's an example of how you can implement the Proxy pattern in Java:


