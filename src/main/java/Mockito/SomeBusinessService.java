package Mockito;

public class SomeBusinessService {
    private DataService dataService;

    public SomeBusinessService(DataService dataService) {
        this.dataService = dataService;
    }

    public int findMaxValue() {
        int[] data = dataService.getAllData();
        int result = 0;

        for(int i : data) {
            if(i > Integer.MIN_VALUE) {
                result = i;
            }
        }

        return result;
    }
}
