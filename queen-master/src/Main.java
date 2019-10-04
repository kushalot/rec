
class Main{
    static boolean correct(int[] pos) {
        int n = pos.length; // размер стороны доски
        // Перебираем всевозможные пары двух различных ферзей
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (Math.abs(i - j) == Math.abs(pos[i] - pos[j]))
                    return false; // Ферзи стоят на одной диагонали
            }
        }
        return true; /*
         * Проверка завершена успешно, ни одной пары ферзей, стоящих
         * на одной диагонали, не найдено
         */
    }

    static int[] recQueen(int[] p, int k) {
        System.out.println();
        for (int j = 0; j < k; j++) {
            System.out.print("\t");
        }
        System.out.print(" recQueen(int[]  , int  " + k + " )");
        System.out.println();
        for (int j = 0; j < k; j++)
            System.out.print("\t");
        for (int j = 0; j < p.length; j++) {
            System.out.print(" " + p[j]);
        }

        int n = p.length; // количество ферзей
        if (k == n) { /*
         * все ферзи уже расставлены, Проверяем расстановку на
         * корректность
         */
            return (correct(p) ? p : null);
        }
        // Находим всевозможные перестановки элементов с индексами от к до n-1
        // System.out.println("перестановки элементов с индексами  от к  = "+k);
        for (int i = k; i < n; i++) {
            // Переставляем местами i-й и к-й элементы
            int c = p[k];
            p[k] = p[i];
            p[i] = c;
            System.out.println();
            for (int j = 0; j < k; j++) {
                System.out.print("\t");
            }
            System.out.print("\t Q [" + k + "]<-->[" + i + "]");

            // Пытаемся найти расстановку с фиксированными к+1 ферзями
            int[] per = recQueen(p, k + 1);
            System.out.println();
            for (int j = 0; j < k; j++) {
                System.out.print("\t");
            }
            if (per == null)
                System.out.println("<-- нe существует!");
            else
                System.out.print("существует!");
            if (per != null)
                return per;
        }
        return null; // Ничего не найдено
    }

    // Главная функция поиска расстановки n ферзей на доске размером nхn
    static int[] queen(int n) {
        int[] pos = new int[n];
        // Формирование начальной расстановки
        for (int i = 0; i < n; i++) {
            pos[i] = i + 1;
        }
        // Вызов основной рекурсивной процедуры
        return recQueen(pos, 0);
    }

    public static void main(String[] args) {
        // Ищем расстановку ферзей с помощью функции queen
        int[] pos = queen(8);
        if (pos == null) {
            System.out.println("He существует!");
        } else {
            System.out.println();
            // Распечатываем найденную позицию в удобном виде
            // Это цикл по всем горизонталям, начиная с первой
            for (int i = 0; i < pos.length; i++) {
                // Печать одной горизонтали
                int queenPos = pos[i];
                for (int k = 1; k < queenPos; k++) {
                    System.out.print(". ");
                }
                System.out.print("Q ");
                for (int k = queenPos + 1; k <= pos.length; k++) {
                    System.out.print(". ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}