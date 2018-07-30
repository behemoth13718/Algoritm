public class erection {

    private static double erections(double chislo, int stepen){
        if (chislo == 0){
            if(stepen != 0)
                return 0;
            else
                    throw new IllegalArgumentException("Введите корректную степень для числа '0' не равную = " + stepen);
            }
        if (stepen <0){
            return 1/(chislo * erections(chislo,-stepen - 1));
        }
        else if(stepen > 0){
            return chislo * erections(chislo,stepen - 1);
        }
        else return 1;
    }

    public static void main(String[] args) {
        System.out.println(erections(5,5));
        System.out.println(erections(2,8));
        System.out.println(erections(3,7));
        System.out.println(erections(1,6));
        System.out.println(erections(0,0));
    }
}
