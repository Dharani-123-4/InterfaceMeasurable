public class MeasurementUtil {
    public static double average(Measurable[] objects) {
        double sum = 0;
        for (Measurable obj : objects) {
            sum += obj.getMeasure();
        }
        return sum / objects.length;
    }

    public static Measurable largest(Measurable[] objects) {
        Measurable largest = objects[0];
        for (Measurable obj : objects) {
            if (obj.getMeasure() > largest.getMeasure()) {
                largest = obj;
            }
        }
        return largest;
    }
}
