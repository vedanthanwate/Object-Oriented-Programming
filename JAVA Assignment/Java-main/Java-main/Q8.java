// Interface
interface Filterable {
    void apply_filter(String filter_type);
    void reset_filter();
}

// ImageProcessor class
class ImageProcessor implements Filterable {

    @Override
    public void apply_filter(String filter_type) {
        System.out.println("Applying " + filter_type + " filter to image.");
    }

    @Override
    public void reset_filter() {
        System.out.println("Image filter reset to original.");
    }
}

// DataAnalyzer class
class DataAnalyzer implements Filterable {

    @Override
    public void apply_filter(String filter_type) {
        System.out.println("Applying " + filter_type + " filter to dataset.");
    }

    @Override
    public void reset_filter() {
        System.out.println("Data filters cleared.");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        // Creating objects
        Filterable img = new ImageProcessor();
        Filterable data = new DataAnalyzer();

        // Using ImageProcessor
        img.apply_filter("Blur");
        img.reset_filter();

        // Using DataAnalyzer
        data.apply_filter("Outlier Removal");
        data.reset_filter();
    }
}