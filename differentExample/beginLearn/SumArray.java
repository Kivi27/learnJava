class SumArray {
    public static void main(String[] args) {
        // Simple program for init array and proccesing it 
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++)
        {
            array[i] = i + 1;
        }
        int summa = 0;
        for (int i = 0; i < array.length; i++)
        {
            summa += array[i];
        }
        System.out.println(summa);
    }
}