public class ferz {
    static int total = 0;

    public static void main(String[] args) {
        // Ищем расстановку ферзей с помощью функции queen
        int n=8; // количество расставляемых ферзей
        queen(n);
        System.out.println("\nИтого: " + total);
    }

    // Главная функция поиска расстановки n ферзей на доске размером nхn
    static void queen(int n) {
        // Вызов основной рекурсивной процедуры
        recQueen(new int[n], 0);
    }

    static int[] recQueen(int[] p, int k) {
        int n = p.length; // количество ферзей
        if (k == n)
            return p; // все ферзи уже расставлены корректно
        for (int j = 1; j <= n; j++) {
            // Пробуем поставить (к+1)-го ферзя последовательно на все вертикали
            boolean correct = true; // признак корректной расстановки
            for (int i = 0; i < k; i++) {
                // Проверяем, не атакует ли новый ферзь уже поставленных
                if (p[i] == j || k - i == Math.abs(j - p[i])) {
                    // Если новый ферзь находится на одной вертикали или диагонали
                    //с некоторым i-M ферзем, то расстановка некорректна
                    correct = false;
                    break;
                }
            }
            if (correct) {
                p[k] = j ;
                // Установили ферзя в свою позицию и пробуем расставить
                // остальных ферзей с помощью рекурсивного вызова функции
                int[] pos = recQueen(p, k+1);
                if (pos != null) {// расстановка найдена!
                    total++; // увеличение счетчика
                    printBoard(pos); // распечатка расстановки
                }
            }
        }
        // Перебрали все варианты постановки (к+1)-го ферзя,
        //но ничего не нашли!
        return null;
    }

    static void printBoard(int[] pos) {
        System.out.println("\n---------> #" + total + " <---------");
        for (int i = 0; i < pos.length; i++) {
            // Печать одной горизонтали
            int queenPos = pos[i];
            for (int k = 1; k < queenPos; k++) {
                System.out.print("_ ");
            }
            System.out.print("Q ");
            for (int k = queenPos + 1; k <= pos.length; k++) {
                System.out.print("_ ");
            }
            System.out.print("\n");
        }
    }
}
