package software.ulpgc.kata3;

public class Main {

    public static void main(String[] args) {

        MainFrame mainFrame = new MainFrame();
        mainFrame.histogramDisplay().show(histogram());
        mainFrame.setVisible(true);

    }

    private static Histogram histogram() {

        return new Histogram() {
            @Override
            public int bins() {
                return 10;
            }

            @Override
            public double[] values() {
                return new double[]{12, 24, 5, 2, 3, 5, 6, 8, 12, 56, 34, 78, 98, 4, 6, 7,
                        19, 18, 27, 22, 34, 45, 65, 99, 90, 88, 78, 65, 76, 47};
            }
        };

    }

}
