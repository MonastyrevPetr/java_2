package hw2;

public class Main {
    public static void main(String[] args) {
        String[][] arr = {
                {"12", "34", "-12", "34"},
                {"23", "one", "78", "20"},
                {"567", "yu", " 89", "554"},
                {"2", "45", "78"}
        };
        String[][] arr2 = {
                {"12", "34", "-12", "34"},
                {"23", "one", "78", "20"},
                {"567", "yu", " 89", "554"},
                {"7890", "2", "45", "78"}
        };
        String[][] arr3 = {
                {"-12", "-34", "-12", "34"},
                {"23", "1", "78", "20"},
                {"567", "34", "89", "554"},
                {"-7890", "2", "45", "78"}
        };
        try {
            System.out.println(sum(arr3));
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        }

    }

    public static long sum(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        if (arr.length != 4) {
            throw new MyArraySizeException("Неверный размер массива");
        }
        for (int i = 0; i < 4; i++) {
            if (arr[i].length != 4) {
                throw new MyArraySizeException("Неверный размер массива");
            }
        }
        long summa = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                try {
                    summa += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Неправильный аргумент в " + i + " " + j);
                }
            }
        }
        return summa;
    }
}
