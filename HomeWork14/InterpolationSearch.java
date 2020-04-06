package HomeWork14;

public class InterpolationSearch {


    public int interpolationSearch(int needToFind, int[] someArray) {
        int min = 0;
        int max = someArray.length - 1;
        int target;
        while (true) {
            target = min + (needToFind - someArray[min]) * (max - min) / (someArray[max] - someArray[min]);
            if (someArray[target] == needToFind) {
                return target;
            } else {
                if (someArray[target] > needToFind) {
                    max = target - 1;

                } else {
                    min = target + 1;
                }
            }


        }
    }
}
