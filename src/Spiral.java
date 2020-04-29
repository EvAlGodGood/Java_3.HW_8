//Задать размерность матрицы от 5 до 7
//Создать матрицу с указанной размерностью
//Заполнить матрицу по спирали (числа увеличиваются на 1) (число начинается с 1)

public class Spiral {
    public static void main(String[] args) {
        int len = 5;
        int[][] mass1 = new int[len][len];
        int count = 0;
        for (int i = 0; i < len; i++){// Для наглядности выведем прямой порядок
            for (int j = 0; j < len; j++){
                count++;
                mass1[i][j]=count;
                System.out.print(count + "\t");
            }
            System.out.println();
        }
        System.out.println();
        
        //начальные позиции "челнока"
        int jmin=0;
        int imin=1;
        int jmax=len-1;
        int imax=len-1;
        count = 0;

        do{//повторяется пока есть элементы в массиве
            for(int j=jmin;j<=jmax;j++){ //строка слева на право (сверху вниз)
                count++;
                mass1[imin-1][j]=count;
            }
            for(int i=imin;i<=imax;i++){ //столбец сверху вниз (справа налево)
                count++;
                mass1[i][jmax]=count;
            }

            jmax--;

            for(int j=jmax;j>=jmin;j--){//строка справа налево (снизу вверх)
                count++;
                mass1[imax][j]=count;
            }

            imax--;

            for(int i=imax;i>=imin;i--){//столбец снизу вверх (слева направо)
                count++;
                mass1[i][jmin]=count;
            }

            imin++;
            jmin++;

        } while (count<len*len);

        for (int i = 0; i < len; i++){//выведем переработанный массив
            for (int j = 0; j < len; j++){
               System.out.print(mass1[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
